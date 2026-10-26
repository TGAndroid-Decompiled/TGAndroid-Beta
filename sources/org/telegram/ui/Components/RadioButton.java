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
    public static Paint f26275s;
    public static Paint v;
    public static Paint f26276w;
    public int f26277a;
    public int f26278b;
    public float f26279c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f26280f;
    public int h;
    public int f26281n;
    public Drawable f26282r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26275s == null) {
            Paint paint = new Paint(1);
            f26275s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26275s.setStyle(Paint.Style.STROKE);
            f26276w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26280f) {
            return;
        }
        this.f26280f = z10;
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
        this.f26278b = i10;
        this.f26277a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f26277a;
    }

    public int getColor() {
        return this.f26278b;
    }

    public float getProgress() {
        return this.f26279c;
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
        float f10 = this.f26279c;
        if (f10 <= 0.5f) {
            f26275s.setColor(this.f26278b);
            f26276w.setColor(this.f26278b);
            f7 = this.f26279c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f26278b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f26278b);
            int blue = Color.blue(this.f26278b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f26277a) - red) * f11)), green + ((int) ((Color.green(this.f26277a) - green) * f11)), blue + ((int) ((Color.blue(this.f26277a) - blue) * f11)));
            f26275s.setColor(rgb);
            f26276w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f26275s);
        if (this.f26282r == null) {
            if (this.f26279c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f26276w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, c3.h0.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f26276w);
            }
        }
        canvas.restore();
        if (this.f26282r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f26279c, 1.0f, 0.0f), this.f26278b, this.f26277a);
            if (this.f26281n != f13) {
                Drawable drawable = this.f26282r;
                this.f26281n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f26282r.setBounds((int) ((getWidth() / 2.0f) - (this.f26282r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26282r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26282r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26282r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26282r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26278b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f26277a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26281n = 0;
        this.f26282r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f26279c == f7) {
            return;
        }
        this.f26279c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
