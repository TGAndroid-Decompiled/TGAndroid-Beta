package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class mv implements Runnable {
    public final int f37548a;
    public final qy f37549b;

    public mv(qy qyVar, int i7) {
        this.f37548a = i7;
        this.f37549b = qyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f37548a;
        qy qyVar = this.f37549b;
        switch (i7) {
            case 0:
                qyVar.Y(false);
                qyVar.D();
                return;
            case 1:
                ax axVar = qyVar.S;
                if (axVar != null) {
                    axVar.F(true);
                    return;
                }
                return;
            case 2:
                qx qxVar = qyVar.f39099u1;
                if (qxVar != null) {
                    qxVar.t(qyVar.S.h);
                    return;
                }
                return;
            case 3:
                qx qxVar2 = qyVar.f39099u1;
                if (qxVar2 != null) {
                    qxVar2.q();
                    return;
                }
                return;
            case 4:
                qyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.i10.i(qyVar.f39047d1).e());
                qyVar.Z1.presentFragment(new org.telegram.ui.bn(bundle));
                return;
            default:
                ArrayList<ex> emojipacks = qyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f34861i) {
                        SparseIntArray sparseIntArray = qyVar.S.f33571s;
                        char[] cArr = org.telegram.messenger.k6.f25086a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        qyVar.Q.C0();
                        qyVar.V(i11);
                        qyVar.F(i11, org.telegram.messenger.g0.L(-9.0f));
                        qyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
