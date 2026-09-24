package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements ml0, qj {
    public final zj f26110a;

    public lj(zj zjVar) {
        this.f26110a = zjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        zj zjVar = this.f26110a;
        zjVar.f27083b.dismiss(true);
        zjVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        zj zjVar = this.f26110a;
        s4.h0 adapter = zjVar.f30904s.getAdapter();
        vj vjVar = zjVar.F;
        if (adapter == vjVar) {
            O = vjVar.E(i10);
        } else {
            tj tjVar = zjVar.E;
            O = tjVar.O(tjVar.S(i10), tjVar.Q(i10));
        }
        if (O != null) {
            zjVar.L((yj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
