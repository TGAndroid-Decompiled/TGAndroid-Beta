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
    public boolean f26993a;
    public Drawable f26994b;
    public final n6 f26995c;
    public int d;
    public int e;
    public CharSequence f26996f;
    public boolean h;
    public boolean f26997n;
    public boolean f26998r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f26997n = true;
        this.f26998r = true;
        n6 n6Var = new n6(z10, z11, z12, false);
        this.f26995c = n6Var;
        n6Var.setCallback(this);
        n6Var.C = new og(this, 8);
    }

    public final void a() {
        this.f26995c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f26995c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f26998r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f26998r = false;
        n6 n6Var = this.f26995c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.f26646g)) {
            if (n6Var.D) {
                ValueAnimator valueAnimator = n6Var.f26653o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.f26653o = null;
                }
            } else if (n6Var.f()) {
                this.f26996f = charSequence;
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
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f26995c.d()));
    }

    public n6 getDrawable() {
        return this.f26995c;
    }

    public TextPaint getPaint() {
        return this.f26995c.f26642a;
    }

    public float getRightPadding() {
        return this.f26995c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f26994b;
    }

    public CharSequence getText() {
        return this.f26995c.f26646g;
    }

    public int getTextColor() {
        return this.f26995c.f26642a.getColor();
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
        Drawable drawable = this.f26994b;
        n6 n6Var = this.f26995c;
        if (drawable != null && (!this.f26993a || n6Var.g() > 0.0f)) {
            int d = (int) (n6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((n6Var.f26643b & 7) == 5) {
                this.f26994b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f26994b.setBounds(0, 0, d, getHeight());
            }
            this.f26994b.draw(canvas);
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
        n6 n6Var = this.f26995c;
        if (i13 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.q(n6Var.f26646g, false, true);
        }
        this.d = size;
        if (this.f26997n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f26995c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f26995c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f26995c.f26650l = i10;
    }

    public void setEmojiColor(int i10) {
        n6 n6Var = this.f26995c;
        if (n6Var.T != i10) {
            n6Var.T = i10;
            n6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f26995c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f26995c.f26643b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f26993a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f26995c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f26995c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f26995c.V = runnable;
    }

    public void setRightPadding(float f7) {
        n6 n6Var = this.f26995c;
        n6Var.H = f7;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f26995c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f26994b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f26995c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f26995c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f26995c.u(typeface);
    }
}
