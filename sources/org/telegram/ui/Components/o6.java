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
    public boolean f31263a;
    public Drawable f31264b;
    public final n6 f31265c;
    public int d;
    public int f31266e;
    public CharSequence f31267f;
    public boolean h;
    public boolean f31268n;
    public boolean f31269r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f31268n = true;
        this.f31269r = true;
        n6 n6Var = new n6(z10, z11, z12, false);
        this.f31265c = n6Var;
        n6Var.setCallback(this);
        n6Var.C = new ig(this, 8);
    }

    public final void a() {
        this.f31265c.b();
    }

    public final void b(float f9, long j10, TimeInterpolator timeInterpolator) {
        this.f31265c.k(f9, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f31269r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f31269r = false;
        n6 n6Var = this.f31265c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.f30866g)) {
            if (n6Var.D) {
                ValueAnimator valueAnimator = n6Var.f30873o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.f30873o = null;
                }
            } else if (n6Var.f()) {
                this.f31267f = charSequence;
                this.h = z11;
                return;
            }
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.q(charSequence, z12, z11);
        float e10 = (int) n6Var.e();
        if (e10 >= n6Var.e() && (z12 || e10 == n6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f31265c.d()));
    }

    public n6 getDrawable() {
        return this.f31265c;
    }

    public TextPaint getPaint() {
        return this.f31265c.f30861a;
    }

    public float getRightPadding() {
        return this.f31265c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f31264b;
    }

    public CharSequence getText() {
        return this.f31265c.f30866g;
    }

    public int getTextColor() {
        return this.f31265c.f30861a.getColor();
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
        Drawable drawable = this.f31264b;
        n6 n6Var = this.f31265c;
        if (drawable != null && (!this.f31263a || n6Var.g() > 0.0f)) {
            int d = (int) (n6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((n6Var.f30862b & 7) == 5) {
                this.f31264b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f31264b.setBounds(0, 0, d, getHeight());
            }
            this.f31264b.draw(canvas);
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
        int i12 = this.f31266e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        n6 n6Var = this.f31265c;
        if (i13 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.q(n6Var.f30866g, false, true);
        }
        this.d = size;
        if (this.f31268n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f31265c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f31265c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f31265c.f30870l = i10;
    }

    public void setEmojiColor(int i10) {
        n6 n6Var = this.f31265c;
        if (n6Var.T != i10) {
            n6Var.T = i10;
            n6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f31265c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f31265c.f30862b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f31263a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f31265c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f31265c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.f31266e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f31265c.V = runnable;
    }

    public void setRightPadding(float f9) {
        n6 n6Var = this.f31265c;
        n6Var.H = f9;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f9) {
        this.f31265c.v = f9;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f31264b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f31265c.r(i10);
        invalidate();
    }

    public void setTextSize(float f9) {
        this.f31265c.t(f9);
    }

    public void setTypeface(Typeface typeface) {
        this.f31265c.u(typeface);
    }
}
