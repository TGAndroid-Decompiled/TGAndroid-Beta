package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class i40 extends org.telegram.ui.Components.tk0 {
    public final LongSparseIntArray f38171e3;
    public final b50 f38172f3;

    public i40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f38172f3 = b50Var;
        this.f38171e3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f38172f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        p40 p40Var = this.f38172f3.O1;
        HashSet hashSet = p40Var.I;
        b50 b50Var = p40Var.L;
        HashSet hashSet2 = p40Var.H;
        if (p40Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(p40Var.f47947q);
            hashSet.clear();
            hashSet.addAll(p40Var.f47946p);
            p40Var.J = 0.0f;
            p40Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            i40 i40Var = b50Var.H1;
            int childCount = i40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = i40Var.getChildAt(i15);
                s4.c1 G = i40Var.G(childAt);
                if (G != null && (i14 = G.f47901f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    p40Var.J = Math.max(p40Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    p40Var.K = Math.min(p40Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            p40Var.F = 0.0f;
            i40Var.invalidate();
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
                    b50.J0(this.f38172f3, kVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
