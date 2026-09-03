package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class p51 extends AnimatorListenerAdapter {
    public final int f36961a;
    public final boolean f36962b;
    public final x61 f36963c;

    public p51(x61 x61Var, boolean z4, int i10) {
        this.f36961a = i10;
        this.f36963c = x61Var;
        this.f36962b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f36961a) {
            case 0:
                x61 x61Var = this.f36963c;
                i51 i51Var = x61Var.f39865f0;
                int i12 = 8;
                boolean z4 = this.f36962b;
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i51Var.setVisibility(i10);
                t51 t51Var = x61Var.f39862e0;
                if (!z4) {
                    i12 = 0;
                }
                t51Var.setVisibility(i12);
                x61Var.B1 = null;
                if (!z4 && (arrayList2 = x61Var.f39905x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = x61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    x61Var.f39880n0.E(false);
                }
                if (!z4 && (arrayList = x61Var.f39908y1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                x61 x61Var2 = this.f36963c;
                FrameLayout frameLayout = x61Var2.f39867g0;
                if (this.f36962b && x61Var2.f39865f0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                x61Var2.E1 = null;
                return;
        }
    }
}
