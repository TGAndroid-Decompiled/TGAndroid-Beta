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
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public static Paint L;
    public int E;
    public int F;
    public int G;
    public String H;
    public final Drawable f32913a;
    public final TextPaint f32914b;
    public Bitmap f32915c;
    public Bitmap d;
    public Canvas f32916e;
    public Canvas f32917f;
    public boolean h;
    public boolean f32918n;
    public float f32919r;
    public ObjectAnimator f32920s;
    public boolean f32921w;
    public boolean f32922x;
    public boolean f32923y;

    public CheckBox(Context context, int i7) {
        super(context);
        this.f32921w = true;
        this.E = 22;
        if (I == null) {
            I = new Paint(1);
            Paint paint = new Paint(1);
            J = paint;
            paint.setColor(0);
            Paint paint2 = J;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            K = paint3;
            paint3.setColor(0);
            Paint paint4 = K;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            K.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            L = paint5;
            paint5.setColor(-1);
            L.setStyle(style);
        }
        K.setStrokeWidth(org.telegram.messenger.g0.L(28.0f));
        L.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f32914b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f32913a = context.getResources().getDrawable(i7).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f32923y) {
            return;
        }
        this.f32923y = z10;
        float f10 = 0.0f;
        if (this.f32922x && z11) {
            this.f32921w = z10;
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32920s = ofFloat;
            ofFloat.addListener(new x(this, 19));
            this.f32920s.setDuration(300L);
            this.f32920s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32920s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f32920s = null;
        }
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i7, int i10) {
        this.G = i7;
        this.f32913a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f32914b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.f32919r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32922x = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32922x = false;
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
        accessibilityNodeInfo.setChecked(this.f32923y);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.G = i7;
        invalidate();
    }

    public void setCheckColor(int i7) {
        this.f32913a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        this.f32914b.setColor(i7);
        invalidate();
    }

    public void setCheckOffset(int i7) {
        this.F = i7;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f32918n = z10;
    }

    public void setNum(int i7) {
        if (i7 >= 0) {
            this.H = "" + (i7 + 1);
        } else if (this.f32920s == null) {
            this.H = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f32919r == f10) {
            return;
        }
        this.f32919r = f10;
        invalidate();
    }

    public void setSize(int i7) {
        this.E = i7;
        if (i7 == 40) {
            this.f32914b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i7) {
        L.setStrokeWidth(i7);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && this.f32915c == null) {
            try {
                int L2 = org.telegram.messenger.g0.L(this.E);
                int L3 = org.telegram.messenger.g0.L(this.E);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f32915c = Bitmap.createBitmap(L2, L3, config);
                this.f32916e = new Canvas(this.f32915c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.E), org.telegram.messenger.g0.L(this.E), config);
                this.f32917f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
