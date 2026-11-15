package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class h01 extends AnimatorListenerAdapter {
    public final int f47568a;
    public final boolean f47569b;
    public final n11 f47570c;

    public h01(n11 n11Var, boolean z10, int i7) {
        this.f47568a = i7;
        this.f47570c = n11Var;
        this.f47569b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f47568a) {
            case 0:
                n11 n11Var = this.f47570c;
                b01 b01Var = n11Var.f49388j0;
                int i11 = 8;
                boolean z10 = this.f47569b;
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                b01Var.setVisibility(i7);
                l01 l01Var = n11Var.f49386i0;
                if (!z10) {
                    i11 = 0;
                }
                l01Var.setVisibility(i11);
                n11Var.G1 = null;
                if (!z10 && (arrayList2 = n11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = n11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n11Var.f49403r0.E(false);
                }
                if (!z10 && (arrayList = n11Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                n11 n11Var2 = this.f47570c;
                FrameLayout frameLayout = n11Var2.f49390k0;
                if (this.f47569b && n11Var2.f49388j0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                n11Var2.J1 = null;
                return;
        }
    }
}
