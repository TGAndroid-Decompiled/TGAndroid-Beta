package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zi implements ok0, fj {
    public final pj f35316a;

    public zi(pj pjVar) {
        this.f35316a = pjVar;
    }

    @Override
    public boolean a(int i9, View view) {
        Object O;
        pj pjVar = this.f35316a;
        f2.r0 adapter = pjVar.f31679s.getAdapter();
        lj ljVar = pjVar.B;
        if (adapter == ljVar) {
            O = ljVar.E(i9);
        } else {
            ij ijVar = pjVar.A;
            O = ijVar.O(ijVar.S(i9), ijVar.Q(i9));
        }
        if (O != null) {
            pjVar.K((oj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(TLRPC.User user, boolean z10, int i9, long j10) {
        pj pjVar = this.f35316a;
        pjVar.f27493b.dismiss(true);
        pjVar.F.b(user, z10, i9, j10);
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i9, long j10, boolean z11) {
    }
}
