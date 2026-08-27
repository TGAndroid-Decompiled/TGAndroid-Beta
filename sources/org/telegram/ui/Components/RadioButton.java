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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class RadioButton extends View {

    public static Paint f26498s;
    public static Paint v;

    public static Paint f26499w;

    public int f26500a;

    public int f26501b;

    public float f26502c;
    public ObjectAnimator d;

    public boolean f26503e;

    public boolean f26504f;
    public int h;

    public int f26505n;

    public Drawable f26506r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26498s == null) {
            Paint paint = new Paint(1);
            f26498s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26498s.setStyle(Paint.Style.STROKE);
            f26499w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26504f) {
            return;
        }
        this.f26504f = z10;
        if (this.f26503e && z11) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z10 ? 1.0f : 0.0f);
    }

    public final void b(int i10, int i11) {
        this.f26501b = i10;
        this.f26500a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f26501b;
    }

    public float getProgress() {
        return this.f26502c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26503e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26503e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f26502c;
        if (f11 <= 0.5f) {
            f26498s.setColor(this.f26501b);
            f26499w.setColor(this.f26501b);
            f10 = this.f26502c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int iRed = Color.red(this.f26501b);
            float f12 = 1.0f - f10;
            int iRed2 = (int) ((Color.red(this.f26500a) - iRed) * f12);
            int iGreen = Color.green(this.f26501b);
            int iGreen2 = (int) ((Color.green(this.f26500a) - iGreen) * f12);
            int iBlue = Color.blue(this.f26501b);
            int iRgb = Color.rgb(iRed + iRed2, iGreen + iGreen2, iBlue + ((int) ((Color.blue(this.f26500a) - iBlue) * f12)));
            f26498s.setColor(iRgb);
            f26499w.setColor(iRgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f26498s);
        if (this.f26506r == null) {
            if (this.f26502c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - AndroidUtilities.dp(1.0f), f26499w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.z(f13 - AndroidUtilities.dp(1.0f), this.h / 4, f10, this.h / 4), f26499w);
            }
        }
        canvas.restore();
        if (this.f26506r != null) {
            int iD = i0.b.d(Utilities.clamp(this.f26502c, 1.0f, 0.0f), this.f26501b, this.f26500a);
            if (this.f26505n != iD) {
                Drawable drawable = this.f26506r;
                this.f26505n = iD;
                drawable.setColorFilter(new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN));
            }
            this.f26506r.setBounds((int) ((getWidth() / 2.0f) - (this.f26506r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26506r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26506r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26506r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26506r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26501b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f26500a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26505n = 0;
        this.f26506r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f26502c == f10) {
            return;
        }
        this.f26502c = f10;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
