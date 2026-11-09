package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pz extends v4.s0 {
    public final a00 f48834a;

    public pz(a00 a00Var) {
        this.f48834a = a00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f48834a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.ij ijVar;
        a00 a00Var = this.f48834a;
        sz szVar = a00Var.m0;
        v4.b0 b0Var = a00Var.f43524j0;
        te.a aVar = a00Var.f43510a;
        jz jzVar = a00Var.f43528n0;
        if (recyclerView.getAdapter() != null && a00Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!a00Var.M && abs > 0 && N0 >= b10 - 10 && !a00Var.N) {
                org.telegram.messenger.g0.h3(new jz(this, 1));
            }
            if (a00Var.d == a00Var.U) {
                if (i10 != 0 && !a00Var.f43519f.isEmpty() && TextUtils.isEmpty(a00Var.Q)) {
                    org.telegram.messenger.g0.r(jzVar);
                    org.telegram.messenger.g0.i3(jzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.d1 K = recyclerView.K(L0);
                if (K != null && K.f57060f == 0) {
                    View view = K.f57056a;
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        if (p7Var.f29744e <= 0) {
                            ijVar = null;
                        } else {
                            ijVar = p7Var.f29742b[0];
                        }
                        if (ijVar != null) {
                            int i11 = ijVar.f23262k.date;
                            szVar.getClass();
                            String u10 = org.telegram.messenger.id.u(i11, false);
                            if (!TextUtils.equals(szVar.f50011c, u10)) {
                                szVar.f50011c = u10;
                                szVar.f50009a.t(u10, true, true);
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
            View pinnedHeader = a00Var.f43512b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(szVar.f50011c, charSequence)) {
                        szVar.f50011c = charSequence;
                        szVar.f50009a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(jzVar);
                        org.telegram.messenger.g0.i3(jzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(jzVar);
            aVar.a(false, true);
        }
    }
}
