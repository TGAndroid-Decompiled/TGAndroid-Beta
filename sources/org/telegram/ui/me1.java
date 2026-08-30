package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class me1 extends f2.z0 {
    public final int f36281a;
    public final kf1 f36282b;

    public me1(kf1 kf1Var, int i10) {
        this.f36281a = i10;
        this.f36282b = kf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z4;
        kf1 kf1Var;
        ng.e eVar;
        switch (this.f36281a) {
            case 0:
                kf1 kf1Var2 = this.f36282b;
                int L0 = kf1Var2.C.L0();
                if (L0 != -1) {
                    f2.l1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i12 = K.f5785a.getTop();
                    } else {
                        i12 = 0;
                    }
                    if (L0 == 0) {
                        int i13 = 0 - i12;
                        if (i12 < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Math.abs(i13);
                    } else if (L0 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    kf1Var2.G0((z4 || !kf1Var2.H) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f36282b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (kf1Var = this.f36282b).f35676c1) != null) {
                    eVar.f(i10, i11);
                    kf1Var.x0();
                    return;
                }
                return;
        }
    }
}
