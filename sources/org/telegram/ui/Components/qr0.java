package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class qr0 extends org.telegram.ui.Cells.k7 {
    public final zt0 f29730l0;

    public qr0(zt0 zt0Var, Context context) {
        super(context);
        this.f29730l0 = zt0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList;
        zt0 zt0Var = this.f29730l0;
        ot0[] ot0VarArr = zt0Var.f33234v1;
        if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !jjVar.h4()) {
            if (!jjVar.I3()) {
                return false;
            }
            return MediaController.B().o0(ot0VarArr[4].f29177a, jjVar, zt0Var.f33184e1, true, null);
        }
        boolean S = MediaController.B().S(jjVar);
        MediaController B = MediaController.B();
        if (S) {
            arrayList = ot0VarArr[4].f29177a;
        } else {
            arrayList = null;
        }
        B.r0(arrayList, false);
        return S;
    }
}
