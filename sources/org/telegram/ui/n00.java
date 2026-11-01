package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class n00 extends s4.s0 {
    public final y00 f39660a;

    public n00(y00 y00Var) {
        this.f39660a = y00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            org.telegram.messenger.i0.v1(this.f39660a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.messenger.kj kjVar;
        y00 y00Var = this.f39660a;
        q00 q00Var = y00Var.m0;
        s4.a0 a0Var = y00Var.f43509j0;
        fe.b bVar = y00Var.f43496a;
        yy yyVar = y00Var.f43513n0;
        if (recyclerView.getAdapter() != null && y00Var.d != null) {
            int L0 = a0Var.L0();
            int N0 = a0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!y00Var.M && abs > 0 && N0 >= b10 - 10 && !y00Var.N) {
                org.telegram.messenger.i0.g3(new yy(this, 2));
            }
            if (y00Var.d == y00Var.U) {
                if (i11 != 0 && !y00Var.f43504f.isEmpty() && TextUtils.isEmpty(y00Var.Q)) {
                    org.telegram.messenger.i0.r(yyVar);
                    org.telegram.messenger.i0.h3(yyVar, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 K = recyclerView.K(L0);
                if (K != null && K.f47912f == 0) {
                    View view = K.f47909a;
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        if (t7Var.e <= 0) {
                            kjVar = null;
                        } else {
                            kjVar = t7Var.f23094b[0];
                        }
                        if (kjVar != null) {
                            int i12 = kjVar.f16690k.date;
                            q00Var.getClass();
                            String u10 = org.telegram.messenger.dd.u(i12, false);
                            if (!TextUtils.equals(q00Var.f40649c, u10)) {
                                q00Var.f40649c = u10;
                                q00Var.f40647a.t(u10, true, true);
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
            View pinnedHeader = y00Var.f43498b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(q00Var.f40649c, charSequence)) {
                        q00Var.f40649c = charSequence;
                        q00Var.f40647a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        org.telegram.messenger.i0.r(yyVar);
                        org.telegram.messenger.i0.h3(yyVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.i0.r(yyVar);
            bVar.a(false, true);
        }
    }
}
