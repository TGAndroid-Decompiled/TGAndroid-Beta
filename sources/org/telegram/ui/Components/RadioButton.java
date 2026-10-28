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
    public static Paint f26277s;
    public static Paint v;
    public static Paint f26278w;
    public int f26279a;
    public int f26280b;
    public float f26281c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f26282f;
    public int h;
    public int f26283n;
    public Drawable f26284r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f26277s == null) {
            Paint paint = new Paint(1);
            f26277s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f26277s.setStyle(Paint.Style.STROKE);
            f26278w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f26282f) {
            return;
        }
        this.f26282f = z10;
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
        this.f26280b = i10;
        this.f26279a = i11;
        invalidate();
    }

    public int getCheckedColor() {
        return this.f26279a;
    }

    public int getColor() {
        return this.f26280b;
    }

    public float getProgress() {
        return this.f26281c;
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
        float f10 = this.f26281c;
        if (f10 <= 0.5f) {
            f26277s.setColor(this.f26280b);
            f26278w.setColor(this.f26280b);
            f7 = this.f26281c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f26280b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f26280b);
            int blue = Color.blue(this.f26280b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f26279a) - red) * f11)), green + ((int) ((Color.green(this.f26279a) - green) * f11)), blue + ((int) ((Color.blue(this.f26279a) - blue) * f11)));
            f26277s.setColor(rgb);
            f26278w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f26277s);
        if (this.f26284r == null) {
            if (this.f26281c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f26278w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, c3.h0.z(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f26278w);
            }
        }
        canvas.restore();
        if (this.f26284r != null) {
            int f13 = i0.a.f(Utilities.clamp(this.f26281c, 1.0f, 0.0f), this.f26280b, this.f26279a);
            if (this.f26283n != f13) {
                Drawable drawable = this.f26284r;
                this.f26283n = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.SRC_IN));
            }
            this.f26284r.setBounds((int) ((getWidth() / 2.0f) - (this.f26284r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f26284r.getIntrinsicHeight() / 2.0f)), (int) ((this.f26284r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f26284r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f26284r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26280b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f26279a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f26283n = 0;
        this.f26284r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f26281c == f7) {
            return;
        }
        this.f26281c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
