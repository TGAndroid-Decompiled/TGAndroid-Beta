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
    public static Paint f23117s;
    public static Paint v;
    public static Paint f23118w;
    public int f23119a;
    public int f23120b;
    public float f23121c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f23122f;
    public int h;
    public int f23123n;
    public Drawable f23124r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f23117s == null) {
            Paint paint = new Paint(1);
            f23117s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f23117s.setStyle(Paint.Style.STROKE);
            f23118w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == this.f23122f) {
            return;
        }
        this.f23122f = z4;
        float f10 = 0.0f;
        if (this.e && z10) {
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
        this.f23120b = i10;
        this.f23119a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f23120b;
    }

    public float getProgress() {
        return this.f23121c;
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
        float f10;
        float f11 = this.f23121c;
        if (f11 <= 0.5f) {
            f23117s.setColor(this.f23120b);
            f23118w.setColor(this.f23120b);
            f10 = this.f23121c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f23120b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f23120b);
            int blue = Color.blue(this.f23120b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f23119a) - red) * f12)), green + ((int) ((Color.green(this.f23119a) - green) * f12)), blue + ((int) ((Color.blue(this.f23119a) - blue) * f12)));
            f23117s.setColor(rgb);
            f23118w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f23117s);
        if (this.f23124r == null) {
            if (this.f23121c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - AndroidUtilities.dp(1.0f), f23118w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, e2.c.w(f13 - AndroidUtilities.dp(1.0f), this.h / 4, f10, this.h / 4), f23118w);
            }
        }
        canvas.restore();
        if (this.f23124r != null) {
            int d = i0.a.d(Utilities.clamp(this.f23121c, 1.0f, 0.0f), this.f23120b, this.f23119a);
            if (this.f23123n != d) {
                Drawable drawable = this.f23124r;
                this.f23123n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f23124r.setBounds((int) ((getWidth() / 2.0f) - (this.f23124r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f23124r.getIntrinsicHeight() / 2.0f)), (int) ((this.f23124r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f23124r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f23124r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f23120b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f23119a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f23123n = 0;
        this.f23124r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f23121c == f10) {
            return;
        }
        this.f23121c = f10;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
