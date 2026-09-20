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
public class a71 extends FrameLayout {
    public ValueAnimator f22579a;
    public float f22580b;
    public boolean f22581c;
    public Boolean d;
    public final c71 e;

    public a71(c71 c71Var, Context context) {
        super(context);
        this.e = c71Var;
        this.f22581c = false;
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
        c71 c71Var = this.e;
        Drawable drawable = c71Var.h;
        RectF rectF = c71Var.f23191x;
        int i24 = c71Var.f23192y;
        i10 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = c71Var.f23192y;
        i11 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
        int i26 = i12 + dp3;
        int i27 = AndroidUtilities.statusBarHeight;
        int i28 = dp2 + i27;
        int i29 = dp + i27;
        int i30 = i26 - i27;
        i13 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i28;
        int i31 = AndroidUtilities.statusBarHeight;
        if (translationY < i31 * 2) {
            i23 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
            int min = (int) Math.min(i31, ((i14 - i28) - i23) - getTranslationY());
            i28 -= min;
            i30 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f7 = 1.0f;
        }
        i15 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i15 + i28;
        float f10 = AndroidUtilities.statusBarHeight;
        boolean z12 = false;
        if (translationY2 < f10) {
            i22 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
            i17 = (int) Math.min(f10, ((i16 - i28) - i22) - getTranslationY());
        } else {
            i17 = 0;
        }
        drawable.setBounds(0, i28, getMeasuredWidth(), i30);
        drawable.draw(canvas);
        if (!c71Var.S) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f19383t0.setColor(c71Var.F);
                i18 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth - i20, AndroidUtilities.dp(24.0f) + i21 + i28);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f19383t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i29, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i29);
            org.telegram.ui.ActionBar.j6.f19383t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, c71Var.I, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19383t0);
        }
        if (i17 > 0) {
            org.telegram.ui.ActionBar.j6.f19383t0.setColor(c71Var.F);
        }
        if (i17 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(c71Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19165h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(c71Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19372s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(c71Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            c71 c71Var = this.e;
            if (y3 < c71Var.f23192y) {
                c71Var.dismiss();
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
        this.f22581c = true;
        c71 c71Var = this.e;
        ai.w0 w0Var = c71Var.d;
        i12 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) c71Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.f22581c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.f3) c71Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            c71Var.setAllowNestedScroll(false);
            int i15 = c71Var.f23192y;
            if (i15 != 0) {
                float f7 = i15;
                this.f22580b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f22579a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f22579a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22580b, 0.0f);
                this.f22579a = ofFloat;
                ofFloat.addUpdateListener(new t61(1, this));
                this.f22579a.setDuration(250L);
                this.f22579a.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
                this.f22579a.addListener(new dd0(this, 29));
                this.f22579a.start();
            } else if (this.f22579a != null) {
                setTranslationY(this.f22580b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            c71Var.setAllowNestedScroll(true);
        }
        if (w0Var.getPaddingTop() != dp) {
            this.f22581c = true;
            w0Var.setPadding(0, dp, 0, 0);
            this.f22581c = false;
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
        if (this.f22581c) {
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
