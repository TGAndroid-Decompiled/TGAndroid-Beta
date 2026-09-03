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
public final class ox0 extends FrameLayout {
    public int f27679a;
    public final RectF f27680b;
    public boolean f27681c;
    public Boolean d;
    public final xx0 e;

    public ox0(xx0 xx0Var, Context context) {
        super(context);
        this.e = xx0Var;
        this.f27680b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xx0 xx0Var = this.e;
            if (xx0Var.f30751b0 != 0 && motionEvent.getY() < xx0Var.f30751b0) {
                xx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.f27679a;
        int i15 = i12 - i10;
        xx0 xx0Var = this.e;
        if (i14 != i15) {
            this.f27679a = i15;
            tx0 tx0Var = xx0Var.d;
            if (tx0Var != null && xx0Var.T != null) {
                tx0Var.l();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
        xx0.O(xx0Var);
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
        float f10;
        int size = View.MeasureSpec.getSize(i11);
        xx0 xx0Var = this.e;
        ArrayList arrayList = xx0Var.U;
        boolean z4 = true;
        xx0Var.f30754d0 = true;
        i12 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        xx0Var.f30754d0 = false;
        if (xx0Var.s0()) {
            int measuredWidth = xx0Var.f30752c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            tx0 tx0Var = xx0Var.d;
            if (AndroidUtilities.isTablet()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            tx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f10));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / xx0Var.d.d;
            xx0Var.L = size2;
            xx0Var.M = size2;
        } else {
            xx0Var.d.d = 5;
            xx0Var.L = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / xx0Var.d.d;
            xx0Var.M = AndroidUtilities.dp(82.0f);
        }
        float f11 = xx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xx0Var.f30752c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * xx0Var.M;
            i21 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (xx0Var.T != null) {
                int size3 = (xx0Var.T.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingTop;
                i17 = i19 + (xx0Var.d.f29045n * xx0Var.M) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (xx0Var.s0()) {
                    i23 = 2;
                }
                if (xx0Var.P != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * xx0Var.M) + dp;
                i15 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (xx0Var.s0()) {
            i18 = (int) ((xx0Var.M * 0.15f) + i18);
        }
        float f12 = size / 5.0f;
        if (i18 < f12 * 3.2d) {
            i20 = 0;
        } else {
            i20 = (int) (f12 * 2.0f);
        }
        if (i20 != 0 && i18 < size) {
            i20 -= size - i18;
        }
        if (i20 == 0) {
            i20 = ((org.telegram.ui.ActionBar.g3) xx0Var).backgroundPaddingTop;
        }
        if (xx0Var.T != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (xx0Var.f30752c.getPaddingTop() != i20) {
            xx0Var.f30754d0 = true;
            xx0Var.f30752c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            xx0Var.H.setPadding(0, i20, 0, 0);
            xx0Var.f30754d0 = false;
        }
        if (i18 < size) {
            z4 = false;
        }
        this.f27681c = z4;
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
        if (this.e.f30754d0) {
            return;
        }
        super.requestLayout();
    }
}
