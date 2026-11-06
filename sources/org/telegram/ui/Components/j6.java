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
public class j6 extends View {
    public boolean f34888a;
    public Drawable f34889b;
    public final i6 f34890c;
    public int d;
    public int f34891e;
    public CharSequence f34892f;
    public boolean h;
    public boolean f34893n;
    public boolean f34894r;

    public j6(Context context, boolean z9, boolean z10, boolean z11) {
        this(context, z9, z10, z11, false, false);
    }

    public final void a() {
        this.f34890c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f34890c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        boolean z11;
        if (!this.f34894r && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34894r = false;
        i6 i6Var = this.f34890c;
        if (z11 && !TextUtils.equals(charSequence, i6Var.f34522i)) {
            if (i6Var.J) {
                ValueAnimator valueAnimator = i6Var.f34533t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i6Var.f34533t = null;
                }
            } else if (i6Var.h()) {
                this.f34892f = charSequence;
                this.h = z10;
                return;
            }
        }
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.t(charSequence, z11, z10);
        float e10 = (int) i6Var.e();
        if (e10 >= i6Var.e() && (z11 || e10 == i6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f34890c.c()));
    }

    public i6 getDrawable() {
        return this.f34890c;
    }

    public TextPaint getPaint() {
        return this.f34890c.f34514a;
    }

    public float getRightPadding() {
        return this.f34890c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f34889b;
    }

    public CharSequence getText() {
        return this.f34890c.f34522i;
    }

    public int getTextColor() {
        return this.f34890c.f34514a.getColor();
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
        Drawable drawable = this.f34889b;
        i6 i6Var = this.f34890c;
        if (drawable != null && (!this.f34888a || i6Var.i() > 0.0f)) {
            int c10 = (int) (i6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = i6Var.f34516b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f34889b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f34889b.draw(canvas);
        }
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.draw(canvas);
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
        int i11 = this.f34891e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        i6 i6Var = this.f34890c;
        if (i12 != size && getLayoutParams().width != 0) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            i6Var.t(i6Var.f34522i, false, true);
        }
        this.d = size;
        if (this.f34893n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(i6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z9) {
        this.f34890c.J = z9;
    }

    public void setEllipsizeByGradient(boolean z9) {
        this.f34890c.q(z9);
    }

    public void setEmojiCacheType(int i7) {
        this.f34890c.f34529p = i7;
    }

    public void setEmojiColor(int i7) {
        i6 i6Var = this.f34890c;
        if (i6Var.Z != i7) {
            i6Var.Z = i7;
            i6Var.f34515a0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f34890c.f34515a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f34890c.f34516b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z9) {
        this.f34888a = z9;
    }

    public void setIgnoreRTL(boolean z9) {
        this.f34890c.K = z9;
    }

    public void setIncludeFontPadding(boolean z9) {
        this.f34890c.S = z9;
    }

    public void setMaxWidth(int i7) {
        this.f34891e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f34890c.f34517b0 = runnable;
    }

    public void setRightPadding(float f10) {
        i6 i6Var = this.f34890c;
        i6Var.N = f10;
        i6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f34890c.A = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f34889b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f34890c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f34890c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f34890c.x(typeface);
    }

    public j6(Context context, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f34893n = true;
        this.f34894r = true;
        i6 i6Var = new i6(z9, z10, z11, z12, z13);
        this.f34890c = i6Var;
        i6Var.setCallback(this);
        i6Var.I = new xf(this, 8);
    }
}
