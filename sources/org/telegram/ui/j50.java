package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class j50 extends org.telegram.ui.Components.xl0 {
    public final LongSparseIntArray X2;
    public final d60 Y2;

    public j50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = d60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j50.dispatchDraw(android.graphics.Canvas):void");
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
        r50 r50Var = this.Y2.X;
        HashSet hashSet = r50Var.I;
        d60 d60Var = r50Var.L;
        HashSet hashSet2 = r50Var.H;
        if (r50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(r50Var.f43018q);
            hashSet.clear();
            hashSet.addAll(r50Var.f43017p);
            r50Var.J = 0.0f;
            r50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            j50 j50Var = d60Var.Q;
            int childCount = j50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = j50Var.getChildAt(i15);
                s4.c1 G = j50Var.G(childAt);
                if (G != null && (i14 = G.f42962f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    r50Var.J = Math.max(r50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    r50Var.K = Math.min(r50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            r50Var.F = 0.0f;
            j50Var.invalidate();
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
                    d60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
