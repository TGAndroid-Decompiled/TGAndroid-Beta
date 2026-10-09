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
    public static Paint f24294s;
    public static Paint v;
    public static Paint f24295w;
    public int f24296a;
    public int f24297b;
    public float f24298c;
    public ObjectAnimator d;
    public boolean f24299e;
    public boolean f24300f;
    public int h;
    public int f24301n;
    public Drawable f24302r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24294s == null) {
            Paint paint = new Paint(1);
            f24294s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24294s.setStyle(Paint.Style.STROKE);
            f24295w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24300f) {
            return;
        }
        this.f24300f = z10;
        float f7 = 0.0f;
        if (this.f24299e && z11) {
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
        this.f24297b = i10;
        this.f24296a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24297b;
    }

    public float getProgress() {
        return this.f24298c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24299e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24299e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24298c;
        if (f10 <= 0.5f) {
            f24294s.setColor(this.f24297b);
            f24295w.setColor(this.f24297b);
            f7 = this.f24298c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24297b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24297b);
            int blue = Color.blue(this.f24297b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24296a) - red) * f11)), green + ((int) ((Color.green(this.f24296a) - green) * f11)), blue + ((int) ((Color.blue(this.f24296a) - blue) * f11)));
            f24294s.setColor(rgb);
            f24295w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24294s);
        if (this.f24302r == null) {
            if (this.f24298c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24295w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24295w);
            }
        }
        canvas.restore();
        if (this.f24302r != null) {
            int d = i0.a.d(Utilities.clamp(this.f24298c, 1.0f, 0.0f), this.f24297b, this.f24296a);
            if (this.f24301n != d) {
                Drawable drawable = this.f24302r;
                this.f24301n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f24302r.setBounds((int) ((getWidth() / 2.0f) - (this.f24302r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24302r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24302r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24302r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24302r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24297b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24296a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24301n = 0;
        this.f24302r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24298c == f7) {
            return;
        }
        this.f24298c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
