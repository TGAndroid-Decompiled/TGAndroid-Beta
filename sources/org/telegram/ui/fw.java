package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class fw extends s4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final ay L;
    public final cy M;

    public fw(cy cyVar, ay ayVar) {
        this.M = cyVar;
        this.L = ayVar;
    }

    @Override
    public final int R0() {
        ay ayVar = this.L;
        if (ayVar.f35442s == 0 && this.M.X3() && ayVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                cy cyVar = this.M;
                sb2.append(cyVar.S1);
                sb2.append(" lastUpdateAction=");
                sb2.append(cyVar.f36194z3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new ew(this.L, 0));
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
        ay ayVar = this.L;
        if (ayVar.f35436a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(23, this, ayVar));
            this.K.addListener(new org.telegram.ui.Components.o31(this, 22));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.bs.f25012f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f35436a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, qf.e r24, s4.y0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fw.o0(int, qf.e, s4.y0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.M.X3() && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.f46053a = i10;
        w0(nVar);
    }
}
