package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jj implements cm0, oj {
    public final xj f29679a;

    public jj(xj xjVar) {
        this.f29679a = xjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        xj xjVar = this.f29679a;
        xjVar.f30254b.dismiss(true);
        xjVar.J.a(user, z10, i10, j10);
    }

    @Override
    public boolean c(int i10, View view) {
        Object O;
        xj xjVar = this.f29679a;
        s4.h0 adapter = xjVar.f34784s.getAdapter();
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
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
