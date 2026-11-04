package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a01 extends AnimatorListenerAdapter {
    public final int f43549a;
    public final boolean f43550b;
    public final g11 f43551c;

    public a01(g11 g11Var, boolean z10, int i3) {
        this.f43549a = i3;
        this.f43551c = g11Var;
        this.f43550b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f43549a) {
            case 0:
                g11 g11Var = this.f43551c;
                uz0 uz0Var = g11Var.f45458j0;
                int i11 = 8;
                boolean z10 = this.f43550b;
                if (z10) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                uz0Var.setVisibility(i3);
                e01 e01Var = g11Var.f45456i0;
                if (!z10) {
                    i11 = 0;
                }
                e01Var.setVisibility(i11);
                g11Var.G1 = null;
                if (!z10 && (arrayList2 = g11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g11Var.f45473r0.E(false);
                }
                if (!z10 && (arrayList = g11Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                g11 g11Var2 = this.f43551c;
                FrameLayout frameLayout = g11Var2.f45460k0;
                if (this.f43550b && g11Var2.f45458j0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                g11Var2.J1 = null;
                return;
        }
    }
}
