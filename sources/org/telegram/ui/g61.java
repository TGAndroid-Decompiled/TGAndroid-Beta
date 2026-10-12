package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class g61 extends AnimatorListenerAdapter {
    public final int f37956a;
    public final boolean f37957b;
    public final n71 f37958c;

    public g61(n71 n71Var, boolean z10, int i10) {
        this.f37956a = i10;
        this.f37958c = n71Var;
        this.f37957b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f37956a) {
            case 0:
                n71 n71Var = this.f37958c;
                a61 a61Var = n71Var.f40277i0;
                int i12 = 8;
                boolean z10 = this.f37957b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                a61Var.setVisibility(i10);
                k61 k61Var = n71Var.f40275h0;
                if (!z10) {
                    i12 = 0;
                }
                k61Var.setVisibility(i12);
                n71Var.E1 = null;
                if (!z10 && (arrayList2 = n71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = n71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n71Var.f40292q0.E(false);
                }
                if (!z10 && (arrayList = n71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                n71 n71Var2 = this.f37958c;
                FrameLayout frameLayout = n71Var2.f40279j0;
                if (this.f37957b && n71Var2.f40277i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                n71Var2.H1 = null;
                return;
        }
    }
}
