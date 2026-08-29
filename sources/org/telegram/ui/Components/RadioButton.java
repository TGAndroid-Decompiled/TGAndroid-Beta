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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class RadioButton extends View {
    public static Paint f26513s;
    public static Paint v;
    public static Paint f26514w;
    public int f26515a;
    public int f26516b;
    public float f26517c;
    public ObjectAnimator d;
    public boolean f26518e;
    public boolean f26519f;
    public int h;
    public int f26520n;
    public Drawable f26521r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26513s == null) {
            Paint paint = new Paint(1);
            f26513s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26513s.setStyle(Paint.Style.STROKE);
            f26514w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26519f) {
            return;
        }
        this.f26519f = z10;
        float f9 = 0.0f;
        if (this.f26518e && z11) {
            if (z10) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f9);
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
            f9 = 1.0f;
        }
        setProgress(f9);
    }

    public final void b(int i10, int i11) {
        this.f26516b = i10;
        this.f26515a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f26516b;
    }

    public float getProgress() {
        return this.f26517c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26518e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26518e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10 = this.f26517c;
        if (f10 <= 0.5f) {
            f26513s.setColor(this.f26516b);
            f26514w.setColor(this.f26516b);
            f9 = this.f26517c / 0.5f;
        } else {
            f9 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f26516b);
            float f11 = 1.0f - f9;
            int green = Color.green(this.f26516b);
            int blue = Color.blue(this.f26516b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f26515a) - red) * f11)), green + ((int) ((Color.green(this.f26515a) - green) * f11)), blue + ((int) ((Color.blue(this.f26515a) - blue) * f11)));
            f26513s.setColor(rgb);
            f26514w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f9 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f26513s);
        if (this.f26521r == null) {
            if (this.f26517c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f26514w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f9) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f9, this.h / 4), f26514w);
            }
        }
        canvas.restore();
        if (this.f26521r != null) {
            int d = i0.a.d(Utilities.clamp(this.f26517c, 1.0f, 0.0f), this.f26516b, this.f26515a);
            if (this.f26520n != d) {
                Drawable drawable = this.f26521r;
                this.f26520n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f26521r.setBounds((int) ((getWidth() / 2.0f) - (this.f26521r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26521r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26521r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26521r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26521r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26516b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f26515a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26520n = 0;
        this.f26521r = drawable;
        invalidate();
    }

    public void setProgress(float f9) {
        if (this.f26517c == f9) {
            return;
        }
        this.f26517c = f9;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
