package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements cm0, qj {
    public final zj f27051a;

    public lj(zj zjVar) {
        this.f27051a = zjVar;
    }

    @Override
    public boolean a(int i10, View view) {
        Object O;
        zj zjVar = this.f27051a;
        s4.g0 adapter = zjVar.f31885s.getAdapter();
        vj vjVar = zjVar.F;
        if (adapter == vjVar) {
            O = vjVar.E(i10);
        } else {
            tj tjVar = zjVar.E;
            O = tjVar.O(tjVar.S(i10), tjVar.Q(i10));
        }
        if (O != null) {
            zjVar.O((yj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        zj zjVar = this.f27051a;
        zjVar.f27671b.dismiss(true);
        zjVar.J.b(user, z10, i10, j10);
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
