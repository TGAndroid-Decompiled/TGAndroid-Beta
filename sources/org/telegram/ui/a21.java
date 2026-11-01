package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a21 extends AnimatorListenerAdapter {
    public final int f35545a;
    public final boolean f35546b;
    public final g31 f35547c;

    public a21(g31 g31Var, boolean z10, int i10) {
        this.f35545a = i10;
        this.f35547c = g31Var;
        this.f35546b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f35545a) {
            case 0:
                g31 g31Var = this.f35547c;
                t11 t11Var = g31Var.f37307i0;
                int i12 = 8;
                boolean z10 = this.f35546b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                t11Var.setVisibility(i10);
                e21 e21Var = g31Var.f37305h0;
                if (!z10) {
                    i12 = 0;
                }
                e21Var.setVisibility(i12);
                g31Var.F1 = null;
                if (!z10 && (arrayList2 = g31Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g31Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g31Var.f37322q0.E(false);
                }
                if (!z10 && (arrayList = g31Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                g31 g31Var2 = this.f35547c;
                FrameLayout frameLayout = g31Var2.f37309j0;
                if (this.f35546b && g31Var2.f37307i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                g31Var2.I1 = null;
                return;
        }
    }
}
