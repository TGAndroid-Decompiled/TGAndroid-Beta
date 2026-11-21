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
    public static Paint f33119s;
    public static Paint f33120w;
    public static Paint f33121x;
    public int f33122a;
    public int f33123b;
    public float f33124c;
    public ObjectAnimator d;
    public boolean f33125e;
    public boolean f33126f;
    public int h;
    public int f33127n;
    public Drawable f33128r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f33119s == null) {
            Paint paint = new Paint(1);
            f33119s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f33119s.setStyle(Paint.Style.STROKE);
            f33121x = new Paint(1);
            Paint paint2 = new Paint(1);
            f33120w = paint2;
            paint2.setColor(0);
            f33120w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f33126f) {
            return;
        }
        this.f33126f = z10;
        float f10 = 0.0f;
        if (this.f33125e && z11) {
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
        this.f33123b = i7;
        this.f33122a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f33122a;
    }

    public int getColor() {
        return this.f33123b;
    }

    public float getProgress() {
        return this.f33124c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33125e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33125e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f33124c;
        if (f11 <= 0.5f) {
            f33119s.setColor(this.f33123b);
            f33121x.setColor(this.f33123b);
            f10 = this.f33124c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f33123b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f33123b);
            int blue = Color.blue(this.f33123b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f33122a) - red) * f12)), green + ((int) ((Color.green(this.f33122a) - green) * f12)), blue + ((int) ((Color.blue(this.f33122a) - blue) * f12)));
            f33119s.setColor(rgb);
            f33121x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f24145p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f33119s);
        if (this.f33128r == null) {
            if (this.f33124c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f33121x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f33120w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f33121x);
            }
        }
        canvas.restore();
        if (this.f33128r != null) {
            int f14 = i0.a.f(Utilities.i(this.f33124c, 1.0f, 0.0f), this.f33123b, this.f33122a);
            if (this.f33127n != f14) {
                Drawable drawable = this.f33128r;
                this.f33127n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f33128r.setBounds((int) ((getWidth() / 2.0f) - (this.f33128r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f33128r.getIntrinsicHeight() / 2.0f)), (int) ((this.f33128r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f33128r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f33128r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f33123b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f33122a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f33127n = 0;
        this.f33128r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f33124c == f10) {
            return;
        }
        this.f33124c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
