package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cj implements ll0, ij {
    public final sj f25985a;

    public cj(sj sjVar) {
        this.f25985a = sjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z4, int i10, long j10) {
        sj sjVar = this.f25985a;
        sjVar.f26546b.dismiss(true);
        sjVar.G.a(user, z4, i10, j10);
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        sj sjVar = this.f25985a;
        f2.p0 adapter = sjVar.f31069s.getAdapter();
        oj ojVar = sjVar.C;
        if (adapter == ojVar) {
            O = ojVar.E(i10);
        } else {
            lj ljVar = sjVar.B;
            O = ljVar.O(ljVar.S(i10), ljVar.Q(i10));
        }
        if (O != null) {
            sjVar.K((rj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
    }
}
