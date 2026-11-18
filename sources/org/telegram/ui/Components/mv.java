package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class mv implements Runnable {
    public final int f37630a;
    public final ry f37631b;

    public mv(ry ryVar, int i7) {
        this.f37630a = i7;
        this.f37631b = ryVar;
    }

    @Override
    public final void run() {
        int i7 = this.f37630a;
        ry ryVar = this.f37631b;
        switch (i7) {
            case 0:
                ryVar.Y(false);
                ryVar.E();
                return;
            case 1:
                bx bxVar = ryVar.S;
                if (bxVar != null) {
                    bxVar.F(true);
                    return;
                }
                return;
            case 2:
                rx rxVar = ryVar.f39397u1;
                if (rxVar != null) {
                    rxVar.t(ryVar.S.h);
                    return;
                }
                return;
            case 3:
                rx rxVar2 = ryVar.f39397u1;
                if (rxVar2 != null) {
                    rxVar2.q();
                    return;
                }
                return;
            case 4:
                ryVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.j10.i(ryVar.f39345d1).e());
                ryVar.Z1.presentFragment(new org.telegram.ui.bn(bundle));
                return;
            default:
                ArrayList<fx> emojipacks = ryVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f35177i) {
                        SparseIntArray sparseIntArray = ryVar.S.f33806s;
                        char[] cArr = org.telegram.messenger.k6.f24987a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        ryVar.Q.C0();
                        ryVar.V(i11);
                        ryVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        ryVar.n(0, null);
                    }
                }
                return;
        }
    }
}
