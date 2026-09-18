package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p10 extends AnimatorListenerAdapter {
    public final int f36488a = 0;
    public final br f36489b;

    public p10(br brVar) {
        this.f36489b = brVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36488a) {
            case 0:
                ((z10) this.f36489b.d).f40089l0.unlock();
                return;
            default:
                br brVar = this.f36489b;
                View view = brVar.f32564b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((z10) brVar.d).f40076b.removeView(view);
                return;
        }
    }

    public p10(br brVar, s4.o0 o0Var) {
        this.f36489b = brVar;
    }
}
