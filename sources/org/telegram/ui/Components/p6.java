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
public class p6 extends View {
    public boolean f27263a;
    public Drawable f27264b;
    public final o6 f27265c;
    public int d;
    public int e;
    public CharSequence f27266f;
    public boolean h;
    public boolean f27267n;
    public boolean f27268r;

    public p6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f27267n = true;
        this.f27268r = true;
        o6 o6Var = new o6(z10, z11, z12, false);
        this.f27265c = o6Var;
        o6Var.setCallback(this);
        o6Var.C = new pg(this, 8);
    }

    public final void a() {
        this.f27265c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f27265c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f27268r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f27268r = false;
        o6 o6Var = this.f27265c;
        if (z12 && !TextUtils.equals(charSequence, o6Var.f26951g)) {
            if (o6Var.D) {
                ValueAnimator valueAnimator = o6Var.f26958o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    o6Var.f26958o = null;
                }
            } else if (o6Var.f()) {
                this.f27266f = charSequence;
                this.h = z11;
                return;
            }
        }
        o6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        o6Var.q(charSequence, z12, z11);
        float e = (int) o6Var.e();
        if (e >= o6Var.e() && (z12 || e == o6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f27265c.d()));
    }

    public o6 getDrawable() {
        return this.f27265c;
    }

    public TextPaint getPaint() {
        return this.f27265c.f26947a;
    }

    public float getRightPadding() {
        return this.f27265c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f27264b;
    }

    public CharSequence getText() {
        return this.f27265c.f26951g;
    }

    public int getTextColor() {
        return this.f27265c.f26947a.getColor();
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
        Drawable drawable = this.f27264b;
        o6 o6Var = this.f27265c;
        if (drawable != null && (!this.f27263a || o6Var.g() > 0.0f)) {
            int d = (int) (o6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((o6Var.f26948b & 7) == 5) {
                this.f27264b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f27264b.setBounds(0, 0, d, getHeight());
            }
            this.f27264b.draw(canvas);
        }
        o6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        o6Var.draw(canvas);
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
        o6 o6Var = this.f27265c;
        if (i13 != size && getLayoutParams().width != 0) {
            o6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            o6Var.q(o6Var.f26951g, false, true);
        }
        this.d = size;
        if (this.f27267n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(o6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f27265c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f27265c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f27265c.f26955l = i10;
    }

    public void setEmojiColor(int i10) {
        o6 o6Var = this.f27265c;
        if (o6Var.T != i10) {
            o6Var.T = i10;
            o6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f27265c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f27265c.f26948b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f27263a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f27265c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f27265c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f27265c.V = runnable;
    }

    public void setRightPadding(float f7) {
        o6 o6Var = this.f27265c;
        o6Var.H = f7;
        o6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f27265c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f27264b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f27265c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f27265c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f27265c.u(typeface);
    }
}
