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
    public boolean f29601a;
    public Drawable f29602b;
    public final o6 f29603c;
    public int d;
    public int f29604e;
    public CharSequence f29605f;
    public boolean h;
    public boolean f29606n;
    public boolean f29607r;

    public p6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f29606n = true;
        this.f29607r = true;
        o6 o6Var = new o6(z10, z11, z12, false);
        this.f29603c = o6Var;
        o6Var.setCallback(this);
        o6Var.C = new qg(this, 8);
    }

    public final void a() {
        this.f29603c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f29603c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29607r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29607r = false;
        o6 o6Var = this.f29603c;
        if (z12 && !TextUtils.equals(charSequence, o6Var.f29358g)) {
            if (o6Var.D) {
                ValueAnimator valueAnimator = o6Var.f29365o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    o6Var.f29365o = null;
                }
            } else if (o6Var.f()) {
                this.f29605f = charSequence;
                this.h = z11;
                return;
            }
        }
        o6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        o6Var.q(charSequence, z12, z11);
        float e7 = (int) o6Var.e();
        if (e7 >= o6Var.e() && (z12 || e7 == o6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29603c.d()));
    }

    public o6 getDrawable() {
        return this.f29603c;
    }

    public TextPaint getPaint() {
        return this.f29603c.f29353a;
    }

    public float getRightPadding() {
        return this.f29603c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f29602b;
    }

    public CharSequence getText() {
        return this.f29603c.f29358g;
    }

    public int getTextColor() {
        return this.f29603c.f29353a.getColor();
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
        Drawable drawable = this.f29602b;
        o6 o6Var = this.f29603c;
        if (drawable != null && (!this.f29601a || o6Var.g() > 0.0f)) {
            int d = (int) (o6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((o6Var.f29354b & 7) == 5) {
                this.f29602b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f29602b.setBounds(0, 0, d, getHeight());
            }
            this.f29602b.draw(canvas);
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
        int i12 = this.f29604e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        o6 o6Var = this.f29603c;
        if (i13 != size && getLayoutParams().width != 0) {
            o6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            o6Var.q(o6Var.f29358g, false, true);
        }
        this.d = size;
        if (this.f29606n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(o6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29603c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29603c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29603c.f29362l = i10;
    }

    public void setEmojiColor(int i10) {
        o6 o6Var = this.f29603c;
        if (o6Var.T != i10) {
            o6Var.T = i10;
            o6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29603c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29603c.f29354b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29601a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29603c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29603c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.f29604e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29603c.V = runnable;
    }

    public void setRightPadding(float f7) {
        o6 o6Var = this.f29603c;
        o6Var.H = f7;
        o6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f29603c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29602b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29603c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f29603c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f29603c.u(typeface);
    }
}
