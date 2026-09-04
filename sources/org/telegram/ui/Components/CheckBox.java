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
    public static Paint H;
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public int E;
    public int F;
    public String G;
    public final Drawable f23882a;
    public final TextPaint f23883b;
    public Bitmap f23884c;
    public Bitmap d;
    public Canvas f23885e;
    public Canvas f23886f;
    public boolean h;
    public boolean f23887n;
    public float f23888r;
    public ObjectAnimator f23889s;
    public boolean v;
    public boolean f23890w;
    public boolean f23891x;
    public int f23892y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f23892y = 22;
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
        J.setStrokeWidth(AndroidUtilities.dp(28.0f));
        K.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f23883b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f23882a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f23891x) {
            return;
        }
        this.f23891x = z10;
        float f7 = 0.0f;
        if (this.f23890w && z11) {
            this.v = z10;
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23889s = ofFloat;
            ofFloat.addListener(new j6(this, 15));
            this.f23889s.setDuration(300L);
            this.f23889s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23889s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23889s = null;
        }
        if (z10) {
            f7 = 1.0f;
        }
        setProgress(f7);
    }

    public final void c(int i10, int i11) {
        this.F = i10;
        this.f23882a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f23883b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f23888r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23890w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23890w = false;
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
        accessibilityNodeInfo.setChecked(this.f23891x);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.f23882a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f23883b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.E = i10;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f23887n = z10;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.G = "" + (i10 + 1);
        } else if (this.f23889s == null) {
            this.G = null;
        }
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f23888r == f7) {
            return;
        }
        this.f23888r = f7;
        invalidate();
    }

    public void setSize(int i10) {
        this.f23892y = i10;
        if (i10 == 40) {
            this.f23883b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        K.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f23884c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f23892y);
                int dp2 = AndroidUtilities.dp(this.f23892y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f23884c = Bitmap.createBitmap(dp, dp2, config);
                this.f23885e = new Canvas(this.f23884c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f23892y), AndroidUtilities.dp(this.f23892y), config);
                this.f23886f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
