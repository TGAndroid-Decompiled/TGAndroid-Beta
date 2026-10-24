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
    public static Paint f24483s;
    public static Paint v;
    public static Paint f24484w;
    public int f24485a;
    public int f24486b;
    public float f24487c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24488f;
    public int h;
    public int f24489n;
    public Drawable f24490r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24483s == null) {
            Paint paint = new Paint(1);
            f24483s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24483s.setStyle(Paint.Style.STROKE);
            f24484w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24488f) {
            return;
        }
        this.f24488f = z10;
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
        this.f24486b = i10;
        this.f24485a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f24485a;
    }

    public int getColor() {
        return this.f24486b;
    }

    public float getProgress() {
        return this.f24487c;
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
        float f10 = this.f24487c;
        if (f10 <= 0.5f) {
            f24483s.setColor(this.f24486b);
            f24484w.setColor(this.f24486b);
            f7 = this.f24487c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24486b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24486b);
            int blue = Color.blue(this.f24486b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24485a) - red) * f11)), green + ((int) ((Color.green(this.f24485a) - green) * f11)), blue + ((int) ((Color.blue(this.f24485a) - blue) * f11)));
            f24483s.setColor(rgb);
            f24484w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24483s);
        if (this.f24490r == null) {
            if (this.f24487c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24484w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.play_billing.k3.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24484w);
            }
        }
        canvas.restore();
        if (this.f24490r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f24487c, 1.0f, 0.0f), this.f24486b, this.f24485a);
            if (this.f24489n != f13) {
                Drawable drawable = this.f24490r;
                this.f24489n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24490r.setBounds((int) ((getWidth() / 2.0f) - (this.f24490r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24490r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24490r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24490r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24490r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24486b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24485a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24489n = 0;
        this.f24490r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24487c == f7) {
            return;
        }
        this.f24487c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
