package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class k01 extends AnimatorListenerAdapter {
    public final int f47072a;
    public final boolean f47073b;
    public final q11 f47074c;

    public k01(q11 q11Var, boolean z9, int i7) {
        this.f47072a = i7;
        this.f47074c = q11Var;
        this.f47073b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f47072a) {
            case 0:
                q11 q11Var = this.f47074c;
                e01 e01Var = q11Var.f49036i0;
                int i11 = 8;
                boolean z9 = this.f47073b;
                if (z9) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                e01Var.setVisibility(i7);
                o01 o01Var = q11Var.f49034h0;
                if (!z9) {
                    i11 = 0;
                }
                o01Var.setVisibility(i11);
                q11Var.F1 = null;
                if (!z9 && (arrayList2 = q11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q11Var.f49050q0.E(false);
                }
                if (!z9 && (arrayList = q11Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                q11 q11Var2 = this.f47074c;
                FrameLayout frameLayout = q11Var2.f49038j0;
                if (this.f47073b && q11Var2.f49036i0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                q11Var2.I1 = null;
                return;
        }
    }
}
