package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class k51 extends AnimatorListenerAdapter {
    public final int f38282a;
    public final boolean f38283b;
    public final r61 f38284c;

    public k51(r61 r61Var, boolean z4, int i10) {
        this.f38282a = i10;
        this.f38284c = r61Var;
        this.f38283b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f38282a) {
            case 0:
                r61 r61Var = this.f38284c;
                d51 d51Var = r61Var.f40794f0;
                int i12 = 8;
                boolean z4 = this.f38283b;
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                d51Var.setVisibility(i10);
                o51 o51Var = r61Var.f40791e0;
                if (!z4) {
                    i12 = 0;
                }
                o51Var.setVisibility(i12);
                r61Var.B1 = null;
                if (!z4 && (arrayList2 = r61Var.f40834x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r61Var.f40809n0.E(false);
                }
                if (!z4 && (arrayList = r61Var.f40837y1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                r61 r61Var2 = this.f38284c;
                FrameLayout frameLayout = r61Var2.f40796g0;
                if (this.f38283b && r61Var2.f40794f0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                r61Var2.E1 = null;
                return;
        }
    }
}
