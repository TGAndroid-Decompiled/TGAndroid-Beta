package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class d61 extends AnimatorListenerAdapter {
    public final int f36915a;
    public final boolean f36916b;
    public final k71 f36917c;

    public d61(k71 k71Var, boolean z10, int i10) {
        this.f36915a = i10;
        this.f36917c = k71Var;
        this.f36916b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f36915a) {
            case 0:
                k71 k71Var = this.f36917c;
                x51 x51Var = k71Var.f39178i0;
                int i12 = 8;
                boolean z10 = this.f36916b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                x51Var.setVisibility(i10);
                h61 h61Var = k71Var.f39176h0;
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
                    k71Var.f39193q0.E(false);
                }
                if (!z10 && (arrayList = k71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                k71 k71Var2 = this.f36917c;
                FrameLayout frameLayout = k71Var2.f39180j0;
                if (this.f36916b && k71Var2.f39178i0.getVisibility() == 0) {
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
