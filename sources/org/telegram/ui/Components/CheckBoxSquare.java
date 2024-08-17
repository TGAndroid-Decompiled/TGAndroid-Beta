package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class CheckBoxSquare extends View {
    private boolean attachedToWindow;
    private ObjectAnimator checkAnimator;
    private Bitmap drawBitmap;
    private Canvas drawCanvas;
    private boolean isAlert;
    private boolean isChecked;
    private boolean isDisabled;
    private int key1;
    private int key2;
    private int key3;
    private float progress;
    private RectF rectF;
    private final Theme.ResourcesProvider resourcesProvider;

    public CheckBoxSquare(Context context, boolean z) {
        this(context, z, null);
    }

    public CheckBoxSquare(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
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
        this.drawBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.drawCanvas = new Canvas(this.drawBitmap);
        this.isAlert = z;
    }

    public void setColors(int i, int i2, int i3) {
        this.key1 = i;
        this.key2 = i2;
        this.key3 = i3;
        invalidate();
    }

    @Keep
    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    @Keep
    public float getProgress() {
        return this.progress;
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = ofFloat;
        ofFloat.setDuration(300L);
        this.checkAnimator.start();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setChecked(boolean z, boolean z2) {
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            animateToCheckedState(z);
        } else {
            cancelCheckAnimator();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    public void setDisabled(boolean z) {
        this.isDisabled = z;
        invalidate();
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (getVisibility() != 0) {
            return;
        }
        int themedColor = getThemedColor(this.key1);
        int themedColor2 = getThemedColor(this.key2);
        float f3 = this.progress;
        if (f3 <= 0.5f) {
            f = f3 / 0.5f;
            Theme.checkboxSquare_backgroundPaint.setColor(Color.rgb(Color.red(themedColor) + ((int) ((Color.red(themedColor2) - Color.red(themedColor)) * f)), Color.green(themedColor) + ((int) ((Color.green(themedColor2) - Color.green(themedColor)) * f)), Color.blue(themedColor) + ((int) ((Color.blue(themedColor2) - Color.blue(themedColor)) * f))));
            f2 = f;
        } else {
            f = 2.0f - (f3 / 0.5f);
            Theme.checkboxSquare_backgroundPaint.setColor(themedColor2);
            f2 = 1.0f;
        }
        if (this.isDisabled) {
            Theme.checkboxSquare_backgroundPaint.setColor(getThemedColor(this.isAlert ? Theme.key_dialogCheckboxSquareDisabled : Theme.key_checkboxSquareDisabled));
        }
        float dp = AndroidUtilities.dp(1.0f) * f;
        this.rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        this.drawBitmap.eraseColor(0);
        this.drawCanvas.drawRoundRect(this.rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.checkboxSquare_backgroundPaint);
        if (f2 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f2) + dp);
            this.rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
            this.drawCanvas.drawRect(this.rectF, Theme.checkboxSquare_eraserPaint);
        }
        if (this.progress > 0.5f) {
            Theme.checkboxSquare_checkPaint.setColor(getThemedColor(this.key3));
            float f4 = 1.0f - f;
            this.drawCanvas.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f4)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f4)), Theme.checkboxSquare_checkPaint);
            this.drawCanvas.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) + (AndroidUtilities.dp(7.0f) * f4)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f4)), Theme.checkboxSquare_checkPaint);
        }
        canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
    }

    protected int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
