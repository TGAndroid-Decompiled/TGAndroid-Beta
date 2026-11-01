package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uk extends s4.s0 {
    public final int f30977a;
    public final bl f30978b;

    public uk(bl blVar, int i10) {
        this.f30977a = i10;
        this.f30978b = blVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        dk0 dk0Var;
        switch (this.f30977a) {
            case 0:
                bl blVar = this.f30978b;
                ag.b1 b1Var = blVar.N;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                blVar.J = z10;
                if (!z10 && blVar.H != null) {
                    blVar.H = null;
                }
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    bi biVar = blVar.f30964b;
                    int i11 = biVar.f21615s0;
                    if (((biVar.V3[0] - i11) - L) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var = (dk0) b1Var.K(0)) != null) {
                        View view = dk0Var.f47909a;
                        if (view.getTop() > blVar.f24877x0 - blVar.f24875w0) {
                            b1Var.w0(0, view.getTop() - (blVar.f24877x0 - blVar.f24875w0), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    bl blVar2 = this.f30978b;
                    if (blVar2.f24858i0 && blVar2.f24859j0) {
                        org.telegram.messenger.i0.v1(blVar2.f30964b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30977a) {
            case 0:
                bl blVar = this.f30978b;
                blVar.h0();
                if (blVar.H != null) {
                    blVar.I += i11;
                }
                blVar.f30964b.L1(blVar, i11);
                return;
            default:
                return;
        }
    }
}
