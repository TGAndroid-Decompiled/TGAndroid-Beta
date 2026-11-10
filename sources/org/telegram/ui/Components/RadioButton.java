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
    public static Paint f31526s;
    public static Paint f31527w;
    public static Paint f31528x;
    public int f31529a;
    public int f31530b;
    public float f31531c;
    public ObjectAnimator d;
    public boolean f31532e;
    public boolean f31533f;
    public int h;
    public int f31534n;
    public Drawable f31535r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f31526s == null) {
            Paint paint = new Paint(1);
            f31526s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f31526s.setStyle(Paint.Style.STROKE);
            f31528x = new Paint(1);
            Paint paint2 = new Paint(1);
            f31527w = paint2;
            paint2.setColor(0);
            f31527w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 == this.f31533f) {
            return;
        }
        this.f31533f = z9;
        float f10 = 0.0f;
        if (this.f31532e && z10) {
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
        this.f31530b = i7;
        this.f31529a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f31529a;
    }

    public int getColor() {
        return this.f31530b;
    }

    public float getProgress() {
        return this.f31531c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31532e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31532e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f31531c;
        if (f11 <= 0.5f) {
            f31526s.setColor(this.f31530b);
            f31528x.setColor(this.f31530b);
            f10 = this.f31531c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f31530b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f31530b);
            int blue = Color.blue(this.f31530b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f31529a) - red) * f12)), green + ((int) ((Color.green(this.f31529a) - green) * f12)), blue + ((int) ((Color.blue(this.f31529a) - blue) * f12)));
            f31526s.setColor(rgb);
            f31528x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f22566p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f31526s);
        if (this.f31535r == null) {
            if (this.f31531c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f31528x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f31527w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f31528x);
            }
        }
        canvas.restore();
        if (this.f31535r != null) {
            int f14 = i0.a.f(Utilities.i(this.f31531c, 1.0f, 0.0f), this.f31530b, this.f31529a);
            if (this.f31534n != f14) {
                Drawable drawable = this.f31535r;
                this.f31534n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f31535r.setBounds((int) ((getWidth() / 2.0f) - (this.f31535r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f31535r.getIntrinsicHeight() / 2.0f)), (int) ((this.f31535r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f31535r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f31535r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f31530b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f31529a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f31534n = 0;
        this.f31535r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31531c == f10) {
            return;
        }
        this.f31531c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
