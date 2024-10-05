package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public class RadioButton extends View {
    private static Paint checkedPaint;
    private static Paint eraser;
    private static Paint paint;
    private boolean attachedToWindow;
    private Bitmap bitmap;
    private Canvas bitmapCanvas;
    private ObjectAnimator checkAnimator;
    private int checkedColor;
    private int color;
    private Drawable icon;
    private boolean isChecked;
    private float progress;
    private int size;

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
        try {
            this.bitmap = Bitmap.createBitmap(AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), Bitmap.Config.ARGB_4444);
            this.bitmapCanvas = new Canvas(this.bitmap);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.checkAnimator.start();
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public int getColor() {
        return this.color;
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean isChecked() {
        return this.isChecked;
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
    protected void onDraw(Canvas canvas) {
        float f;
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.bitmap = null;
            }
            try {
                this.bitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.bitmapCanvas = new Canvas(this.bitmap);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        float f2 = this.progress;
        if (f2 <= 0.5f) {
            paint.setColor(this.color);
            checkedPaint.setColor(this.color);
            f = this.progress / 0.5f;
        } else {
            f = 2.0f - (f2 / 0.5f);
            float f3 = 1.0f - f;
            int rgb = Color.rgb(Color.red(this.color) + ((int) ((Color.red(this.checkedColor) - r5) * f3)), Color.green(this.color) + ((int) ((Color.green(this.checkedColor) - r8) * f3)), Color.blue(this.color) + ((int) ((Color.blue(this.checkedColor) - r10) * f3)));
            paint.setColor(rgb);
            checkedPaint.setColor(rgb);
        }
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setBounds((int) ((getWidth() / 2.0f) - (this.icon.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.icon.getIntrinsicHeight() / 2.0f)), (int) ((getWidth() / 2.0f) + (this.icon.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) + (this.icon.getIntrinsicHeight() / 2.0f)));
            this.icon.draw(canvas);
        }
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 != null) {
            bitmap3.eraseColor(0);
            float f4 = (this.size / 2) - ((f + 1.0f) * AndroidUtilities.density);
            this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4, paint);
            if (this.progress <= 0.5f) {
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4 - AndroidUtilities.dp(1.0f), checkedPaint);
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (f4 - AndroidUtilities.dp(1.0f)) * (1.0f - f), eraser);
            } else {
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (this.size / 4) + (((f4 - AndroidUtilities.dp(1.0f)) - (this.size / 4)) * f), checkedPaint);
            }
            canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.color = i;
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
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

    public void setCheckedColor(int i) {
        this.checkedColor = i;
        invalidate();
    }

    public void setColor(int i, int i2) {
        this.color = i;
        this.checkedColor = i2;
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.SRC_IN));
        }
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
