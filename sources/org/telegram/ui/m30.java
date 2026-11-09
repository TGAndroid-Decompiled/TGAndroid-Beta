package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class m30 extends org.telegram.ui.Components.qj0 {
    public final LongSparseIntArray f47733e3;
    public final e40 f47734f3;

    public m30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f47734f3 = e40Var;
        this.f47733e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f47734f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        s30 s30Var = this.f47734f3.O1;
        HashSet hashSet = s30Var.I;
        e40 e40Var = s30Var.L;
        HashSet hashSet2 = s30Var.H;
        if (s30Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(s30Var.f57114q);
            hashSet.clear();
            hashSet.addAll(s30Var.f57113p);
            s30Var.J = 0.0f;
            s30Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            m30 m30Var = e40Var.H1;
            int childCount = m30Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = m30Var.getChildAt(i14);
                v4.d1 G = m30Var.G(childAt);
                if (G != null && (i13 = G.f57060f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                    s30Var.J = Math.max(s30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    s30Var.K = Math.min(s30Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            s30Var.F = 0.0f;
            m30Var.invalidate();
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
                    e40.J0(this.f47734f3, rVar, z9);
                }
            }
        }
        super.setVisibility(i7);
    }
}
