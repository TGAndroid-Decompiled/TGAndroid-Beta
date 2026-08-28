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
    public static Paint f26502s;
    public static Paint v;
    public static Paint f26503w;
    public int f26504a;
    public int f26505b;
    public float f26506c;
    public ObjectAnimator d;
    public boolean f26507e;
    public boolean f26508f;
    public int h;
    public int f26509n;
    public Drawable f26510r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26502s == null) {
            Paint paint = new Paint(1);
            f26502s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26502s.setStyle(Paint.Style.STROKE);
            f26503w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26508f) {
            return;
        }
        this.f26508f = z10;
        float f10 = 0.0f;
        if (this.f26507e && z11) {
            if (z10) {
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
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void b(int i9, int i10) {
        this.f26505b = i9;
        this.f26504a = i10;
        invalidate();
    }

    public int getColor() {
        return this.f26505b;
    }

    public float getProgress() {
        return this.f26506c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26507e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26507e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.f26506c;
        if (f11 <= 0.5f) {
            f26502s.setColor(this.f26505b);
            f26503w.setColor(this.f26505b);
            f10 = this.f26506c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            int red = Color.red(this.f26505b);
            float f12 = 1.0f - f10;
            int green = Color.green(this.f26505b);
            int blue = Color.blue(this.f26505b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f26504a) - red) * f12)), green + ((int) ((Color.green(this.f26504a) - green) * f12)), blue + ((int) ((Color.blue(this.f26504a) - blue) * f12)));
            f26502s.setColor(rgb);
            f26503w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, f26502s);
        if (this.f26510r == null) {
            if (this.f26506c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - AndroidUtilities.dp(1.0f), f26503w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, e2.c.z(f13 - AndroidUtilities.dp(1.0f), this.h / 4, f10, this.h / 4), f26503w);
            }
        }
        canvas.restore();
        if (this.f26510r != null) {
            int d = i0.a.d(Utilities.clamp(this.f26506c, 1.0f, 0.0f), this.f26505b, this.f26504a);
            if (this.f26509n != d) {
                Drawable drawable = this.f26510r;
                this.f26509n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f26510r.setBounds((int) ((getWidth() / 2.0f) - (this.f26510r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26510r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26510r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26510r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26510r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.f26505b = i9;
        invalidate();
    }

    public void setCheckedColor(int i9) {
        this.f26504a = i9;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26509n = 0;
        this.f26510r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f26506c == f10) {
            return;
        }
        this.f26506c = f10;
        invalidate();
    }

    public void setSize(int i9) {
        if (this.h == i9) {
            return;
        }
        this.h = i9;
    }
}
