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
public final class yx0 extends FrameLayout {
    public int f30635a;
    public final RectF f30636b;
    public boolean f30637c;
    public Boolean d;
    public final gy0 e;

    public yx0(gy0 gy0Var, Context context) {
        super(context);
        this.e = gy0Var;
        this.f30636b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gy0 gy0Var = this.e;
            if (gy0Var.f24482e0 != 0 && motionEvent.getY() < gy0Var.f24482e0) {
                gy0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f30635a;
        int i15 = i12 - i10;
        gy0 gy0Var = this.e;
        if (i14 != i15) {
            this.f30635a = i15;
            cy0 cy0Var = gy0Var.d;
            if (cy0Var != null && gy0Var.W != null) {
                cy0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        gy0.O(gy0Var);
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
        gy0 gy0Var = this.e;
        ArrayList arrayList = gy0Var.X;
        boolean z10 = true;
        gy0Var.f24485g0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        gy0Var.f24485g0 = false;
        if (gy0Var.s0()) {
            int measuredWidth = gy0Var.f24479c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            cy0 cy0Var = gy0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            cy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / gy0Var.d.d;
            gy0Var.O = size2;
            gy0Var.P = size2;
        } else {
            gy0Var.d.d = 5;
            gy0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / gy0Var.d.d;
            gy0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = gy0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gy0Var.f24479c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * gy0Var.P;
            i21 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (gy0Var.W != null) {
                int size3 = (gy0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i17 = i19 + (gy0Var.d.f23435n * gy0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (gy0Var.s0()) {
                    i23 = 2;
                }
                if (gy0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * gy0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (gy0Var.s0()) {
            i18 = (int) ((gy0Var.P * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
        }
        if (gy0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (gy0Var.f24479c.getPaddingTop() != i20) {
            gy0Var.f24485g0 = true;
            gy0Var.f24479c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            gy0Var.K.setPadding(0, i20, 0, 0);
            gy0Var.f24485g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f30637c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i18, size), 1073741824));
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
        if (this.e.f24485g0) {
            return;
        }
        super.requestLayout();
    }
}
