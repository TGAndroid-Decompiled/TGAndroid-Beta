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
    public boolean f29595a;
    public Drawable f29596b;
    public final p6 f29597c;
    public int d;
    public int f29598e;
    public CharSequence f29599f;
    public boolean h;
    public boolean f29600n;
    public boolean f29601r;

    public q6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f29600n = true;
        this.f29601r = true;
        p6 p6Var = new p6(z10, z11, z12, false);
        this.f29597c = p6Var;
        p6Var.setCallback(this);
        p6Var.C = new pg(this, 8);
    }

    public final void a() {
        this.f29597c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f29597c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29601r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29601r = false;
        p6 p6Var = this.f29597c;
        if (z12 && !TextUtils.equals(charSequence, p6Var.f29289g)) {
            if (p6Var.D) {
                ValueAnimator valueAnimator = p6Var.f29296o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p6Var.f29296o = null;
                }
            } else if (p6Var.f()) {
                this.f29599f = charSequence;
                this.h = z11;
                return;
            }
        }
        p6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        p6Var.q(charSequence, z12, z11);
        float e7 = (int) p6Var.e();
        if (e7 >= p6Var.e() && (z12 || e7 == p6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29597c.d()));
    }

    public p6 getDrawable() {
        return this.f29597c;
    }

    public TextPaint getPaint() {
        return this.f29597c.f29284a;
    }

    public float getRightPadding() {
        return this.f29597c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f29596b;
    }

    public CharSequence getText() {
        return this.f29597c.f29289g;
    }

    public int getTextColor() {
        return this.f29597c.f29284a.getColor();
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
        Drawable drawable = this.f29596b;
        p6 p6Var = this.f29597c;
        if (drawable != null && (!this.f29595a || p6Var.g() > 0.0f)) {
            int d = (int) (p6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((p6Var.f29285b & 7) == 5) {
                this.f29596b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f29596b.setBounds(0, 0, d, getHeight());
            }
            this.f29596b.draw(canvas);
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
        int i12 = this.f29598e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        p6 p6Var = this.f29597c;
        if (i13 != size && getLayoutParams().width != 0) {
            p6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            p6Var.q(p6Var.f29289g, false, true);
        }
        this.d = size;
        if (this.f29600n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(p6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29597c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29597c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29597c.f29293l = i10;
    }

    public void setEmojiColor(int i10) {
        p6 p6Var = this.f29597c;
        if (p6Var.T != i10) {
            p6Var.T = i10;
            p6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29597c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29597c.f29285b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29595a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29597c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29597c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.f29598e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29597c.V = runnable;
    }

    public void setRightPadding(float f7) {
        p6 p6Var = this.f29597c;
        p6Var.H = f7;
        p6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f29597c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29596b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29597c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f29597c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f29597c.u(typeface);
    }
}
