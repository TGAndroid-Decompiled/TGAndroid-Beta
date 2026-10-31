package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ts0 extends org.telegram.ui.Cells.k7 {
    public final int f30688l0;
    public final sk0 m0;

    public ts0(sk0 sk0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(0, context, p6Var);
        this.f30688l0 = i10;
        this.m0 = sk0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f30688l0) {
            case 0:
                us0 us0Var = (us0) this.m0;
                if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !jjVar.h4()) {
                    if (!jjVar.I3()) {
                        return false;
                    }
                    return MediaController.B().o0(us0Var.d, jjVar, us0Var.f31036w.f33184e1, true, null);
                }
                boolean S = MediaController.B().S(jjVar);
                MediaController B = MediaController.B();
                if (S) {
                    arrayList = us0Var.d;
                } else {
                    arrayList = null;
                }
                B.r0(arrayList, false);
                if (jjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                mt0 mt0Var = (mt0) this.m0;
                int i10 = mt0Var.d;
                zt0 zt0Var = mt0Var.f28592f;
                if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !jjVar.h4()) {
                    if (!jjVar.I3()) {
                        return false;
                    }
                    return MediaController.B().o0(zt0Var.f33234v1[i10].f29177a, jjVar, zt0Var.f33184e1, true, null);
                }
                boolean S2 = MediaController.B().S(jjVar);
                MediaController B2 = MediaController.B();
                if (S2) {
                    arrayList2 = zt0Var.f33234v1[i10].f29177a;
                } else {
                    arrayList2 = null;
                }
                B2.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.z00 z00Var = ((org.telegram.ui.u00) this.m0).f41981w;
                if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !jjVar.h4()) {
                    if (!jjVar.I3()) {
                        return false;
                    }
                    String str = z00Var.Q;
                    long j10 = z00Var.E;
                    long j11 = z00Var.H;
                    e2.a0 a0Var = new e2.a0(str, j10, j11, j11, z00Var.D);
                    a0Var.e = z00Var.N;
                    a0Var.f6105f = z00Var.f43963w;
                    a0Var.d = z00Var.O;
                    a0Var.f6106g = z00Var.J ? 1 : 0;
                    return MediaController.B().o0(z00Var.f43947f, jjVar, 0L, true, a0Var);
                }
                boolean S3 = MediaController.B().S(jjVar);
                MediaController B3 = MediaController.B();
                if (S3) {
                    arrayList3 = z00Var.f43947f;
                } else {
                    arrayList3 = null;
                }
                B3.r0(arrayList3, false);
                return S3;
        }
    }

    public ts0(org.telegram.ui.u00 u00Var, Context context) {
        super(1, context, null);
        this.f30688l0 = 2;
        this.m0 = u00Var;
    }
}
