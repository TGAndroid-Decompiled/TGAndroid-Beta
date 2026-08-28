package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class hw extends f2.m0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final cy L;
    public final dy M;

    public hw(dy dyVar, cy cyVar) {
        this.M = dyVar;
        this.L = cyVar;
    }

    @Override
    public final int R0() {
        cy cyVar = this.L;
        if (cyVar.f37357s == 0 && this.M.Z3() && cyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(g1Var, n1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                dy dyVar = this.M;
                sb2.append(dyVar.O1);
                sb2.append(" lastUpdateAction=");
                sb2.append(dyVar.f37734u3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new gw(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i9, int i10) {
        this.I = true;
        super.b1(view, view2, i9, i10);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        cy cyVar = this.L;
        if (cyVar.f37350a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new f2.g(17, this, cyVar));
            this.K.addListener(new org.telegram.ui.Components.y11(this, 22));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i9, int i10) {
        if (this.I) {
            i10 -= this.L.f37350a.getPaddingTop();
        }
        super.h1(i9, i10);
    }

    @Override
    public final int o0(int r23, f2.g1 r24, f2.n1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hw.o0(int, f2.g1, f2.n1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        if (this.M.Z3() && i9 == 1) {
            super.v0(recyclerView, n1Var, i9);
            return;
        }
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.f5443a = i9;
        w0(nVar);
    }
}
