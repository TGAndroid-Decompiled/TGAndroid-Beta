package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;

public class ReorderingHintDrawable extends Drawable {
    private final RectDrawable primaryRectDrawable;
    private float scaleX;
    private float scaleY;
    private final RectDrawable secondaryRectDrawable;
    private final android.graphics.Rect tempRect = new android.graphics.Rect();
    private final Interpolator interpolator = Easings.easeInOutSine;
    private final int intrinsicWidth = AndroidUtilities.dp(24.0f);
    private final int intrinsicHeight = AndroidUtilities.dp(24.0f);
    private long startedTime = -1;

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void setAlpha(int i) {
    }

    public ReorderingHintDrawable() {
        RectDrawable rectDrawable = new RectDrawable();
        this.primaryRectDrawable = rectDrawable;
        rectDrawable.setColor(-2130706433);
        RectDrawable rectDrawable2 = new RectDrawable();
        this.secondaryRectDrawable = rectDrawable2;
        rectDrawable2.setColor(-2130706433);
    }

    public void startAnimation() {
        this.startedTime = System.currentTimeMillis();
        invalidateSelf();
    }

    public void resetAnimation() {
        this.startedTime = -1L;
        invalidateSelf();
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect rect) {
        this.scaleX = rect.width() / this.intrinsicWidth;
        this.scaleY = rect.height() / this.intrinsicHeight;
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.startedTime > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.startedTime);
            int i = currentTimeMillis - 300;
            if (i < 0) {
                drawStage1(canvas, 0.0f);
            } else if (i < 150) {
                drawStage1(canvas, i / 150.0f);
            } else {
                int i2 = currentTimeMillis - 750;
                if (i2 < 0) {
                    drawStage1(canvas, 1.0f);
                } else if (i2 < 200) {
                    drawStage2(canvas, i2 / 200.0f);
                } else {
                    int i3 = currentTimeMillis - 1250;
                    if (i3 < 0) {
                        drawStage2(canvas, 1.0f);
                    } else if (i3 < 150) {
                        drawStage3(canvas, i3 / 150.0f);
                    } else {
                        drawStage3(canvas, 1.0f);
                        if (currentTimeMillis - 1400 >= 100) {
                            this.startedTime = System.currentTimeMillis();
                        }
                    }
                }
            }
            invalidateSelf();
            return;
        }
        drawStage1(canvas, 0.0f);
    }

    private void drawStage1(Canvas canvas, float f) {
        android.graphics.Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        this.tempRect.left = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        this.tempRect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        android.graphics.Rect rect = this.tempRect;
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        this.secondaryRectDrawable.setBounds(this.tempRect);
        this.secondaryRectDrawable.draw(canvas);
        android.graphics.Rect rect2 = this.tempRect;
        int dp = AndroidUtilities.dp(12.0f);
        rect2.right = dp;
        rect2.left = dp;
        android.graphics.Rect rect3 = this.tempRect;
        int dp2 = AndroidUtilities.dp(8.0f);
        rect3.bottom = dp2;
        rect3.top = dp2;
        this.tempRect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        this.primaryRectDrawable.setBounds(this.tempRect);
        this.primaryRectDrawable.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        this.primaryRectDrawable.draw(canvas);
    }

    private void drawStage2(Canvas canvas, float f) {
        android.graphics.Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        this.tempRect.left = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        this.tempRect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        android.graphics.Rect rect = this.tempRect;
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        this.tempRect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        this.secondaryRectDrawable.setBounds(this.tempRect);
        this.secondaryRectDrawable.draw(canvas);
        this.tempRect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.scaleX);
        this.tempRect.top = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.scaleY);
        android.graphics.Rect rect2 = this.tempRect;
        rect2.right = bounds.right - rect2.left;
        rect2.bottom = rect2.top + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.scaleY));
        this.tempRect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        this.primaryRectDrawable.setBounds(this.tempRect);
        this.primaryRectDrawable.setAlpha(255);
        this.primaryRectDrawable.draw(canvas);
    }

    private void drawStage3(Canvas canvas, float f) {
        android.graphics.Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        this.tempRect.left = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        this.tempRect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        android.graphics.Rect rect = this.tempRect;
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        this.tempRect.offset(0, AndroidUtilities.dp(-8.0f));
        this.secondaryRectDrawable.setBounds(this.tempRect);
        this.secondaryRectDrawable.draw(canvas);
        this.tempRect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.scaleX);
        this.tempRect.top = (int) (AndroidUtilities.dpf2(6.0f) * this.scaleY);
        android.graphics.Rect rect2 = this.tempRect;
        rect2.right = bounds.right - rect2.left;
        rect2.bottom = rect2.top + ((int) (AndroidUtilities.dpf2(4.0f) * this.scaleY));
        this.tempRect.offset(0, AndroidUtilities.dp(8.0f));
        this.primaryRectDrawable.setBounds(this.tempRect);
        this.primaryRectDrawable.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        this.primaryRectDrawable.draw(canvas);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.primaryRectDrawable.setColorFilter(colorFilter);
        this.secondaryRectDrawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    public static class RectDrawable extends Drawable {
        private final RectF tempRect = new RectF();
        private final Paint paint = new Paint(1);

        @Override
        public int getOpacity() {
            return -3;
        }

        protected RectDrawable() {
        }

        @Override
        public void draw(Canvas canvas) {
            this.tempRect.set(getBounds());
            float height = this.tempRect.height() * 0.2f;
            canvas.drawRoundRect(this.tempRect, height, height, this.paint);
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }
}
