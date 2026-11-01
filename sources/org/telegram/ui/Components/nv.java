package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class nv implements Runnable {
    public final int f28966a;
    public final vy f28967b;

    public nv(vy vyVar, int i10) {
        this.f28966a = i10;
        this.f28967b = vyVar;
    }

    @Override
    public final void run() {
        int i10 = this.f28966a;
        vy vyVar = this.f28967b;
        switch (i10) {
            case 0:
                vyVar.Y(false);
                vyVar.F();
                return;
            case 1:
                ex exVar = vyVar.R;
                if (exVar != null) {
                    exVar.F(true);
                    return;
                }
                return;
            case 2:
                vx vxVar = vyVar.f31996t1;
                if (vxVar != null) {
                    vxVar.t(vyVar.R.h);
                    return;
                }
                return;
            case 3:
                vx vxVar2 = vyVar.f31996t1;
                if (vxVar2 != null) {
                    vxVar2.q();
                    return;
                }
                return;
            case 4:
                vyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.e20.i(vyVar.f31943c1).e());
                vyVar.Y1.presentFragment(new org.telegram.ui.un(bundle));
                return;
            default:
                ArrayList<ix> emojipacks = vyVar.getEmojipacks();
                for (int i11 = 0; i11 < emojipacks.size(); i11++) {
                    if (emojipacks.get(i11).f27197i) {
                        SparseIntArray sparseIntArray = vyVar.R.f25960s;
                        char[] cArr = org.telegram.messenger.l6.f16891a;
                        int i12 = sparseIntArray.get(i11 + 8);
                        vyVar.P.C0();
                        vyVar.V(i12);
                        vyVar.H(i12, org.telegram.messenger.i0.L(-9.0f));
                        vyVar.n(0, null);
                    }
                }
                return;
        }
    }
}
