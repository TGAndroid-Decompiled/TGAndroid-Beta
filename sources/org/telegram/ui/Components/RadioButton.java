package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class RadioButton extends View {
    public static Paint checkedPaint;
    public static Paint eraser;
    public static Paint paint;
    public boolean attachedToWindow;
    public ObjectAnimator checkAnimator;
    public int checkedColor;
    public int color;
    public Drawable icon;
    public int iconColor;
    public boolean isChecked;
    public float progress;
    public int size;

    public RadioButton(Context context) {
        super(context);
        this.size = AndroidUtilities.dp(16.0f);
        if (paint == null) {
            Paint paint2 = new Paint(1);
            paint = paint2;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            checkedPaint = new Paint(1);
            Paint paint3 = new Paint(1);
            eraser = paint3;
            paint3.setColor(0);
            eraser.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public int getColor() {
        return this.color;
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
        float f2 = this.progress;
        if (f2 <= 0.5f) {
            paint.setColor(this.color);
            checkedPaint.setColor(this.color);
            f = this.progress / 0.5f;
        } else {
            f = 2.0f - (f2 / 0.5f);
            int iRed = Color.red(this.color);
            float f3 = 1.0f - f;
            int iRed2 = (int) ((Color.red(this.checkedColor) - iRed) * f3);
            int iGreen = Color.green(this.color);
            int iGreen2 = (int) ((Color.green(this.checkedColor) - iGreen) * f3);
            int iBlue = Color.blue(this.color);
            int iRgb = Color.rgb(iRed + iRed2, iGreen + iGreen2, iBlue + ((int) ((Color.blue(this.checkedColor) - iBlue) * f3)));
            paint.setColor(iRgb);
            checkedPaint.setColor(iRgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f4 = (this.size / 2) - ((f + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4, paint);
        if (this.icon == null) {
            if (this.progress <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4 - AndroidUtilities.dp(1.0f), checkedPaint);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f) * (f4 - AndroidUtilities.dp(1.0f)), eraser);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, DiffUtil.m(f4 - AndroidUtilities.dp(1.0f), this.size / 4, f, this.size / 4), checkedPaint);
            }
        }
        canvas.restore();
        if (this.icon != null) {
            int iBlendARGB = ColorUtils.blendARGB(Utilities.clamp(this.progress, 1.0f, 0.0f), this.color, this.checkedColor);
            if (this.iconColor != iBlendARGB) {
                Drawable drawable = this.icon;
                this.iconColor = iBlendARGB;
                drawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
            }
            this.icon.setBounds((int) ((getWidth() / 2.0f) - (this.icon.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.icon.getIntrinsicHeight() / 2.0f)), (int) ((this.icon.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.icon.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.icon.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.color = i;
        invalidate();
    }

    public final void setChecked(boolean z, boolean z2) {
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
            this.checkAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.checkAnimator.start();
            return;
        }
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z ? 1.0f : 0.0f);
    }

    public void setCheckedColor(int i) {
        this.checkedColor = i;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.iconColor = 0;
        this.icon = drawable;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    public void setSize(int i) {
        if (this.size == i) {
            return;
        }
        this.size = i;
    }
}
