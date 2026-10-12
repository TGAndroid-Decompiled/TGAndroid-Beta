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
    public static Paint f23277s;
    public static Paint v;
    public static Paint f23278w;
    public int f23279a;
    public int f23280b;
    public float f23281c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f23282f;
    public int h;
    public int f23283n;
    public Drawable f23284r;

    public RadioButton(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(16.0f);
        if (f23277s == null) {
            Paint paint = new Paint(1);
            f23277s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f23277s.setStyle(Paint.Style.STROKE);
            f23278w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f23282f) {
            return;
        }
        this.f23282f = z10;
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
        this.f23280b = i10;
        this.f23279a = i11;
        invalidate();
    }

    public int getColor() {
        return this.f23280b;
    }

    public float getProgress() {
        return this.f23281c;
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
        float f10 = this.f23281c;
        if (f10 <= 0.5f) {
            f23277s.setColor(this.f23280b);
            f23278w.setColor(this.f23280b);
            f7 = this.f23281c / 0.5f;
        } else {
            f7 = 2.0f - (f10 / 0.5f);
            int red = Color.red(this.f23280b);
            float f11 = 1.0f - f7;
            int green = Color.green(this.f23280b);
            int blue = Color.blue(this.f23280b);
            int rgb = Color.rgb(red + ((int) ((Color.red(this.f23279a) - red) * f11)), green + ((int) ((Color.green(this.f23279a) - green) * f11)), blue + ((int) ((Color.blue(this.f23279a) - blue) * f11)));
            f23277s.setColor(rgb);
            f23278w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f12 = (this.h / 2) - ((f7 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12, f23277s);
        if (this.f23284r == null) {
            if (this.f23281c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f12 - AndroidUtilities.dp(1.0f), f23278w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f7) * (f12 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.gms.internal.play_billing.k3.y(f12 - AndroidUtilities.dp(1.0f), this.h / 4, f7, this.h / 4), f23278w);
            }
        }
        canvas.restore();
        if (this.f23284r != null) {
            int d = i0.a.d(Utilities.clamp(this.f23281c, 1.0f, 0.0f), this.f23280b, this.f23279a);
            if (this.f23283n != d) {
                Drawable drawable = this.f23284r;
                this.f23283n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.f23284r.setBounds((int) ((getWidth() / 2.0f) - (this.f23284r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.f23284r.getIntrinsicHeight() / 2.0f)), (int) ((this.f23284r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.f23284r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.f23284r.draw(canvas);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f23280b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.f23279a = i10;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.f23283n = 0;
        this.f23284r = drawable;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f23281c == f7) {
            return;
        }
        this.f23281c = f7;
        invalidate();
    }

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
