package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.RecyclerListView;

public abstract class PaintColorsListView extends RecyclerListView {
    private static Paint checkerboardPaint = new Paint(1);
    private static Paint checkerboardPaintWhite = new Paint(1);
    private static Paint colorCirclePaint;
    private static Path colorCirclePath;
    private Consumer colorListener;
    private PersistColorPalette colorPalette;
    private Paint outlinePaint;
    private Paint paint;
    private int selectedColorIndex;

    static {
        checkerboardPaint.setColor(-2013265920);
        checkerboardPaintWhite.setColor(-1996488705);
        colorCirclePath = new Path();
        colorCirclePaint = new Paint(1);
    }

    public PaintColorsListView(final Context context) {
        super(context);
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        this.outlinePaint = paint;
        this.selectedColorIndex = -1;
        paint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new GridLayoutManager(context, 7));
        setAdapter(new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                return 14;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(PaintColorsListView.this.new ColorView(context));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ColorView colorView = (ColorView) viewHolder.itemView;
                colorView.getLayoutParams().height = ((PaintColorsListView.this.getHeight() - PaintColorsListView.this.getPaddingTop()) - PaintColorsListView.this.getPaddingBottom()) / 2;
                if (PaintColorsListView.this.colorPalette != null) {
                    colorView.setColor(PaintColorsListView.this.colorPalette.getColor(i));
                    colorView.setSelected(PaintColorsListView.this.selectedColorIndex == i, false);
                }
            }
        });
        setOverScrollMode(2);
        setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                PaintColorsListView.$r8$lambda$GgggSRcoxMrnPF6gvY4gb8SaR7I(this.f$0, view, i);
            }
        });
    }

    public static void $r8$lambda$GgggSRcoxMrnPF6gvY4gb8SaR7I(PaintColorsListView paintColorsListView, View view, int i) {
        paintColorsListView.colorListener.accept(Integer.valueOf(paintColorsListView.colorPalette.getColor(i)));
        paintColorsListView.colorPalette.setCurrentBrushColorByColorIndex(i);
    }

    public static void drawCheckerboard(Canvas canvas, RectF rectF, int i) {
        float f = rectF.left;
        while (f <= rectF.right) {
            float f2 = rectF.top;
            while (f2 <= rectF.bottom) {
                float f3 = i;
                float f4 = f + f3;
                float f5 = f2 + f3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f, f2, f4, f5, checkerboardPaint);
                float f6 = i * 2;
                float f7 = f + f6;
                float f8 = f2;
                canvas2.drawRect(f4, f8, f7, f5, checkerboardPaintWhite);
                float f9 = f8 + f6;
                canvas2.drawRect(f4, f5, f7, f9, checkerboardPaint);
                canvas2.drawRect(f, f5, f4, f9, checkerboardPaintWhite);
                canvas = canvas2;
                f2 = f9;
            }
            f += i * 2;
            canvas = canvas;
        }
    }

    public static void drawColorCircle(Canvas canvas, float f, float f2, float f3, int i) {
        colorCirclePaint.setColor(i);
        if (colorCirclePaint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
            colorCirclePaint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, colorCirclePaint);
            colorCirclePath.rewind();
            colorCirclePath.moveTo(rectF.centerX(), rectF.centerY());
            colorCirclePath.lineTo((float) (((double) rectF.centerX()) + (((double) (rectF.width() / 2.0f)) * Math.cos(-1.5707963267948966d))), (float) (((double) rectF.centerY()) + (((double) (rectF.height() / 2.0f)) * Math.sin(-1.5707963267948966d))));
            colorCirclePath.moveTo(rectF.centerX(), rectF.centerY());
            colorCirclePath.lineTo((float) (((double) rectF.centerX()) + (((double) (rectF.width() / 2.0f)) * Math.cos(4.71238898038469d))), (float) (((double) rectF.centerY()) + (((double) (rectF.height() / 2.0f)) * Math.sin(4.71238898038469d))));
            colorCirclePath.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(colorCirclePath);
            drawCheckerboard(canvas, rectF, AndroidUtilities.dp(4.0f));
            canvas.restore();
            colorCirclePaint.setColor(i);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, colorCirclePaint);
            return;
        }
        canvas.drawCircle(f, f2, f3, colorCirclePaint);
    }

    public void setColorListener(Consumer consumer) {
        this.colorListener = consumer;
    }

    public void setColorPalette(PersistColorPalette persistColorPalette) {
        this.colorPalette = persistColorPalette;
        getAdapter().notifyDataSetChanged();
    }

    public void setSelectedColorIndex(int i) {
        this.selectedColorIndex = i;
        getAdapter().notifyDataSetChanged();
    }

    public int getSelectedColorIndex() {
        return this.selectedColorIndex;
    }

    public void setProgress(float f, boolean z) {
        float interpolation;
        if (z) {
            interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        } else {
            interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(f);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i == 0) {
                childAt.setAlpha(interpolation == 1.0f ? 1.0f : 0.0f);
            } else {
                float f2 = i * childCount;
                float fMin = Math.min(interpolation, f2) / f2;
                childAt.setScaleX(fMin);
                childAt.setScaleY(fMin);
            }
        }
        invalidate();
    }

    private final class ColorView extends View {
        private int mColor;
        private float selectProgress;

        public ColorView(Context context) {
            super(context);
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setLayoutParams(new RecyclerView.LayoutParams(-2, 0));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            PaintColorsListView.this.paint.setColor(this.mColor);
            float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
            if (this.selectProgress != 0.0f) {
                fMin -= (AndroidUtilities.dp(3.0f) + PaintColorsListView.this.outlinePaint.getStrokeWidth()) * this.selectProgress;
            }
            float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
            float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
            PaintColorsListView.drawColorCircle(canvas, width, height, fMin, this.mColor);
            if (this.selectProgress != 0.0f) {
                float fMin2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
                PaintColorsListView.this.outlinePaint.setColor(this.mColor);
                PaintColorsListView.this.outlinePaint.setAlpha(255);
                canvas.drawCircle(width, height, fMin2, PaintColorsListView.this.outlinePaint);
            }
        }

        public void setSelected(boolean z, boolean z2) {
            if (z2) {
                return;
            }
            this.selectProgress = z ? 1.0f : 0.0f;
            invalidate();
        }

        public void setColor(int i) {
            this.mColor = i;
            invalidate();
        }
    }
}
