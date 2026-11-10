package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class n01 extends AnimatorListenerAdapter {
    public final int f48089a;
    public final boolean f48090b;
    public final t11 f48091c;

    public n01(t11 t11Var, boolean z9, int i7) {
        this.f48089a = i7;
        this.f48091c = t11Var;
        this.f48090b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f48089a) {
            case 0:
                t11 t11Var = this.f48091c;
                h01 h01Var = t11Var.f50038i0;
                int i11 = 8;
                boolean z9 = this.f48090b;
                if (z9) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                h01Var.setVisibility(i7);
                r01 r01Var = t11Var.f50036h0;
                if (!z9) {
                    i11 = 0;
                }
                r01Var.setVisibility(i11);
                t11Var.F1 = null;
                if (!z9 && (arrayList2 = t11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = t11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    t11Var.f50052q0.E(false);
                }
                if (!z9 && (arrayList = t11Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                t11 t11Var2 = this.f48091c;
                FrameLayout frameLayout = t11Var2.f50040j0;
                if (this.f48090b && t11Var2.f50038i0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                t11Var2.I1 = null;
                return;
        }
    }
}
