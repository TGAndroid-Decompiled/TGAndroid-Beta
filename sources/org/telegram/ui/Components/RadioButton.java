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
    public static Paint f31582s;
    public static Paint f31583w;
    public static Paint f31584x;
    public int f31585a;
    public int f31586b;
    public float f31587c;
    public ObjectAnimator d;
    public boolean f31588e;
    public boolean f31589f;
    public int h;
    public int f31590n;
    public Drawable f31591r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (f31582s == null) {
            Paint paint = new Paint(1);
            f31582s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f31582s.setStyle(Paint.Style.STROKE);
            f31584x = new Paint(1);
            Paint paint2 = new Paint(1);
            f31583w = paint2;
            paint2.setColor(0);
            f31583w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f31589f) {
            return;
        }
        this.f31589f = z10;
        float f10 = 0.0f;
        if (this.f31588e && z11) {
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

    public final void b(int i3, int i10) {
        this.f31586b = i3;
        this.f31585a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f31585a;
    }

    public int getColor() {
        return this.f31586b;
    }

    public float getProgress() {
        return this.f31587c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31588e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31588e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f31587c;
        if (f11 <= 0.5f) {
            f31582s.setColor(this.f31586b);
            f31584x.setColor(this.f31586b);
            f10 = this.f31587c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f31586b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f31586b);
            int blue = Color.blue(this.f31586b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f31585a) - red) * f12)), green + ((int) ((Color.green(this.f31585a) - green) * f12)), blue + ((int) ((Color.blue(this.f31585a) - blue) * f12)));
            f31582s.setColor(rgb);
            f31584x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.f22607p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f31582s);
        if (this.f31591r == null) {
            if (this.f31587c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), f31584x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), f31583w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.y(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), f31584x);
            }
        }
        canvas.restore();
        if (this.f31591r != null) {
            int f14 = i0.a.f(Utilities.i(this.f31587c, 1.0f, 0.0f), this.f31586b, this.f31585a);
            if (this.f31590n != f14) {
                Drawable drawable = this.f31591r;
                this.f31590n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.f31591r.setBounds((int) ((getWidth() / 2.0f) - (this.f31591r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f31591r.getIntrinsicHeight() / 2.0f)), (int) ((this.f31591r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f31591r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f31591r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.f31586b = i3;
        invalidate();
    }

    public void setCheckedColor(int i3) {
        this.f31585a = i3;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f31590n = 0;
        this.f31591r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31587c == f10) {
            return;
        }
        this.f31587c = f10;
        invalidate();
    }

    public void setSize(int i3) {
        if (this.h == i3) {
            return;
        }
        this.h = i3;
    }
}
