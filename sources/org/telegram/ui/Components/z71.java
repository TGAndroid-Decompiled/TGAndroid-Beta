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
public class z71 extends FrameLayout {
    public ValueAnimator f35236a;
    public float f35237b;
    public boolean f35238c;
    public Boolean d;
    public final b81 e;

    public z71(b81 b81Var, Context context) {
        super(context);
        this.e = b81Var;
        this.f35238c = false;
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
        b81 b81Var = this.e;
        Drawable drawable = b81Var.h;
        RectF rectF = b81Var.f26783x;
        int i24 = b81Var.f26784y;
        i10 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = b81Var.f26784y;
        i11 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f7 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f10 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f10) {
            i22 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
            i17 = (int) Math.min(f10, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!b81Var.S) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.y6.f23646t0.setColor(b81Var.F);
                i18 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.f23646t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.y6.f23646t0.setColor(org.telegram.ui.ActionBar.y6.x0(null, b81Var.I, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23646t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.y6.f23646t0.setColor(b81Var.F);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(b81Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(b81Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23634s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(b81Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            b81 b81Var = this.e;
            if (y3 < b81Var.f26784y) {
                b81Var.dismiss();
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
        this.f35238c = true;
        b81 b81Var = this.e;
        bi.r1 r1Var = b81Var.d;
        i12 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f35238c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.k3) b81Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            b81Var.setAllowNestedScroll(false);
            int i15 = b81Var.f26784y;
            if (i15 != 0) {
                float f7 = i15;
                this.f35237b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f35236a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f35236a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35237b, 0.0f);
                this.f35236a = ofFloat;
                ofFloat.addUpdateListener(new s71(1, this));
                this.f35236a.setDuration(250L);
                this.f35236a.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
                this.f35236a.addListener(new h31(this, 6));
                this.f35236a.start();
            } else if (this.f35236a != null) {
                setTranslationY(this.f35237b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            b81Var.setAllowNestedScroll(true);
        }
        if (r1Var.getPaddingTop() != dp) {
            this.f35238c = true;
            r1Var.setPadding(0, dp, 0, 0);
            this.f35238c = false;
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
        if (this.f35238c) {
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
