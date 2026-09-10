package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p50 extends org.telegram.ui.Components.vl0 {
    public final LongSparseIntArray X2;
    public final j60 Y2;

    public p50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = j60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p50.dispatchDraw(android.graphics.Canvas):void");
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
        x50 x50Var = this.Y2.X;
        HashSet hashSet = x50Var.I;
        j60 j60Var = x50Var.L;
        HashSet hashSet2 = x50Var.H;
        if (x50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(x50Var.f41669q);
            hashSet.clear();
            hashSet.addAll(x50Var.f41668p);
            x50Var.J = 0.0f;
            x50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            p50 p50Var = j60Var.Q;
            int childCount = p50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = p50Var.getChildAt(i15);
                s4.c1 G = p50Var.G(childAt);
                if (G != null && (i14 = G.f41613f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    x50Var.J = Math.max(x50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    x50Var.K = Math.min(x50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            x50Var.F = 0.0f;
            p50Var.invalidate();
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
                    j60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
