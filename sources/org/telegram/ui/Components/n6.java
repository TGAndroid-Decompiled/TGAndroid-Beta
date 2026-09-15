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
    public boolean f26328a;
    public Drawable f26329b;
    public final m6 f26330c;
    public int d;
    public int e;
    public CharSequence f26331f;
    public boolean h;
    public boolean f26332n;
    public boolean f26333r;

    public n6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f26332n = true;
        this.f26333r = true;
        m6 m6Var = new m6(z10, z11, z12, false);
        this.f26330c = m6Var;
        m6Var.setCallback(this);
        m6Var.C = new ng(this, 8);
    }

    public final void a() {
        this.f26330c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f26330c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f26333r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f26333r = false;
        m6 m6Var = this.f26330c;
        if (z12 && !TextUtils.equals(charSequence, m6Var.f26089g)) {
            if (m6Var.D) {
                ValueAnimator valueAnimator = m6Var.f26096o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m6Var.f26096o = null;
                }
            } else if (m6Var.f()) {
                this.f26331f = charSequence;
                this.h = z11;
                return;
            }
        }
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.q(charSequence, z12, z11);
        float e = (int) m6Var.e();
        if (e >= m6Var.e() && (z12 || e == m6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f26330c.d()));
    }

    public m6 getDrawable() {
        return this.f26330c;
    }

    public TextPaint getPaint() {
        return this.f26330c.f26085a;
    }

    public float getRightPadding() {
        return this.f26330c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f26329b;
    }

    public CharSequence getText() {
        return this.f26330c.f26089g;
    }

    public int getTextColor() {
        return this.f26330c.f26085a.getColor();
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
        Drawable drawable = this.f26329b;
        m6 m6Var = this.f26330c;
        if (drawable != null && (!this.f26328a || m6Var.g() > 0.0f)) {
            int d = (int) (m6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((m6Var.f26086b & 7) == 5) {
                this.f26329b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f26329b.setBounds(0, 0, d, getHeight());
            }
            this.f26329b.draw(canvas);
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
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        m6 m6Var = this.f26330c;
        if (i13 != size && getLayoutParams().width != 0) {
            m6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            m6Var.q(m6Var.f26089g, false, true);
        }
        this.d = size;
        if (this.f26332n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(m6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f26330c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f26330c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f26330c.f26093l = i10;
    }

    public void setEmojiColor(int i10) {
        m6 m6Var = this.f26330c;
        if (m6Var.T != i10) {
            m6Var.T = i10;
            m6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f26330c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f26330c.f26086b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f26328a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f26330c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f26330c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f26330c.V = runnable;
    }

    public void setRightPadding(float f7) {
        m6 m6Var = this.f26330c;
        m6Var.H = f7;
        m6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f26330c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f26329b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f26330c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f26330c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f26330c.u(typeface);
    }
}
