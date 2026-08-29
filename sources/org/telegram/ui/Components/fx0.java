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
public final class fx0 extends FrameLayout {
    public int f28559a;
    public final RectF f28560b;
    public boolean f28561c;
    public Boolean d;
    public final nx0 f28562e;

    public fx0(nx0 nx0Var, Context context) {
        super(context);
        this.f28562e = nx0Var;
        this.f28560b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            nx0 nx0Var = this.f28562e;
            if (nx0Var.f31168a0 != 0 && motionEvent.getY() < nx0Var.f31168a0) {
                nx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f28559a;
        int i15 = i12 - i10;
        nx0 nx0Var = this.f28562e;
        if (i14 != i15) {
            this.f28559a = i15;
            jx0 jx0Var = nx0Var.d;
            if (jx0Var != null && nx0Var.S != null) {
                jx0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nx0.O(nx0Var);
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
        float f9;
        int size = View.MeasureSpec.getSize(i11);
        nx0 nx0Var = this.f28562e;
        ArrayList arrayList = nx0Var.T;
        boolean z10 = true;
        nx0Var.f31172c0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        nx0Var.f31172c0 = false;
        if (nx0Var.s0()) {
            int measuredWidth = nx0Var.f31171c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            jx0 jx0Var = nx0Var.d;
            if (AndroidUtilities.isTablet()) {
                f9 = 60.0f;
            } else {
                f9 = 45.0f;
            }
            jx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f9));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / nx0Var.d.d;
            nx0Var.K = size2;
            nx0Var.L = size2;
        } else {
            nx0Var.d.d = 5;
            nx0Var.K = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / nx0Var.d.d;
            nx0Var.L = AndroidUtilities.dp(82.0f);
        }
        float f10 = nx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nx0Var.f31171c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * nx0Var.L;
            i21 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (nx0Var.S != null) {
                int size3 = (nx0Var.S.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingTop;
                i17 = i19 + (nx0Var.d.f29843n * nx0Var.L) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (nx0Var.s0()) {
                    i23 = 2;
                }
                if (nx0Var.O != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * nx0Var.L) + dp;
                i15 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (nx0Var.s0()) {
            i18 = (int) ((nx0Var.L * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.f3) nx0Var).backgroundPaddingTop;
        }
        if (nx0Var.S != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (nx0Var.f31171c.getPaddingTop() != i20) {
            nx0Var.f31172c0 = true;
            nx0Var.f31171c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            nx0Var.G.setPadding(0, i20, 0, 0);
            nx0Var.f31172c0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f28561c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i18, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28562e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28562e.f31172c0) {
            return;
        }
        super.requestLayout();
    }
}
