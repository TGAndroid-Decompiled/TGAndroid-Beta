package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class j0 extends AnimatorListenerAdapter {
    public final int f20435a;
    public final ArrayList f20436b;
    public final t0 f20437c;

    public j0(t0 t0Var, ArrayList arrayList, int i10) {
        this.f20435a = i10;
        this.f20437c = t0Var;
        this.f20436b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20435a) {
            case 0:
                t0 t0Var = this.f20437c;
                t0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f20436b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        t0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f20437c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f20436b;
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
