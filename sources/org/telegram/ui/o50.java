package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o50 extends org.telegram.ui.Components.wl0 {
    public final LongSparseIntArray X2;
    public final i60 Y2;

    public o50(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = i60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Y2.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        w50 w50Var = this.Y2.X;
        HashSet hashSet = w50Var.I;
        i60 i60Var = w50Var.L;
        HashSet hashSet2 = w50Var.H;
        if (w50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(w50Var.f42988q);
            hashSet.clear();
            hashSet.addAll(w50Var.f42987p);
            w50Var.J = 0.0f;
            w50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            o50 o50Var = i60Var.Q;
            int childCount = o50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = o50Var.getChildAt(i15);
                s4.c1 H = o50Var.H(childAt);
                if (H != null && (i14 = H.f42932f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(H)) {
                    w50Var.J = Math.max(w50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    w50Var.K = Math.min(w50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            w50Var.F = 0.0f;
            o50Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (childAt.isAttachedToWindow() && i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
