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
    public static Paint f22343s;
    public static Paint v;
    public static Paint f22344w;
    public int f22345a;
    public int f22346b;
    public float f22347c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f22348f;
    public int h;
    public int f22349n;
    public Drawable f22350r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f22343s == null) {
            Paint paint = new Paint(1);
            f22343s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f22343s.setStyle(Paint.Style.STROKE);
            f22344w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f22348f) {
            return;
        }
        this.f22348f = z10;
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
        this.f22346b = i10;
        this.f22345a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f22346b;
    }

    public float getProgress() {
        return this.f22347c;
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
        float f10 = this.f22347c;
        if (f10 <= 0.5f) {
            f22343s.setColor(this.f22346b);
            f22344w.setColor(this.f22346b);
            f7 = this.f22347c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f22346b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f22346b);
            int blue = Color.blue(this.f22346b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f22345a) - red) * f11)), green + ((int) ((Color.green(this.f22345a) - green) * f11)), blue + ((int) ((Color.blue(this.f22345a) - blue) * f11)));
            f22343s.setColor(rgb);
            f22344w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f22343s);
        if (this.f22350r == null) {
            if (this.f22347c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f22344w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f22344w);
            }
        }
        canvas.restore();
        if (this.f22350r != null) {
            int d = i0.a.d(Utilities.clamp(this.f22347c, 1.0f, 0.0f), this.f22346b, this.f22345a);
            if (this.f22349n != d) {
                Drawable drawable = this.f22350r;
                this.f22349n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f22350r.setBounds((int) ((getWidth() / 2.0f) - (this.f22350r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f22350r.getIntrinsicHeight() / 2.0f)), (int) ((this.f22350r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f22350r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f22350r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f22346b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f22345a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f22349n = 0;
        this.f22350r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f22347c == f7) {
            return;
        }
        this.f22347c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
