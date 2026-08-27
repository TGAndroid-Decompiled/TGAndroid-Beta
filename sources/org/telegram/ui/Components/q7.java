package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class q7 extends FrameLayout {

    public final RectF f31813a;

    public boolean f31814b;

    public int f31815c;
    public int d;

    public final b8 f31816e;

    public q7(b8 b8Var, Context context) {
        super(context);
        this.f31816e = b8Var;
        this.f31813a = new RectF();
        this.f31814b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this, new gh.w0(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float fMin;
        float f11;
        float f12;
        b8 b8Var = this.f31816e;
        n7 n7Var = b8Var.f27026n;
        ag.d2 d2Var = b8Var.f27013c;
        boolean z10 = b8Var.f27030q0;
        if (b8Var.f27035t0.size() <= 1) {
            ((org.telegram.ui.ActionBar.e3) b8Var).shadowDrawable.setBounds(0, (getMeasuredHeight() - b8Var.A.getMeasuredHeight()) - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
            ((org.telegram.ui.ActionBar.e3) b8Var).shadowDrawable.draw(canvas);
            if (z10) {
                d2Var.setVisibility(8);
                return;
            }
            return;
        }
        if (n7Var.getVisibility() != 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (n7Var.getTranslationY() + ((b8Var.f27039w0 - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop) - iDp));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
        }
        int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
        int iDp3 = ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        if (z10 || ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop + translationY >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = 1.0f;
            fMin = 0.0f;
        } else {
            float fDp = AndroidUtilities.dp(4.0f) + iDp;
            fMin = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop) / fDp);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - fDp) * fMin);
            translationY -= currentActionBarHeight;
            iDp2 -= currentActionBarHeight;
            iDp3 += currentActionBarHeight;
            f10 = 1.0f - fMin;
        }
        int i10 = (int) ((1.0f - fMin) * AndroidUtilities.statusBarHeight);
        int i11 = translationY + i10;
        int i12 = iDp2 + i10;
        ((org.telegram.ui.ActionBar.e3) b8Var).shadowDrawable.setBounds(0, i11, getMeasuredWidth(), iDp3);
        ((org.telegram.ui.ActionBar.e3) b8Var).shadowDrawable.draw(canvas);
        RectF rectF = this.f31813a;
        if (z10 || f10 == 1.0f) {
            f11 = 10.0f;
            f12 = 4.0f;
        } else {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            f11 = 10.0f;
            f12 = 4.0f;
            rectF.set(((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop + i11, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop + i11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (!z10 && f10 != 0.0f) {
            int iDp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - iDp4) / 2, i12, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(f12) + i12);
            int themedColor = b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
            int iAlpha = Color.alpha(themedColor);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(themedColor);
            org.telegram.ui.ActionBar.g6.f23333t0.setAlpha((int) (iAlpha * 1.0f * f10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (z10) {
            d2Var.setVisibility(0);
            d2Var.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, b8Var.M0, AndroidUtilities.dp(6.0f), (i11 - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop) - AndroidUtilities.dp(f11)) - d2Var.getTop()));
            b8Var.d.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, b8Var.M0, AndroidUtilities.dp(6.0f), (i11 - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop) - AndroidUtilities.dp(f11)) - d2Var.getTop()));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b8 b8Var = this.f31816e;
        b8.P(b8Var);
        b8Var.E0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        b8 b8Var = this.f31816e;
        i7 i7Var = b8Var.A;
        i7 i7Var2 = b8Var.f27017e0;
        n7 n7Var = b8Var.f27026n;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size != this.f31815c || size2 != this.d) {
            if (i7Var2.getTag() != null) {
                b8Var.A0(false, false);
            }
            this.d = size2;
            this.f31815c = size;
        }
        this.f31814b = true;
        i7Var.setVisibility((b8Var.f27018f || ((org.telegram.ui.ActionBar.e3) b8Var).keyboardVisible) ? 4 : 0);
        b8Var.f27016e.setVisibility(i7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) n7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) b8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) i7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int iDp2 = AndroidUtilities.dp(179 + ((b8Var.s0() || b8Var.f27037v0) ? 0 : 52));
        if (b8Var.f27035t0.size() > 1) {
            iDp2 += (AndroidUtilities.dp(56.0f) * b8Var.f27035t0.size()) + ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop;
        }
        if (b8Var.h || ((org.telegram.ui.ActionBar.e3) b8Var).keyboardVisible) {
            iDp = AndroidUtilities.dp(8.0f);
        } else {
            if (iDp2 >= paddingTop) {
                iDp2 = (int) ((paddingTop / 5) * 3.5f);
            }
            iDp = AndroidUtilities.dp(8.0f) + (paddingTop - iDp2);
            if (iDp > paddingTop - AndroidUtilities.dp(((b8Var.s0() || b8Var.f27037v0) ? 0 : 52) + 329)) {
                iDp = paddingTop - AndroidUtilities.dp(((b8Var.s0() || b8Var.f27037v0) ? 0 : 52) + 329);
            }
            if (iDp < 0) {
                iDp = 0;
            }
        }
        if (b8Var.f27032r0) {
            iDp = 0;
        }
        if (n7Var.getPaddingTop() != iDp) {
            n7Var.setPadding(0, iDp, 0, (b8Var.h && ((org.telegram.ui.ActionBar.e3) b8Var).keyboardVisible) ? 0 : n7Var.getPaddingBottom());
        }
        this.f31814b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f31816e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f31814b) {
            return;
        }
        super.requestLayout();
    }
}
