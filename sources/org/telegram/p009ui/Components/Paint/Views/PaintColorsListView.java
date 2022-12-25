package org.telegram.p009ui.Components.Paint.Views;

import android.annotation.SuppressLint;
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
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.Paint.PersistColorPalette;
import org.telegram.p009ui.Components.RecyclerListView;

public class PaintColorsListView extends RecyclerListView {
    private static Paint checkerboardPaint = new Paint(1);
    private static Paint checkerboardPaintWhite = new Paint(1);
    private static Paint colorCirclePaint;
    private static Path colorCirclePath;
    private Consumer<Integer> colorListener;
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
        this.selectedColorIndex = 0;
        paint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        setPadding(AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f));
        setLayoutManager(new GridLayoutManager(context, 7));
        setAdapter(new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                return 14;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(new ColorView(context));
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
                PaintColorsListView.this.lambda$new$0(view, i);
            }
        });
    }

    public void lambda$new$0(View view, int i) {
        this.colorListener.accept(Integer.valueOf(this.colorPalette.getColor(i)));
        this.colorPalette.selectColorIndex(i);
    }

    public static void drawCheckerboard(Canvas canvas, RectF rectF, int i) {
        float f = rectF.left;
        while (f <= rectF.right) {
            float f2 = rectF.top;
            while (f2 <= rectF.bottom) {
                float f3 = i;
                float f4 = f + f3;
                float f5 = f2 + f3;
                canvas.drawRect(f, f2, f4, f5, checkerboardPaint);
                float f6 = i * 2;
                float f7 = f + f6;
                canvas.drawRect(f4, f2, f7, f5, checkerboardPaintWhite);
                f2 += f6;
                canvas.drawRect(f4, f5, f7, f2, checkerboardPaint);
                canvas.drawRect(f, f5, f4, f2, checkerboardPaintWhite);
            }
            f += i * 2;
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
            Path path = colorCirclePath;
            double centerX = rectF.centerX();
            double width = rectF.width() / 2.0f;
            double cos = Math.cos(-1.5707963267948966d);
            Double.isNaN(width);
            Double.isNaN(centerX);
            double centerY = rectF.centerY();
            double height = rectF.height() / 2.0f;
            double sin = Math.sin(-1.5707963267948966d);
            Double.isNaN(height);
            Double.isNaN(centerY);
            path.lineTo((float) (centerX + (width * cos)), (float) (centerY + (height * sin)));
            colorCirclePath.moveTo(rectF.centerX(), rectF.centerY());
            Path path2 = colorCirclePath;
            double centerX2 = rectF.centerX();
            double width2 = rectF.width() / 2.0f;
            double cos2 = Math.cos(4.71238898038469d);
            Double.isNaN(width2);
            Double.isNaN(centerX2);
            double centerY2 = rectF.centerY();
            double height2 = rectF.height() / 2.0f;
            double sin2 = Math.sin(4.71238898038469d);
            Double.isNaN(height2);
            Double.isNaN(centerY2);
            path2.lineTo((float) (centerX2 + (width2 * cos2)), (float) (centerY2 + (height2 * sin2)));
            colorCirclePath.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(colorCirclePath);
            drawCheckerboard(canvas, rectF, AndroidUtilities.m35dp(4.0f));
            canvas.restore();
            colorCirclePaint.setColor(i);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, colorCirclePaint);
            return;
        }
        canvas.drawCircle(f, f2, f3, colorCirclePaint);
    }

    public void setColorListener(Consumer<Integer> consumer) {
        this.colorListener = consumer;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setColorPalette(PersistColorPalette persistColorPalette) {
        this.colorPalette = persistColorPalette;
        getAdapter().notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setSelectedColorIndex(int i) {
        this.selectedColorIndex = i;
        getAdapter().notifyDataSetChanged();
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
                float min = Math.min(interpolation, f2) / f2;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    private final class ColorView extends View {
        private int mColor;
        private float selectProgress;

        public ColorView(Context context) {
            super(context);
            setPadding(AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f));
            setLayoutParams(new RecyclerView.LayoutParams(-2, 0));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            PaintColorsListView.this.paint.setColor(this.mColor);
            float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
            if (this.selectProgress != 0.0f) {
                min -= (AndroidUtilities.m35dp(3.0f) + PaintColorsListView.this.outlinePaint.getStrokeWidth()) * this.selectProgress;
            }
            float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
            float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
            PaintColorsListView.drawColorCircle(canvas, width, height, min, this.mColor);
            if (this.selectProgress != 0.0f) {
                float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.m35dp(2.0f);
                PaintColorsListView.this.outlinePaint.setColor(this.mColor);
                PaintColorsListView.this.outlinePaint.setAlpha(255);
                canvas.drawCircle(width, height, min2, PaintColorsListView.this.outlinePaint);
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
