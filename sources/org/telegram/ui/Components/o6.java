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
public class o6 extends View {
    public boolean f29153a;
    public Drawable f29154b;
    public final n6 f29155c;
    public int d;
    public int e;
    public CharSequence f29156f;
    public boolean h;
    public boolean f29157n;
    public boolean f29158r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f29155c.a();
    }

    public final void b(float f7, long j10, TimeInterpolator timeInterpolator) {
        this.f29155c.n(f7, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29158r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29158r = false;
        n6 n6Var = this.f29155c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.f28802i)) {
            if (n6Var.J) {
                ValueAnimator valueAnimator = n6Var.f28813t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.f28813t = null;
                }
            } else if (n6Var.h()) {
                this.f29156f = charSequence;
                this.h = z11;
                return;
            }
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.t(charSequence, z12, z11);
        float e = (int) n6Var.e();
        if (e >= n6Var.e() && (z12 || e == n6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29155c.c()));
    }

    public n6 getDrawable() {
        return this.f29155c;
    }

    public TextPaint getPaint() {
        return this.f29155c.f28795a;
    }

    public float getRightPadding() {
        return this.f29155c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f29154b;
    }

    public CharSequence getText() {
        return this.f29155c.f28802i;
    }

    public int getTextColor() {
        return this.f29155c.f28795a.getColor();
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
        int i10;
        Drawable drawable = this.f29154b;
        n6 n6Var = this.f29155c;
        if (drawable != null && (!this.f29153a || n6Var.i() > 0.0f)) {
            int c10 = (int) (n6Var.c() + getPaddingLeft() + getPaddingRight());
            int i11 = n6Var.f28797b & 7;
            if (i11 == 5) {
                i10 = getWidth() - c10;
            } else if (i11 == 1) {
                i10 = (getWidth() - c10) / 2;
            } else {
                i10 = 0;
            }
            this.f29154b.setBounds(i10, 0, c10 + i10, getHeight());
            this.f29154b.draw(canvas);
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.draw(canvas);
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
        n6 n6Var = this.f29155c;
        if (i13 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.t(n6Var.f28802i, false, true);
        }
        this.d = size;
        if (this.f29157n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29155c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29155c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29155c.f28809p = i10;
    }

    public void setEmojiColor(int i10) {
        n6 n6Var = this.f29155c;
        if (n6Var.Z != i10) {
            n6Var.Z = i10;
            n6Var.f28796a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29155c.f28796a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29155c.f28797b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29153a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29155c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29155c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29155c.f28798b0 = runnable;
    }

    public void setRightPadding(float f7) {
        n6 n6Var = this.f29155c;
        n6Var.N = f7;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f29155c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29154b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29155c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f29155c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f29155c.x(typeface);
    }

    public o6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f29157n = true;
        this.f29158r = true;
        n6 n6Var = new n6(z10, z11, z12, z13, z14);
        this.f29155c = n6Var;
        n6Var.setCallback(this);
        n6Var.I = new ng(this, 9);
    }
}
