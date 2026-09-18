package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kj implements cl0, pj {
    public final yj f25639a;

    public kj(yj yjVar) {
        this.f25639a = yjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        yj yjVar = this.f25639a;
        yjVar.f26463b.dismiss(true);
        yjVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        yj yjVar = this.f25639a;
        s4.h0 adapter = yjVar.f30258s.getAdapter();
        uj ujVar = yjVar.F;
        if (adapter == ujVar) {
            O = ujVar.E(i10);
        } else {
            sj sjVar = yjVar.E;
            O = sjVar.O(sjVar.S(i10), sjVar.Q(i10));
        }
        if (O != null) {
            yjVar.L((xj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
