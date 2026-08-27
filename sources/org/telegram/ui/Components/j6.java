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

public class j6 extends View {

    public boolean f29630a;

    public Drawable f29631b;

    public final i6 f29632c;
    public int d;

    public int f29633e;

    public CharSequence f29634f;
    public boolean h;

    public boolean f29635n;

    public boolean f29636r;

    public j6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f29635n = true;
        this.f29636r = true;
        i6 i6Var = new i6(z10, z11, z12, false);
        this.f29632c = i6Var;
        i6Var.setCallback(this);
        i6Var.C = new bg(this, 8);
    }

    public final void a() {
        this.f29632c.b();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f29632c.k(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.f29636r && z10;
        this.f29636r = false;
        i6 i6Var = this.f29632c;
        if (z12 && !TextUtils.equals(charSequence, i6Var.f29243g)) {
            if (i6Var.D) {
                ValueAnimator valueAnimator = i6Var.f29250o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i6Var.f29250o = null;
                }
            } else if (i6Var.f()) {
                this.f29634f = charSequence;
                this.h = z11;
                return;
            }
        }
        int iE = (int) i6Var.e();
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.q(charSequence, z12, z11);
        float f10 = iE;
        if (f10 < i6Var.e() || !(z12 || f10 == i6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29632c.d()));
    }

    public i6 getDrawable() {
        return this.f29632c;
    }

    public TextPaint getPaint() {
        return this.f29632c.f29238a;
    }

    public float getRightPadding() {
        return this.f29632c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f29631b;
    }

    public CharSequence getText() {
        return this.f29632c.f29243g;
    }

    public int getTextColor() {
        return this.f29632c.f29238a.getColor();
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
        Drawable drawable = this.f29631b;
        i6 i6Var = this.f29632c;
        if (drawable != null && (!this.f29630a || i6Var.g() > 0.0f)) {
            int iD = (int) (i6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((i6Var.f29239b & 7) == 5) {
                this.f29631b.setBounds(getWidth() - iD, 0, getWidth(), getHeight());
            } else {
                this.f29631b.setBounds(0, 0, iD, getHeight());
            }
            this.f29631b.draw(canvas);
        }
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.draw(canvas);
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
        int i12 = this.f29633e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        i6 i6Var = this.f29632c;
        if (i13 != size && getLayoutParams().width != 0) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            i6Var.q(i6Var.f29243g, false, true);
        }
        this.d = size;
        if (this.f29635n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(i6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29632c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29632c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.f29632c.f29247l = i10;
    }

    public void setEmojiColor(int i10) {
        i6 i6Var = this.f29632c;
        if (i6Var.T != i10) {
            i6Var.T = i10;
            i6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29632c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.f29632c.f29239b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29630a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29632c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29632c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.f29633e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29632c.V = runnable;
    }

    public void setRightPadding(float f10) {
        i6 i6Var = this.f29632c;
        i6Var.H = f10;
        i6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f29632c.v = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29631b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.f29632c.r(i10);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f29632c.t(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f29632c.u(typeface);
    }
}
