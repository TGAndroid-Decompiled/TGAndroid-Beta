package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class e61 extends AnimatorListenerAdapter {
    public final int f32074a;
    public final boolean f32075b;
    public final l71 f32076c;

    public e61(l71 l71Var, boolean z10, int i10) {
        this.f32074a = i10;
        this.f32076c = l71Var;
        this.f32075b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f32074a) {
            case 0:
                l71 l71Var = this.f32076c;
                y51 y51Var = l71Var.f34572i0;
                int i12 = 8;
                boolean z10 = this.f32075b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                y51Var.setVisibility(i10);
                i61 i61Var = l71Var.f34570h0;
                if (!z10) {
                    i12 = 0;
                }
                i61Var.setVisibility(i12);
                l71Var.E1 = null;
                if (!z10 && (arrayList2 = l71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = l71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    l71Var.f34587q0.E(false);
                }
                if (!z10 && (arrayList = l71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                l71 l71Var2 = this.f32076c;
                FrameLayout frameLayout = l71Var2.f34574j0;
                if (this.f32075b && l71Var2.f34572i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                l71Var2.H1 = null;
                return;
        }
    }
}
