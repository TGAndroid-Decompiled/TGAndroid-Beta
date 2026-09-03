package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class p51 extends AnimatorListenerAdapter {
    public final int f39896a;
    public final boolean f39897b;
    public final w61 f39898c;

    public p51(w61 w61Var, boolean z4, int i10) {
        this.f39896a = i10;
        this.f39898c = w61Var;
        this.f39897b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f39896a) {
            case 0:
                w61 w61Var = this.f39898c;
                i51 i51Var = w61Var.f42317f0;
                int i12 = 8;
                boolean z4 = this.f39897b;
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i51Var.setVisibility(i10);
                t51 t51Var = w61Var.f42314e0;
                if (!z4) {
                    i12 = 0;
                }
                t51Var.setVisibility(i12);
                w61Var.B1 = null;
                if (!z4 && (arrayList2 = w61Var.f42357x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = w61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    w61Var.f42332n0.E(false);
                }
                if (!z4 && (arrayList = w61Var.f42360y1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                w61 w61Var2 = this.f39898c;
                FrameLayout frameLayout = w61Var2.f42319g0;
                if (this.f39897b && w61Var2.f42317f0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                w61Var2.E1 = null;
                return;
        }
    }
}
