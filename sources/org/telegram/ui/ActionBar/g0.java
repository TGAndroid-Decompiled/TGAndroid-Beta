package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27512a;
    public final ArrayList f27513b;
    public final q0 f27514c;

    public g0(q0 q0Var, ArrayList arrayList, int i3) {
        this.f27512a = i3;
        this.f27514c = q0Var;
        this.f27513b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27512a) {
            case 0:
                q0 q0Var = this.f27514c;
                q0Var.G.setAlpha(0.0f);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f27513b;
                    if (i3 < arrayList.size()) {
                        ((View) arrayList.get(i3)).setAlpha(1.0f);
                        i3++;
                    } else {
                        q0Var.G.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f27514c.G.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27513b;
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
