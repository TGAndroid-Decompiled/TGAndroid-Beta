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
    public static Paint f24156s;
    public static Paint f24157w;
    public static Paint f24158x;
    public int f24159a;
    public int f24160b;
    public float f24161c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24162f;
    public int h;
    public int f24163n;
    public Drawable f24164r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.i0.L(16.0f);
        if (f24156s == null) {
            Paint paint = new Paint(1);
            f24156s = paint;
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            f24156s.setStyle(Paint.Style.STROKE);
            f24158x = new Paint(1);
            Paint paint2 = new Paint(1);
            f24157w = paint2;
            paint2.setColor(0);
            f24157w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24162f) {
            return;
        }
        this.f24162f = z10;
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
        this.f24160b = i10;
        this.f24159a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f24159a;
    }

    public int getColor() {
        return this.f24160b;
    }

    public float getProgress() {
        return this.f24161c;
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
        float f10 = this.f24161c;
        if (f10 <= 0.5f) {
            f24156s.setColor(this.f24160b);
            f24158x.setColor(this.f24160b);
            f7 = this.f24161c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24160b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24160b);
            int blue = Color.blue(this.f24160b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24159a) - red) * f11)), green + ((int) ((Color.green(this.f24159a) - green) * f11)), blue + ((int) ((Color.blue(this.f24159a) - blue) * f11)));
            f24156s.setColor(rgb);
            f24158x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * org.telegram.messenger.i0.f16171p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24156s);
        if (this.f24164r == null) {
            if (this.f24161c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - org.telegram.messenger.i0.L(1.0f), f24158x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - org.telegram.messenger.i0.L(1.0f)), f24157w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, c3.i0.z(f12 - org.telegram.messenger.i0.L(1.0f), this.h / 4, f7, this.h / 4), f24158x);
            }
        }
        canvas.restore();
        if (this.f24164r != null) {
            int f13 = i0.b.f(Utilities.i(this.f24161c, 1.0f, 0.0f), this.f24160b, this.f24159a);
            if (this.f24163n != f13) {
                Drawable drawable = this.f24164r;
                this.f24163n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24164r.setBounds((int) ((getWidth() / 2.0f) - (this.f24164r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24164r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24164r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24164r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24164r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24160b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24159a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24163n = 0;
        this.f24164r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24161c == f7) {
            return;
        }
        this.f24161c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
