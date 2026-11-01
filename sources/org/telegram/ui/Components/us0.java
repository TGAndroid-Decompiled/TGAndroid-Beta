package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class us0 extends org.telegram.ui.Cells.k7 {
    public final int f31082l0;
    public final tk0 m0;

    public us0(tk0 tk0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(0, context, p6Var);
        this.f31082l0 = i10;
        this.m0 = tk0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.kj kjVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f31082l0) {
            case 0:
                vs0 vs0Var = (vs0) this.m0;
                if (!org.telegram.messenger.kj.R4(kjVar.f16690k) && !kjVar.h4()) {
                    if (!kjVar.I3()) {
                        return false;
                    }
                    return MediaController.B().o0(vs0Var.d, kjVar, vs0Var.f31904w.f24512e1, true, null);
                }
                boolean S = MediaController.B().S(kjVar);
                MediaController B = MediaController.B();
                if (S) {
                    arrayList = vs0Var.d;
                } else {
                    arrayList = null;
                }
                B.r0(arrayList, false);
                if (kjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                nt0 nt0Var = (nt0) this.m0;
                int i10 = nt0Var.d;
                au0 au0Var = nt0Var.f28964f;
                if (!org.telegram.messenger.kj.R4(kjVar.f16690k) && !kjVar.h4()) {
                    if (!kjVar.I3()) {
                        return false;
                    }
                    return MediaController.B().o0(au0Var.f24562v1[i10].f29532a, kjVar, au0Var.f24512e1, true, null);
                }
                boolean S2 = MediaController.B().S(kjVar);
                MediaController B2 = MediaController.B();
                if (S2) {
                    arrayList2 = au0Var.f24562v1[i10].f29532a;
                } else {
                    arrayList2 = null;
                }
                B2.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.y00 y00Var = ((org.telegram.ui.t00) this.m0).f41502w;
                if (!org.telegram.messenger.kj.R4(kjVar.f16690k) && !kjVar.h4()) {
                    if (!kjVar.I3()) {
                        return false;
                    }
                    String str = y00Var.Q;
                    long j10 = y00Var.E;
                    long j11 = y00Var.H;
                    e2.a0 a0Var = new e2.a0(str, j10, j11, j11, y00Var.D);
                    a0Var.e = y00Var.N;
                    a0Var.f6105f = y00Var.f43520w;
                    a0Var.d = y00Var.O;
                    a0Var.f6106g = y00Var.J ? 1 : 0;
                    return MediaController.B().o0(y00Var.f43504f, kjVar, 0L, true, a0Var);
                }
                boolean S3 = MediaController.B().S(kjVar);
                MediaController B3 = MediaController.B();
                if (S3) {
                    arrayList3 = y00Var.f43504f;
                } else {
                    arrayList3 = null;
                }
                B3.r0(arrayList3, false);
                return S3;
        }
    }

    public us0(org.telegram.ui.t00 t00Var, Context context) {
        super(1, context, null);
        this.f31082l0 = 2;
        this.m0 = t00Var;
    }
}
