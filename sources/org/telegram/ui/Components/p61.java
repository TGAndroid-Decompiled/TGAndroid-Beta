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
public class p61 extends FrameLayout {
    public ValueAnimator f29994a;
    public float f29995b;
    public boolean f29996c;
    public Boolean d;
    public final r61 f29997e;

    public p61(r61 r61Var, Context context) {
        super(context);
        this.f29997e = r61Var;
        this.f29996c = false;
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
        float f10;
        int i15;
        int i16;
        int i17;
        boolean z4;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        canvas.save();
        r61 r61Var = this.f29997e;
        Drawable drawable = r61Var.h;
        RectF rectF = r61Var.f30672x;
        int i24 = r61Var.f30673y;
        i10 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = r61Var.f30673y;
        i11 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f10 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f11 = AndroidUtilities.statusBarHeight;
        boolean z11 = false;
        if (translationY2 < f11) {
            i22 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
            i17 = (int) Math.min(f11, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!r61Var.P) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21941t0.setColor(r61Var.C);
                i18 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.k6.f21941t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.k6.f21941t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, r61Var.F, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21941t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.k6.f21941t0.setColor(r61Var.C);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            if (AndroidUtilities.computePerceivedBrightness(r61Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(r61Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21932s8), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z4);
            if (!z4) {
                z10 = z11;
            }
            AndroidUtilities.setLightStatusBar(r61Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            r61 r61Var = this.f29997e;
            if (y10 < r61Var.f30673y) {
                r61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f29997e.K();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z4;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        this.f29996c = true;
        r61 r61Var = this.f29997e;
        mh.d1 d1Var = r61Var.d;
        i12 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f29996c = false;
        int paddingTop = size - getPaddingTop();
        z4 = ((org.telegram.ui.ActionBar.h3) r61Var).keyboardVisible;
        if (z4) {
            dp = AndroidUtilities.dp(8.0f);
            r61Var.setAllowNestedScroll(false);
            int i15 = r61Var.f30673y;
            if (i15 != 0) {
                float f10 = i15;
                this.f29995b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f29994a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f29994a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29995b, 0.0f);
                this.f29994a = ofFloat;
                ofFloat.addUpdateListener(new i61(1, this));
                this.f29994a.setDuration(250L);
                this.f29994a.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                this.f29994a.addListener(new pd0(this, 27));
                this.f29994a.start();
            } else if (this.f29994a != null) {
                setTranslationY(this.f29995b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            r61Var.setAllowNestedScroll(true);
        }
        if (d1Var.getPaddingTop() != dp) {
            this.f29996c = true;
            d1Var.setPadding(0, dp, 0, 0);
            this.f29996c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29997e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29996c) {
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
