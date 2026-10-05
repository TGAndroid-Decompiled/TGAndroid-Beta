package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jy0 extends FrameLayout {
    public int f27992a;
    public final RectF f27993b;
    public boolean f27994c;
    public Boolean d;
    public final ry0 f27995e;

    public jy0(ry0 ry0Var, Context context) {
        super(context);
        this.f27995e = ry0Var;
        this.f27993b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ry0 ry0Var = this.f27995e;
            if (ry0Var.f30614e0 != 0 && motionEvent.getY() < ry0Var.f30614e0) {
                ry0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f27992a;
        int i15 = i12 - i10;
        ry0 ry0Var = this.f27995e;
        if (i14 != i15) {
            this.f27992a = i15;
            ny0 ny0Var = ry0Var.d;
            if (ny0Var != null && ry0Var.W != null) {
                ny0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ry0.M(ry0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f7;
        int size = View.MeasureSpec.getSize(i11);
        ry0 ry0Var = this.f27995e;
        ArrayList arrayList = ry0Var.X;
        boolean z10 = true;
        ry0Var.f30617g0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        ry0Var.f30617g0 = false;
        if (ry0Var.s0()) {
            int measuredWidth = ry0Var.f30610c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            ny0 ny0Var = ry0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            ny0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / ry0Var.d.d;
            ry0Var.O = size2;
            ry0Var.P = size2;
        } else {
            ry0Var.d.d = 5;
            ry0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / ry0Var.d.d;
            ry0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = ry0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ry0Var.f30610c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * ry0Var.P;
            i21 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (ry0Var.W != null) {
                int size3 = (ry0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingTop;
                i17 = i19 + (ry0Var.d.f29183n * ry0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (ry0Var.s0()) {
                    i23 = 2;
                }
                if (ry0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * ry0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (ry0Var.s0()) {
            i18 = (int) ((ry0Var.P * 0.15f) + i18);
        }
        float f11 = size / 5.0f;
        if (i18 < f11 * 3.2d) {
            i20 = 0;
        } else {
            i20 = (int) (f11 * 2.0f);
        }
        if (i20 != 0 && i18 < size) {
            i20 -= size - i18;
        }
        if (i20 == 0) {
            i20 = ((org.telegram.ui.ActionBar.f3) ry0Var).backgroundPaddingTop;
        }
        if (ry0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (ry0Var.f30610c.getPaddingTop() != i20) {
            ry0Var.f30617g0 = true;
            ry0Var.f30610c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            ry0Var.K.setPadding(0, i20, 0, 0);
            ry0Var.f30617g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f27994c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i18, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27995e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27995e.f30617g0) {
            return;
        }
        super.requestLayout();
    }
}
