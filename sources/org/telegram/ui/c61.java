package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class c61 extends AnimatorListenerAdapter {
    public final int f35036a;
    public final boolean f35037b;
    public final j71 f35038c;

    public c61(j71 j71Var, boolean z10, int i10) {
        this.f35036a = i10;
        this.f35038c = j71Var;
        this.f35037b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f35036a) {
            case 0:
                j71 j71Var = this.f35038c;
                w51 w51Var = j71Var.f37675i0;
                int i12 = 8;
                boolean z10 = this.f35037b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w51Var.setVisibility(i10);
                g61 g61Var = j71Var.f37673h0;
                if (!z10) {
                    i12 = 0;
                }
                g61Var.setVisibility(i12);
                j71Var.E1 = null;
                if (!z10 && (arrayList2 = j71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = j71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    j71Var.f37690q0.E(false);
                }
                if (!z10 && (arrayList = j71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                j71 j71Var2 = this.f35038c;
                FrameLayout frameLayout = j71Var2.f37677j0;
                if (this.f35037b && j71Var2.f37675i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                j71Var2.H1 = null;
                return;
        }
    }
}
