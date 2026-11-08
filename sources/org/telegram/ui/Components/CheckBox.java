package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class CheckBox extends View {
    public static Paint H;
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public int D;
    public int E;
    public int F;
    public String G;
    public final Drawable f31238a;
    public final TextPaint f31239b;
    public Bitmap f31240c;
    public Bitmap d;
    public Canvas f31241e;
    public Canvas f31242f;
    public boolean h;
    public boolean f31243n;
    public float f31244r;
    public ObjectAnimator f31245s;
    public boolean f31246w;
    public boolean f31247x;
    public boolean f31248y;

    public CheckBox(Context context, int i7) {
        super(context);
        this.f31246w = true;
        this.D = 22;
        if (H == null) {
            H = new Paint(1);
            Paint paint = new Paint(1);
            I = paint;
            paint.setColor(0);
            Paint paint2 = I;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            J = paint3;
            paint3.setColor(0);
            Paint paint4 = J;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            J.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            K = paint5;
            paint5.setColor(-1);
            K.setStyle(style);
        }
        J.setStrokeWidth(org.telegram.messenger.g0.L(28.0f));
        K.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f31239b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f31238a = context.getResources().getDrawable(i7).mutate();
    }

    public final void a(boolean z9) {
        b(z9, false);
    }

    public final void b(boolean z9, boolean z10) {
        if (z9 == this.f31248y) {
            return;
        }
        this.f31248y = z9;
        float f10 = 0.0f;
        if (this.f31247x && z10) {
            this.f31246w = z9;
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31245s = ofFloat;
            ofFloat.addListener(new z5(this, 18));
            this.f31245s.setDuration(300L);
            this.f31245s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31245s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31245s = null;
        }
        if (z9) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i7, int i10) {
        this.F = i7;
        this.f31238a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f31239b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.f31244r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31247x = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31247x = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBox.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f31248y);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setCheckColor(int i7) {
        this.f31238a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        this.f31239b.setColor(i7);
        invalidate();
    }

    public void setCheckOffset(int i7) {
        this.E = i7;
    }

    public void setDrawBackground(boolean z9) {
        this.h = z9;
    }

    public void setHasBorder(boolean z9) {
        this.f31243n = z9;
    }

    public void setNum(int i7) {
        if (i7 >= 0) {
            this.G = "" + (i7 + 1);
        } else if (this.f31245s == null) {
            this.G = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31244r == f10) {
            return;
        }
        this.f31244r = f10;
        invalidate();
    }

    public void setSize(int i7) {
        this.D = i7;
        if (i7 == 40) {
            this.f31239b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i7) {
        K.setStrokeWidth(i7);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && this.f31240c == null) {
            try {
                int L = org.telegram.messenger.g0.L(this.D);
                int L2 = org.telegram.messenger.g0.L(this.D);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f31240c = Bitmap.createBitmap(L, L2, config);
                this.f31241e = new Canvas(this.f31240c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.D), org.telegram.messenger.g0.L(this.D), config);
                this.f31242f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
