package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements sj0, lj {
    public final uj f35752a;

    public hj(uj ujVar) {
        this.f35752a = ujVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        uj ujVar = this.f35752a;
        ujVar.f37135b.a(true);
        ujVar.K.a(user, z10, i7, j3);
    }

    @Override
    public boolean b(int i7, View view) {
        Object O;
        uj ujVar = this.f35752a;
        v4.i0 adapter = ujVar.f40390s.getAdapter();
        qj qjVar = ujVar.G;
        if (adapter == qjVar) {
            O = qjVar.E(i7);
        } else {
            oj ojVar = ujVar.F;
            O = ojVar.O(ojVar.S(i7), ojVar.Q(i7));
        }
        if (O != null) {
            ujVar.Q((tj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
