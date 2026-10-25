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
    public static Paint f26273s;
    public static Paint v;
    public static Paint f26274w;
    public int f26275a;
    public int f26276b;
    public float f26277c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f26278f;
    public int h;
    public int f26279n;
    public Drawable f26280r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26273s == null) {
            Paint paint = new Paint(1);
            f26273s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26273s.setStyle(Paint.Style.STROKE);
            f26274w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26278f) {
            return;
        }
        this.f26278f = z10;
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
        this.f26276b = i10;
        this.f26275a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f26275a;
    }

    public int getColor() {
        return this.f26276b;
    }

    public float getProgress() {
        return this.f26277c;
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
        float f10 = this.f26277c;
        if (f10 <= 0.5f) {
            f26273s.setColor(this.f26276b);
            f26274w.setColor(this.f26276b);
            f7 = this.f26277c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f26276b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f26276b);
            int blue = Color.blue(this.f26276b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f26275a) - red) * f11)), green + ((int) ((Color.green(this.f26275a) - green) * f11)), blue + ((int) ((Color.blue(this.f26275a) - blue) * f11)));
            f26273s.setColor(rgb);
            f26274w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f26273s);
        if (this.f26280r == null) {
            if (this.f26277c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f26274w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, c3.h0.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f26274w);
            }
        }
        canvas.restore();
        if (this.f26280r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f26277c, 1.0f, 0.0f), this.f26276b, this.f26275a);
            if (this.f26279n != f13) {
                Drawable drawable = this.f26280r;
                this.f26279n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f26280r.setBounds((int) ((getWidth() / 2.0f) - (this.f26280r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26280r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26280r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26280r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26280r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26276b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f26275a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26279n = 0;
        this.f26280r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f26277c == f7) {
            return;
        }
        this.f26277c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
