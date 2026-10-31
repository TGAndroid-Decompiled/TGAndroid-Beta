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
public class f6 extends View {
    public boolean f25982a;
    public Drawable f25983b;
    public final e6 f25984c;
    public int d;
    public int e;
    public CharSequence f25985f;
    public boolean h;
    public boolean f25986n;
    public boolean f25987r;

    public f6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.f25984c.a();
    }

    public final void b(float f7, long j10, TimeInterpolator timeInterpolator) {
        this.f25984c.n(f7, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f25987r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f25987r = false;
        e6 e6Var = this.f25984c;
        if (z12 && !TextUtils.equals(charSequence, e6Var.f25700i)) {
            if (e6Var.J) {
                ValueAnimator valueAnimator = e6Var.f25711t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e6Var.f25711t = null;
                }
            } else if (e6Var.h()) {
                this.f25985f = charSequence;
                this.h = z11;
                return;
            }
        }
        e6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        e6Var.t(charSequence, z12, z11);
        float e = (int) e6Var.e();
        if (e >= e6Var.e() && (z12 || e == e6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f25984c.c()));
    }

    public e6 getDrawable() {
        return this.f25984c;
    }

    public TextPaint getPaint() {
        return this.f25984c.f25693a;
    }

    public float getRightPadding() {
        return this.f25984c.N;
    }

    public Drawable getSizeableBackground() {
        return this.f25983b;
    }

    public CharSequence getText() {
        return this.f25984c.f25700i;
    }

    public int getTextColor() {
        return this.f25984c.f25693a.getColor();
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
        Drawable drawable = this.f25983b;
        e6 e6Var = this.f25984c;
        if (drawable != null && (!this.f25982a || e6Var.i() > 0.0f)) {
            int c10 = (int) (e6Var.c() + getPaddingLeft() + getPaddingRight());
            int i11 = e6Var.f25695b & 7;
            if (i11 == 5) {
                i10 = getWidth() - c10;
            } else if (i11 == 1) {
                i10 = (getWidth() - c10) / 2;
            } else {
                i10 = 0;
            }
            this.f25983b.setBounds(i10, 0, c10 + i10, getHeight());
            this.f25983b.draw(canvas);
        }
        e6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        e6Var.draw(canvas);
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
        e6 e6Var = this.f25984c;
        if (i13 != size && getLayoutParams().width != 0) {
            e6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            e6Var.t(e6Var.f25700i, false, true);
        }
        this.d = size;
        if (this.f25986n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(e6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f25984c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f25984c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f25984c.f25707p = i10;
    }

    public void setEmojiColor(int i10) {
        e6 e6Var = this.f25984c;
        if (e6Var.Z != i10) {
            e6Var.Z = i10;
            e6Var.f25694a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f25984c.f25694a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f25984c.f25695b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f25982a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f25984c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f25984c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f25984c.f25696b0 = runnable;
    }

    public void setRightPadding(float f7) {
        e6 e6Var = this.f25984c;
        e6Var.N = f7;
        e6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f25984c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f25983b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f25984c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f25984c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f25984c.x(typeface);
    }

    public f6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.f25986n = true;
        this.f25987r = true;
        e6 e6Var = new e6(z10, z11, z12, z13, z14);
        this.f25984c = e6Var;
        e6Var.setCallback(this);
        e6Var.I = new tf(this, 9);
    }
}
