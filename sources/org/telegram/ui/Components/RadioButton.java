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
import org.telegram.messenger.Utilities;
public class RadioButton extends View {
    public static Paint f31515s;
    public static Paint f31516w;
    public static Paint f31517x;
    public int f31518a;
    public int f31519b;
    public float f31520c;
    public ObjectAnimator d;
    public boolean f31521e;
    public boolean f31522f;
    public int h;
    public int f31523n;
    public Drawable f31524r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f31515s == null) {
            Paint paint = new Paint(1);
            f31515s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f31515s.setStyle(Paint.Style.STROKE);
            f31517x = new Paint(1);
            Paint paint2 = new Paint(1);
            f31516w = paint2;
            paint2.setColor(0);
            f31516w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 == this.f31522f) {
            return;
        }
        this.f31522f = z9;
        float f10 = 0.0f;
        if (this.f31521e && z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.d = ofFloat;
            ofFloat.setDuration(200L);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z9) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void b(int i7, int i10) {
        this.f31519b = i7;
        this.f31518a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f31518a;
    }

    public int getColor() {
        return this.f31519b;
    }

    public float getProgress() {
        return this.f31520c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31521e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31521e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f31520c;
        if (f11 <= 0.5f) {
            f31515s.setColor(this.f31519b);
            f31517x.setColor(this.f31519b);
            f10 = this.f31520c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f31519b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f31519b);
            int blue = Color.blue(this.f31519b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f31518a) - red) * f12)), green + ((int) ((Color.green(this.f31518a) - green) * f12)), blue + ((int) ((Color.blue(this.f31518a) - blue) * f12)));
            f31515s.setColor(rgb);
            f31517x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f22562p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f31515s);
        if (this.f31524r == null) {
            if (this.f31520c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f31517x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f31516w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f31517x);
            }
        }
        canvas.restore();
        if (this.f31524r != null) {
            int f14 = i0.a.f(Utilities.i(this.f31520c, 1.0f, 0.0f), this.f31519b, this.f31518a);
            if (this.f31523n != f14) {
                Drawable drawable = this.f31524r;
                this.f31523n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f31524r.setBounds((int) ((getWidth() / 2.0f) - (this.f31524r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f31524r.getIntrinsicHeight() / 2.0f)), (int) ((this.f31524r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f31524r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f31524r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f31519b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f31518a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f31523n = 0;
        this.f31524r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31520c == f10) {
            return;
        }
        this.f31520c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
