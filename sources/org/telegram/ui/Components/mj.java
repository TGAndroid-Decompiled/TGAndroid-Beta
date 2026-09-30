package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements ol0, rj {
    public final ak f26433a;

    public mj(ak akVar) {
        this.f26433a = akVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        ak akVar = this.f26433a;
        akVar.f27075b.dismiss(true);
        akVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ak akVar = this.f26433a;
        s4.h0 adapter = akVar.f22678s.getAdapter();
        wj wjVar = akVar.F;
        if (adapter == wjVar) {
            O = wjVar.E(i10);
        } else {
            uj ujVar = akVar.E;
            O = ujVar.O(ujVar.S(i10), ujVar.Q(i10));
        }
        if (O != null) {
            akVar.L((zj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
