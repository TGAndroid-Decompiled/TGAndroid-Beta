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
    public boolean f38113a;
    public Drawable f38114b;
    public final n6 f38115c;
    public int d;
    public int f38116e;
    public CharSequence f38117f;
    public boolean h;
    public boolean f38118n;
    public boolean f38119r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f38115c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.f38115c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f38119r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f38119r = false;
        n6 n6Var = this.f38115c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.f37802i)) {
            if (n6Var.K) {
                ValueAnimator valueAnimator = n6Var.f37813t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.f37813t = null;
                }
            } else if (n6Var.h()) {
                this.f38117f = charSequence;
                this.h = z11;
                return;
            }
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.t(charSequence, z12, z11);
        float e10 = (int) n6Var.e();
        if (e10 >= n6Var.e() && (z12 || e10 == n6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f38115c.c()));
    }

    public n6 getDrawable() {
        return this.f38115c;
    }

    public TextPaint getPaint() {
        return this.f38115c.f37793a;
    }

    public float getRightPadding() {
        return this.f38115c.O;
    }

    public Drawable getSizeableBackground() {
        return this.f38114b;
    }

    public CharSequence getText() {
        return this.f38115c.f37802i;
    }

    public int getTextColor() {
        return this.f38115c.f37793a.getColor();
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
        Drawable drawable = this.f38114b;
        n6 n6Var = this.f38115c;
        if (drawable != null && (!this.f38113a || n6Var.i() > 0.0f)) {
            int c10 = (int) (n6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = n6Var.f37795b & 7;
            if (i10 == 5) {
                i7 = getWidth() - c10;
            } else if (i10 == 1) {
                i7 = (getWidth() - c10) / 2;
            } else {
                i7 = 0;
            }
            this.f38114b.setBounds(i7, 0, c10 + i7, getHeight());
            this.f38114b.draw(canvas);
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
    public void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.f38116e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        n6 n6Var = this.f38115c;
        if (i12 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.t(n6Var.f37802i, false, true);
        }
        this.d = size;
        if (this.f38118n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f38115c.K = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f38115c.q(z10);
    }

    public void setEmojiCacheType(int i7) {
        this.f38115c.f37809p = i7;
    }

    public void setEmojiColor(int i7) {
        n6 n6Var = this.f38115c;
        if (n6Var.f37794a0 != i7) {
            n6Var.f37794a0 = i7;
            n6Var.f37796b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f38115c.f37796b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.f38115c.f37795b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f38113a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f38115c.L = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f38115c.T = z10;
    }

    public void setMaxWidth(int i7) {
        this.f38116e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f38115c.f37798c0 = runnable;
    }

    public void setRightPadding(float f10) {
        n6 n6Var = this.f38115c;
        n6Var.O = f10;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f38115c.B = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f38114b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.f38115c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f38115c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f38115c.x(typeface);
    }

    public o6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f38118n = true;
        this.f38119r = true;
        n6 n6Var = new n6(z10, z11, z12, z13, z14);
        this.f38115c = n6Var;
        n6Var.setCallback(this);
        n6Var.J = new og(this, 8);
    }
}
