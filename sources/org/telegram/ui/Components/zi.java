package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zi implements ij0, dj {
    public final mj f42367a;

    public zi(mj mjVar) {
        this.f42367a = mjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        mj mjVar = this.f42367a;
        mjVar.f33609b.a(true);
        mjVar.K.a(user, z10, i7, j3);
    }

    @Override
    public boolean b(int i7, View view) {
        Object O;
        mj mjVar = this.f42367a;
        v4.h0 adapter = mjVar.f37304s.getAdapter();
        ij ijVar = mjVar.G;
        if (adapter == ijVar) {
            O = ijVar.E(i7);
        } else {
            gj gjVar = mjVar.F;
            O = gjVar.O(gjVar.S(i7), gjVar.Q(i7));
        }
        if (O != null) {
            mjVar.Q((lj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
