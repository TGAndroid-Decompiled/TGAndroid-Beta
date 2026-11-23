package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class m30 extends org.telegram.ui.Components.ek0 {
    public final LongSparseIntArray f49943f3;
    public final e40 f49944g3;

    public m30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f49944g3 = e40Var;
        this.f49943f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f49944g3.W4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        s30 s30Var = this.f49944g3.S1;
        HashSet hashSet = s30Var.I;
        e40 e40Var = s30Var.L;
        HashSet hashSet2 = s30Var.H;
        if (s30Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(s30Var.f59298q);
            hashSet.clear();
            hashSet.addAll(s30Var.f59297p);
            s30Var.J = 0.0f;
            s30Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            m30 m30Var = e40Var.L1;
            int childCount = m30Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = m30Var.getChildAt(i14);
                v4.f1 G = m30Var.G(childAt);
                if (G != null && (i13 = G.f59249f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
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
        boolean z10;
        if (getVisibility() != i7) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.s) {
                    org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) childAt;
                    if (childAt.isAttachedToWindow() && i7 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e40.K0(this.f49944g3, sVar, z10);
                }
            }
        }
        super.setVisibility(i7);
    }
}
