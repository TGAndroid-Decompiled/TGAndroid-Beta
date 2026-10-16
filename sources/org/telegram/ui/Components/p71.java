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
public class p71 extends FrameLayout {
    public ValueAnimator f27919a;
    public float f27920b;
    public boolean f27921c;
    public Boolean d;
    public final r71 e;

    public p71(r71 r71Var, Context context) {
        super(context);
        this.e = r71Var;
        this.f27921c = false;
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
        r71 r71Var = this.e;
        Drawable drawable = r71Var.h;
        RectF rectF = r71Var.f28465x;
        int i24 = r71Var.f28466y;
        i10 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = r71Var.f28466y;
        i11 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f7 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f10 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f10) {
            i22 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
            i17 = (int) Math.min(f10, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!r71Var.S) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f19891t0.setColor(r71Var.F);
                i18 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.f19891t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.g6.f19891t0.setColor(org.telegram.ui.ActionBar.g6.x0(null, r71Var.I, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f19891t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.g6.f19891t0.setColor(r71Var.F);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(r71Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(r71Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19880s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(r71Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            r71 r71Var = this.e;
            if (y3 < r71Var.f28466y) {
                r71Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.M();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        this.f27921c = true;
        r71 r71Var = this.e;
        bi.o0 o0Var = r71Var.d;
        i12 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.e3) r71Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f27921c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.e3) r71Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            r71Var.setAllowNestedScroll(false);
            int i15 = r71Var.f28466y;
            if (i15 != 0) {
                float f7 = i15;
                this.f27920b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f27919a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f27919a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27920b, 0.0f);
                this.f27919a = ofFloat;
                ofFloat.addUpdateListener(new r51(2, this));
                this.f27919a.setDuration(250L);
                this.f27919a.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
                this.f27919a.addListener(new v61(this, 2));
                this.f27919a.start();
            } else if (this.f27919a != null) {
                setTranslationY(this.f27920b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            r71Var.setAllowNestedScroll(true);
        }
        if (o0Var.getPaddingTop() != dp) {
            this.f27921c = true;
            o0Var.setPadding(0, dp, 0, 0);
            this.f27921c = false;
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
        if (this.f27921c) {
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
