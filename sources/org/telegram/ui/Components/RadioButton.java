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
    public static Paint f24332s;
    public static Paint v;
    public static Paint f24333w;
    public int f24334a;
    public int f24335b;
    public float f24336c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f24337f;
    public int h;
    public int f24338n;
    public Drawable f24339r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24332s == null) {
            Paint paint = new Paint(1);
            f24332s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24332s.setStyle(Paint.Style.STROKE);
            f24333w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24337f) {
            return;
        }
        this.f24337f = z10;
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
        this.f24335b = i10;
        this.f24334a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24335b;
    }

    public float getProgress() {
        return this.f24336c;
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
        float f10 = this.f24336c;
        if (f10 <= 0.5f) {
            f24332s.setColor(this.f24335b);
            f24333w.setColor(this.f24335b);
            f7 = this.f24336c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24335b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24335b);
            int blue = Color.blue(this.f24335b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24334a) - red) * f11)), green + ((int) ((Color.green(this.f24334a) - green) * f11)), blue + ((int) ((Color.blue(this.f24334a) - blue) * f11)));
            f24332s.setColor(rgb);
            f24333w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24332s);
        if (this.f24339r == null) {
            if (this.f24336c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24333w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.cast.a6.x(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24333w);
            }
        }
        canvas.restore();
        if (this.f24339r != null) {
            int f13 = i0.b.f(Utilities.clamp(this.f24336c, 1.0f, 0.0f), this.f24335b, this.f24334a);
            if (this.f24338n != f13) {
                Drawable drawable = this.f24339r;
                this.f24338n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f24339r.setBounds((int) ((getWidth() / 2.0f) - (this.f24339r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24339r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24339r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24339r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24339r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24335b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24334a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24338n = 0;
        this.f24339r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24336c == f7) {
            return;
        }
        this.f24336c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
