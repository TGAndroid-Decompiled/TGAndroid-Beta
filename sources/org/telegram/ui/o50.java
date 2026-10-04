package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o50 extends org.telegram.ui.Components.zl0 {
    public final LongSparseIntArray f39104e3;
    public final h60 f39105f3;

    public o50(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f39105f3 = h60Var;
        this.f39104e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f39105f3.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        v50 v50Var = this.f39105f3.X;
        HashSet hashSet = v50Var.I;
        h60 h60Var = v50Var.L;
        HashSet hashSet2 = v50Var.H;
        if (v50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(v50Var.f46590q);
            hashSet.clear();
            hashSet.addAll(v50Var.f46589p);
            v50Var.J = 0.0f;
            v50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            o50 o50Var = h60Var.Q;
            int childCount = o50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = o50Var.getChildAt(i15);
                s4.c1 G = o50Var.G(childAt);
                if (G != null && (i14 = G.f46527f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    v50Var.J = Math.max(v50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    v50Var.K = Math.min(v50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            v50Var.F = 0.0f;
            o50Var.invalidate();
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
                    h60.L(this.f39105f3, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
