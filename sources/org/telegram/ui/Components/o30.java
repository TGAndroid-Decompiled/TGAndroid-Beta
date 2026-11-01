package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o30 extends AnimatorListenerAdapter {
    public final int f29017a;
    public final q30 f29018b;

    public o30(q30 q30Var, int i10) {
        this.f29017a = i10;
        this.f29018b = q30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f29017a) {
            case 0:
                q30 q30Var = this.f29018b;
                q30Var.f29620f = null;
                if (!q30Var.H) {
                    ho hoVar = new ho(this, 22);
                    q30Var.h = hoVar;
                    if (q30Var.f29621n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    org.telegram.messenger.i0.h3(hoVar, j10);
                    return;
                }
                return;
            case 1:
                q30 q30Var2 = this.f29018b;
                q30Var2.f29620f = null;
                if (!q30Var2.H) {
                    ho hoVar2 = new ho(this, 23);
                    q30Var2.h = hoVar2;
                    org.telegram.messenger.i0.h3(hoVar2, q30Var2.E);
                    return;
                }
                return;
            default:
                q30 q30Var3 = this.f29018b;
                q30Var3.setVisibility(4);
                q30Var3.getClass();
                q30Var3.e = null;
                q30Var3.d = null;
                q30Var3.f29620f = null;
                return;
        }
    }
}
