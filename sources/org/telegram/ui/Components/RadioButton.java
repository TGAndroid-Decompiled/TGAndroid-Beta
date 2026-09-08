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
    public static Paint f24131s;
    public static Paint v;
    public static Paint f24132w;
    public int f24133a;
    public int f24134b;
    public float f24135c;
    public ObjectAnimator d;
    public boolean f24136e;
    public boolean f24137f;
    public int h;
    public int f24138n;
    public Drawable f24139r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24131s == null) {
            Paint paint = new Paint(1);
            f24131s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24131s.setStyle(Paint.Style.STROKE);
            f24132w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24137f) {
            return;
        }
        this.f24137f = z10;
        float f7 = 0.0f;
        if (this.f24136e && z11) {
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
        this.f24134b = i10;
        this.f24133a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24134b;
    }

    public float getProgress() {
        return this.f24135c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24136e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24136e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24135c;
        if (f10 <= 0.5f) {
            f24131s.setColor(this.f24134b);
            f24132w.setColor(this.f24134b);
            f7 = this.f24135c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24134b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24134b);
            int blue = Color.blue(this.f24134b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24133a) - red) * f11)), green + ((int) ((Color.green(this.f24133a) - green) * f11)), blue + ((int) ((Color.blue(this.f24133a) - blue) * f11)));
            f24131s.setColor(rgb);
            f24132w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24131s);
        if (this.f24139r == null) {
            if (this.f24135c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24132w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24132w);
            }
        }
        canvas.restore();
        if (this.f24139r != null) {
            int d = i0.a.d(Utilities.clamp(this.f24135c, 1.0f, 0.0f), this.f24134b, this.f24133a);
            if (this.f24138n != d) {
                Drawable drawable = this.f24139r;
                this.f24138n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f24139r.setBounds((int) ((getWidth() / 2.0f) - (this.f24139r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24139r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24139r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24139r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24139r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24134b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24133a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24138n = 0;
        this.f24139r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24135c == f7) {
            return;
        }
        this.f24135c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
