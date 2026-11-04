package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class lz extends u4.t0 {
    public final wz f47470a;

    public lz(wz wzVar) {
        this.f47470a = wzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 1) {
            org.telegram.messenger.g0.v1(this.f47470a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.messenger.zi ziVar;
        wz wzVar = this.f47470a;
        oz ozVar = wzVar.f51654n0;
        u4.b0 b0Var = wzVar.f51651k0;
        qe.a aVar = wzVar.f51636a;
        fz fzVar = wzVar.f51655o0;
        if (recyclerView.getAdapter() != null && wzVar.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!wzVar.N && abs > 0 && N0 >= b10 - 10 && !wzVar.O) {
                org.telegram.messenger.g0.h3(new fz(this, 1));
            }
            if (wzVar.d == wzVar.V) {
                if (i10 != 0 && !wzVar.f51645f.isEmpty() && TextUtils.isEmpty(wzVar.R)) {
                    org.telegram.messenger.g0.r(fzVar);
                    org.telegram.messenger.g0.i3(fzVar, 1650L);
                    aVar.a(true, true);
                }
                u4.d1 K = recyclerView.K(L0);
                if (K != null && K.f55544f == 0) {
                    View view = K.f55540a;
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        if (o7Var.f29753e <= 0) {
                            ziVar = null;
                        } else {
                            ziVar = o7Var.f29751b[0];
                        }
                        if (ziVar != null) {
                            int i11 = ziVar.f26868k.date;
                            ozVar.getClass();
                            String u10 = org.telegram.messenger.bd.u(i11, false);
                            if (!TextUtils.equals(ozVar.f48385c, u10)) {
                                ozVar.f48385c = u10;
                                ozVar.f48383a.t(u10, true, true);
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
            View pinnedHeader = wzVar.f51638b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(ozVar.f48385c, charSequence)) {
                        ozVar.f48385c = charSequence;
                        ozVar.f48383a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(fzVar);
                        org.telegram.messenger.g0.i3(fzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(fzVar);
            aVar.a(false, true);
        }
    }
}
