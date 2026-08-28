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
    public boolean f29645a;
    public Drawable f29646b;
    public final i6 f29647c;
    public int d;
    public int f29648e;
    public CharSequence f29649f;
    public boolean h;
    public boolean f29650n;
    public boolean f29651r;

    public j6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f29650n = true;
        this.f29651r = true;
        i6 i6Var = new i6(z10, z11, z12, false);
        this.f29647c = i6Var;
        i6Var.setCallback(this);
        i6Var.C = new fg(this, 8);
    }

    public final void a() {
        this.f29647c.b();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f29647c.k(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        if (!this.f29651r && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f29651r = false;
        i6 i6Var = this.f29647c;
        if (z12 && !TextUtils.equals(charSequence, i6Var.f29337g)) {
            if (i6Var.D) {
                ValueAnimator valueAnimator = i6Var.f29344o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i6Var.f29344o = null;
                }
            } else if (i6Var.f()) {
                this.f29649f = charSequence;
                this.h = z11;
                return;
            }
        }
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.q(charSequence, z12, z11);
        float e10 = (int) i6Var.e();
        if (e10 >= i6Var.e() && (z12 || e10 == i6Var.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.f29647c.d()));
    }

    public i6 getDrawable() {
        return this.f29647c;
    }

    public TextPaint getPaint() {
        return this.f29647c.f29332a;
    }

    public float getRightPadding() {
        return this.f29647c.H;
    }

    public Drawable getSizeableBackground() {
        return this.f29646b;
    }

    public CharSequence getText() {
        return this.f29647c.f29337g;
    }

    public int getTextColor() {
        return this.f29647c.f29332a.getColor();
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
        Drawable drawable = this.f29646b;
        i6 i6Var = this.f29647c;
        if (drawable != null && (!this.f29645a || i6Var.g() > 0.0f)) {
            int d = (int) (i6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((i6Var.f29333b & 7) == 5) {
                this.f29646b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.f29646b.setBounds(0, 0, d, getHeight());
            }
            this.f29646b.draw(canvas);
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
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.f29648e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        i6 i6Var = this.f29647c;
        if (i12 != size && getLayoutParams().width != 0) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            i6Var.q(i6Var.f29337g, false, true);
        }
        this.d = size;
        if (this.f29650n && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(i6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.f29647c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f29647c.n(z10);
    }

    public void setEmojiCacheType(int i9) {
        this.f29647c.f29341l = i9;
    }

    public void setEmojiColor(int i9) {
        i6 i6Var = this.f29647c;
        if (i6Var.T != i9) {
            i6Var.T = i9;
            i6Var.U = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29647c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i9) {
        this.f29647c.f29333b = i9;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.f29645a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.f29647c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.f29647c.M = z10;
    }

    public void setMaxWidth(int i9) {
        this.f29648e = i9;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.f29647c.V = runnable;
    }

    public void setRightPadding(float f10) {
        i6 i6Var = this.f29647c;
        i6Var.H = f10;
        i6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.f29647c.v = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.f29646b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i9) {
        this.f29647c.r(i9);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f29647c.t(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.f29647c.u(typeface);
    }
}
