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
    public static Paint f25000s;
    public static Paint v;
    public static Paint f25001w;
    public int f25002a;
    public int f25003b;
    public float f25004c;
    public ObjectAnimator d;
    public boolean f25005e;
    public boolean f25006f;
    public int h;
    public int f25007n;
    public Drawable f25008r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f25000s == null) {
            Paint paint = new Paint(1);
            f25000s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f25000s.setStyle(Paint.Style.STROKE);
            f25001w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == this.f25006f) {
            return;
        }
        this.f25006f = z4;
        float f10 = 0.0f;
        if (this.f25005e && z10) {
            if (z4) {
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
        if (z4) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void b(int i10, int i11) {
        this.f25003b = i10;
        this.f25002a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f25003b;
    }

    public float getProgress() {
        return this.f25004c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25005e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25005e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f25004c;
        if (f11 <= 0.5f) {
            f25000s.setColor(this.f25003b);
            f25001w.setColor(this.f25003b);
            f10 = this.f25004c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f25003b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f25003b);
            int blue = Color.blue(this.f25003b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f25002a) - red) * f12)), green + ((int) ((Color.green(this.f25002a) - green) * f12)), blue + ((int) ((Color.blue(this.f25002a) - blue) * f12)));
            f25000s.setColor(rgb);
            f25001w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f25000s);
        if (this.f25008r == null) {
            if (this.f25004c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - AndroidUtilities.dp(1.0f), f25001w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, e2.c.w(f13 - AndroidUtilities.dp(1.0f), this.h / 4, f10, this.h / 4), f25001w);
            }
        }
        canvas.restore();
        if (this.f25008r != null) {
            int d = i0.a.d(Utilities.clamp(this.f25004c, 1.0f, 0.0f), this.f25003b, this.f25002a);
            if (this.f25007n != d) {
                Drawable drawable = this.f25008r;
                this.f25007n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f25008r.setBounds((int) ((getWidth() / 2.0f) - (this.f25008r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f25008r.getIntrinsicHeight() / 2.0f)), (int) ((this.f25008r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f25008r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f25008r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f25003b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f25002a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f25007n = 0;
        this.f25008r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f25004c == f10) {
            return;
        }
        this.f25004c = f10;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
