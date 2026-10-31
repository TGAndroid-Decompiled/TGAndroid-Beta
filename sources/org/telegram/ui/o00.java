package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class o00 extends s4.s0 {
    public final z00 f40089a;

    public o00(z00 z00Var) {
        this.f40089a = z00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            org.telegram.messenger.i0.v1(this.f40089a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.messenger.jj jjVar;
        z00 z00Var = this.f40089a;
        r00 r00Var = z00Var.m0;
        s4.a0 a0Var = z00Var.f43952j0;
        fe.b bVar = z00Var.f43939a;
        zy zyVar = z00Var.f43956n0;
        if (recyclerView.getAdapter() != null && z00Var.d != null) {
            int L0 = a0Var.L0();
            int N0 = a0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!z00Var.M && abs > 0 && N0 >= b10 - 10 && !z00Var.N) {
                org.telegram.messenger.i0.g3(new zy(this, 2));
            }
            if (z00Var.d == z00Var.U) {
                if (i11 != 0 && !z00Var.f43947f.isEmpty() && TextUtils.isEmpty(z00Var.Q)) {
                    org.telegram.messenger.i0.r(zyVar);
                    org.telegram.messenger.i0.h3(zyVar, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 K = recyclerView.K(L0);
                if (K != null && K.f47901f == 0) {
                    View view = K.f47898a;
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        if (t7Var.e <= 0) {
                            jjVar = null;
                        } else {
                            jjVar = t7Var.f23093b[0];
                        }
                        if (jjVar != null) {
                            int i12 = jjVar.f16337k.date;
                            r00Var.getClass();
                            String u10 = org.telegram.messenger.cd.u(i12, false);
                            if (!TextUtils.equals(r00Var.f41102c, u10)) {
                                r00Var.f41102c = u10;
                                r00Var.f41100a.t(u10, true, true);
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
            View pinnedHeader = z00Var.f43941b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(r00Var.f41102c, charSequence)) {
                        r00Var.f41102c = charSequence;
                        r00Var.f41100a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        org.telegram.messenger.i0.r(zyVar);
                        org.telegram.messenger.i0.h3(zyVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.i0.r(zyVar);
            bVar.a(false, true);
        }
    }
}
