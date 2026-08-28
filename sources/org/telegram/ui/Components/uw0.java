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
public final class uw0 extends FrameLayout {
    public int f33153a;
    public final RectF f33154b;
    public boolean f33155c;
    public Boolean d;
    public final cx0 f33156e;

    public uw0(cx0 cx0Var, Context context) {
        super(context);
        this.f33156e = cx0Var;
        this.f33154b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cx0 cx0Var = this.f33156e;
            if (cx0Var.f27570a0 != 0 && motionEvent.getY() < cx0Var.f27570a0) {
                cx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = this.f33153a;
        int i14 = i11 - i9;
        cx0 cx0Var = this.f33156e;
        if (i13 != i14) {
            this.f33153a = i14;
            yw0 yw0Var = cx0Var.d;
            if (yw0Var != null && cx0Var.S != null) {
                yw0Var.l();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
        cx0.N(cx0Var);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        cx0 cx0Var = this.f33156e;
        ArrayList arrayList = cx0Var.T;
        boolean z10 = true;
        cx0Var.f27574c0 = true;
        i11 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
        int i21 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
        setPadding(i11, i21, i12, 0);
        cx0Var.f27574c0 = false;
        if (cx0Var.r0()) {
            int measuredWidth = cx0Var.f27573c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            yw0 yw0Var = cx0Var.d;
            if (AndroidUtilities.isTablet()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            yw0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f10));
            int size2 = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(36.0f)) / cx0Var.d.d;
            cx0Var.K = size2;
            cx0Var.L = size2;
        } else {
            cx0Var.d.d = 5;
            cx0Var.K = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(36.0f)) / cx0Var.d.d;
            cx0Var.L = AndroidUtilities.dp(82.0f);
        }
        float f11 = cx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cx0Var.f27573c.getLayoutParams();
        int i22 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * cx0Var.L;
            i20 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
            i17 = i20 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (cx0Var.S != null) {
                int size3 = (cx0Var.S.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i18 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i16 = i18 + (cx0Var.d.f35090n * cx0Var.L) + size3;
                i15 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (cx0Var.r0()) {
                    i22 = 2;
                }
                if (cx0Var.O != null) {
                    i13 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i13 = 0;
                }
                int max2 = (Math.max(i22, i13) * cx0Var.L) + dp;
                i14 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i15 = i14 + max2;
                i16 = AndroidUtilities.statusBarHeight;
            }
            i17 = i16 + i15;
        }
        if (cx0Var.r0()) {
            i17 = (int) ((cx0Var.L * 0.15f) + i17);
        }
        float f12 = size / 5.0f;
        if (i17 < f12 * 3.2d) {
            i19 = 0;
        } else {
            i19 = (int) (f12 * 2.0f);
        }
        if (i19 != 0 && i17 < size) {
            i19 -= size - i17;
        }
        if (i19 == 0) {
            i19 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
        }
        if (cx0Var.S != null) {
            i19 += AndroidUtilities.dp(8.0f);
        }
        if (cx0Var.f27573c.getPaddingTop() != i19) {
            cx0Var.f27574c0 = true;
            cx0Var.f27573c.setPadding(AndroidUtilities.dp(10.0f), i19, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            cx0Var.G.setPadding(0, i19, 0, 0);
            cx0Var.f27574c0 = false;
        }
        if (i17 < size) {
            z10 = false;
        }
        this.f33155c = z10;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(i17, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33156e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33156e.f27574c0) {
            return;
        }
        super.requestLayout();
    }
}
