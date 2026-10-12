package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class k61 extends AnimatorListenerAdapter {
    public final int f37592a;
    public final boolean f37593b;
    public final r71 f37594c;

    public k61(r71 r71Var, boolean z10, int i10) {
        this.f37592a = i10;
        this.f37594c = r71Var;
        this.f37593b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f37592a) {
            case 0:
                r71 r71Var = this.f37594c;
                e61 e61Var = r71Var.f39639i0;
                int i12 = 8;
                boolean z10 = this.f37593b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                e61Var.setVisibility(i10);
                o61 o61Var = r71Var.f39637h0;
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
                    r71Var.f39654q0.E(false);
                }
                if (!z10 && (arrayList = r71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                r71 r71Var2 = this.f37594c;
                FrameLayout frameLayout = r71Var2.f39641j0;
                if (this.f37593b && r71Var2.f39639i0.getVisibility() == 0) {
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
