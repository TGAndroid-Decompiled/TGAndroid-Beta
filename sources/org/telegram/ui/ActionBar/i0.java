package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i0 extends AnimatorListenerAdapter {
    public final int f29004a;
    public final ArrayList f29005b;
    public final r0 f29006c;

    public i0(r0 r0Var, ArrayList arrayList, int i7) {
        this.f29004a = i7;
        this.f29006c = r0Var;
        this.f29005b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29004a) {
            case 0:
                r0 r0Var = this.f29006c;
                r0Var.G.setAlpha(0.0f);
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f29005b;
                    if (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setAlpha(1.0f);
                        i7++;
                    } else {
                        r0Var.G.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f29006c.G.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29005b;
                    if (i10 < arrayList2.size()) {
                        ((View) arrayList2.get(i10)).setAlpha(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
