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
    public final Drawable a;
    public final TextPaint b;
    public Bitmap c;
    public Bitmap d;
    public Canvas e;
    public Canvas f;
    public boolean h;
    public boolean n;
    public float r;
    public ObjectAnimator s;
    public boolean w;
    public boolean x;
    public boolean y;

    public CheckBox(Context context, int i) {
        super(context);
        this.w = true;
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
        K.setStrokeWidth(gl.L(28.0f));
        L.setStrokeWidth(gl.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(gl.L(18.0f));
        textPaint.setTypeface(gl.o());
        this.a = context.getResources().getDrawable(i).mutate();
    }

    public final void a(boolean z) {
        b(z, false);
    }

    public final void b(boolean z, boolean z2) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        float f = 0.0f;
        if (this.x && z2) {
            this.w = z;
            if (z) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f);
            this.s = ofFloat;
            ofFloat.addListener(new bb1(this, (byte) 27));
            this.s.setDuration(300L);
            this.s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.s = null;
        }
        if (z) {
            f = 1.0f;
        }
        setProgress(f);
    }

    public final void c(int i, int i2) {
        this.G = i;
        this.a.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i2);
        invalidate();
    }

    public float getProgress() {
        return this.r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
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
        accessibilityNodeInfo.setChecked(this.y);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.G = i;
        invalidate();
    }

    public void setCheckColor(int i) {
        this.a.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i);
        invalidate();
    }

    public void setCheckOffset(int i) {
        this.F = i;
    }

    public void setDrawBackground(boolean z) {
        this.h = z;
    }

    public void setHasBorder(boolean z) {
        this.n = z;
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.H = String.valueOf(i + 1);
        } else if (this.s == null) {
            this.H = null;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.r == f) {
            return;
        }
        this.r = f;
        invalidate();
    }

    public void setSize(int i) {
        this.E = i;
        if (i == 40) {
            this.b.setTextSize(gl.L(24.0f));
        }
    }

    public void setStrokeWidth(int i) {
        L.setStrokeWidth(i);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.c == null) {
            try {
                int L2 = gl.L(this.E);
                int L3 = gl.L(this.E);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.c = Bitmap.createBitmap(L2, L3, config);
                this.e = new Canvas(this.c);
                this.d = Bitmap.createBitmap(gl.L(this.E), gl.L(this.E), config);
                this.f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
