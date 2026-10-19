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
    public static Paint f24335s;
    public static Paint v;
    public static Paint f24336w;
    public int f24337a;
    public int f24338b;
    public float f24339c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24340f;
    public int h;
    public int f24341n;
    public Drawable f24342r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24335s == null) {
            Paint paint = new Paint(1);
            f24335s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24335s.setStyle(Paint.Style.STROKE);
            f24336w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24340f) {
            return;
        }
        this.f24340f = z10;
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
        this.f24338b = i10;
        this.f24337a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24338b;
    }

    public float getProgress() {
        return this.f24339c;
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
        float f10 = this.f24339c;
        if (f10 <= 0.5f) {
            f24335s.setColor(this.f24338b);
            f24336w.setColor(this.f24338b);
            f7 = this.f24339c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24338b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24338b);
            int blue = Color.blue(this.f24338b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24337a) - red) * f11)), green + ((int) ((Color.green(this.f24337a) - green) * f11)), blue + ((int) ((Color.blue(this.f24337a) - blue) * f11)));
            f24335s.setColor(rgb);
            f24336w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24335s);
        if (this.f24342r == null) {
            if (this.f24339c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24336w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.play_billing.k3.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24336w);
            }
        }
        canvas.restore();
        if (this.f24342r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f24339c, 1.0f, 0.0f), this.f24338b, this.f24337a);
            if (this.f24341n != f13) {
                Drawable drawable = this.f24342r;
                this.f24341n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24342r.setBounds((int) ((getWidth() / 2.0f) - (this.f24342r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24342r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24342r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24342r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24342r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24338b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24337a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24341n = 0;
        this.f24342r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24339c == f7) {
            return;
        }
        this.f24339c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
