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
    public static Paint f24072s;
    public static Paint v;
    public static Paint f24073w;
    public int f24074a;
    public int f24075b;
    public float f24076c;
    public ObjectAnimator d;
    public boolean f24077e;
    public boolean f24078f;
    public int h;
    public int f24079n;
    public Drawable f24080r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f24072s == null) {
            Paint paint = new Paint(1);
            f24072s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f24072s.setStyle(Paint.Style.STROKE);
            f24073w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f24078f) {
            return;
        }
        this.f24078f = z10;
        float f7 = 0.0f;
        if (this.f24077e && z11) {
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
        this.f24075b = i10;
        this.f24074a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f24075b;
    }

    public float getProgress() {
        return this.f24076c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24077e = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24077e = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = this.f24076c;
        if (f10 <= 0.5f) {
            f24072s.setColor(this.f24075b);
            f24073w.setColor(this.f24075b);
            f7 = this.f24076c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f24075b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f24075b);
            int blue = Color.blue(this.f24075b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f24074a) - red) * f11)), green + ((int) ((Color.green(this.f24074a) - green) * f11)), blue + ((int) ((Color.blue(this.f24074a) - blue) * f11)));
            f24072s.setColor(rgb);
            f24073w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f24072s);
        if (this.f24080r == null) {
            if (this.f24076c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f24073w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f24073w);
            }
        }
        canvas.restore();
        if (this.f24080r != null) {
            int d = i0.a.d(Utilities.clamp(this.f24076c, 1.0f, 0.0f), this.f24075b, this.f24074a);
            if (this.f24079n != d) {
                Drawable drawable = this.f24080r;
                this.f24079n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f24080r.setBounds((int) ((getWidth() / 2.0f) - (this.f24080r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f24080r.getIntrinsicHeight() / 2.0f)), (int) ((this.f24080r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f24080r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f24080r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24075b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f24074a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f24079n = 0;
        this.f24080r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24076c == f7) {
            return;
        }
        this.f24076c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
