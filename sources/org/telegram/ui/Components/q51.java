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
public class q51 extends FrameLayout {
    public ValueAnimator f31835a;
    public float f31836b;
    public boolean f31837c;
    public Boolean d;
    public final s51 f31838e;

    public q51(s51 s51Var, Context context) {
        super(context);
        this.f31838e = s51Var;
        this.f31837c = false;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        canvas.save();
        s51 s51Var = this.f31838e;
        Drawable drawable = s51Var.h;
        RectF rectF = s51Var.f32377x;
        int i23 = s51Var.f32378y;
        i9 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i23 - i9);
        int i24 = s51Var.f32378y;
        i10 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int dp2 = (i24 - i10) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int i25 = i11 + dp3;
        int i26 = AndroidUtilities.statusBarHeight;
        int i27 = dp2 + i26;
        int i28 = dp + i26;
        int i29 = i25 - i26;
        i12 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i12 + i27;
        int i30 = AndroidUtilities.statusBarHeight;
        if (translationY < i30 * 2) {
            i22 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
            int min = (int) Math.min(i30, ((i13 - i27) - i22) - getTranslationY());
            i27 -= min;
            i29 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f10 = 1.0f;
        }
        i14 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i14 + i27;
        float f11 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f11) {
            i21 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
            i16 = (int) Math.min(f11, ((i15 - i27) - i21) - getTranslationY());
        } else {
            i16 = 0;
        }
        drawable.setBounds(0, i27, getMeasuredWidth(), i29);
        drawable.draw(canvas);
        if (!s51Var.O) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(s51Var.B);
                i17 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
                i18 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i19 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
                i20 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
                rectF.set(i17, i18 + i27, measuredWidth - i19, AndroidUtilities.dp(24.0f) + i20 + i27);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.f23279t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i28, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i28);
            org.telegram.ui.ActionBar.f6.f23279t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, s51Var.E, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
        }
        if (i16 > 0) {
            org.telegram.ui.ActionBar.f6.f23279t0.setColor(s51Var.B);
        }
        if (i16 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(s51Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(s51Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(s51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            s51 s51Var = this.f31838e;
            if (y10 < s51Var.f32378y) {
                s51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f31838e.K();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        this.f31837c = true;
        s51 s51Var = this.f31838e;
        gh.f1 f1Var = s51Var.d;
        i11 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
        int i13 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
        setPadding(i11, i13, i12, 0);
        this.f31837c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.f3) s51Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            s51Var.setAllowNestedScroll(false);
            int i14 = s51Var.f32378y;
            if (i14 != 0) {
                float f10 = i14;
                this.f31836b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f31835a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f31835a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31836b, 0.0f);
                this.f31835a = ofFloat;
                ofFloat.addUpdateListener(new j51(1, this));
                this.f31835a.setDuration(250L);
                this.f31835a.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                this.f31835a.addListener(new y11(this, 4));
                this.f31835a.start();
            } else if (this.f31835a != null) {
                setTranslationY(this.f31836b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            s51Var.setAllowNestedScroll(true);
        }
        if (f1Var.getPaddingTop() != dp) {
            this.f31837c = true;
            f1Var.setPadding(0, dp, 0, 0);
            this.f31837c = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31838e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31837c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
