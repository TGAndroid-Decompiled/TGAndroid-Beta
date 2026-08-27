package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class r50 extends FrameLayout {

    public final RectF f32085a;

    public boolean f32086b;

    public Boolean f32087c;
    public final f60 d;

    public r50(f60 f60Var, Context context) {
        super(context);
        this.d = f60Var;
        this.f32085a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fMin;
        int iMin;
        boolean z10;
        Boolean bool;
        boolean z11;
        boolean z12;
        f60 f60Var = this.d;
        int iDp = (f60Var.V - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop) - AndroidUtilities.dp(8.0f);
        int iDp2 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + AndroidUtilities.dp(36.0f) + getMeasuredHeight();
        int i10 = AndroidUtilities.statusBarHeight;
        int i11 = iDp + i10;
        int i12 = iDp2 - i10;
        if (this.f32086b) {
            int i13 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
            int i14 = AndroidUtilities.statusBarHeight;
            int i15 = i14 * 2;
            if (i13 < i15) {
                int iMin2 = Math.min(i14, (i15 - i11) - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop);
                i11 -= iMin2;
                i12 += iMin2;
                fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
            } else {
                fMin = 1.0f;
            }
            int i16 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
            int i17 = AndroidUtilities.statusBarHeight;
            iMin = i16 < i17 ? Math.min(i17, (i17 - i11) - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop) : 0;
            ((org.telegram.ui.ActionBar.e3) f60Var).shadowDrawable.setBounds(0, i11, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i12 + AndroidUtilities.navigationBarHeight);
            ((org.telegram.ui.ActionBar.e3) f60Var).shadowDrawable.draw(canvas);
            if (fMin != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                float f10 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft;
                float f11 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
                float measuredWidth = getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft;
                float fDp = AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
                RectF rectF = this.f32085a;
                rectF.set(f10, f11, measuredWidth, fDp);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            if (iMin > 0) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                canvas.drawRect(((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            if (iMin > AndroidUtilities.statusBarHeight / 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = this.f32087c;
            if (bool == null && bool.booleanValue() == z10) {
                return;
            }
            if (AndroidUtilities.computePerceivedBrightness(f60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(f60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
            this.f32087c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(f60Var.getWindow(), z11);
        }
        fMin = 1.0f;
        ((org.telegram.ui.ActionBar.e3) f60Var).shadowDrawable.setBounds(0, i11, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i12 + AndroidUtilities.navigationBarHeight);
        ((org.telegram.ui.ActionBar.e3) f60Var).shadowDrawable.draw(canvas);
        if (fMin != 1.0f) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
            float f12 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft;
            float f13 = ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
            float measuredWidth2 = getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft;
            float fDp2 = AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingTop + i11;
            RectF rectF2 = this.f32085a;
            rectF2.set(f12, f13, measuredWidth2, fDp2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (iMin > 0) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
            canvas.drawRect(((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (iMin > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        bool = this.f32087c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(f60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(f60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f) {
        }
        this.f32087c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(f60Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f60 f60Var = this.d;
            if (f60Var.V != 0 && motionEvent.getY() < f60Var.V) {
                f60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f60.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        f60 f60Var = this.d;
        f60Var.W = true;
        setPadding(((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) f60Var).backgroundPaddingLeft, 0);
        f60Var.W = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f32086b = true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.d.W) {
            return;
        }
        super.requestLayout();
    }
}
