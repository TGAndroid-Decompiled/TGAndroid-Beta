package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g70 extends FrameLayout {
    public final RectF f26626a;
    public boolean f26627b;
    public Boolean f26628c;
    public final u70 d;

    public g70(u70 u70Var, Context context) {
        super(context);
        this.d = u70Var;
        this.f26626a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f7;
        Drawable drawable;
        Drawable drawable2;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        u70 u70Var = this.d;
        int i23 = u70Var.Z;
        i10 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
        int dp = (i23 - i10) - AndroidUtilities.dp(8.0f);
        int dp2 = AndroidUtilities.dp(36.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
        int i24 = i11 + dp2;
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp + i25;
        int i27 = i24 - i25;
        boolean z12 = false;
        if (this.f26627b) {
            i19 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
            int i28 = i19 + i26;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i22 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
                int min = Math.min(i29, (i30 - i26) - i22);
                i26 -= min;
                i27 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f7 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
            int i31 = i20 + i26;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i21 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
                i12 = Math.min(i32, (i32 - i26) - i21);
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
            f7 = 1.0f;
        }
        drawable = ((org.telegram.ui.ActionBar.f3) u70Var).shadowDrawable;
        drawable.setBounds(0, i26, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i27 + AndroidUtilities.navigationBarHeight);
        drawable2 = ((org.telegram.ui.ActionBar.f3) u70Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f7 != 1.0f) {
            org.telegram.ui.ActionBar.i6.f21090t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
            i15 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingTop;
            int i33 = i18 + i26;
            RectF rectF = this.f26626a;
            rectF.set(i15, i16 + i26, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i33);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.f21090t0);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.i6.f21090t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
            i13 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
            float f10 = i13;
            float f11 = AndroidUtilities.statusBarHeight - i12;
            int measuredWidth2 = getMeasuredWidth();
            i14 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
            canvas.drawRect(f10, f11, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.i6.f21090t0);
        }
        if (i12 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f26628c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(u70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(u70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21079s8), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f26628c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(u70Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u70 u70Var = this.d;
            if (u70Var.Z != 0 && motionEvent.getY() < u70Var.Z) {
                u70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u70.P(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        u70 u70Var = this.d;
        u70Var.f31387a0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) u70Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        u70Var.f31387a0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f26627b = true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.d.f31387a0) {
            return;
        }
        super.requestLayout();
    }
}
