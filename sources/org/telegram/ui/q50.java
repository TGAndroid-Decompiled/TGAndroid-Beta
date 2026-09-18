package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class q50 extends org.telegram.ui.Components.ml0 {
    public final LongSparseIntArray X2;
    public final k60 Y2;

    public q50(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = k60Var;
        this.X2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.dispatchDraw(android.graphics.Canvas):void");
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
        y50 y50Var = this.Y2.X;
        HashSet hashSet = y50Var.I;
        k60 k60Var = y50Var.L;
        HashSet hashSet2 = y50Var.H;
        if (y50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(y50Var.f42761q);
            hashSet.clear();
            hashSet.addAll(y50Var.f42760p);
            y50Var.J = 0.0f;
            y50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            q50 q50Var = k60Var.Q;
            int childCount = q50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = q50Var.getChildAt(i15);
                s4.c1 H = q50Var.H(childAt);
                if (H != null && (i14 = H.f42705f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(H)) {
                    y50Var.J = Math.max(y50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    y50Var.K = Math.min(y50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            y50Var.F = 0.0f;
            q50Var.invalidate();
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
                    k60.N(this.Y2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
