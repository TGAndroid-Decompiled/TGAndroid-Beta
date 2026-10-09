package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class d61 extends AnimatorListenerAdapter {
    public final int f36869a;
    public final boolean f36870b;
    public final k71 f36871c;

    public d61(k71 k71Var, boolean z10, int i10) {
        this.f36869a = i10;
        this.f36871c = k71Var;
        this.f36870b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f36869a) {
            case 0:
                k71 k71Var = this.f36871c;
                x51 x51Var = k71Var.f39132i0;
                int i12 = 8;
                boolean z10 = this.f36870b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                x51Var.setVisibility(i10);
                h61 h61Var = k71Var.f39130h0;
                if (!z10) {
                    i12 = 0;
                }
                h61Var.setVisibility(i12);
                k71Var.E1 = null;
                if (!z10 && (arrayList2 = k71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = k71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    k71Var.f39147q0.E(false);
                }
                if (!z10 && (arrayList = k71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                k71 k71Var2 = this.f36871c;
                FrameLayout frameLayout = k71Var2.f39134j0;
                if (this.f36870b && k71Var2.f39132i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                k71Var2.H1 = null;
                return;
        }
    }
}
