package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class hv implements Runnable {
    public final int f35350a;
    public final ly f35351b;

    public hv(ly lyVar, int i7) {
        this.f35350a = i7;
        this.f35351b = lyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f35350a;
        ly lyVar = this.f35351b;
        switch (i7) {
            case 0:
                lyVar.Y(false);
                lyVar.D();
                return;
            case 1:
                vw vwVar = lyVar.S;
                if (vwVar != null) {
                    vwVar.F(true);
                    return;
                }
                return;
            case 2:
                mx mxVar = lyVar.f36993u1;
                if (mxVar != null) {
                    mxVar.t(lyVar.S.h);
                    return;
                }
                return;
            case 3:
                mx mxVar2 = lyVar.f36993u1;
                if (mxVar2 != null) {
                    mxVar2.q();
                    return;
                }
                return;
            case 4:
                lyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.m10.i(lyVar.f36941d1).e());
                lyVar.Z1.presentFragment(new org.telegram.ui.an(bundle));
                return;
            default:
                ArrayList<zw> emojipacks = lyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f42436i) {
                        SparseIntArray sparseIntArray = lyVar.S.f41167s;
                        char[] cArr = org.telegram.messenger.k6.f24639a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        lyVar.Q.C0();
                        lyVar.V(i11);
                        lyVar.H(i11, org.telegram.messenger.g0.L(-9.0f));
                        lyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
