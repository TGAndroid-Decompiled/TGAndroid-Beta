package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class m50 extends org.telegram.ui.Components.yl0 {
    public final LongSparseIntArray X2;
    public final g60 Y2;

    public m50(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = g60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m50.dispatchDraw(android.graphics.Canvas):void");
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
        u50 u50Var = this.Y2.X;
        HashSet hashSet = u50Var.I;
        g60 g60Var = u50Var.L;
        HashSet hashSet2 = u50Var.H;
        if (u50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(u50Var.f43064q);
            hashSet.clear();
            hashSet.addAll(u50Var.f43063p);
            u50Var.J = 0.0f;
            u50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            m50 m50Var = g60Var.Q;
            int childCount = m50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = m50Var.getChildAt(i15);
                s4.c1 H = m50Var.H(childAt);
                if (H != null && (i14 = H.f43008f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(H)) {
                    u50Var.J = Math.max(u50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    u50Var.K = Math.min(u50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            u50Var.F = 0.0f;
            m50Var.invalidate();
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
                    g60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
