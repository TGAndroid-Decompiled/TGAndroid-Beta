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
public final class nx0 extends FrameLayout {
    public int f26607a;
    public final RectF f26608b;
    public boolean f26609c;
    public Boolean d;
    public final vx0 e;

    public nx0(vx0 vx0Var, Context context) {
        super(context);
        this.e = vx0Var;
        this.f26608b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            vx0 vx0Var = this.e;
            if (vx0Var.f29457e0 != 0 && motionEvent.getY() < vx0Var.f29457e0) {
                vx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f26607a;
        int i15 = i12 - i10;
        vx0 vx0Var = this.e;
        if (i14 != i15) {
            this.f26607a = i15;
            rx0 rx0Var = vx0Var.d;
            if (rx0Var != null && vx0Var.W != null) {
                rx0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vx0.O(vx0Var);
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
        vx0 vx0Var = this.e;
        ArrayList arrayList = vx0Var.X;
        boolean z10 = true;
        vx0Var.f29460g0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        vx0Var.f29460g0 = false;
        if (vx0Var.s0()) {
            int measuredWidth = vx0Var.f29454c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            rx0 rx0Var = vx0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            rx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / vx0Var.d.d;
            vx0Var.O = size2;
            vx0Var.P = size2;
        } else {
            vx0Var.d.d = 5;
            vx0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / vx0Var.d.d;
            vx0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = vx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vx0Var.f29454c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * vx0Var.P;
            i21 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (vx0Var.W != null) {
                int size3 = (vx0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingTop;
                i17 = i19 + (vx0Var.d.f27703n * vx0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (vx0Var.s0()) {
                    i23 = 2;
                }
                if (vx0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * vx0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (vx0Var.s0()) {
            i18 = (int) ((vx0Var.P * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.f3) vx0Var).backgroundPaddingTop;
        }
        if (vx0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (vx0Var.f29454c.getPaddingTop() != i20) {
            vx0Var.f29460g0 = true;
            vx0Var.f29454c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            vx0Var.K.setPadding(0, i20, 0, 0);
            vx0Var.f29460g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f26609c = z10;
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
        if (this.e.f29460g0) {
            return;
        }
        super.requestLayout();
    }
}
