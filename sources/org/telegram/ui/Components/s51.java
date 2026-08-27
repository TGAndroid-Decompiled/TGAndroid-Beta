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

public class s51 extends FrameLayout {

    public ValueAnimator f32338a;

    public float f32339b;

    public boolean f32340c;
    public Boolean d;

    public final u51 f32341e;

    public s51(u51 u51Var, Context context) {
        super(context);
        this.f32341e = u51Var;
        this.f32340c = false;
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
        float fMin;
        canvas.save();
        u51 u51Var = this.f32341e;
        Drawable drawable = u51Var.h;
        RectF rectF = u51Var.f32985x;
        int iDp = AndroidUtilities.dp(6.0f) + (u51Var.f32986y - ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop);
        int iDp2 = (u51Var.f32986y - ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
        int iDp3 = ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        int i10 = AndroidUtilities.statusBarHeight;
        int i11 = iDp2 + i10;
        int i12 = iDp + i10;
        int i13 = iDp3 - i10;
        float translationY = getTranslationY() + ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + i11;
        int i14 = AndroidUtilities.statusBarHeight;
        int i15 = i14 * 2;
        if (translationY < i15) {
            int iMin = (int) Math.min(i14, ((i15 - i11) - ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop) - getTranslationY());
            i11 -= iMin;
            i13 += iMin;
            fMin = 1.0f - Math.min(1.0f, (iMin * 2) / AndroidUtilities.statusBarHeight);
        } else {
            fMin = 1.0f;
        }
        float translationY2 = getTranslationY() + ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + i11;
        int i16 = AndroidUtilities.statusBarHeight;
        float f10 = i16;
        int iMin2 = translationY2 < f10 ? (int) Math.min(f10, ((i16 - i11) - ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop) - getTranslationY()) : 0;
        drawable.setBounds(0, i11, getMeasuredWidth(), i13);
        drawable.draw(canvas);
        if (!u51Var.O) {
            if (fMin != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(u51Var.B);
                rectF.set(((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + i11, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + i11);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            int iDp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - iDp4) / 2, i12, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i12);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, u51Var.E, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (iMin2 > 0) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(u51Var.B);
        }
        boolean z10 = iMin2 > AndroidUtilities.statusBarHeight / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(u51Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(u51Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(u51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            u51 u51Var = this.f32341e;
            if (y10 < u51Var.f32986y) {
                u51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32341e.L();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int size = View.MeasureSpec.getSize(i11);
        int i12 = 1;
        this.f32340c = true;
        u51 u51Var = this.f32341e;
        hh.f1 f1Var = u51Var.d;
        setPadding(((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingLeft, 0);
        this.f32340c = false;
        int paddingTop = size - getPaddingTop();
        if (((org.telegram.ui.ActionBar.e3) u51Var).keyboardVisible) {
            iDp = AndroidUtilities.dp(8.0f);
            u51Var.setAllowNestedScroll(false);
            int i13 = u51Var.f32986y;
            if (i13 != 0) {
                float f10 = i13;
                this.f32339b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f32338a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f32338a.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f32339b, 0.0f);
                this.f32338a = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new l51(i12, this));
                this.f32338a.setDuration(250L);
                this.f32338a.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                this.f32338a.addListener(new f11(this, 6));
                this.f32338a.start();
            } else if (this.f32338a != null) {
                setTranslationY(this.f32339b);
            }
        } else {
            iDp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            u51Var.setAllowNestedScroll(true);
        }
        if (f1Var.getPaddingTop() != iDp) {
            this.f32340c = true;
            f1Var.setPadding(0, iDp, 0, 0);
            this.f32340c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f32341e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f32340c) {
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
