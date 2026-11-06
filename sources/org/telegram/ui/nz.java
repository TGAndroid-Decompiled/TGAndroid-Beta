package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class nz extends v4.s0 {
    public final yz f48149a;

    public nz(yz yzVar) {
        this.f48149a = yzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f48149a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.ij ijVar;
        yz yzVar = this.f48149a;
        qz qzVar = yzVar.m0;
        v4.b0 b0Var = yzVar.f52387j0;
        te.a aVar = yzVar.f52373a;
        hz hzVar = yzVar.f52391n0;
        if (recyclerView.getAdapter() != null && yzVar.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!yzVar.M && abs > 0 && N0 >= b10 - 10 && !yzVar.N) {
                org.telegram.messenger.g0.h3(new hz(this, 1));
            }
            if (yzVar.d == yzVar.U) {
                if (i10 != 0 && !yzVar.f52382f.isEmpty() && TextUtils.isEmpty(yzVar.Q)) {
                    org.telegram.messenger.g0.r(hzVar);
                    org.telegram.messenger.g0.i3(hzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.d1 K = recyclerView.K(L0);
                if (K != null && K.f56931f == 0) {
                    View view = K.f56927a;
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        if (p7Var.f29736e <= 0) {
                            ijVar = null;
                        } else {
                            ijVar = p7Var.f29734b[0];
                        }
                        if (ijVar != null) {
                            int i11 = ijVar.f23237k.date;
                            qzVar.getClass();
                            String u10 = org.telegram.messenger.hd.u(i11, false);
                            if (!TextUtils.equals(qzVar.f49316c, u10)) {
                                qzVar.f49316c = u10;
                                qzVar.f49314a.t(u10, true, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            View pinnedHeader = yzVar.f52375b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(qzVar.f49316c, charSequence)) {
                        qzVar.f49316c = charSequence;
                        qzVar.f49314a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(hzVar);
                        org.telegram.messenger.g0.i3(hzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(hzVar);
            aVar.a(false, true);
        }
    }
}
