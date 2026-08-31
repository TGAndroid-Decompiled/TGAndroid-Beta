package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class oe1 extends f2.a1 {
    public final int f39739a;
    public final mf1 f39740b;

    public oe1(mf1 mf1Var, int i10) {
        this.f39739a = i10;
        this.f39740b = mf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z4;
        mf1 mf1Var;
        og.e eVar;
        switch (this.f39739a) {
            case 0:
                mf1 mf1Var2 = this.f39740b;
                int L0 = mf1Var2.C.L0();
                if (L0 != -1) {
                    f2.m1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i12 = K.f5875a.getTop();
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
                    mf1Var2.G0((z4 || !mf1Var2.H) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f39740b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (mf1Var = this.f39740b).f39110c1) != null) {
                    eVar.f(i10, i11);
                    mf1Var.x0();
                    return;
                }
                return;
        }
    }
}
