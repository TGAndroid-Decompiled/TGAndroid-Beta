package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class bv implements Runnable {
    public final int f32306a;
    public final gy f32307b;

    public bv(gy gyVar, int i7) {
        this.f32306a = i7;
        this.f32307b = gyVar;
    }

    @Override
    public final void run() {
        int i7 = this.f32306a;
        gy gyVar = this.f32307b;
        switch (i7) {
            case 0:
                gyVar.X(false);
                gyVar.D();
                return;
            case 1:
                pw pwVar = gyVar.R;
                if (pwVar != null) {
                    pwVar.F(true);
                    return;
                }
                return;
            case 2:
                hx hxVar = gyVar.f34128t1;
                if (hxVar != null) {
                    hxVar.t(gyVar.R.h);
                    return;
                }
                return;
            case 3:
                hx hxVar2 = gyVar.f34128t1;
                if (hxVar2 != null) {
                    hxVar2.q();
                    return;
                }
                return;
            case 4:
                gyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.p10.i(gyVar.f34076c1).e());
                gyVar.Y1.presentFragment(new org.telegram.ui.an(bundle));
                return;
            default:
                ArrayList<tw> emojipacks = gyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f38425i) {
                        SparseIntArray sparseIntArray = gyVar.R.f37187s;
                        char[] cArr = org.telegram.messenger.j6.f23475a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        gyVar.P.C0();
                        gyVar.U(i11);
                        gyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        gyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
