package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jj implements zl0, oj {
    public final xj f27538a;

    public jj(xj xjVar) {
        this.f27538a = xjVar;
    }

    @Override
    public boolean a(int i10, View view) {
        Object O;
        xj xjVar = this.f27538a;
        s4.g0 adapter = xjVar.f32436s.getAdapter();
        tj tjVar = xjVar.F;
        if (adapter == tjVar) {
            O = tjVar.E(i10);
        } else {
            rj rjVar = xjVar.E;
            O = rjVar.O(rjVar.S(i10), rjVar.Q(i10));
        }
        if (O != null) {
            xjVar.O((wj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        xj xjVar = this.f27538a;
        xjVar.f28173b.dismiss(true);
        xjVar.J.b(user, z10, i10, j10);
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
