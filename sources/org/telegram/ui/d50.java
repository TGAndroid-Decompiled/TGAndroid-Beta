package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class d50 extends org.telegram.ui.Components.nm0 {
    public final LongSparseIntArray f38517f3;
    public final x50 f38518g3;

    public d50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f38518g3 = x50Var;
        this.f38517f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f38518g3.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        l50 l50Var = this.f38518g3.X;
        HashSet hashSet = l50Var.I;
        x50 x50Var = l50Var.L;
        HashSet hashSet2 = l50Var.H;
        if (l50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(l50Var.f47824q);
            hashSet.clear();
            hashSet.addAll(l50Var.f47823p);
            l50Var.J = 0.0f;
            l50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            d50 d50Var = x50Var.Q;
            int childCount = d50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = d50Var.getChildAt(i15);
                s4.e1 G = d50Var.G(childAt);
                if (G != null && (i14 = G.f47776f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    l50Var.J = Math.max(l50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    l50Var.K = Math.min(l50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            l50Var.F = 0.0f;
            d50Var.invalidate();
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
                    x50.N(this.f38518g3, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
