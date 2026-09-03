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
    public final Drawable f22915a;
    public final TextPaint f22916b;
    public Bitmap f22917c;
    public Bitmap d;
    public Canvas e;
    public Canvas f22918f;
    public boolean h;
    public boolean f22919n;
    public float f22920r;
    public ObjectAnimator f22921s;
    public boolean v;
    public boolean f22922w;
    public boolean f22923x;
    public int f22924y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f22924y = 22;
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
        this.f22916b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f22915a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z4) {
        b(z4, false);
    }

    public final void b(boolean z4, boolean z10) {
        if (z4 == this.f22923x) {
            return;
        }
        this.f22923x = z4;
        float f10 = 0.0f;
        if (this.f22922w && z10) {
            this.v = z4;
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f22921s = ofFloat;
            ofFloat.addListener(new a9(this, 11));
            this.f22921s.setDuration(300L);
            this.f22921s.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22921s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22921s = null;
        }
        if (z4) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void c(int i10, int i11) {
        this.C = i10;
        this.f22915a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f22916b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f22920r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22922w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22922w = false;
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
        accessibilityNodeInfo.setChecked(this.f22923x);
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
        this.f22915a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f22916b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.B = i10;
    }

    public void setDrawBackground(boolean z4) {
        this.h = z4;
    }

    public void setHasBorder(boolean z4) {
        this.f22919n = z4;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.D = "" + (i10 + 1);
        } else if (this.f22921s == null) {
            this.D = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f22920r == f10) {
            return;
        }
        this.f22920r = f10;
        invalidate();
    }

    public void setSize(int i10) {
        this.f22924y = i10;
        if (i10 == 40) {
            this.f22916b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        H.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f22917c == null) {
            try {
                int dp = AndroidUtilities.dp(this.f22924y);
                int dp2 = AndroidUtilities.dp(this.f22924y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f22917c = Bitmap.createBitmap(dp, dp2, config);
                this.e = new Canvas(this.f22917c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f22924y), AndroidUtilities.dp(this.f22924y), config);
                this.f22918f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
