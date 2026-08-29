package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class jw extends f2.j0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final ey L;
    public final fy M;

    public jw(fy fyVar, ey eyVar) {
        this.M = fyVar;
        this.L = eyVar;
    }

    @Override
    public final int R0() {
        ey eyVar = this.L;
        if (eyVar.f37928s == 0 && this.M.Z3() && eyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(d1Var, k1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                fy fyVar = this.M;
                sb2.append(fyVar.O1);
                sb2.append(" lastUpdateAction=");
                sb2.append(fyVar.f38361u3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new iw(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ey eyVar = this.L;
        if (eyVar.f37921a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.b3(19, this, eyVar));
            this.K.addListener(new org.telegram.ui.Components.p11(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f37921a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, f2.d1 r24, f2.k1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw.o0(int, f2.d1, f2.k1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, k1Var, i10);
            return;
        }
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.f6373a = i10;
        w0(nVar);
    }
}
