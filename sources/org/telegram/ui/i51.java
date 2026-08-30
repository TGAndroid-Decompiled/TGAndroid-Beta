package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class i51 extends AnimatorListenerAdapter {
    public final int f35023a;
    public final boolean f35024b;
    public final q61 f35025c;

    public i51(q61 q61Var, boolean z4, int i10) {
        this.f35023a = i10;
        this.f35025c = q61Var;
        this.f35024b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f35023a) {
            case 0:
                q61 q61Var = this.f35025c;
                b51 b51Var = q61Var.f37608f0;
                int i12 = 8;
                boolean z4 = this.f35024b;
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                b51Var.setVisibility(i10);
                m51 m51Var = q61Var.f37605e0;
                if (!z4) {
                    i12 = 0;
                }
                m51Var.setVisibility(i12);
                q61Var.B1 = null;
                if (!z4 && (arrayList2 = q61Var.f37648x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q61Var.f37623n0.E(false);
                }
                if (!z4 && (arrayList = q61Var.f37651y1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                q61 q61Var2 = this.f35025c;
                FrameLayout frameLayout = q61Var2.f37610g0;
                if (this.f35024b && q61Var2.f37608f0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                q61Var2.E1 = null;
                return;
        }
    }
}
