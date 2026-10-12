package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class l0 extends AnimatorListenerAdapter {
    public final int f20482a;
    public final ArrayList f20483b;
    public final u0 f20484c;

    public l0(u0 u0Var, ArrayList arrayList, int i10) {
        this.f20482a = i10;
        this.f20484c = u0Var;
        this.f20483b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20482a) {
            case 0:
                u0 u0Var = this.f20484c;
                u0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f20483b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        u0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f20484c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f20483b;
                    if (i11 < arrayList2.size()) {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
