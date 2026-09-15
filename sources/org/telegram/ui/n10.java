package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f35861a = 0;
    public final br f35862b;

    public n10(br brVar) {
        this.f35862b = brVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35861a) {
            case 0:
                ((x10) this.f35862b.d).f39453l0.unlock();
                return;
            default:
                br brVar = this.f35862b;
                View view = brVar.f32574b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) brVar.d).f39440b.removeView(view);
                return;
        }
    }

    public n10(br brVar, s4.o0 o0Var) {
        this.f35862b = brVar;
    }
}
