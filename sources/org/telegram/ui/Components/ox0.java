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
    public int f26877a;
    public final RectF f26878b;
    public boolean f26879c;
    public Boolean d;
    public final wx0 e;

    public ox0(wx0 wx0Var, Context context) {
        super(context);
        this.e = wx0Var;
        this.f26878b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wx0 wx0Var = this.e;
            if (wx0Var.f29775e0 != 0 && motionEvent.getY() < wx0Var.f29775e0) {
                wx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f26877a;
        int i15 = i12 - i10;
        wx0 wx0Var = this.e;
        if (i14 != i15) {
            this.f26877a = i15;
            sx0 sx0Var = wx0Var.d;
            if (sx0Var != null && wx0Var.W != null) {
                sx0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wx0.O(wx0Var);
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
        wx0 wx0Var = this.e;
        ArrayList arrayList = wx0Var.X;
        boolean z10 = true;
        wx0Var.f29778g0 = true;
        i12 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        wx0Var.f29778g0 = false;
        if (wx0Var.s0()) {
            int measuredWidth = wx0Var.f29772c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            sx0 sx0Var = wx0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            sx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / wx0Var.d.d;
            wx0Var.O = size2;
            wx0Var.P = size2;
        } else {
            wx0Var.d.d = 5;
            wx0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / wx0Var.d.d;
            wx0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = wx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wx0Var.f29772c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * wx0Var.P;
            i21 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (wx0Var.W != null) {
                int size3 = (wx0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingTop;
                i17 = i19 + (wx0Var.d.f27955n * wx0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (wx0Var.s0()) {
                    i23 = 2;
                }
                if (wx0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * wx0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (wx0Var.s0()) {
            i18 = (int) ((wx0Var.P * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.g3) wx0Var).backgroundPaddingTop;
        }
        if (wx0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (wx0Var.f29772c.getPaddingTop() != i20) {
            wx0Var.f29778g0 = true;
            wx0Var.f29772c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            wx0Var.K.setPadding(0, i20, 0, 0);
            wx0Var.f29778g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f26879c = z10;
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
        if (this.e.f29778g0) {
            return;
        }
        super.requestLayout();
    }
}
