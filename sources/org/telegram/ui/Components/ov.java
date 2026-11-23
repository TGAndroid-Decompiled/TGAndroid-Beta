package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class ov implements Runnable {
    public final int f38335a;
    public final ty f38336b;

    public ov(ty tyVar, int i7) {
        this.f38335a = i7;
        this.f38336b = tyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f38335a;
        ty tyVar = this.f38336b;
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
                tx txVar = tyVar.f40126u1;
                if (txVar != null) {
                    txVar.t(tyVar.S.h);
                    return;
                }
                return;
            case 3:
                tx txVar2 = tyVar.f40126u1;
                if (txVar2 != null) {
                    txVar2.q();
                    return;
                }
                return;
            case 4:
                tyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.k10.i(tyVar.f40074d1).e());
                tyVar.Z1.presentFragment(new org.telegram.ui.bn(bundle));
                return;
            default:
                ArrayList<hx> emojipacks = tyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f35941i) {
                        SparseIntArray sparseIntArray = tyVar.S.f34591s;
                        char[] cArr = org.telegram.messenger.k6.f24981a;
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
