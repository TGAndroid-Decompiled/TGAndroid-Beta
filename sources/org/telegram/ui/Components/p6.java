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
    public boolean f27248a;
    public Drawable f27249b;
    public final o6 f27250c;
    public int d;
    public int e;
    public CharSequence f27251f;
    public boolean h;
    public boolean f27252n;
    public boolean f27253r;

    public p6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f27252n = true;
        this.f27253r = true;
        o6 o6Var = new o6(z10, z11, z12, false);
        this.f27250c = o6Var;
        o6Var.setCallback(this);
        o6Var.C = new qg(this, 8);
    }

    public final void a() {
        this.f27250c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f27250c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f27253r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f27253r = false;
        o6 o6Var = this.f27250c;
        if (z12 && !TextUtils.equals(charSequence, o6Var.f26994g)) {
            if (o6Var.D) {
                ValueAnimator valueAnimator = o6Var.f27001o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    o6Var.f27001o = null;
                }
            } else if (o6Var.f()) {
                this.f27251f = charSequence;
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
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f27250c.d()));
    }

    public o6 getDrawable() {
        return this.f27250c;
    }

    public TextPaint getPaint() {
        return this.f27250c.f26990a;
    }

    public float getRightPadding() {
        return this.f27250c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f27249b;
    }

    public CharSequence getText() {
        return this.f27250c.f26994g;
    }

    public int getTextColor() {
        return this.f27250c.f26990a.getColor();
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
        Drawable drawable = this.f27249b;
        o6 o6Var = this.f27250c;
        if (drawable != null && (!this.f27248a || o6Var.g() > 0.0f)) {
            int d = (int) (o6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((o6Var.f26991b & 7) == 5) {
                this.f27249b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f27249b.setBounds(0, 0, d, getHeight());
            }
            this.f27249b.draw(canvas);
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
        o6 o6Var = this.f27250c;
        if (i13 != size && getLayoutParams().width != 0) {
            o6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            o6Var.q(o6Var.f26994g, false, true);
        }
        this.d = size;
        if (this.f27252n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(o6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f27250c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f27250c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f27250c.f26998l = i10;
    }

    public void setEmojiColor(int i10) {
        o6 o6Var = this.f27250c;
        if (o6Var.T != i10) {
            o6Var.T = i10;
            o6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f27250c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f27250c.f26991b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f27248a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f27250c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f27250c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f27250c.V = runnable;
    }

    public void setRightPadding(float f7) {
        o6 o6Var = this.f27250c;
        o6Var.H = f7;
        o6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f27250c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f27249b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f27250c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f27250c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f27250c.u(typeface);
    }
}
