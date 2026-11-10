package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qi implements dj0, vi {
    public final ej f37299a;

    public qi(ej ejVar) {
        this.f37299a = ejVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z9, int i7, long j3) {
        ej ejVar = this.f37299a;
        ejVar.f38656b.a(true);
        ejVar.J.a(user, z9, i7, j3);
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        ej ejVar = this.f37299a;
        v4.g0 adapter = ejVar.f33270s.getAdapter();
        aj ajVar = ejVar.F;
        if (adapter == ajVar) {
            O = ajVar.E(i7);
        } else {
            yi yiVar = ejVar.E;
            O = yiVar.O(yiVar.S(i7), yiVar.Q(i7));
        }
        if (O != null) {
            ejVar.P((dj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
    }
}
