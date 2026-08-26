package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class CheckBoxSquare extends View {
    public boolean attachedToWindow;
    public ObjectAnimator checkAnimator;
    public final Bitmap drawBitmap;
    public final Canvas drawCanvas;
    public final boolean isAlert;
    public boolean isChecked;
    public boolean isDisabled;
    public int key1;
    public int key2;
    public int key3;
    public float progress;
    public final RectF rectF;
    public final Theme.ResourcesProvider resourcesProvider;

    public CheckBoxSquare(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        if (Theme.checkboxSquare_backgroundPaint == null) {
            Theme.createCommonResources(context);
        }
        boolean z2 = this.isAlert;
        this.key1 = z2 ? Theme.key_dialogCheckboxSquareUnchecked : Theme.key_checkboxSquareUnchecked;
        this.key2 = z2 ? Theme.key_dialogCheckboxSquareBackground : Theme.key_checkboxSquareBackground;
        this.key3 = z2 ? Theme.key_dialogCheckboxSquareCheck : Theme.key_checkboxSquareCheck;
        this.rectF = new RectF();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.drawBitmap = bitmapCreateBitmap;
        this.drawCanvas = new Canvas(bitmapCreateBitmap);
        this.isAlert = z;
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (getVisibility() != 0) {
            return;
        }
        int i = this.key1;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        int color2 = Theme.getColor(this.key2, resourcesProvider);
        float f3 = this.progress;
        if (f3 <= 0.5f) {
            f = f3 / 0.5f;
            Theme.checkboxSquare_backgroundPaint.setColor(Color.rgb(Color.red(color) + ((int) ((Color.red(color2) - Color.red(color)) * f)), Color.green(color) + ((int) ((Color.green(color2) - Color.green(color)) * f)), Color.blue(color) + ((int) ((Color.blue(color2) - Color.blue(color)) * f))));
            f2 = f;
        } else {
            f = 2.0f - (f3 / 0.5f);
            Theme.checkboxSquare_backgroundPaint.setColor(color2);
            f2 = 1.0f;
        }
        if (this.isDisabled) {
            Theme.checkboxSquare_backgroundPaint.setColor(Theme.getColor(this.isAlert ? Theme.key_dialogCheckboxSquareDisabled : Theme.key_checkboxSquareDisabled, resourcesProvider));
        }
        float fDp = AndroidUtilities.dp(1.0f) * f;
        RectF rectF = this.rectF;
        rectF.set(fDp, fDp, AndroidUtilities.dp(18.0f) - fDp, AndroidUtilities.dp(18.0f) - fDp);
        Bitmap bitmap = this.drawBitmap;
        bitmap.eraseColor(0);
        Canvas canvas2 = this.drawCanvas;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.checkboxSquare_backgroundPaint);
        if (f2 != 1.0f) {
            float fMin = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f2) + fDp);
            rectF.set(AndroidUtilities.dp(1.33f) + fMin, AndroidUtilities.dp(1.33f) + fMin, AndroidUtilities.dp(16.66f) - fMin, AndroidUtilities.dp(16.66f) - fMin);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), Theme.checkboxSquare_eraserPaint);
        }
        if (this.progress > 0.5f) {
            Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(this.key3, resourcesProvider));
            float f4 = 1.0f - f;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f4)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f4)), Theme.checkboxSquare_checkPaint);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f4) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f4)), Theme.checkboxSquare_checkPaint);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void setChecked(boolean z, boolean z2) {
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
            this.checkAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            this.checkAnimator.start();
            return;
        }
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z ? 1.0f : 0.0f);
    }

    public void setDisabled(boolean z) {
        this.isDisabled = z;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }
}
