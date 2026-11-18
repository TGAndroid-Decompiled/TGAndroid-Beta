package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class l01 extends AnimatorListenerAdapter {
    public final int f49394a;
    public final boolean f49395b;
    public final r11 f49396c;

    public l01(r11 r11Var, boolean z10, int i7) {
        this.f49394a = i7;
        this.f49396c = r11Var;
        this.f49395b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f49394a) {
            case 0:
                r11 r11Var = this.f49396c;
                f01 f01Var = r11Var.f51440j0;
                int i11 = 8;
                boolean z10 = this.f49395b;
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                f01Var.setVisibility(i7);
                p01 p01Var = r11Var.f51438i0;
                if (!z10) {
                    i11 = 0;
                }
                p01Var.setVisibility(i11);
                r11Var.G1 = null;
                if (!z10 && (arrayList2 = r11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r11Var.f51455r0.E(false);
                }
                if (!z10 && (arrayList = r11Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                r11 r11Var2 = this.f49396c;
                FrameLayout frameLayout = r11Var2.f51442k0;
                if (this.f49395b && r11Var2.f51440j0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                r11Var2.J1 = null;
                return;
        }
    }
}
