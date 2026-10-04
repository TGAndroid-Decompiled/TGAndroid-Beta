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
    public static Paint f24295s;
    public static Paint v;
    public static Paint f24296w;
    public int f24297a;
    public int f24298b;
    public float f24299c;
    public ObjectAnimator d;
    public boolean f24300e;
    public boolean f24301f;
    public int h;
    public int f24302n;
    public Drawable f24303r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24295s == null) {
            Paint paint = new Paint(1);
            f24295s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24295s.setStyle(Paint.Style.STROKE);
            f24296w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24301f) {
            return;
        }
        this.f24301f = z10;
        float f7 = 0.0f;
        if (this.f24300e && z11) {
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
        this.f24298b = i10;
        this.f24297a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24298b;
    }

    public float getProgress() {
        return this.f24299c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24300e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24300e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24299c;
        if (f10 <= 0.5f) {
            f24295s.setColor(this.f24298b);
            f24296w.setColor(this.f24298b);
            f7 = this.f24299c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24298b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24298b);
            int blue = Color.blue(this.f24298b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24297a) - red) * f11)), green + ((int) ((Color.green(this.f24297a) - green) * f11)), blue + ((int) ((Color.blue(this.f24297a) - blue) * f11)));
            f24295s.setColor(rgb);
            f24296w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24295s);
        if (this.f24303r == null) {
            if (this.f24299c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24296w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24296w);
            }
        }
        canvas.restore();
        if (this.f24303r != null) {
            int d = i0.a.d(Utilities.clamp(this.f24299c, 1.0f, 0.0f), this.f24298b, this.f24297a);
            if (this.f24302n != d) {
                Drawable drawable = this.f24303r;
                this.f24302n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f24303r.setBounds((int) ((getWidth() / 2.0f) - (this.f24303r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24303r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24303r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24303r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24303r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24298b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24297a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24302n = 0;
        this.f24303r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24299c == f7) {
            return;
        }
        this.f24299c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
