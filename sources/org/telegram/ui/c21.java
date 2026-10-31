package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class c21 extends AnimatorListenerAdapter {
    public final int f36376a;
    public final boolean f36377b;
    public final i31 f36378c;

    public c21(i31 i31Var, boolean z10, int i10) {
        this.f36376a = i10;
        this.f36378c = i31Var;
        this.f36377b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f36376a) {
            case 0:
                i31 i31Var = this.f36378c;
                v11 v11Var = i31Var.f38131i0;
                int i12 = 8;
                boolean z10 = this.f36377b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                v11Var.setVisibility(i10);
                g21 g21Var = i31Var.f38129h0;
                if (!z10) {
                    i12 = 0;
                }
                g21Var.setVisibility(i12);
                i31Var.F1 = null;
                if (!z10 && (arrayList2 = i31Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = i31Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    i31Var.f38146q0.E(false);
                }
                if (!z10 && (arrayList = i31Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                i31 i31Var2 = this.f36378c;
                FrameLayout frameLayout = i31Var2.f38133j0;
                if (this.f36377b && i31Var2.f38131i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                i31Var2.I1 = null;
                return;
        }
    }
}
