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
    public static Paint f33086s;
    public static Paint f33087w;
    public static Paint f33088x;
    public int f33089a;
    public int f33090b;
    public float f33091c;
    public ObjectAnimator d;
    public boolean f33092e;
    public boolean f33093f;
    public int h;
    public int f33094n;
    public Drawable f33095r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f33086s == null) {
            Paint paint = new Paint(1);
            f33086s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f33086s.setStyle(Paint.Style.STROKE);
            f33088x = new Paint(1);
            Paint paint2 = new Paint(1);
            f33087w = paint2;
            paint2.setColor(0);
            f33087w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f33093f) {
            return;
        }
        this.f33093f = z10;
        float f10 = 0.0f;
        if (this.f33092e && z11) {
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
        this.f33090b = i7;
        this.f33089a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f33089a;
    }

    public int getColor() {
        return this.f33090b;
    }

    public float getProgress() {
        return this.f33091c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33092e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33092e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f33091c;
        if (f11 <= 0.5f) {
            f33086s.setColor(this.f33090b);
            f33088x.setColor(this.f33090b);
            f10 = this.f33091c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f33090b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f33090b);
            int blue = Color.blue(this.f33090b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f33089a) - red) * f12)), green + ((int) ((Color.green(this.f33089a) - green) * f12)), blue + ((int) ((Color.blue(this.f33089a) - blue) * f12)));
            f33086s.setColor(rgb);
            f33088x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f24120p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f33086s);
        if (this.f33095r == null) {
            if (this.f33091c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f33088x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f33087w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f33088x);
            }
        }
        canvas.restore();
        if (this.f33095r != null) {
            int f14 = i0.a.f(Utilities.i(this.f33091c, 1.0f, 0.0f), this.f33090b, this.f33089a);
            if (this.f33094n != f14) {
                Drawable drawable = this.f33095r;
                this.f33094n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f33095r.setBounds((int) ((getWidth() / 2.0f) - (this.f33095r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f33095r.getIntrinsicHeight() / 2.0f)), (int) ((this.f33095r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f33095r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f33095r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f33090b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f33089a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f33094n = 0;
        this.f33095r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f33091c == f10) {
            return;
        }
        this.f33091c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
