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
    public static Paint s;
    public static Paint w;
    public static Paint x;
    public int a;
    public int b;
    public float c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public Drawable r;

    public RadioButton(Context context) {
        super(context);
        this.h = gl.L(16.0f);
        if (s == null) {
            Paint paint = new Paint(1);
            s = paint;
            paint.setStrokeWidth(gl.L(2.0f));
            s.setStyle(Paint.Style.STROKE);
            x = new Paint(1);
            Paint paint2 = new Paint(1);
            w = paint2;
            paint2.setColor(0);
            w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        float f = 0.0f;
        if (this.e && z2) {
            if (z) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f);
            this.d = ofFloat;
            ofFloat.setDuration(200L);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
            f = 1.0f;
        }
        setProgress(f);
    }

    public final void b(int i, int i2) {
        this.b = i;
        this.a = i2;
        invalidate();
    }

    public int getCheckedColor() {
        return this.a;
    }

    public int getColor() {
        return this.b;
    }

    public float getProgress() {
        return this.c;
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
        float f;
        float f2 = this.c;
        if (f2 <= 0.5f) {
            s.setColor(this.b);
            x.setColor(this.b);
            f = this.c / 0.5f;
        } else {
            f = 2.0f - (f2 / 0.5f);
            int red = Color.red(this.b);
            float f3 = 1.0f - f;
            int green = Color.green(this.b);
            int blue = Color.blue(this.b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.a) - red) * f3)), green + ((int) ((Color.green(this.a) - green) * f3)), blue + ((int) ((Color.blue(this.a) - blue) * f3)));
            s.setColor(rgb);
            x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f4 = (this.h / 2) - ((f + 1.0f) * gl.p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4, s);
        if (this.r == null) {
            if (this.c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f4 - gl.L(1.0f), x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f) * (f4 - gl.L(1.0f)), w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, tb4.A(f4 - gl.L(1.0f), this.h / 4, f, this.h / 4), x);
            }
        }
        canvas.restore();
        if (this.r != null) {
            int f5 = bm2.f(Utilities.i(this.c, 1.0f, 0.0f), this.b, this.a);
            if (this.n != f5) {
                Drawable drawable = this.r;
                this.n = f5;
                drawable.setColorFilter(new PorterDuffColorFilter(f5, PorterDuff.Mode.SRC_IN));
            }
            this.r.setBounds((int) ((getWidth() / 2.0f) - (this.r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.r.getIntrinsicHeight() / 2.0f)), (int) ((this.r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.b = i;
        invalidate();
    }

    public void setCheckedColor(int i) {
        this.a = i;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.n = 0;
        this.r = drawable;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        invalidate();
    }

    public void setSize(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
    }
}
