package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n30 extends org.telegram.ui.Components.pj0 {
    public final LongSparseIntArray f48105e3;
    public final f40 f48106f3;

    public n30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f48106f3 = f40Var;
        this.f48105e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f48106f3.R4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        t30 t30Var = this.f48106f3.R1;
        HashSet hashSet = t30Var.I;
        f40 f40Var = t30Var.L;
        HashSet hashSet2 = t30Var.H;
        if (t30Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(t30Var.f57110q);
            hashSet.clear();
            hashSet.addAll(t30Var.f57109p);
            t30Var.J = 0.0f;
            t30Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            n30 n30Var = f40Var.K1;
            int childCount = n30Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = n30Var.getChildAt(i14);
                v4.d1 G = n30Var.G(childAt);
                if (G != null && (i13 = G.f57056f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                    t30Var.J = Math.max(t30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    t30Var.K = Math.min(t30Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            t30Var.F = 0.0f;
            n30Var.invalidate();
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
                    f40.J0(this.f48106f3, rVar, z9);
                }
            }
        }
        super.setVisibility(i7);
    }
}
