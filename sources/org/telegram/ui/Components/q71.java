package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public class q71 extends FrameLayout {
    public ValueAnimator f29783a;
    public float f29784b;
    public boolean f29785c;
    public Boolean d;
    public final s71 e;

    public q71(s71 s71Var, Context context) {
        super(context);
        this.e = s71Var;
        this.f29785c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        canvas.save();
        s71 s71Var = this.e;
        Drawable drawable = s71Var.h;
        RectF rectF = s71Var.f30409x;
        int i24 = s71Var.f30410y;
        i10 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = s71Var.f30410y;
        i11 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f7 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f10 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f10) {
            i22 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
            i17 = (int) Math.min(f10, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!s71Var.S) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21473t0.setColor(s71Var.F);
                i18 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.k6.f21473t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.k6.f21473t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, s71Var.I, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21473t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.k6.f21473t0.setColor(s71Var.F);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(s71Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(s71Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(s71Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            s71 s71Var = this.e;
            if (y3 < s71Var.f30410y) {
                s71Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.L();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        this.f29785c = true;
        s71 s71Var = this.e;
        ai.u1 u1Var = s71Var.d;
        i12 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f29785c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.h3) s71Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            s71Var.setAllowNestedScroll(false);
            int i15 = s71Var.f30410y;
            if (i15 != 0) {
                float f7 = i15;
                this.f29784b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f29783a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f29783a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29784b, 0.0f);
                this.f29783a = ofFloat;
                ofFloat.addUpdateListener(new r51(2, this));
                this.f29783a.setDuration(250L);
                this.f29783a.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                this.f29783a.addListener(new p31(this, 5));
                this.f29783a.start();
            } else if (this.f29783a != null) {
                setTranslationY(this.f29784b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            s71Var.setAllowNestedScroll(true);
        }
        if (u1Var.getPaddingTop() != dp) {
            this.f29785c = true;
            u1Var.setPadding(0, dp, 0, 0);
            this.f29785c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29785c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
