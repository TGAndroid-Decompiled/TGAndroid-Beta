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
public class k6 extends View {
    public boolean f26165a;
    public Drawable f26166b;
    public final j6 f26167c;
    public int d;
    public int e;
    public CharSequence f26168f;
    public boolean h;
    public boolean f26169n;
    public boolean f26170r;

    public k6(Context context, boolean z4, boolean z10, boolean z11) {
        super(context);
        this.f26169n = true;
        this.f26170r = true;
        j6 j6Var = new j6(z4, z10, z11, false);
        this.f26167c = j6Var;
        j6Var.setCallback(this);
        j6Var.C = new fg(this, 8);
    }

    public final void a() {
        this.f26167c.b();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f26167c.k(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z4, boolean z10) {
        boolean z11;
        if (!this.f26170r && z4) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26170r = false;
        j6 j6Var = this.f26167c;
        if (z11 && !TextUtils.equals(charSequence, j6Var.f25887g)) {
            if (j6Var.D) {
                ValueAnimator valueAnimator = j6Var.f25894o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j6Var.f25894o = null;
                }
            } else if (j6Var.f()) {
                this.f26168f = charSequence;
                this.h = z10;
                return;
            }
        }
        j6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        j6Var.q(charSequence, z11, z10);
        float e = (int) j6Var.e();
        if (e >= j6Var.e() && (z11 || e == j6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f26167c.d()));
    }

    public j6 getDrawable() {
        return this.f26167c;
    }

    public TextPaint getPaint() {
        return this.f26167c.f25883a;
    }

    public float getRightPadding() {
        return this.f26167c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f26166b;
    }

    public CharSequence getText() {
        return this.f26167c.f25887g;
    }

    public int getTextColor() {
        return this.f26167c.f25883a.getColor();
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
        Drawable drawable = this.f26166b;
        j6 j6Var = this.f26167c;
        if (drawable != null && (!this.f26165a || j6Var.g() > 0.0f)) {
            int d = (int) (j6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((j6Var.f25884b & 7) == 5) {
                this.f26166b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f26166b.setBounds(0, 0, d, getHeight());
            }
            this.f26166b.draw(canvas);
        }
        j6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        j6Var.draw(canvas);
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
        j6 j6Var = this.f26167c;
        if (i13 != size && getLayoutParams().width != 0) {
            j6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            j6Var.q(j6Var.f25887g, false, true);
        }
        this.d = size;
        if (this.f26169n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(j6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z4) {
        this.f26167c.D = z4;
    }

    public void setEllipsizeByGradient(boolean z4) {
        this.f26167c.n(z4);
    }

    public void setEmojiCacheType(int i10) {
        this.f26167c.f25891l = i10;
    }

    public void setEmojiColor(int i10) {
        j6 j6Var = this.f26167c;
        if (j6Var.T != i10) {
            j6Var.T = i10;
            j6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f26167c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f26167c.f25884b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z4) {
        this.f26165a = z4;
    }

    public void setIgnoreRTL(boolean z4) {
        this.f26167c.E = z4;
    }

    public void setIncludeFontPadding(boolean z4) {
        this.f26167c.M = z4;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f26167c.V = runnable;
    }

    public void setRightPadding(float f10) {
        j6 j6Var = this.f26167c;
        j6Var.H = f10;
        j6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f26167c.v = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f26166b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f26167c.r(i10);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f26167c.t(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f26167c.u(typeface);
    }
}
