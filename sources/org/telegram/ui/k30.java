package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k30 extends org.telegram.ui.Components.pj0 {
    public final LongSparseIntArray f47097e3;
    public final c40 f47098f3;

    public k30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f47098f3 = c40Var;
        this.f47097e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f47098f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        q30 q30Var = this.f47098f3.O1;
        HashSet hashSet = q30Var.I;
        c40 c40Var = q30Var.L;
        HashSet hashSet2 = q30Var.H;
        if (q30Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(q30Var.f57009q);
            hashSet.clear();
            hashSet.addAll(q30Var.f57008p);
            q30Var.J = 0.0f;
            q30Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            k30 k30Var = c40Var.H1;
            int childCount = k30Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = k30Var.getChildAt(i14);
                v4.d1 G = k30Var.G(childAt);
                if (G != null && (i13 = G.f56955f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                    q30Var.J = Math.max(q30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    q30Var.K = Math.min(q30Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            q30Var.F = 0.0f;
            k30Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        if (getVisibility() != i7) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (childAt.isAttachedToWindow() && i7 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c40.J0(this.f47098f3, rVar, z9);
                }
            }
        }
        super.setVisibility(i7);
    }
}
