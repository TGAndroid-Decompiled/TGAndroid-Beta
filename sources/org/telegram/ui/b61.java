package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class b61 extends AnimatorListenerAdapter {
    public final int f32061a;
    public final boolean f32062b;
    public final i71 f32063c;

    public b61(i71 i71Var, boolean z10, int i10) {
        this.f32061a = i10;
        this.f32063c = i71Var;
        this.f32062b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f32061a) {
            case 0:
                i71 i71Var = this.f32063c;
                v51 v51Var = i71Var.f34468i0;
                int i12 = 8;
                boolean z10 = this.f32062b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                v51Var.setVisibility(i10);
                f61 f61Var = i71Var.f34466h0;
                if (!z10) {
                    i12 = 0;
                }
                f61Var.setVisibility(i12);
                i71Var.E1 = null;
                if (!z10 && (arrayList2 = i71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = i71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    i71Var.f34483q0.E(false);
                }
                if (!z10 && (arrayList = i71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                i71 i71Var2 = this.f32063c;
                FrameLayout frameLayout = i71Var2.f34470j0;
                if (this.f32062b && i71Var2.f34468i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                i71Var2.H1 = null;
                return;
        }
    }
}
