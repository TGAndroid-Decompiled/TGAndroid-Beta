package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements bm0, mj {
    public final vj f27040a;

    public hj(vj vjVar) {
        this.f27040a = vjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        vj vjVar = this.f27040a;
        vjVar.f27704b.dismiss(true);
        vjVar.J.a(user, z10, i10, j10);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        vj vjVar = this.f27040a;
        s4.g0 adapter = vjVar.f31466s.getAdapter();
        rj rjVar = vjVar.F;
        if (adapter == rjVar) {
            O = rjVar.E(i10);
        } else {
            pj pjVar = vjVar.E;
            O = pjVar.O(pjVar.S(i10), pjVar.Q(i10));
        }
        if (O != null) {
            vjVar.O((uj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
