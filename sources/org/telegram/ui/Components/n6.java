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
    public boolean f37735a;
    public Drawable f37736b;
    public final m6 f37737c;
    public int d;
    public int f37738e;
    public CharSequence f37739f;
    public boolean h;
    public boolean f37740n;
    public boolean f37741r;

    public n6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f37737c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f37737c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f37741r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f37741r = false;
        m6 m6Var = this.f37737c;
        if (z12 && !TextUtils.equals(charSequence, m6Var.f37384i)) {
            if (m6Var.K) {
                ValueAnimator valueAnimator = m6Var.f37395t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m6Var.f37395t = null;
                }
            } else if (m6Var.h()) {
                this.f37739f = charSequence;
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
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f37737c.c()));
    }

    public m6 getDrawable() {
        return this.f37737c;
    }

    public TextPaint getPaint() {
        return this.f37737c.f37375a;
    }

    public float getRightPadding() {
        return this.f37737c.O;
    }

    public Drawable getSizeableBackground() {
        return this.f37736b;
    }

    public CharSequence getText() {
        return this.f37737c.f37384i;
    }

    public int getTextColor() {
        return this.f37737c.f37375a.getColor();
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
        Drawable drawable = this.f37736b;
        m6 m6Var = this.f37737c;
        if (drawable != null && (!this.f37735a || m6Var.i() > 0.0f)) {
            int c10 = (int) (m6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = m6Var.f37377b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f37736b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f37736b.draw(canvas);
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
        int i11 = this.f37738e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        m6 m6Var = this.f37737c;
        if (i12 != size && getLayoutParams().width != 0) {
            m6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            m6Var.t(m6Var.f37384i, false, true);
        }
        this.d = size;
        if (this.f37740n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(m6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f37737c.K = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f37737c.q(z10);
    }

    public void setEmojiCacheType(int i7) {
        this.f37737c.f37391p = i7;
    }

    public void setEmojiColor(int i7) {
        m6 m6Var = this.f37737c;
        if (m6Var.f37376a0 != i7) {
            m6Var.f37376a0 = i7;
            m6Var.f37378b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f37737c.f37378b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f37737c.f37377b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f37735a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f37737c.L = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f37737c.T = z10;
    }

    public void setMaxWidth(int i7) {
        this.f37738e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f37737c.f37380c0 = runnable;
    }

    public void setRightPadding(float f10) {
        m6 m6Var = this.f37737c;
        m6Var.O = f10;
        m6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f37737c.B = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f37736b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f37737c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f37737c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f37737c.x(typeface);
    }

    public n6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f37740n = true;
        this.f37741r = true;
        m6 m6Var = new m6(z10, z11, z12, z13, z14);
        this.f37737c = m6Var;
        m6Var.setCallback(this);
        m6Var.J = new lg(this, 8);
    }
}
