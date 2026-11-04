package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class f30 extends org.telegram.ui.Components.tj0 {
    public final LongSparseIntArray f45132f3;
    public final x30 f45133g3;

    public f30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f45133g3 = x30Var;
        this.f45132f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f45133g3.P4) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        l30 l30Var = this.f45133g3.P1;
        HashSet hashSet = l30Var.I;
        x30 x30Var = l30Var.L;
        HashSet hashSet2 = l30Var.H;
        if (l30Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(l30Var.f55599q);
            hashSet.clear();
            hashSet.addAll(l30Var.f55598p);
            l30Var.J = 0.0f;
            l30Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            f30 f30Var = x30Var.I1;
            int childCount = f30Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = f30Var.getChildAt(i14);
                u4.d1 G = f30Var.G(childAt);
                if (G != null && (i13 = G.f55544f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                    l30Var.J = Math.max(l30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    l30Var.K = Math.min(l30Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            l30Var.F = 0.0f;
            f30Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        if (getVisibility() != i3) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (childAt.isAttachedToWindow() && i3 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x30.J0(this.f45133g3, kVar, z10);
                }
            }
        }
        super.setVisibility(i3);
    }
}
