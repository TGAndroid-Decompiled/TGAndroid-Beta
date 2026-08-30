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
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public static Paint H;
    public int B;
    public int C;
    public String D;
    public final Drawable f22942a;
    public final TextPaint f22943b;
    public Bitmap f22944c;
    public Bitmap d;
    public Canvas e;
    public Canvas f22945f;
    public boolean h;
    public boolean f22946n;
    public float f22947r;
    public ObjectAnimator f22948s;
    public boolean v;
    public boolean f22949w;
    public boolean f22950x;
    public int f22951y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f22951y = 22;
        if (E == null) {
            E = new Paint(1);
            Paint paint = new Paint(1);
            F = paint;
            paint.setColor(0);
            Paint paint2 = F;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            G = paint3;
            paint3.setColor(0);
            Paint paint4 = G;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            G.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            H = paint5;
            paint5.setColor(-1);
            H.setStyle(style);
        }
        G.setStrokeWidth(AndroidUtilities.dp(28.0f));
        H.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f22943b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f22942a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z4) {
        b(z4, false);
    }

    public final void b(boolean z4, boolean z10) {
        if (z4 == this.f22950x) {
            return;
        }
        this.f22950x = z4;
        float f10 = 0.0f;
        if (this.f22949w && z10) {
            this.v = z4;
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f22948s = ofFloat;
            ofFloat.addListener(new a9(this, 11));
            this.f22948s.setDuration(300L);
            this.f22948s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22948s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22948s = null;
        }
        if (z4) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i10, int i11) {
        this.C = i10;
        this.f22942a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f22943b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f22947r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22949w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22949w = false;
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
        accessibilityNodeInfo.setChecked(this.f22950x);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.f22942a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f22943b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.B = i10;
    }

    public void setDrawBackground(boolean z4) {
        this.h = z4;
    }

    public void setHasBorder(boolean z4) {
        this.f22946n = z4;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.D = "" + (i10 + 1);
        } else if (this.f22948s == null) {
            this.D = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f22947r == f10) {
            return;
        }
        this.f22947r = f10;
        invalidate();
    }

    public void setSize(int i10) {
        this.f22951y = i10;
        if (i10 == 40) {
            this.f22943b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        H.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f22944c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f22951y);
                int dp2 = AndroidUtilities.dp(this.f22951y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f22944c = Bitmap.createBitmap(dp, dp2, config);
                this.e = new Canvas(this.f22944c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f22951y), AndroidUtilities.dp(this.f22951y), config);
                this.f22945f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
