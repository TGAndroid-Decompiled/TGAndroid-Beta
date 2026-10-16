package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class k61 extends AnimatorListenerAdapter {
    public final int f37313a;
    public final boolean f37314b;
    public final r71 f37315c;

    public k61(r71 r71Var, boolean z10, int i10) {
        this.f37313a = i10;
        this.f37315c = r71Var;
        this.f37314b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f37313a) {
            case 0:
                r71 r71Var = this.f37315c;
                e61 e61Var = r71Var.f39332i0;
                int i12 = 8;
                boolean z10 = this.f37314b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                e61Var.setVisibility(i10);
                o61 o61Var = r71Var.f39330h0;
                if (!z10) {
                    i12 = 0;
                }
                o61Var.setVisibility(i12);
                r71Var.E1 = null;
                if (!z10 && (arrayList2 = r71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r71Var.f39347q0.E(false);
                }
                if (!z10 && (arrayList = r71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                r71 r71Var2 = this.f37315c;
                FrameLayout frameLayout = r71Var2.f39334j0;
                if (this.f37314b && r71Var2.f39332i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                r71Var2.H1 = null;
                return;
        }
    }
}
