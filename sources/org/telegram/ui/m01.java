package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m01 extends AnimatorListenerAdapter {
    public final int f47716a;
    public final boolean f47717b;
    public final s11 f47718c;

    public m01(s11 s11Var, boolean z9, int i7) {
        this.f47716a = i7;
        this.f47718c = s11Var;
        this.f47717b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f47716a) {
            case 0:
                s11 s11Var = this.f47718c;
                g01 g01Var = s11Var.f49682i0;
                int i11 = 8;
                boolean z9 = this.f47717b;
                if (z9) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                g01Var.setVisibility(i7);
                q01 q01Var = s11Var.f49680h0;
                if (!z9) {
                    i11 = 0;
                }
                q01Var.setVisibility(i11);
                s11Var.F1 = null;
                if (!z9 && (arrayList2 = s11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = s11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    s11Var.f49696q0.E(false);
                }
                if (!z9 && (arrayList = s11Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                s11 s11Var2 = this.f47718c;
                FrameLayout frameLayout = s11Var2.f49684j0;
                if (this.f47717b && s11Var2.f49682i0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                s11Var2.I1 = null;
                return;
        }
    }
}
