package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class q41 extends AnimatorListenerAdapter {
    public final int f40364a;
    public final boolean f40365b;
    public final x51 f40366c;

    public q41(x51 x51Var, boolean z10, int i10) {
        this.f40364a = i10;
        this.f40366c = x51Var;
        this.f40365b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f40364a) {
            case 0:
                x51 x51Var = this.f40366c;
                k41 k41Var = x51Var.f43057i0;
                int i12 = 8;
                boolean z10 = this.f40365b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k41Var.setVisibility(i10);
                u41 u41Var = x51Var.f43055h0;
                if (!z10) {
                    i12 = 0;
                }
                u41Var.setVisibility(i12);
                x51Var.E1 = null;
                if (!z10 && (arrayList2 = x51Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = x51Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    x51Var.f43072q0.E(false);
                }
                if (!z10 && (arrayList = x51Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                x51 x51Var2 = this.f40366c;
                FrameLayout frameLayout = x51Var2.f43059j0;
                if (this.f40365b && x51Var2.f43057i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                x51Var2.H1 = null;
                return;
        }
    }
}
