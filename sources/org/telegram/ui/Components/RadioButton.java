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
    public static Paint f33088s;
    public static Paint f33089w;
    public static Paint f33090x;
    public int f33091a;
    public int f33092b;
    public float f33093c;
    public ObjectAnimator d;
    public boolean f33094e;
    public boolean f33095f;
    public int h;
    public int f33096n;
    public Drawable f33097r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f33088s == null) {
            Paint paint = new Paint(1);
            f33088s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f33088s.setStyle(Paint.Style.STROKE);
            f33090x = new Paint(1);
            Paint paint2 = new Paint(1);
            f33089w = paint2;
            paint2.setColor(0);
            f33089w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f33095f) {
            return;
        }
        this.f33095f = z10;
        float f10 = 0.0f;
        if (this.f33094e && z11) {
            if (z10) {
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
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void b(int i7, int i10) {
        this.f33092b = i7;
        this.f33091a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f33091a;
    }

    public int getColor() {
        return this.f33092b;
    }

    public float getProgress() {
        return this.f33093c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33094e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33094e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f33093c;
        if (f11 <= 0.5f) {
            f33088s.setColor(this.f33092b);
            f33090x.setColor(this.f33092b);
            f10 = this.f33093c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f33092b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f33092b);
            int blue = Color.blue(this.f33092b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f33091a) - red) * f12)), green + ((int) ((Color.green(this.f33091a) - green) * f12)), blue + ((int) ((Color.blue(this.f33091a) - blue) * f12)));
            f33088s.setColor(rgb);
            f33090x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f24009p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f33088s);
        if (this.f33097r == null) {
            if (this.f33093c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f33090x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f33089w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f33090x);
            }
        }
        canvas.restore();
        if (this.f33097r != null) {
            int f14 = i0.a.f(Utilities.i(this.f33093c, 1.0f, 0.0f), this.f33092b, this.f33091a);
            if (this.f33096n != f14) {
                Drawable drawable = this.f33097r;
                this.f33096n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f33097r.setBounds((int) ((getWidth() / 2.0f) - (this.f33097r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f33097r.getIntrinsicHeight() / 2.0f)), (int) ((this.f33097r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f33097r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f33097r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f33092b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f33091a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f33096n = 0;
        this.f33097r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f33093c == f10) {
            return;
        }
        this.f33093c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
