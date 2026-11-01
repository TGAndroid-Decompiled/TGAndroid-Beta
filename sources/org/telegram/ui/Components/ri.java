package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ri implements jk0, vi {
    public final ej f29999a;

    public ri(ej ejVar) {
        this.f29999a = ejVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        ej ejVar = this.f29999a;
        ejVar.f30964b.a(true);
        ejVar.J.a(user, z10, i10, j10);
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        ej ejVar = this.f29999a;
        s4.g0 adapter = ejVar.f25848s.getAdapter();
        aj ajVar = ejVar.F;
        if (adapter == ajVar) {
            O = ajVar.E(i10);
        } else {
            yi yiVar = ejVar.E;
            O = yiVar.O(yiVar.S(i10), yiVar.Q(i10));
        }
        if (O != null) {
            ejVar.O((dj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
