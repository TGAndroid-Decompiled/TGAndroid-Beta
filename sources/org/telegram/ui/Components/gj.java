package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gj implements qj0, kj {
    public final tj f35507a;

    public gj(tj tjVar) {
        this.f35507a = tjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        tj tjVar = this.f35507a;
        tjVar.f36766b.a(true);
        tjVar.K.a(user, z10, i7, j3);
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        tj tjVar = this.f35507a;
        v4.i0 adapter = tjVar.f40022s.getAdapter();
        pj pjVar = tjVar.G;
        if (adapter == pjVar) {
            O = pjVar.E(i7);
        } else {
            nj njVar = tjVar.F;
            O = njVar.O(njVar.S(i7), njVar.Q(i7));
        }
        if (O != null) {
            tjVar.Q((sj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
