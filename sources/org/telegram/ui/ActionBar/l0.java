package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class l0 extends AnimatorListenerAdapter {
    public final int f19595a;
    public final ArrayList f19596b;
    public final u0 f19597c;

    public l0(u0 u0Var, ArrayList arrayList, int i10) {
        this.f19595a = i10;
        this.f19597c = u0Var;
        this.f19596b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19595a) {
            case 0:
                u0 u0Var = this.f19597c;
                u0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f19596b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        u0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f19597c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f19596b;
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
