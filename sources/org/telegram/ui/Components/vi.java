package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class vi implements rk0, bj {

    public final lj f33423a;

    public vi(lj ljVar) {
        this.f33423a = ljVar;
    }

    @Override
    public boolean a(int i10, View view) {
        Object objO;
        lj ljVar = this.f33423a;
        f2.q0 adapter = ljVar.f30397s.getAdapter();
        hj hjVar = ljVar.B;
        if (adapter == hjVar) {
            objO = hjVar.E(i10);
        } else {
            ej ejVar = ljVar.A;
            objO = ejVar.O(ejVar.S(i10), ejVar.Q(i10));
        }
        if (objO == null) {
            return false;
        }
        ljVar.L((kj) view, objO);
        return true;
    }

    @Override
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        lj ljVar = this.f33423a;
        ljVar.f34900b.dismiss(true);
        ljVar.F.b(user, z10, i10, j10);
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
