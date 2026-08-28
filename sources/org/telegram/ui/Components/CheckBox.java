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
    public final Drawable f26288a;
    public final TextPaint f26289b;
    public Bitmap f26290c;
    public Bitmap d;
    public Canvas f26291e;
    public Canvas f26292f;
    public boolean h;
    public boolean f26293n;
    public float f26294r;
    public ObjectAnimator f26295s;
    public boolean v;
    public boolean f26296w;
    public boolean f26297x;
    public int f26298y;

    public CheckBox(Context context, int i9) {
        super(context);
        this.v = true;
        this.f26298y = 22;
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
        this.f26289b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f26288a = context.getResources().getDrawable(i9).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f26297x) {
            return;
        }
        this.f26297x = z10;
        float f10 = 0.0f;
        if (this.f26296w && z11) {
            this.v = z10;
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f26295s = ofFloat;
            ofFloat.addListener(new org.telegram.ui.xp(this, 18));
            this.f26295s.setDuration(300L);
            this.f26295s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26295s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26295s = null;
        }
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i9, int i10) {
        this.B = i9;
        this.f26288a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f26289b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.f26294r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26296w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26296w = false;
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
        accessibilityNodeInfo.setChecked(this.f26297x);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.B = i9;
        invalidate();
    }

    public void setCheckColor(int i9) {
        this.f26288a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
        this.f26289b.setColor(i9);
        invalidate();
    }

    public void setCheckOffset(int i9) {
        this.A = i9;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f26293n = z10;
    }

    public void setNum(int i9) {
        if (i9 >= 0) {
            this.C = "" + (i9 + 1);
        } else if (this.f26295s == null) {
            this.C = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f26294r == f10) {
            return;
        }
        this.f26294r = f10;
        invalidate();
    }

    public void setSize(int i9) {
        this.f26298y = i9;
        if (i9 == 40) {
            this.f26289b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i9) {
        G.setStrokeWidth(i9);
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0 && this.f26290c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f26298y);
                int dp2 = AndroidUtilities.dp(this.f26298y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f26290c = Bitmap.createBitmap(dp, dp2, config);
                this.f26291e = new Canvas(this.f26290c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f26298y), AndroidUtilities.dp(this.f26298y), config);
                this.f26292f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
