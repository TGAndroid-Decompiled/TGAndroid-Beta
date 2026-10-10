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
    public final Drawable f24076a;
    public final TextPaint f24077b;
    public Bitmap f24078c;
    public Bitmap d;
    public Canvas f24079e;
    public Canvas f24080f;
    public boolean h;
    public boolean f24081n;
    public float f24082r;
    public ObjectAnimator f24083s;
    public boolean v;
    public boolean f24084w;
    public boolean f24085x;
    public int f24086y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f24086y = 22;
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
        this.f24077b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f24076a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f24085x) {
            return;
        }
        this.f24085x = z10;
        float f7 = 0.0f;
        if (this.f24084w && z11) {
            this.v = z10;
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24083s = ofFloat;
            ofFloat.addListener(new t8(this, 12));
            this.f24083s.setDuration(300L);
            this.f24083s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24083s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24083s = null;
        }
        if (z10) {
            f7 = 1.0f;
        }
        setProgress(f7);
    }

    public final void c(int i10, int i11) {
        this.F = i10;
        this.f24076a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f24077b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f24082r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24084w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24084w = false;
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
        accessibilityNodeInfo.setChecked(this.f24085x);
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
        this.f24076a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f24077b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.E = i10;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f24081n = z10;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.G = "" + (i10 + 1);
        } else if (this.f24083s == null) {
            this.G = null;
        }
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.f24082r == f7) {
            return;
        }
        this.f24082r = f7;
        invalidate();
    }

    public void setSize(int i10) {
        this.f24086y = i10;
        if (i10 == 40) {
            this.f24077b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        K.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f24078c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f24086y);
                int dp2 = AndroidUtilities.dp(this.f24086y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f24078c = Bitmap.createBitmap(dp, dp2, config);
                this.f24079e = new Canvas(this.f24078c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f24086y), AndroidUtilities.dp(this.f24086y), config);
                this.f24080f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
