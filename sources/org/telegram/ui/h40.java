package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class h40 extends org.telegram.ui.Components.uk0 {
    public final LongSparseIntArray f37697e3;
    public final a50 f37698f3;

    public h40(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f37698f3 = a50Var;
        this.f37697e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f37698f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        o40 o40Var = this.f37698f3.O1;
        HashSet hashSet = o40Var.I;
        a50 a50Var = o40Var.L;
        HashSet hashSet2 = o40Var.H;
        if (o40Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(o40Var.f47958q);
            hashSet.clear();
            hashSet.addAll(o40Var.f47957p);
            o40Var.J = 0.0f;
            o40Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            h40 h40Var = a50Var.H1;
            int childCount = h40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = h40Var.getChildAt(i15);
                s4.c1 G = h40Var.G(childAt);
                if (G != null && (i14 = G.f47912f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    o40Var.J = Math.max(o40Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    o40Var.K = Math.min(o40Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            o40Var.F = 0.0f;
            h40Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (childAt.isAttachedToWindow() && i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a50.J0(this.f37698f3, kVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
