package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oz extends v4.t0 {
    public final zz f50091a;

    public oz(zz zzVar) {
        this.f50091a = zzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f50091a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.gj gjVar;
        zz zzVar = this.f50091a;
        rz rzVar = zzVar.f54091n0;
        v4.b0 b0Var = zzVar.f54088k0;
        te.a aVar = zzVar.f54073a;
        iz izVar = zzVar.f54092o0;
        if (recyclerView.getAdapter() != null && zzVar.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!zzVar.N && abs > 0 && N0 >= b10 - 10 && !zzVar.O) {
                org.telegram.messenger.g0.h3(new iz(this, 1));
            }
            if (zzVar.d == zzVar.V) {
                if (i10 != 0 && !zzVar.f54082f.isEmpty() && TextUtils.isEmpty(zzVar.R)) {
                    org.telegram.messenger.g0.r(izVar);
                    org.telegram.messenger.g0.i3(izVar, 1650L);
                    aVar.a(true, true);
                }
                v4.e1 K = recyclerView.K(L0);
                if (K != null && K.f58539f == 0) {
                    View view = K.f58535a;
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        if (o7Var.f30814e <= 0) {
                            gjVar = null;
                        } else {
                            gjVar = o7Var.f30812b[0];
                        }
                        if (gjVar != null) {
                            int i11 = gjVar.f23817k.date;
                            rzVar.getClass();
                            String u10 = org.telegram.messenger.hd.u(i11, false);
                            if (!TextUtils.equals(rzVar.f51057c, u10)) {
                                rzVar.f51057c = u10;
                                rzVar.f51055a.t(u10, true, true);
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
            View pinnedHeader = zzVar.f54075b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(rzVar.f51057c, charSequence)) {
                        rzVar.f51057c = charSequence;
                        rzVar.f51055a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(izVar);
                        org.telegram.messenger.g0.i3(izVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(izVar);
            aVar.a(false, true);
        }
    }
}
