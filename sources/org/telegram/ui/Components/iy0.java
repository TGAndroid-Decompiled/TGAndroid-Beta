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
public final class iy0 extends FrameLayout {
    public int f27512a;
    public final RectF f27513b;
    public boolean f27514c;
    public Boolean d;
    public final qy0 f27515e;

    public iy0(qy0 qy0Var, Context context) {
        super(context);
        this.f27515e = qy0Var;
        this.f27513b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            qy0 qy0Var = this.f27515e;
            if (qy0Var.f30193e0 != 0 && motionEvent.getY() < qy0Var.f30193e0) {
                qy0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f27512a;
        int i15 = i12 - i10;
        qy0 qy0Var = this.f27515e;
        if (i14 != i15) {
            this.f27512a = i15;
            my0 my0Var = qy0Var.d;
            if (my0Var != null && qy0Var.W != null) {
                my0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        qy0.M(qy0Var);
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
        qy0 qy0Var = this.f27515e;
        ArrayList arrayList = qy0Var.X;
        boolean z10 = true;
        qy0Var.f30196g0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        qy0Var.f30196g0 = false;
        if (qy0Var.s0()) {
            int measuredWidth = qy0Var.f30189c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            my0 my0Var = qy0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            my0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / qy0Var.d.d;
            qy0Var.O = size2;
            qy0Var.P = size2;
        } else {
            qy0Var.d.d = 5;
            qy0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / qy0Var.d.d;
            qy0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = qy0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qy0Var.f30189c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * qy0Var.P;
            i21 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (qy0Var.W != null) {
                int size3 = (qy0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingTop;
                i17 = i19 + (qy0Var.d.f28753n * qy0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (qy0Var.s0()) {
                    i23 = 2;
                }
                if (qy0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * qy0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (qy0Var.s0()) {
            i18 = (int) ((qy0Var.P * 0.15f) + i18);
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
            i20 = ((org.telegram.ui.ActionBar.f3) qy0Var).backgroundPaddingTop;
        }
        if (qy0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (qy0Var.f30189c.getPaddingTop() != i20) {
            qy0Var.f30196g0 = true;
            qy0Var.f30189c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            qy0Var.K.setPadding(0, i20, 0, 0);
            qy0Var.f30196g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f27514c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i18, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27515e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27515e.f30196g0) {
            return;
        }
        super.requestLayout();
    }
}
