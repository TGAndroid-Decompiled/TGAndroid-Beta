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
public final class zx0 extends FrameLayout {
    public int f29823a;
    public final RectF f29824b;
    public boolean f29825c;
    public Boolean d;
    public final hy0 e;

    public zx0(hy0 hy0Var, Context context) {
        super(context);
        this.e = hy0Var;
        this.f29824b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            hy0 hy0Var = this.e;
            if (hy0Var.f23809e0 != 0 && motionEvent.getY() < hy0Var.f23809e0) {
                hy0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f29823a;
        int i15 = i12 - i10;
        hy0 hy0Var = this.e;
        if (i14 != i15) {
            this.f29823a = i15;
            dy0 dy0Var = hy0Var.d;
            if (dy0Var != null && hy0Var.W != null) {
                dy0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        hy0.O(hy0Var);
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
        hy0 hy0Var = this.e;
        ArrayList arrayList = hy0Var.X;
        boolean z10 = true;
        hy0Var.f23812g0 = true;
        i12 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        hy0Var.f23812g0 = false;
        if (hy0Var.s0()) {
            int measuredWidth = hy0Var.f23806c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            dy0 dy0Var = hy0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            dy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / hy0Var.d.d;
            hy0Var.O = size2;
            hy0Var.P = size2;
        } else {
            hy0Var.d.d = 5;
            hy0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / hy0Var.d.d;
            hy0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = hy0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hy0Var.f23806c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * hy0Var.P;
            i21 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (hy0Var.W != null) {
                int size3 = (hy0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingTop;
                i17 = i19 + (hy0Var.d.f22507n * hy0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (hy0Var.s0()) {
                    i23 = 2;
                }
                if (hy0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * hy0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (hy0Var.s0()) {
            i18 = (int) ((hy0Var.P * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.h3) hy0Var).backgroundPaddingTop;
        }
        if (hy0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (hy0Var.f23806c.getPaddingTop() != i20) {
            hy0Var.f23812g0 = true;
            hy0Var.f23806c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            hy0Var.K.setPadding(0, i20, 0, 0);
            hy0Var.f23812g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f29825c = z10;
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
        if (this.e.f23812g0) {
            return;
        }
        super.requestLayout();
    }
}
