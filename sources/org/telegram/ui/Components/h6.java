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
    public boolean f35173a;
    public Drawable f35174b;
    public final g6 f35175c;
    public int d;
    public int f35176e;
    public CharSequence f35177f;
    public boolean h;
    public boolean f35178n;
    public boolean f35179r;

    public h6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f35175c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f35175c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f35179r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f35179r = false;
        g6 g6Var = this.f35175c;
        if (z12 && !TextUtils.equals(charSequence, g6Var.f34840i)) {
            if (g6Var.K) {
                ValueAnimator valueAnimator = g6Var.f34851t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g6Var.f34851t = null;
                }
            } else if (g6Var.h()) {
                this.f35177f = charSequence;
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
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f35175c.c()));
    }

    public g6 getDrawable() {
        return this.f35175c;
    }

    public TextPaint getPaint() {
        return this.f35175c.f34831a;
    }

    public float getRightPadding() {
        return this.f35175c.O;
    }

    public Drawable getSizeableBackground() {
        return this.f35174b;
    }

    public CharSequence getText() {
        return this.f35175c.f34840i;
    }

    public int getTextColor() {
        return this.f35175c.f34831a.getColor();
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
        int i7;
        Drawable drawable = this.f35174b;
        g6 g6Var = this.f35175c;
        if (drawable != null && (!this.f35173a || g6Var.i() > 0.0f)) {
            int c10 = (int) (g6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = g6Var.f34833b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f35174b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f35174b.draw(canvas);
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
    public void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.f35176e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        g6 g6Var = this.f35175c;
        if (i12 != size && getLayoutParams().width != 0) {
            g6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            g6Var.t(g6Var.f34840i, false, true);
        }
        this.d = size;
        if (this.f35178n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(g6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f35175c.K = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f35175c.q(z10);
    }

    public void setEmojiCacheType(int i7) {
        this.f35175c.f34847p = i7;
    }

    public void setEmojiColor(int i7) {
        g6 g6Var = this.f35175c;
        if (g6Var.f34832a0 != i7) {
            g6Var.f34832a0 = i7;
            g6Var.f34834b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f35175c.f34834b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f35175c.f34833b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f35173a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f35175c.L = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f35175c.T = z10;
    }

    public void setMaxWidth(int i7) {
        this.f35176e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f35175c.f34836c0 = runnable;
    }

    public void setRightPadding(float f10) {
        g6 g6Var = this.f35175c;
        g6Var.O = f10;
        g6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f35175c.B = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f35174b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f35175c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f35175c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f35175c.x(typeface);
    }

    public h6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f35178n = true;
        this.f35179r = true;
        g6 g6Var = new g6(z10, z11, z12, z13, z14);
        this.f35175c = g6Var;
        g6Var.setCallback(this);
        g6Var.J = new dg(this, 8);
    }
}
