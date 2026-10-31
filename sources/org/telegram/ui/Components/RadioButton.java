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
    public static Paint f24155s;
    public static Paint f24156w;
    public static Paint f24157x;
    public int f24158a;
    public int f24159b;
    public float f24160c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24161f;
    public int h;
    public int f24162n;
    public Drawable f24163r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.i0.L(16.0f);
        if (f24155s == null) {
            Paint paint = new Paint(1);
            f24155s = paint;
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            f24155s.setStyle(Paint.Style.STROKE);
            f24157x = new Paint(1);
            Paint paint2 = new Paint(1);
            f24156w = paint2;
            paint2.setColor(0);
            f24156w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24161f) {
            return;
        }
        this.f24161f = z10;
        float f7 = 0.0f;
        if (this.e && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
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
            f7 = 1.0f;
        }
        setProgress(f7);
    }

    public final void b(int i10, int i11) {
        this.f24159b = i10;
        this.f24158a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f24158a;
    }

    public int getColor() {
        return this.f24159b;
    }

    public float getProgress() {
        return this.f24160c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24160c;
        if (f10 <= 0.5f) {
            f24155s.setColor(this.f24159b);
            f24157x.setColor(this.f24159b);
            f7 = this.f24160c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24159b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24159b);
            int blue = Color.blue(this.f24159b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24158a) - red) * f11)), green + ((int) ((Color.green(this.f24158a) - green) * f11)), blue + ((int) ((Color.blue(this.f24158a) - blue) * f11)));
            f24155s.setColor(rgb);
            f24157x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * org.telegram.messenger.i0.f16025p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24155s);
        if (this.f24163r == null) {
            if (this.f24160c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - org.telegram.messenger.i0.L(1.0f), f24157x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - org.telegram.messenger.i0.L(1.0f)), f24156w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, c3.i0.z(f12 - org.telegram.messenger.i0.L(1.0f), this.h / 4, f7, this.h / 4), f24157x);
            }
        }
        canvas.restore();
        if (this.f24163r != null) {
            int f13 = i0.b.f(Utilities.i(this.f24160c, 1.0f, 0.0f), this.f24159b, this.f24158a);
            if (this.f24162n != f13) {
                Drawable drawable = this.f24163r;
                this.f24162n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24163r.setBounds((int) ((getWidth() / 2.0f) - (this.f24163r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24163r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24163r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24163r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24163r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24159b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24158a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24162n = 0;
        this.f24163r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24160c == f7) {
            return;
        }
        this.f24160c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
