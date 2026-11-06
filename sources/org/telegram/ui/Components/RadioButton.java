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
    public static Paint f31505s;
    public static Paint f31506w;
    public static Paint f31507x;
    public int f31508a;
    public int f31509b;
    public float f31510c;
    public ObjectAnimator d;
    public boolean f31511e;
    public boolean f31512f;
    public int h;
    public int f31513n;
    public Drawable f31514r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f31505s == null) {
            Paint paint = new Paint(1);
            f31505s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f31505s.setStyle(Paint.Style.STROKE);
            f31507x = new Paint(1);
            Paint paint2 = new Paint(1);
            f31506w = paint2;
            paint2.setColor(0);
            f31506w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 == this.f31512f) {
            return;
        }
        this.f31512f = z9;
        float f10 = 0.0f;
        if (this.f31511e && z10) {
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
        this.f31509b = i7;
        this.f31508a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f31508a;
    }

    public int getColor() {
        return this.f31509b;
    }

    public float getProgress() {
        return this.f31510c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31511e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31511e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f31510c;
        if (f11 <= 0.5f) {
            f31505s.setColor(this.f31509b);
            f31507x.setColor(this.f31509b);
            f10 = this.f31510c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f31509b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f31509b);
            int blue = Color.blue(this.f31509b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f31508a) - red) * f12)), green + ((int) ((Color.green(this.f31508a) - green) * f12)), blue + ((int) ((Color.blue(this.f31508a) - blue) * f12)));
            f31505s.setColor(rgb);
            f31507x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f22536p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f31505s);
        if (this.f31514r == null) {
            if (this.f31510c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f31507x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f31506w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f31507x);
            }
        }
        canvas.restore();
        if (this.f31514r != null) {
            int f14 = i0.a.f(Utilities.i(this.f31510c, 1.0f, 0.0f), this.f31509b, this.f31508a);
            if (this.f31513n != f14) {
                Drawable drawable = this.f31514r;
                this.f31513n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f31514r.setBounds((int) ((getWidth() / 2.0f) - (this.f31514r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f31514r.getIntrinsicHeight() / 2.0f)), (int) ((this.f31514r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f31514r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f31514r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f31509b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f31508a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f31513n = 0;
        this.f31514r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31510c == f10) {
            return;
        }
        this.f31510c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
