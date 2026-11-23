package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class k01 extends AnimatorListenerAdapter {
    public final int f49272a;
    public final boolean f49273b;
    public final q11 f49274c;

    public k01(q11 q11Var, boolean z10, int i7) {
        this.f49272a = i7;
        this.f49274c = q11Var;
        this.f49273b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f49272a) {
            case 0:
                q11 q11Var = this.f49274c;
                e01 e01Var = q11Var.f51249j0;
                int i11 = 8;
                boolean z10 = this.f49273b;
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                e01Var.setVisibility(i7);
                o01 o01Var = q11Var.f51247i0;
                if (!z10) {
                    i11 = 0;
                }
                o01Var.setVisibility(i11);
                q11Var.G1 = null;
                if (!z10 && (arrayList2 = q11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q11Var.f51264r0.E(false);
                }
                if (!z10 && (arrayList = q11Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                q11 q11Var2 = this.f49274c;
                FrameLayout frameLayout = q11Var2.f51251k0;
                if (this.f49273b && q11Var2.f51249j0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                q11Var2.J1 = null;
                return;
        }
    }
}
