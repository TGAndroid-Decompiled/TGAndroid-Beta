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
    public static Paint f32689s;
    public static Paint f32690w;
    public static Paint f32691x;
    public int f32692a;
    public int f32693b;
    public float f32694c;
    public ObjectAnimator d;
    public boolean f32695e;
    public boolean f32696f;
    public int h;
    public int f32697n;
    public Drawable f32698r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f32689s == null) {
            Paint paint = new Paint(1);
            f32689s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f32689s.setStyle(Paint.Style.STROKE);
            f32691x = new Paint(1);
            Paint paint2 = new Paint(1);
            f32690w = paint2;
            paint2.setColor(0);
            f32690w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f32696f) {
            return;
        }
        this.f32696f = z10;
        float f10 = 0.0f;
        if (this.f32695e && z11) {
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
        this.f32693b = i7;
        this.f32692a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f32692a;
    }

    public int getColor() {
        return this.f32693b;
    }

    public float getProgress() {
        return this.f32694c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32695e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32695e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f32694c;
        if (f11 <= 0.5f) {
            f32689s.setColor(this.f32693b);
            f32691x.setColor(this.f32693b);
            f10 = this.f32694c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f32693b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f32693b);
            int blue = Color.blue(this.f32693b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f32692a) - red) * f12)), green + ((int) ((Color.green(this.f32692a) - green) * f12)), blue + ((int) ((Color.blue(this.f32692a) - blue) * f12)));
            f32689s.setColor(rgb);
            f32691x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f23610p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f32689s);
        if (this.f32698r == null) {
            if (this.f32694c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f32691x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f32690w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f32691x);
            }
        }
        canvas.restore();
        if (this.f32698r != null) {
            int f14 = i0.a.f(Utilities.i(this.f32694c, 1.0f, 0.0f), this.f32693b, this.f32692a);
            if (this.f32697n != f14) {
                Drawable drawable = this.f32698r;
                this.f32697n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f32698r.setBounds((int) ((getWidth() / 2.0f) - (this.f32698r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f32698r.getIntrinsicHeight() / 2.0f)), (int) ((this.f32698r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f32698r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f32698r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f32693b = i7;
        invalidate();
    }

    public void setCheckedColor(int i7) {
        this.f32692a = i7;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f32697n = 0;
        this.f32698r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f32694c == f10) {
            return;
        }
        this.f32694c = f10;
        invalidate();
    }

    public void setSize(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
    }
}
