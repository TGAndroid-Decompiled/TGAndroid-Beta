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
public class i6 extends View {
    public boolean f34541a;
    public Drawable f34542b;
    public final h6 f34543c;
    public int d;
    public int f34544e;
    public CharSequence f34545f;
    public boolean h;
    public boolean f34546n;
    public boolean f34547r;

    public i6(Context context, boolean z9, boolean z10, boolean z11) {
        this(context, z9, z10, z11, false, false);
    }

    public final void a() {
        this.f34543c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f34543c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        boolean z11;
        if (!this.f34547r && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34547r = false;
        h6 h6Var = this.f34543c;
        if (z11 && !TextUtils.equals(charSequence, h6Var.f34193i)) {
            if (h6Var.J) {
                ValueAnimator valueAnimator = h6Var.f34204t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    h6Var.f34204t = null;
                }
            } else if (h6Var.h()) {
                this.f34545f = charSequence;
                this.h = z10;
                return;
            }
        }
        h6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        h6Var.t(charSequence, z11, z10);
        float e10 = (int) h6Var.e();
        if (e10 >= h6Var.e() && (z11 || e10 == h6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f34543c.c()));
    }

    public h6 getDrawable() {
        return this.f34543c;
    }

    public TextPaint getPaint() {
        return this.f34543c.f34185a;
    }

    public float getRightPadding() {
        return this.f34543c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f34542b;
    }

    public CharSequence getText() {
        return this.f34543c.f34193i;
    }

    public int getTextColor() {
        return this.f34543c.f34185a.getColor();
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
        Drawable drawable = this.f34542b;
        h6 h6Var = this.f34543c;
        if (drawable != null && (!this.f34541a || h6Var.i() > 0.0f)) {
            int c10 = (int) (h6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = h6Var.f34187b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f34542b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f34542b.draw(canvas);
        }
        h6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        h6Var.draw(canvas);
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
        int i11 = this.f34544e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        h6 h6Var = this.f34543c;
        if (i12 != size && getLayoutParams().width != 0) {
            h6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            h6Var.t(h6Var.f34193i, false, true);
        }
        this.d = size;
        if (this.f34546n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(h6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z9) {
        this.f34543c.J = z9;
    }

    public void setEllipsizeByGradient(boolean z9) {
        this.f34543c.q(z9);
    }

    public void setEmojiCacheType(int i7) {
        this.f34543c.f34200p = i7;
    }

    public void setEmojiColor(int i7) {
        h6 h6Var = this.f34543c;
        if (h6Var.Z != i7) {
            h6Var.Z = i7;
            h6Var.f34186a0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f34543c.f34186a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f34543c.f34187b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z9) {
        this.f34541a = z9;
    }

    public void setIgnoreRTL(boolean z9) {
        this.f34543c.K = z9;
    }

    public void setIncludeFontPadding(boolean z9) {
        this.f34543c.S = z9;
    }

    public void setMaxWidth(int i7) {
        this.f34544e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f34543c.f34188b0 = runnable;
    }

    public void setRightPadding(float f10) {
        h6 h6Var = this.f34543c;
        h6Var.N = f10;
        h6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f34543c.A = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f34542b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f34543c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f34543c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f34543c.x(typeface);
    }

    public i6(Context context, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f34546n = true;
        this.f34547r = true;
        h6 h6Var = new h6(z9, z10, z11, z12, z13);
        this.f34543c = h6Var;
        h6Var.setCallback(this);
        h6Var.I = new wf(this, 8);
    }
}
