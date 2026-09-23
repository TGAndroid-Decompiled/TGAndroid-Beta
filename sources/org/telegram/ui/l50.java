package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class l50 extends org.telegram.ui.Components.ml0 {
    public final LongSparseIntArray X2;
    public final f60 Y2;

    public l50(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = f60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l50.dispatchDraw(android.graphics.Canvas):void");
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
        t50 t50Var = this.Y2.X;
        HashSet hashSet = t50Var.I;
        f60 f60Var = t50Var.L;
        HashSet hashSet2 = t50Var.H;
        if (t50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(t50Var.f42686q);
            hashSet.clear();
            hashSet.addAll(t50Var.f42685p);
            t50Var.J = 0.0f;
            t50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            l50 l50Var = f60Var.Q;
            int childCount = l50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = l50Var.getChildAt(i15);
                s4.c1 G = l50Var.G(childAt);
                if (G != null && (i14 = G.f42630f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    t50Var.J = Math.max(t50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    t50Var.K = Math.min(t50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            t50Var.F = 0.0f;
            l50Var.invalidate();
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
                    f60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
