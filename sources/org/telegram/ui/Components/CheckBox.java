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
    public final Drawable f31243a;
    public final TextPaint f31244b;
    public Bitmap f31245c;
    public Bitmap d;
    public Canvas f31246e;
    public Canvas f31247f;
    public boolean h;
    public boolean f31248n;
    public float f31249r;
    public ObjectAnimator f31250s;
    public boolean f31251w;
    public boolean f31252x;
    public boolean f31253y;

    public CheckBox(Context context, int i7) {
        super(context);
        this.f31251w = true;
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
        this.f31244b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f31243a = context.getResources().getDrawable(i7).mutate();
    }

    public final void a(boolean z9) {
        b(z9, false);
    }

    public final void b(boolean z9, boolean z10) {
        if (z9 == this.f31253y) {
            return;
        }
        this.f31253y = z9;
        float f10 = 0.0f;
        if (this.f31252x && z10) {
            this.f31251w = z9;
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31250s = ofFloat;
            ofFloat.addListener(new z5(this, 18));
            this.f31250s.setDuration(300L);
            this.f31250s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31250s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31250s = null;
        }
        if (z9) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i7, int i10) {
        this.F = i7;
        this.f31243a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f31244b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.f31249r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31252x = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31252x = false;
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
        accessibilityNodeInfo.setChecked(this.f31253y);
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
        this.f31243a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        this.f31244b.setColor(i7);
        invalidate();
    }

    public void setCheckOffset(int i7) {
        this.E = i7;
    }

    public void setDrawBackground(boolean z9) {
        this.h = z9;
    }

    public void setHasBorder(boolean z9) {
        this.f31248n = z9;
    }

    public void setNum(int i7) {
        if (i7 >= 0) {
            this.G = "" + (i7 + 1);
        } else if (this.f31250s == null) {
            this.G = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31249r == f10) {
            return;
        }
        this.f31249r = f10;
        invalidate();
    }

    public void setSize(int i7) {
        this.D = i7;
        if (i7 == 40) {
            this.f31244b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i7) {
        K.setStrokeWidth(i7);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && this.f31245c == null) {
            try {
                int L = org.telegram.messenger.g0.L(this.D);
                int L2 = org.telegram.messenger.g0.L(this.D);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f31245c = Bitmap.createBitmap(L, L2, config);
                this.f31246e = new Canvas(this.f31245c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.D), org.telegram.messenger.g0.L(this.D), config);
                this.f31247f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
