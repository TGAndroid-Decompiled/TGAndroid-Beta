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
    public boolean f25678a;
    public Drawable f25679b;
    public final n6 f25680c;
    public int d;
    public int e;
    public CharSequence f25681f;
    public boolean h;
    public boolean f25682n;
    public boolean f25683r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f25682n = true;
        this.f25683r = true;
        n6 n6Var = new n6(z10, z11, z12, false);
        this.f25680c = n6Var;
        n6Var.setCallback(this);
        n6Var.C = new rg(this, 8);
    }

    public final void a() {
        this.f25680c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f25680c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f25683r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f25683r = false;
        n6 n6Var = this.f25680c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.f25428g)) {
            if (n6Var.D) {
                ValueAnimator valueAnimator = n6Var.f25435o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.f25435o = null;
                }
            } else if (n6Var.f()) {
                this.f25681f = charSequence;
                this.h = z11;
                return;
            }
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.q(charSequence, z12, z11);
        float e = (int) n6Var.e();
        if (e >= n6Var.e() && (z12 || e == n6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f25680c.d()));
    }

    public n6 getDrawable() {
        return this.f25680c;
    }

    public TextPaint getPaint() {
        return this.f25680c.f25424a;
    }

    public float getRightPadding() {
        return this.f25680c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f25679b;
    }

    public CharSequence getText() {
        return this.f25680c.f25428g;
    }

    public int getTextColor() {
        return this.f25680c.f25424a.getColor();
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
        Drawable drawable = this.f25679b;
        n6 n6Var = this.f25680c;
        if (drawable != null && (!this.f25678a || n6Var.g() > 0.0f)) {
            int d = (int) (n6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((n6Var.f25425b & 7) == 5) {
                this.f25679b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f25679b.setBounds(0, 0, d, getHeight());
            }
            this.f25679b.draw(canvas);
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
        n6 n6Var = this.f25680c;
        if (i13 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.q(n6Var.f25428g, false, true);
        }
        this.d = size;
        if (this.f25682n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f25680c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f25680c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f25680c.f25432l = i10;
    }

    public void setEmojiColor(int i10) {
        n6 n6Var = this.f25680c;
        if (n6Var.T != i10) {
            n6Var.T = i10;
            n6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f25680c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f25680c.f25425b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f25678a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f25680c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f25680c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f25680c.V = runnable;
    }

    public void setRightPadding(float f7) {
        n6 n6Var = this.f25680c;
        n6Var.H = f7;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f25680c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f25679b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f25680c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f25680c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f25680c.u(typeface);
    }
}
