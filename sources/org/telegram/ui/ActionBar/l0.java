package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class l0 extends AnimatorListenerAdapter {
    public final int f21601a;
    public final ArrayList f21602b;
    public final u0 f21603c;

    public l0(u0 u0Var, ArrayList arrayList, int i10) {
        this.f21601a = i10;
        this.f21603c = u0Var;
        this.f21602b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21601a) {
            case 0:
                u0 u0Var = this.f21603c;
                u0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f21602b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        u0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f21603c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f21602b;
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
