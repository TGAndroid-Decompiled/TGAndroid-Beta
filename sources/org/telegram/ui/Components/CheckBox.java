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
    public final Drawable f31309a;
    public final TextPaint f31310b;
    public Bitmap f31311c;
    public Bitmap d;
    public Canvas f31312e;
    public Canvas f31313f;
    public boolean h;
    public boolean f31314n;
    public float f31315r;
    public ObjectAnimator f31316s;
    public boolean f31317w;
    public boolean f31318x;
    public boolean f31319y;

    public CheckBox(Context context, int i3) {
        super(context);
        this.f31317w = true;
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
        this.f31310b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f31309a = context.getResources().getDrawable(i3).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f31319y) {
            return;
        }
        this.f31319y = z10;
        float f10 = 0.0f;
        if (this.f31318x && z11) {
            this.f31317w = z10;
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31316s = ofFloat;
            ofFloat.addListener(new x5(this, 18));
            this.f31316s.setDuration(300L);
            this.f31316s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31316s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31316s = null;
        }
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i3, int i10) {
        this.G = i3;
        this.f31309a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f31310b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.f31315r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31318x = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31318x = false;
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
        accessibilityNodeInfo.setChecked(this.f31319y);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.G = i3;
        invalidate();
    }

    public void setCheckColor(int i3) {
        this.f31309a.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        this.f31310b.setColor(i3);
        invalidate();
    }

    public void setCheckOffset(int i3) {
        this.F = i3;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f31314n = z10;
    }

    public void setNum(int i3) {
        if (i3 >= 0) {
            this.H = "" + (i3 + 1);
        } else if (this.f31316s == null) {
            this.H = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f31315r == f10) {
            return;
        }
        this.f31315r = f10;
        invalidate();
    }

    public void setSize(int i3) {
        this.E = i3;
        if (i3 == 40) {
            this.f31310b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i3) {
        L.setStrokeWidth(i3);
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 0 && this.f31311c == null) {
            try {
                int L2 = org.telegram.messenger.g0.L(this.E);
                int L3 = org.telegram.messenger.g0.L(this.E);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f31311c = Bitmap.createBitmap(L2, L3, config);
                this.f31312e = new Canvas(this.f31311c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.E), org.telegram.messenger.g0.L(this.E), config);
                this.f31313f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
