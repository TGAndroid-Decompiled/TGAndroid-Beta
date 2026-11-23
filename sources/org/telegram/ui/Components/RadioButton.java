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
    public static Paint f33122s;
    public static Paint f33123w;
    public static Paint f33124x;
    public int f33125a;
    public int f33126b;
    public float f33127c;
    public ObjectAnimator d;
    public boolean f33128e;
    public boolean f33129f;
    public int h;
    public int f33130n;
    public Drawable f33131r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f33122s == null) {
            Paint paint = new Paint(1);
            f33122s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f33122s.setStyle(Paint.Style.STROKE);
            f33124x = new Paint(1);
            Paint paint2 = new Paint(1);
            f33123w = paint2;
            paint2.setColor(0);
            f33123w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f33129f) {
            return;
        }
        this.f33129f = z10;
        float f10 = 0.0f;
        if (this.f33128e && z11) {
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
        this.f33126b = i7;
        this.f33125a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f33125a;
    }

    public int getColor() {
        return this.f33126b;
    }

    public float getProgress() {
        return this.f33127c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33128e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33128e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f33127c;
        if (f11 <= 0.5f) {
            f33122s.setColor(this.f33126b);
            f33124x.setColor(this.f33126b);
            f10 = this.f33127c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f33126b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f33126b);
            int blue = Color.blue(this.f33126b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f33125a) - red) * f12)), green + ((int) ((Color.green(this.f33125a) - green) * f12)), blue + ((int) ((Color.blue(this.f33125a) - blue) * f12)));
            f33122s.setColor(rgb);
            f33124x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f24045p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f33122s);
        if (this.f33131r == null) {
            if (this.f33127c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f33124x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f33123w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f33124x);
            }
        }
        canvas.restore();
        if (this.f33131r != null) {
            int f14 = i0.a.f(Utilities.i(this.f33127c, 1.0f, 0.0f), this.f33126b, this.f33125a);
            if (this.f33130n != f14) {
                Drawable drawable = this.f33131r;
                this.f33130n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f33131r.setBounds((int) ((getWidth() / 2.0f) - (this.f33131r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f33131r.getIntrinsicHeight() / 2.0f)), (int) ((this.f33131r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f33131r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f33131r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f33126b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f33125a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f33130n = 0;
        this.f33131r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f33127c == f10) {
            return;
        }
        this.f33127c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
