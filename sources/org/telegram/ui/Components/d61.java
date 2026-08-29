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
public class d61 extends FrameLayout {
    public ValueAnimator f27678a;
    public float f27679b;
    public boolean f27680c;
    public Boolean d;
    public final f61 f27681e;

    public d61(f61 f61Var, Context context) {
        super(context);
        this.f27681e = f61Var;
        this.f27680c = false;
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
        float f9;
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
        f61 f61Var = this.f27681e;
        Drawable drawable = f61Var.h;
        RectF rectF = f61Var.f28336x;
        int i24 = f61Var.f28337y;
        i10 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = f61Var.f28337y;
        i11 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f9 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f9 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f10 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f10) {
            i22 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
            i17 = (int) Math.min(f10, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!f61Var.O) {
            if (f9 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(f61Var.B);
                i18 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, org.telegram.ui.ActionBar.g6.f23340t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.g6.f23340t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, f61Var.E, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.g6.f23340t0.setColor(f61Var.B);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(f61Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(f61Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(f61Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            f61 f61Var = this.f27681e;
            if (y8 < f61Var.f28337y) {
                f61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f27681e.K();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        this.f27680c = true;
        f61 f61Var = this.f27681e;
        jh.e1 e1Var = f61Var.d;
        i12 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f27680c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.f3) f61Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            f61Var.setAllowNestedScroll(false);
            int i15 = f61Var.f28337y;
            if (i15 != 0) {
                float f9 = i15;
                this.f27679b = f9;
                setTranslationY(f9);
                ValueAnimator valueAnimator = this.f27678a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f27678a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27679b, 0.0f);
                this.f27678a = ofFloat;
                ofFloat.addUpdateListener(new v51(1, this));
                this.f27678a.setDuration(250L);
                this.f27678a.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                this.f27678a.addListener(new p11(this, 6));
                this.f27678a.start();
            } else if (this.f27678a != null) {
                setTranslationY(this.f27679b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            f61Var.setAllowNestedScroll(true);
        }
        if (e1Var.getPaddingTop() != dp) {
            this.f27680c = true;
            e1Var.setPadding(0, dp, 0, 0);
            this.f27680c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27681e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27680c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        invalidate();
    }
}
