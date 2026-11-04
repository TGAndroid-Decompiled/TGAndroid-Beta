package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ri implements hj0, vi {
    public final ej f37735a;

    public ri(ej ejVar) {
        this.f37735a = ejVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i3, long j10) {
        ej ejVar = this.f37735a;
        ejVar.f38416b.a(true);
        ejVar.K.a(user, z10, i3, j10);
    }

    @Override
    public boolean f(int i3, View view) {
        Object O;
        ej ejVar = this.f37735a;
        u4.h0 adapter = ejVar.f33406s.getAdapter();
        aj ajVar = ejVar.G;
        if (adapter == ajVar) {
            O = ajVar.E(i3);
        } else {
            yi yiVar = ejVar.F;
            O = yiVar.O(yiVar.S(i3), yiVar.Q(i3));
        }
        if (O != null) {
            ejVar.P((dj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i3, long j10, boolean z11) {
    }
}
