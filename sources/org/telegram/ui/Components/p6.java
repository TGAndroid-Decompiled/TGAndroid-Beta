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
    public boolean f29515a;
    public Drawable f29516b;
    public final o6 f29517c;
    public int d;
    public int f29518e;
    public CharSequence f29519f;
    public boolean h;
    public boolean f29520n;
    public boolean f29521r;

    public p6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f29520n = true;
        this.f29521r = true;
        o6 o6Var = new o6(z10, z11, z12, false);
        this.f29517c = o6Var;
        o6Var.setCallback(this);
        o6Var.C = new qg(this, 8);
    }

    public final void a() {
        this.f29517c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f29517c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29521r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29521r = false;
        o6 o6Var = this.f29517c;
        if (z12 && !TextUtils.equals(charSequence, o6Var.f29244g)) {
            if (o6Var.D) {
                ValueAnimator valueAnimator = o6Var.f29251o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    o6Var.f29251o = null;
                }
            } else if (o6Var.f()) {
                this.f29519f = charSequence;
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
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29517c.d()));
    }

    public o6 getDrawable() {
        return this.f29517c;
    }

    public TextPaint getPaint() {
        return this.f29517c.f29239a;
    }

    public float getRightPadding() {
        return this.f29517c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f29516b;
    }

    public CharSequence getText() {
        return this.f29517c.f29244g;
    }

    public int getTextColor() {
        return this.f29517c.f29239a.getColor();
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
        Drawable drawable = this.f29516b;
        o6 o6Var = this.f29517c;
        if (drawable != null && (!this.f29515a || o6Var.g() > 0.0f)) {
            int d = (int) (o6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((o6Var.f29240b & 7) == 5) {
                this.f29516b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f29516b.setBounds(0, 0, d, getHeight());
            }
            this.f29516b.draw(canvas);
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
        int i12 = this.f29518e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        o6 o6Var = this.f29517c;
        if (i13 != size && getLayoutParams().width != 0) {
            o6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            o6Var.q(o6Var.f29244g, false, true);
        }
        this.d = size;
        if (this.f29520n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(o6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29517c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29517c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29517c.f29248l = i10;
    }

    public void setEmojiColor(int i10) {
        o6 o6Var = this.f29517c;
        if (o6Var.T != i10) {
            o6Var.T = i10;
            o6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29517c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29517c.f29240b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29515a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29517c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29517c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.f29518e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29517c.V = runnable;
    }

    public void setRightPadding(float f7) {
        o6 o6Var = this.f29517c;
        o6Var.H = f7;
        o6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.f29517c.v = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29516b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29517c.r(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f29517c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.f29517c.u(typeface);
    }
}
