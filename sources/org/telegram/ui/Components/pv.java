package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class pv implements Runnable {
    public final int f38669a;
    public final ty f38670b;

    public pv(ty tyVar, int i7) {
        this.f38669a = i7;
        this.f38670b = tyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f38669a;
        ty tyVar = this.f38670b;
        switch (i7) {
            case 0:
                tyVar.Y(false);
                tyVar.E();
                return;
            case 1:
                dx dxVar = tyVar.S;
                if (dxVar != null) {
                    dxVar.F(true);
                    return;
                }
                return;
            case 2:
                tx txVar = tyVar.f40151u1;
                if (txVar != null) {
                    txVar.t(tyVar.S.h);
                    return;
                }
                return;
            case 3:
                tx txVar2 = tyVar.f40151u1;
                if (txVar2 != null) {
                    txVar2.q();
                    return;
                }
                return;
            case 4:
                tyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.j10.i(tyVar.f40099d1).e());
                tyVar.Z1.presentFragment(new org.telegram.ui.bn(bundle));
                return;
            default:
                ArrayList<hx> emojipacks = tyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f35993i) {
                        SparseIntArray sparseIntArray = tyVar.S.f34606s;
                        char[] cArr = org.telegram.messenger.k6.f25015a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        tyVar.Q.C0();
                        tyVar.V(i11);
                        tyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        tyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
