package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class cv implements Runnable {
    public final int f32763a;
    public final hy f32764b;

    public cv(hy hyVar, int i7) {
        this.f32763a = i7;
        this.f32764b = hyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f32763a;
        hy hyVar = this.f32764b;
        switch (i7) {
            case 0:
                hyVar.X(false);
                hyVar.D();
                return;
            case 1:
                qw qwVar = hyVar.R;
                if (qwVar != null) {
                    qwVar.F(true);
                    return;
                }
                return;
            case 2:
                ix ixVar = hyVar.f34467t1;
                if (ixVar != null) {
                    ixVar.t(hyVar.R.h);
                    return;
                }
                return;
            case 3:
                ix ixVar2 = hyVar.f34467t1;
                if (ixVar2 != null) {
                    ixVar2.q();
                    return;
                }
                return;
            case 4:
                hyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.p10.i(hyVar.f34415c1).e());
                hyVar.Y1.presentFragment(new org.telegram.ui.cn(bundle));
                return;
            default:
                ArrayList<uw> emojipacks = hyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f38815i) {
                        SparseIntArray sparseIntArray = hyVar.R.f37483s;
                        char[] cArr = org.telegram.messenger.j6.f23501a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        hyVar.P.C0();
                        hyVar.U(i11);
                        hyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        hyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
