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
    public static Paint f24322s;
    public static Paint v;
    public static Paint f24323w;
    public int f24324a;
    public int f24325b;
    public float f24326c;
    public ObjectAnimator d;
    public boolean f24327e;
    public boolean f24328f;
    public int h;
    public int f24329n;
    public Drawable f24330r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24322s == null) {
            Paint paint = new Paint(1);
            f24322s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24322s.setStyle(Paint.Style.STROKE);
            f24323w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24328f) {
            return;
        }
        this.f24328f = z10;
        float f7 = 0.0f;
        if (this.f24327e && z11) {
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
        this.f24325b = i10;
        this.f24324a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24325b;
    }

    public float getProgress() {
        return this.f24326c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24327e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24327e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24326c;
        if (f10 <= 0.5f) {
            f24322s.setColor(this.f24325b);
            f24323w.setColor(this.f24325b);
            f7 = this.f24326c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24325b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24325b);
            int blue = Color.blue(this.f24325b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24324a) - red) * f11)), green + ((int) ((Color.green(this.f24324a) - green) * f11)), blue + ((int) ((Color.blue(this.f24324a) - blue) * f11)));
            f24322s.setColor(rgb);
            f24323w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24322s);
        if (this.f24330r == null) {
            if (this.f24326c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24323w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24323w);
            }
        }
        canvas.restore();
        if (this.f24330r != null) {
            int d = i0.a.d(Utilities.clamp(this.f24326c, 1.0f, 0.0f), this.f24325b, this.f24324a);
            if (this.f24329n != d) {
                Drawable drawable = this.f24330r;
                this.f24329n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f24330r.setBounds((int) ((getWidth() / 2.0f) - (this.f24330r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24330r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24330r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24330r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24330r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24325b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24324a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24329n = 0;
        this.f24330r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24326c == f7) {
            return;
        }
        this.f24326c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
