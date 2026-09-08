package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kj implements bl0, pj {
    public final yj f27863a;

    public kj(yj yjVar) {
        this.f27863a = yjVar;
    }

    @Override
    public boolean a(int i10, View view) {
        Object O;
        yj yjVar = this.f27863a;
        s4.h0 adapter = yjVar.f32960s.getAdapter();
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
    public void b(TLRPC.User user, boolean z10, int i10, long j3) {
        yj yjVar = this.f27863a;
        yjVar.f28780b.dismiss(true);
        yjVar.J.b(user, z10, i10, j3);
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
