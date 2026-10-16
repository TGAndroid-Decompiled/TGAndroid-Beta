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
public class s6 extends View {
    public boolean f28750a;
    public Drawable f28751b;
    public final r6 f28752c;
    public int d;
    public int e;
    public CharSequence f28753f;
    public boolean h;
    public boolean f28754n;
    public boolean f28755r;

    public s6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f28752c.a();
    }

    public final void b(float f7, long j10, TimeInterpolator timeInterpolator) {
        this.f28752c.n(f7, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f28755r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f28755r = false;
        r6 r6Var = this.f28752c;
        if (z12 && !TextUtils.equals(charSequence, r6Var.f28440i)) {
            if (r6Var.J) {
                ValueAnimator valueAnimator = r6Var.f28451t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r6Var.f28451t = null;
                }
            } else if (r6Var.h()) {
                this.f28753f = charSequence;
                this.h = z11;
                return;
            }
        }
        r6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        r6Var.t(charSequence, z12, z11);
        float e = (int) r6Var.e();
        if (e >= r6Var.e() && (z12 || e == r6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f28752c.c()));
    }

    public r6 getDrawable() {
        return this.f28752c;
    }

    public TextPaint getPaint() {
        return this.f28752c.f28433a;
    }

    public float getRightPadding() {
        return this.f28752c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f28751b;
    }

    public CharSequence getText() {
        return this.f28752c.f28440i;
    }

    public int getTextColor() {
        return this.f28752c.f28433a.getColor();
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
        Drawable drawable = this.f28751b;
        r6 r6Var = this.f28752c;
        if (drawable != null && (!this.f28750a || r6Var.i() > 0.0f)) {
            int c10 = (int) (r6Var.c() + getPaddingLeft() + getPaddingRight());
            int i11 = r6Var.f28435b & 7;
            if (i11 == 5) {
                i10 = getWidth() - c10;
            } else if (i11 == 1) {
                i10 = (getWidth() - c10) / 2;
            } else {
                i10 = 0;
            }
            this.f28751b.setBounds(i10, 0, c10 + i10, getHeight());
            this.f28751b.draw(canvas);
        }
        r6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        r6Var.draw(canvas);
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
        r6 r6Var = this.f28752c;
        if (i13 != size && getLayoutParams().width != 0) {
            r6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            r6Var.t(r6Var.f28440i, false, true);
        }
        this.d = size;
        if (this.f28754n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(r6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f28752c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f28752c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f28752c.f28447p = i10;
    }

    public void setEmojiColor(int i10) {
        r6 r6Var = this.f28752c;
        if (r6Var.Z != i10) {
            r6Var.Z = i10;
            r6Var.f28434a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f28752c.f28434a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f28752c.f28435b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f28750a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f28752c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f28752c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f28752c.f28436b0 = runnable;
    }

    public void setRightPadding(float f7) {
        r6 r6Var = this.f28752c;
        r6Var.N = f7;
        r6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f28752c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f28751b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f28752c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f28752c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f28752c.x(typeface);
    }

    public s6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f28754n = true;
        this.f28755r = true;
        r6 r6Var = new r6(z10, z11, z12, z13, z14);
        this.f28752c = r6Var;
        r6Var.setCallback(this);
        r6Var.I = new qg(this, 8);
    }
}
