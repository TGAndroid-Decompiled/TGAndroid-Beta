package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cj implements bl0, ij {
    public final sj f27490a;

    public cj(sj sjVar) {
        this.f27490a = sjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        sj sjVar = this.f27490a;
        sjVar.f28403b.dismiss(true);
        sjVar.F.a(user, z10, i10, j10);
    }

    @Override
    public boolean c(int i10, View view) {
        Object O;
        sj sjVar = this.f27490a;
        f2.p0 adapter = sjVar.f32656s.getAdapter();
        oj ojVar = sjVar.B;
        if (adapter == ojVar) {
            O = ojVar.E(i10);
        } else {
            lj ljVar = sjVar.A;
            O = ljVar.O(ljVar.S(i10), ljVar.Q(i10));
        }
        if (O != null) {
            sjVar.K((rj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
