package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a61 extends AnimatorListenerAdapter {
    public final int f31686a;
    public final boolean f31687b;
    public final h71 f31688c;

    public a61(h71 h71Var, boolean z10, int i10) {
        this.f31686a = i10;
        this.f31688c = h71Var;
        this.f31687b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f31686a) {
            case 0:
                h71 h71Var = this.f31688c;
                u51 u51Var = h71Var.f34134i0;
                int i12 = 8;
                boolean z10 = this.f31687b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                u51Var.setVisibility(i10);
                e61 e61Var = h71Var.f34132h0;
                if (!z10) {
                    i12 = 0;
                }
                e61Var.setVisibility(i12);
                h71Var.E1 = null;
                if (!z10 && (arrayList2 = h71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = h71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    h71Var.f34149q0.E(false);
                }
                if (!z10 && (arrayList = h71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                h71 h71Var2 = this.f31688c;
                FrameLayout frameLayout = h71Var2.f34136j0;
                if (this.f31687b && h71Var2.f34134i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                h71Var2.H1 = null;
                return;
        }
    }
}
