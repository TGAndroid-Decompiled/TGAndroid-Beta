package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class av implements Runnable {
    public final int f31998a;
    public final ey f31999b;

    public av(ey eyVar, int i3) {
        this.f31998a = i3;
        this.f31999b = eyVar;
    }

    @Override
    public final void run() {
        int i3 = this.f31998a;
        ey eyVar = this.f31999b;
        switch (i3) {
            case 0:
                eyVar.X(false);
                eyVar.D();
                return;
            case 1:
                ow owVar = eyVar.S;
                if (owVar != null) {
                    owVar.F(true);
                    return;
                }
                return;
            case 2:
                fx fxVar = eyVar.f33582u1;
                if (fxVar != null) {
                    fxVar.t(eyVar.S.h);
                    return;
                }
                return;
            case 3:
                fx fxVar2 = eyVar.f33582u1;
                if (fxVar2 != null) {
                    fxVar2.q();
                    return;
                }
                return;
            case 4:
                eyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.h10.i(eyVar.f33529d1).e());
                eyVar.Z1.presentFragment(new org.telegram.ui.wm(bundle));
                return;
            default:
                ArrayList<sw> emojipacks = eyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f38130i) {
                        SparseIntArray sparseIntArray = eyVar.S.f36954s;
                        char[] cArr = org.telegram.messenger.j6.f23640a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        eyVar.Q.C0();
                        eyVar.U(i11);
                        eyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        eyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
