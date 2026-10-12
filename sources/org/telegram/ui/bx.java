package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bx extends s4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final xy L;
    public final yy M;

    public bx(yy yyVar, xy xyVar) {
        this.M = yyVar;
        this.L = xyVar;
    }

    @Override
    public final int R0() {
        xy xyVar = this.L;
        if (xyVar.f41986s == 0 && this.M.W3() && xyVar.v == 2) {
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
                yy yyVar = this.M;
                sb2.append(yyVar.S1);
                sb2.append(" lastUpdateAction=");
                sb2.append(yyVar.y3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new ax(this.L, 0));
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
        xy xyVar = this.L;
        if (xyVar.f41980a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, xyVar));
            this.K.addListener(new org.telegram.ui.Components.u61(this, 20));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.es.f24771f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f41980a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, qf.e r24, s4.y0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.o0(int, qf.e, s4.y0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.M.W3() && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        ki.o oVar = new ki.o(recyclerView.getContext(), 0);
        oVar.f44979a = i10;
        w0(oVar);
    }
}
