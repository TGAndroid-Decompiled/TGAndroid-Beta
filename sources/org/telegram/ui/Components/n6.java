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
public class n6 extends View {
    public boolean f37680a;
    public Drawable f37681b;
    public final m6 f37682c;
    public int d;
    public int f37683e;
    public CharSequence f37684f;
    public boolean h;
    public boolean f37685n;
    public boolean f37686r;

    public n6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f37682c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f37682c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f37686r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f37686r = false;
        m6 m6Var = this.f37682c;
        if (z12 && !TextUtils.equals(charSequence, m6Var.f37401i)) {
            if (m6Var.K) {
                ValueAnimator valueAnimator = m6Var.f37412t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m6Var.f37412t = null;
                }
            } else if (m6Var.h()) {
                this.f37684f = charSequence;
                this.h = z11;
                return;
            }
        }
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.t(charSequence, z12, z11);
        float e10 = (int) m6Var.e();
        if (e10 >= m6Var.e() && (z12 || e10 == m6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f37682c.c()));
    }

    public m6 getDrawable() {
        return this.f37682c;
    }

    public TextPaint getPaint() {
        return this.f37682c.f37392a;
    }

    public float getRightPadding() {
        return this.f37682c.O;
    }

    public Drawable getSizeableBackground() {
        return this.f37681b;
    }

    public CharSequence getText() {
        return this.f37682c.f37401i;
    }

    public int getTextColor() {
        return this.f37682c.f37392a.getColor();
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
        Drawable drawable = this.f37681b;
        m6 m6Var = this.f37682c;
        if (drawable != null && (!this.f37680a || m6Var.i() > 0.0f)) {
            int c10 = (int) (m6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = m6Var.f37394b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f37681b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f37681b.draw(canvas);
        }
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.draw(canvas);
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
        int i11 = this.f37683e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        m6 m6Var = this.f37682c;
        if (i12 != size && getLayoutParams().width != 0) {
            m6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            m6Var.t(m6Var.f37401i, false, true);
        }
        this.d = size;
        if (this.f37685n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(m6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f37682c.K = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f37682c.q(z10);
    }

    public void setEmojiCacheType(int i7) {
        this.f37682c.f37408p = i7;
    }

    public void setEmojiColor(int i7) {
        m6 m6Var = this.f37682c;
        if (m6Var.f37393a0 != i7) {
            m6Var.f37393a0 = i7;
            m6Var.f37395b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f37682c.f37395b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f37682c.f37394b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f37680a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f37682c.L = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f37682c.T = z10;
    }

    public void setMaxWidth(int i7) {
        this.f37683e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f37682c.f37397c0 = runnable;
    }

    public void setRightPadding(float f10) {
        m6 m6Var = this.f37682c;
        m6Var.O = f10;
        m6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f37682c.B = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f37681b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f37682c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f37682c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f37682c.x(typeface);
    }

    public n6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f37685n = true;
        this.f37686r = true;
        m6 m6Var = new m6(z10, z11, z12, z13, z14);
        this.f37682c = m6Var;
        m6Var.setCallback(this);
        m6Var.J = new ng(this, 8);
    }
}
