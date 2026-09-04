package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class c61 extends AnimatorListenerAdapter {
    public final int f35009a;
    public final boolean f35010b;
    public final j71 f35011c;

    public c61(j71 j71Var, boolean z10, int i10) {
        this.f35009a = i10;
        this.f35011c = j71Var;
        this.f35010b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f35009a) {
            case 0:
                j71 j71Var = this.f35011c;
                w51 w51Var = j71Var.f37648i0;
                int i12 = 8;
                boolean z10 = this.f35010b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w51Var.setVisibility(i10);
                g61 g61Var = j71Var.f37646h0;
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
                    j71Var.f37663q0.E(false);
                }
                if (!z10 && (arrayList = j71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                j71 j71Var2 = this.f35011c;
                FrameLayout frameLayout = j71Var2.f37650j0;
                if (this.f35010b && j71Var2.f37648i0.getVisibility() == 0) {
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
