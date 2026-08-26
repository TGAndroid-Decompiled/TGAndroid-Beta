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
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;

public abstract class PaintColorsListView extends RecyclerListView {
    public static final Paint checkerboardPaint;
    public static final Paint checkerboardPaintWhite;
    public static final Paint colorCirclePaint;
    public static final Path colorCirclePath;
    public Consumer colorListener;
    public PersistColorPalette colorPalette;
    public final Paint outlinePaint;
    public final Paint paint;
    public int selectedColorIndex;

    public final class ColorView extends View {
        public int mColor;
        public float selectProgress;

        public ColorView(Context context) {
            super(context);
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setLayoutParams(new RecyclerView.LayoutParams(-2, 0));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            PaintColorsListView paintColorsListView = PaintColorsListView.this;
            paintColorsListView.paint.setColor(this.mColor);
            float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
            if (this.selectProgress != 0.0f) {
                fMin -= (paintColorsListView.outlinePaint.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.selectProgress;
            }
            float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
            float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
            PaintColorsListView.drawColorCircle(canvas, width, height, fMin, this.mColor);
            if (this.selectProgress != 0.0f) {
                float fMin2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
                paintColorsListView.outlinePaint.setColor(this.mColor);
                paintColorsListView.outlinePaint.setAlpha(255);
                canvas.drawCircle(width, height, fMin2, paintColorsListView.outlinePaint);
            }
        }
    }

    static {
        Paint paint = new Paint(1);
        checkerboardPaint = paint;
        Paint paint2 = new Paint(1);
        checkerboardPaintWhite = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
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
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new GridLayoutManager(7));
        setAdapter(new RecyclerView.Adapter() {
            @Override
            public final int getItemCount() {
                return 14;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ColorView colorView = (ColorView) viewHolder.itemView;
                ViewGroup.LayoutParams layoutParams = colorView.getLayoutParams();
                PaintColorsListView paintColorsListView = PaintColorsListView.this;
                layoutParams.height = ((paintColorsListView.getHeight() - paintColorsListView.getPaddingTop()) - paintColorsListView.getPaddingBottom()) / 2;
                PersistColorPalette persistColorPalette = paintColorsListView.colorPalette;
                if (persistColorPalette != null) {
                    colorView.mColor = persistColorPalette.getColor(i);
                    colorView.invalidate();
                    colorView.selectProgress = paintColorsListView.selectedColorIndex == i ? 1.0f : 0.0f;
                    colorView.invalidate();
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(PaintColorsListView.this.new ColorView(context));
            }
        });
        setOverScrollMode(2);
        setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 7));
    }

    public static void drawCheckerboard(Canvas canvas, RectF rectF, int i) {
        float f = rectF.left;
        while (f <= rectF.right) {
            float f2 = rectF.top;
            while (f2 <= rectF.bottom) {
                float f3 = i;
                float f4 = f + f3;
                float f5 = f2 + f3;
                Paint paint = checkerboardPaint;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f, f2, f4, f5, paint);
                float f6 = i * 2;
                float f7 = f + f6;
                Paint paint2 = checkerboardPaintWhite;
                float f8 = f2;
                canvas2.drawRect(f4, f8, f7, f5, paint2);
                float f9 = f8 + f6;
                canvas2.drawRect(f4, f5, f7, f9, paint);
                canvas2.drawRect(f, f5, f4, f9, paint2);
                canvas = canvas2;
                f2 = f9;
            }
            f += i * 2;
            canvas = canvas;
        }
    }

    public static void drawColorCircle(Canvas canvas, float f, float f2, float f3, int i) {
        Paint paint = colorCirclePaint;
        paint.setColor(i);
        if (paint.getAlpha() == 255) {
            canvas.drawCircle(f, f2, f3, paint);
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f - f3, f2 - f3, f + f3, f3 + f2);
        paint.setAlpha(255);
        canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
        Path path = colorCirclePath;
        path.rewind();
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) AndroidUtilities$$ExternalSyntheticOutline1.m(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * ((double) (rectF.height() / 2.0f))) + ((double) rectF.centerY())));
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) AndroidUtilities$$ExternalSyntheticOutline1.m(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * ((double) (rectF.height() / 2.0f))) + ((double) rectF.centerY())));
        path.addArc(rectF, -45.0f, 180.0f);
        canvas.save();
        canvas.clipPath(path);
        drawCheckerboard(canvas, rectF, AndroidUtilities.dp(4.0f));
        canvas.restore();
        paint.setColor(i);
        canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
    }

    public int getSelectedColorIndex() {
        return this.selectedColorIndex;
    }

    public void setColorListener(Consumer consumer) {
        this.colorListener = consumer;
    }

    public void setColorPalette(PersistColorPalette persistColorPalette) {
        this.colorPalette = persistColorPalette;
        getAdapter().notifyDataSetChanged();
    }

    public final void setProgress(float f, boolean z) {
        float interpolation = z ? CubicBezierInterpolator.EASE_OUT.getInterpolation(f) : CubicBezierInterpolator.EASE_IN.getInterpolation(f);
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

    public void setSelectedColorIndex(int i) {
        this.selectedColorIndex = i;
        getAdapter().notifyDataSetChanged();
    }
}
