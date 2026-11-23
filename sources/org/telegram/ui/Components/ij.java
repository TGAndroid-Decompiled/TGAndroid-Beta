package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ij implements sj0, mj {
    public final vj f36261a;

    public ij(vj vjVar) {
        this.f36261a = vjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        vj vjVar = this.f36261a;
        vjVar.f37520b.a(true);
        vjVar.K.a(user, z10, i7, j3);
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        vj vjVar = this.f36261a;
        v4.i0 adapter = vjVar.f40850s.getAdapter();
        rj rjVar = vjVar.G;
        if (adapter == rjVar) {
            O = rjVar.E(i7);
        } else {
            pj pjVar = vjVar.F;
            O = pjVar.O(pjVar.S(i7), pjVar.Q(i7));
        }
        if (O != null) {
            vjVar.Q((uj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
