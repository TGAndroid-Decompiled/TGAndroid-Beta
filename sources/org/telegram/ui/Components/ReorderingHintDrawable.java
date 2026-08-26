package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.DialogsActivity;

public final class ReorderingHintDrawable extends Drawable {
    public final DialogsActivity.AnonymousClass11.AnonymousClass1 primaryRectDrawable;
    public float scaleX;
    public float scaleY;
    public final DialogsActivity.AnonymousClass11.AnonymousClass1 secondaryRectDrawable;
    public final Rect tempRect = new Rect();
    public final CubicBezierInterpolator interpolator = Easings.easeInOutSine;
    public final int intrinsicWidth = AndroidUtilities.dp(24.0f);
    public final int intrinsicHeight = AndroidUtilities.dp(24.0f);
    public long startedTime = -1;

    public ReorderingHintDrawable() {
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass1 = new DialogsActivity.AnonymousClass11.AnonymousClass1();
        this.primaryRectDrawable = anonymousClass1;
        anonymousClass1.paint.setColor(-2130706433);
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass2 = new DialogsActivity.AnonymousClass11.AnonymousClass1();
        this.secondaryRectDrawable = anonymousClass2;
        anonymousClass2.paint.setColor(-2130706433);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.startedTime <= 0) {
            drawStage1(canvas, 0.0f);
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.startedTime);
        int i = iCurrentTimeMillis - 300;
        if (i < 0) {
            drawStage1(canvas, 0.0f);
        } else if (i < 150) {
            drawStage1(canvas, i / 150.0f);
        } else {
            int i2 = iCurrentTimeMillis - 750;
            if (i2 < 0) {
                drawStage1(canvas, 1.0f);
            } else if (i2 < 200) {
                drawStage2(canvas, i2 / 200.0f);
            } else {
                int i3 = iCurrentTimeMillis - 1250;
                if (i3 < 0) {
                    drawStage2(canvas, 1.0f);
                } else if (i3 < 150) {
                    drawStage3(canvas, i3 / 150.0f);
                } else {
                    drawStage3(canvas, 1.0f);
                    if (iCurrentTimeMillis - 1400 >= 100) {
                        this.startedTime = System.currentTimeMillis();
                    }
                }
            }
        }
        invalidateSelf();
    }

    public final void drawStage1(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        Rect rect = this.tempRect;
        rect.left = iDp;
        rect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass1 = this.secondaryRectDrawable;
        anonymousClass1.setBounds(rect);
        anonymousClass1.draw(canvas);
        int iDp2 = AndroidUtilities.dp(12.0f);
        rect.right = iDp2;
        rect.left = iDp2;
        int iDp3 = AndroidUtilities.dp(8.0f);
        rect.bottom = iDp3;
        rect.top = iDp3;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass2 = this.primaryRectDrawable;
        anonymousClass2.setBounds(rect);
        anonymousClass2.paint.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        anonymousClass2.draw(canvas);
    }

    public final void drawStage2(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        Rect rect = this.tempRect;
        rect.left = iDp;
        rect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass1 = this.secondaryRectDrawable;
        anonymousClass1.setBounds(rect);
        anonymousClass1.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.scaleX);
        rect.top = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.scaleY);
        rect.right = bounds.right - rect.left;
        rect.bottom = rect.top + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.scaleY));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass2 = this.primaryRectDrawable;
        anonymousClass2.setBounds(rect);
        anonymousClass2.paint.setAlpha(255);
        anonymousClass2.draw(canvas);
    }

    public final void drawStage3(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.interpolator.getInterpolation(f);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.scaleX);
        Rect rect = this.tempRect;
        rect.left = iDp;
        rect.bottom = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.scaleY));
        rect.right = bounds.right - rect.left;
        rect.top = rect.bottom - ((int) (AndroidUtilities.dp(4.0f) * this.scaleY));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass1 = this.secondaryRectDrawable;
        anonymousClass1.setBounds(rect);
        anonymousClass1.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.scaleX);
        rect.top = (int) (AndroidUtilities.dpf2(6.0f) * this.scaleY);
        rect.right = bounds.right - rect.left;
        rect.bottom = rect.top + ((int) (AndroidUtilities.dpf2(4.0f) * this.scaleY));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        DialogsActivity.AnonymousClass11.AnonymousClass1 anonymousClass2 = this.primaryRectDrawable;
        anonymousClass2.setBounds(rect);
        anonymousClass2.paint.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        anonymousClass2.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.scaleX = rect.width() / this.intrinsicWidth;
        this.scaleY = rect.height() / this.intrinsicHeight;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.primaryRectDrawable.paint.setColorFilter(colorFilter);
        this.secondaryRectDrawable.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
