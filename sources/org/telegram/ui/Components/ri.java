package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ri implements dj0, wi {
    public final fj f37650a;

    public ri(fj fjVar) {
        this.f37650a = fjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z9, int i7, long j3) {
        fj fjVar = this.f37650a;
        fjVar.f38969b.a(true);
        fjVar.J.a(user, z9, i7, j3);
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        fj fjVar = this.f37650a;
        v4.g0 adapter = fjVar.f33554s.getAdapter();
        bj bjVar = fjVar.F;
        if (adapter == bjVar) {
            O = bjVar.E(i7);
        } else {
            zi ziVar = fjVar.E;
            O = ziVar.O(ziVar.S(i7), ziVar.Q(i7));
        }
        if (O != null) {
            fjVar.P((ej) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
    }
}
