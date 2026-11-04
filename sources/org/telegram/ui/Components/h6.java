package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class h6 extends View {
    public boolean f34305a;
    public Drawable f34306b;
    public final g6 f34307c;
    public int d;
    public int f34308e;
    public CharSequence f34309f;
    public boolean h;
    public boolean f34310n;
    public boolean f34311r;

    public h6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f34307c.a();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f34307c.n(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f34311r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f34311r = false;
        g6 g6Var = this.f34307c;
        if (z12 && !TextUtils.equals(charSequence, g6Var.f33989i)) {
            if (g6Var.J) {
                ValueAnimator valueAnimator = g6Var.f34000t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g6Var.f34000t = null;
                }
            } else if (g6Var.h()) {
                this.f34309f = charSequence;
                this.h = z11;
                return;
            }
        }
        g6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        g6Var.t(charSequence, z12, z11);
        float e10 = (int) g6Var.e();
        if (e10 >= g6Var.e() && (z12 || e10 == g6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f34307c.c()));
    }

    public g6 getDrawable() {
        return this.f34307c;
    }

    public TextPaint getPaint() {
        return this.f34307c.f33981a;
    }

    public float getRightPadding() {
        return this.f34307c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f34306b;
    }

    public CharSequence getText() {
        return this.f34307c.f33989i;
    }

    public int getTextColor() {
        return this.f34307c.f33981a.getColor();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i3;
        Drawable drawable = this.f34306b;
        g6 g6Var = this.f34307c;
        if (drawable != null && (!this.f34305a || g6Var.i() > 0.0f)) {
            int c2 = (int) (g6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = g6Var.f33983b & 7;
            if (i10 == 5) {
                i3 = getWidth() - c2;
            } else if (i10 == 1) {
                i3 = (getWidth() - c2) / 2;
            } else {
                i3 = 0;
            }
            this.f34306b.setBounds(i3, 0, c2 + i3, getHeight());
            this.f34306b.draw(canvas);
        }
        g6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        g6Var.draw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.f34308e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        g6 g6Var = this.f34307c;
        if (i12 != size && getLayoutParams().width != 0) {
            g6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            g6Var.t(g6Var.f33989i, false, true);
        }
        this.d = size;
        if (this.f34310n && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(g6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f34307c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f34307c.q(z10);
    }

    public void setEmojiCacheType(int i3) {
        this.f34307c.f33996p = i3;
    }

    public void setEmojiColor(int i3) {
        g6 g6Var = this.f34307c;
        if (g6Var.Z != i3) {
            g6Var.Z = i3;
            g6Var.f33982a0 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f34307c.f33982a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i3) {
        this.f34307c.f33983b = i3;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f34305a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f34307c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f34307c.S = z10;
    }

    public void setMaxWidth(int i3) {
        this.f34308e = i3;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f34307c.f33984b0 = runnable;
    }

    public void setRightPadding(float f10) {
        g6 g6Var = this.f34307c;
        g6Var.N = f10;
        g6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f34307c.A = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f34306b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i3) {
        this.f34307c.u(i3);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f34307c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f34307c.x(typeface);
    }

    public h6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f34310n = true;
        this.f34311r = true;
        g6 g6Var = new g6(z10, z11, z12, z13, z14);
        this.f34307c = g6Var;
        g6Var.setCallback(this);
        g6Var.I = new vf(this, 8);
    }
}
