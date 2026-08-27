package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class kw extends f2.k0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final fy L;
    public final gy M;

    public kw(gy gyVar, fy fyVar) {
        this.M = gyVar;
        this.L = fyVar;
    }

    @Override
    public final int R0() {
        fy fyVar = this.L;
        return (fyVar.f38232s == 0 && this.M.Z3() && fyVar.v == 2) ? 1 : 0;
    }

    @Override
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(e1Var, l1Var);
                return;
            } catch (IndexOutOfBoundsException e9) {
                FileLog.e(e9);
                AndroidUtilities.runOnUIThread(new jw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            gy gyVar = this.M;
            sb2.append(gyVar.O1);
            sb2.append(" lastUpdateAction=");
            sb2.append(gyVar.f38603u3);
            throw new RuntimeException(sb2.toString());
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
        fy fyVar = this.L;
        if (fyVar.f38225a.getScrollState() != 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.t2(18, this, fyVar));
            this.K.addListener(new org.telegram.ui.Components.f11(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f38225a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, f2.e1 r24, f2.l1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kw.o0(int, f2.e1, f2.l1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, l1Var, i10);
            return;
        }
        sh.n nVar = new sh.n(recyclerView.getContext(), 0);
        nVar.f5731a = i10;
        w0(nVar);
    }
}
