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
public class r6 extends View {
    public boolean f30428a;
    public Drawable f30429b;
    public final q6 f30430c;
    public int d;
    public int f30431e;
    public CharSequence f30432f;
    public boolean h;
    public boolean f30433n;
    public boolean f30434r;

    public r6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f30430c.a();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f30430c.n(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f30434r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f30434r = false;
        q6 q6Var = this.f30430c;
        if (z12 && !TextUtils.equals(charSequence, q6Var.f30140i)) {
            if (q6Var.J) {
                ValueAnimator valueAnimator = q6Var.f30151t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    q6Var.f30151t = null;
                }
            } else if (q6Var.h()) {
                this.f30432f = charSequence;
                this.h = z11;
                return;
            }
        }
        q6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        q6Var.t(charSequence, z12, z11);
        float e7 = (int) q6Var.e();
        if (e7 >= q6Var.e() && (z12 || e7 == q6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f30430c.c()));
    }

    public q6 getDrawable() {
        return this.f30430c;
    }

    public TextPaint getPaint() {
        return this.f30430c.f30132a;
    }

    public float getRightPadding() {
        return this.f30430c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f30429b;
    }

    public CharSequence getText() {
        return this.f30430c.f30140i;
    }

    public int getTextColor() {
        return this.f30430c.f30132a.getColor();
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
        Drawable drawable = this.f30429b;
        q6 q6Var = this.f30430c;
        if (drawable != null && (!this.f30428a || q6Var.i() > 0.0f)) {
            int c10 = (int) (q6Var.c() + getPaddingLeft() + getPaddingRight());
            int i11 = q6Var.f30134b & 7;
            if (i11 == 5) {
                i10 = getWidth() - c10;
            } else if (i11 == 1) {
                i10 = (getWidth() - c10) / 2;
            } else {
                i10 = 0;
            }
            this.f30429b.setBounds(i10, 0, c10 + i10, getHeight());
            this.f30429b.draw(canvas);
        }
        q6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        q6Var.draw(canvas);
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
        int i12 = this.f30431e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        q6 q6Var = this.f30430c;
        if (i13 != size && getLayoutParams().width != 0) {
            q6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            q6Var.t(q6Var.f30140i, false, true);
        }
        this.d = size;
        if (this.f30433n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(q6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f30430c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f30430c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f30430c.f30147p = i10;
    }

    public void setEmojiColor(int i10) {
        q6 q6Var = this.f30430c;
        if (q6Var.Z != i10) {
            q6Var.Z = i10;
            q6Var.f30133a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f30430c.f30133a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f30430c.f30134b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f30428a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f30430c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f30430c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.f30431e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f30430c.f30135b0 = runnable;
    }

    public void setRightPadding(float f7) {
        q6 q6Var = this.f30430c;
        q6Var.N = f7;
        q6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f30430c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f30429b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f30430c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f30430c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f30430c.x(typeface);
    }

    public r6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f30433n = true;
        this.f30434r = true;
        q6 q6Var = new q6(z10, z11, z12, z13, z14);
        this.f30430c = q6Var;
        q6Var.setCallback(this);
        q6Var.I = new rg(this, 8);
    }
}
