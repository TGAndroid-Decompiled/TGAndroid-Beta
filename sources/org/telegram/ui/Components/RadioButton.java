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
    public static Paint f22379s;
    public static Paint v;
    public static Paint f22380w;
    public int f22381a;
    public int f22382b;
    public float f22383c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f22384f;
    public int h;
    public int f22385n;
    public Drawable f22386r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f22379s == null) {
            Paint paint = new Paint(1);
            f22379s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f22379s.setStyle(Paint.Style.STROKE);
            f22380w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f22384f) {
            return;
        }
        this.f22384f = z10;
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
        this.f22382b = i10;
        this.f22381a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f22382b;
    }

    public float getProgress() {
        return this.f22383c;
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
        float f10 = this.f22383c;
        if (f10 <= 0.5f) {
            f22379s.setColor(this.f22382b);
            f22380w.setColor(this.f22382b);
            f7 = this.f22383c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f22382b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f22382b);
            int blue = Color.blue(this.f22382b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f22381a) - red) * f11)), green + ((int) ((Color.green(this.f22381a) - green) * f11)), blue + ((int) ((Color.blue(this.f22381a) - blue) * f11)));
            f22379s.setColor(rgb);
            f22380w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f22379s);
        if (this.f22386r == null) {
            if (this.f22383c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f22380w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.vision.e2.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f22380w);
            }
        }
        canvas.restore();
        if (this.f22386r != null) {
            int d = i0.a.d(Utilities.clamp(this.f22383c, 1.0f, 0.0f), this.f22382b, this.f22381a);
            if (this.f22385n != d) {
                Drawable drawable = this.f22386r;
                this.f22385n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f22386r.setBounds((int) ((getWidth() / 2.0f) - (this.f22386r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f22386r.getIntrinsicHeight() / 2.0f)), (int) ((this.f22386r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f22386r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f22386r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f22382b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f22381a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f22385n = 0;
        this.f22386r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f22383c == f7) {
            return;
        }
        this.f22383c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
