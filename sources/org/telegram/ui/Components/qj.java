package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qj implements mm0, vj {
    public final ek f29822a;

    public qj(ek ekVar) {
        this.f29822a = ekVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        ek ekVar = this.f29822a;
        ekVar.f30570b.dismiss(true);
        ekVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ek ekVar = this.f29822a;
        s4.i0 adapter = ekVar.f25718s.getAdapter();
        ak akVar = ekVar.F;
        if (adapter == akVar) {
            O = akVar.E(i10);
        } else {
            yj yjVar = ekVar.E;
            O = yjVar.O(yjVar.S(i10), yjVar.Q(i10));
        }
        if (O != null) {
            ekVar.O((dk) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
