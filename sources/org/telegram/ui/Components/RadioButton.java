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
    public static Paint f24333s;
    public static Paint v;
    public static Paint f24334w;
    public int f24335a;
    public int f24336b;
    public float f24337c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24338f;
    public int h;
    public int f24339n;
    public Drawable f24340r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24333s == null) {
            Paint paint = new Paint(1);
            f24333s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24333s.setStyle(Paint.Style.STROKE);
            f24334w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24338f) {
            return;
        }
        this.f24338f = z10;
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
        this.f24336b = i10;
        this.f24335a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24336b;
    }

    public float getProgress() {
        return this.f24337c;
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
        float f10 = this.f24337c;
        if (f10 <= 0.5f) {
            f24333s.setColor(this.f24336b);
            f24334w.setColor(this.f24336b);
            f7 = this.f24337c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24336b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24336b);
            int blue = Color.blue(this.f24336b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24335a) - red) * f11)), green + ((int) ((Color.green(this.f24335a) - green) * f11)), blue + ((int) ((Color.blue(this.f24335a) - blue) * f11)));
            f24333s.setColor(rgb);
            f24334w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24333s);
        if (this.f24340r == null) {
            if (this.f24337c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24334w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.play_billing.k3.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24334w);
            }
        }
        canvas.restore();
        if (this.f24340r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f24337c, 1.0f, 0.0f), this.f24336b, this.f24335a);
            if (this.f24339n != f13) {
                Drawable drawable = this.f24340r;
                this.f24339n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24340r.setBounds((int) ((getWidth() / 2.0f) - (this.f24340r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24340r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24340r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24340r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24340r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24336b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24335a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24339n = 0;
        this.f24340r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24337c == f7) {
            return;
        }
        this.f24337c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
