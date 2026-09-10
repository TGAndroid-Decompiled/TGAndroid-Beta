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
    public static Paint f21242s;
    public static Paint v;
    public static Paint f21243w;
    public int f21244a;
    public int f21245b;
    public float f21246c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f21247f;
    public int h;
    public int f21248n;
    public Drawable f21249r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f21242s == null) {
            Paint paint = new Paint(1);
            f21242s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f21242s.setStyle(Paint.Style.STROKE);
            f21243w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f21247f) {
            return;
        }
        this.f21247f = z10;
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
        this.f21245b = i10;
        this.f21244a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f21245b;
    }

    public float getProgress() {
        return this.f21246c;
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
        float f10 = this.f21246c;
        if (f10 <= 0.5f) {
            f21242s.setColor(this.f21245b);
            f21243w.setColor(this.f21245b);
            f7 = this.f21246c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f21245b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f21245b);
            int blue = Color.blue(this.f21245b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f21244a) - red) * f11)), green + ((int) ((Color.green(this.f21244a) - green) * f11)), blue + ((int) ((Color.blue(this.f21244a) - blue) * f11)));
            f21242s.setColor(rgb);
            f21243w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f21242s);
        if (this.f21249r == null) {
            if (this.f21246c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f21243w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f21243w);
            }
        }
        canvas.restore();
        if (this.f21249r != null) {
            int d = i0.a.d(Utilities.clamp(this.f21246c, 1.0f, 0.0f), this.f21245b, this.f21244a);
            if (this.f21248n != d) {
                Drawable drawable = this.f21249r;
                this.f21248n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f21249r.setBounds((int) ((getWidth() / 2.0f) - (this.f21249r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f21249r.getIntrinsicHeight() / 2.0f)), (int) ((this.f21249r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f21249r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f21249r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f21245b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f21244a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f21248n = 0;
        this.f21249r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f21246c == f7) {
            return;
        }
        this.f21246c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
