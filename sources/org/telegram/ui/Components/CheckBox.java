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
import org.telegram.messenger.AndroidUtilities;
public class CheckBox extends View {
    public static Paint D;
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public int A;
    public int B;
    public String C;
    public final Drawable f26299a;
    public final TextPaint f26300b;
    public Bitmap f26301c;
    public Bitmap d;
    public Canvas f26302e;
    public Canvas f26303f;
    public boolean h;
    public boolean f26304n;
    public float f26305r;
    public ObjectAnimator f26306s;
    public boolean v;
    public boolean f26307w;
    public boolean f26308x;
    public int f26309y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f26309y = 22;
        if (D == null) {
            D = new Paint(1);
            Paint paint = new Paint(1);
            E = paint;
            paint.setColor(0);
            Paint paint2 = E;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            F = paint3;
            paint3.setColor(0);
            Paint paint4 = F;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            F.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            G = paint5;
            paint5.setColor(-1);
            G.setStyle(style);
        }
        F.setStrokeWidth(AndroidUtilities.dp(28.0f));
        G.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f26300b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f26299a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f26308x) {
            return;
        }
        this.f26308x = z10;
        float f9 = 0.0f;
        if (this.f26307w && z11) {
            this.v = z10;
            if (z10) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f9);
            this.f26306s = ofFloat;
            ofFloat.addListener(new org.telegram.ui.bm(this, 20));
            this.f26306s.setDuration(300L);
            this.f26306s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26306s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26306s = null;
        }
        if (z10) {
            f9 = 1.0f;
        }
        setProgress(f9);
    }

    public final void c(int i10, int i11) {
        this.B = i10;
        this.f26299a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f26300b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f26305r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26307w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26307w = false;
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
        accessibilityNodeInfo.setChecked(this.f26308x);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.f26299a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f26300b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.A = i10;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f26304n = z10;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.C = "" + (i10 + 1);
        } else if (this.f26306s == null) {
            this.C = null;
        }
        invalidate();
    }

    public void setProgress(float f9) {
        if (this.f26305r == f9) {
            return;
        }
        this.f26305r = f9;
        invalidate();
    }

    public void setSize(int i10) {
        this.f26309y = i10;
        if (i10 == 40) {
            this.f26300b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        G.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f26301c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f26309y);
                int dp2 = AndroidUtilities.dp(this.f26309y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f26301c = Bitmap.createBitmap(dp, dp2, config);
                this.f26302e = new Canvas(this.f26301c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f26309y), AndroidUtilities.dp(this.f26309y), config);
                this.f26303f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
