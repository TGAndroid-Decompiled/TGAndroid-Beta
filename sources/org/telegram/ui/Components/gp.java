package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gp extends AnimatorListenerAdapter {
    public final int f26488a;
    public final hp f26489b;

    public gp(hp hpVar, int i10) {
        this.f26488a = i10;
        this.f26489b = hpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26488a) {
            case 0:
                hp hpVar = this.f26489b;
                hpVar.d = null;
                ho hoVar = new ho(this, 1);
                hpVar.e = hoVar;
                org.telegram.messenger.i0.h3(hoVar, 3000L);
                return;
            default:
                hp hpVar2 = this.f26489b;
                hpVar2.setVisibility(4);
                hpVar2.getClass();
                hpVar2.getClass();
                hpVar2.d = null;
                return;
        }
    }
}
