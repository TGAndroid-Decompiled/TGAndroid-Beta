package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class rr0 extends org.telegram.ui.Cells.k7 {
    public final au0 f30077l0;

    public rr0(au0 au0Var, Context context) {
        super(context);
        this.f30077l0 = au0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.kj kjVar) {
        ArrayList arrayList;
        au0 au0Var = this.f30077l0;
        pt0[] pt0VarArr = au0Var.f24562v1;
        if (!org.telegram.messenger.kj.R4(kjVar.f16690k) && !kjVar.h4()) {
            if (!kjVar.I3()) {
                return false;
            }
            return MediaController.B().o0(pt0VarArr[4].f29532a, kjVar, au0Var.f24512e1, true, null);
        }
        boolean S = MediaController.B().S(kjVar);
        MediaController B = MediaController.B();
        if (S) {
            arrayList = pt0VarArr[4].f29532a;
        } else {
            arrayList = null;
        }
        B.r0(arrayList, false);
        return S;
    }
}
