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
public class q6 extends View {
    public boolean f29524a;
    public Drawable f29525b;
    public final p6 f29526c;
    public int d;
    public int e;
    public CharSequence f29527f;
    public boolean h;
    public boolean f29528n;
    public boolean f29529r;

    public q6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f29526c.a();
    }

    public final void b(float f7, long j10, TimeInterpolator timeInterpolator) {
        this.f29526c.n(f7, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29529r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29529r = false;
        p6 p6Var = this.f29526c;
        if (z12 && !TextUtils.equals(charSequence, p6Var.f29185i)) {
            if (p6Var.J) {
                ValueAnimator valueAnimator = p6Var.f29196t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p6Var.f29196t = null;
                }
            } else if (p6Var.h()) {
                this.f29527f = charSequence;
                this.h = z11;
                return;
            }
        }
        p6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        p6Var.t(charSequence, z12, z11);
        float e = (int) p6Var.e();
        if (e >= p6Var.e() && (z12 || e == p6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29526c.c()));
    }

    public p6 getDrawable() {
        return this.f29526c;
    }

    public TextPaint getPaint() {
        return this.f29526c.f29178a;
    }

    public float getRightPadding() {
        return this.f29526c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f29525b;
    }

    public CharSequence getText() {
        return this.f29526c.f29185i;
    }

    public int getTextColor() {
        return this.f29526c.f29178a.getColor();
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
        Drawable drawable = this.f29525b;
        p6 p6Var = this.f29526c;
        if (drawable != null && (!this.f29524a || p6Var.i() > 0.0f)) {
            int c10 = (int) (p6Var.c() + getPaddingLeft() + getPaddingRight());
            int i11 = p6Var.f29180b & 7;
            if (i11 == 5) {
                i10 = getWidth() - c10;
            } else if (i11 == 1) {
                i10 = (getWidth() - c10) / 2;
            } else {
                i10 = 0;
            }
            this.f29525b.setBounds(i10, 0, c10 + i10, getHeight());
            this.f29525b.draw(canvas);
        }
        p6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        p6Var.draw(canvas);
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
        p6 p6Var = this.f29526c;
        if (i13 != size && getLayoutParams().width != 0) {
            p6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            p6Var.t(p6Var.f29185i, false, true);
        }
        this.d = size;
        if (this.f29528n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(p6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29526c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29526c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29526c.f29192p = i10;
    }

    public void setEmojiColor(int i10) {
        p6 p6Var = this.f29526c;
        if (p6Var.Z != i10) {
            p6Var.Z = i10;
            p6Var.f29179a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29526c.f29179a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29526c.f29180b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29524a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29526c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29526c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29526c.f29181b0 = runnable;
    }

    public void setRightPadding(float f7) {
        p6 p6Var = this.f29526c;
        p6Var.N = f7;
        p6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f29526c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29525b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29526c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f29526c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f29526c.x(typeface);
    }

    public q6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f29528n = true;
        this.f29529r = true;
        p6 p6Var = new p6(z10, z11, z12, z13, z14);
        this.f29526c = p6Var;
        p6Var.setCallback(this);
        p6Var.I = new pg(this, 8);
    }
}
