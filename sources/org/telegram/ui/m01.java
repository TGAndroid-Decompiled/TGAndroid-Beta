package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m01 extends AnimatorListenerAdapter {
    public final int f49736a;
    public final boolean f49737b;
    public final s11 f49738c;

    public m01(s11 s11Var, boolean z10, int i7) {
        this.f49736a = i7;
        this.f49738c = s11Var;
        this.f49737b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f49736a) {
            case 0:
                s11 s11Var = this.f49738c;
                g01 g01Var = s11Var.f51846j0;
                int i11 = 8;
                boolean z10 = this.f49737b;
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                g01Var.setVisibility(i7);
                q01 q01Var = s11Var.f51844i0;
                if (!z10) {
                    i11 = 0;
                }
                q01Var.setVisibility(i11);
                s11Var.G1 = null;
                if (!z10 && (arrayList2 = s11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = s11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    s11Var.f51861r0.E(false);
                }
                if (!z10 && (arrayList = s11Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                s11 s11Var2 = this.f49738c;
                FrameLayout frameLayout = s11Var2.f51848k0;
                if (this.f49737b && s11Var2.f51846j0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                s11Var2.J1 = null;
                return;
        }
    }
}
