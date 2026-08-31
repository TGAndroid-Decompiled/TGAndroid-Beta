package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k50 extends org.telegram.ui.Components.tl0 {
    public final LongSparseIntArray U2;
    public final d60 V2;

    public k50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = d60Var;
        this.U2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.V2.U2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        r50 r50Var = this.V2.U;
        HashSet hashSet = r50Var.I;
        d60 d60Var = r50Var.L;
        HashSet hashSet2 = r50Var.H;
        if (r50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(r50Var.f5854q);
            hashSet.clear();
            hashSet.addAll(r50Var.f5853p);
            r50Var.J = 0.0f;
            r50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            k50 k50Var = d60Var.N;
            int childCount = k50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = k50Var.getChildAt(i15);
                f2.m1 G = k50Var.G(childAt);
                if (G != null && (i14 = G.f5879f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    r50Var.J = Math.max(r50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    r50Var.K = Math.min(r50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            r50Var.F = 0.0f;
            k50Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (childAt.isAttachedToWindow() && i10 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    d60.N(this.V2, lVar, z4);
                }
            }
        }
        super.setVisibility(i10);
    }
}
