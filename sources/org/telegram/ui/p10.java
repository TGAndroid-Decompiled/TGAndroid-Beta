package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p10 extends AnimatorListenerAdapter {
    public final int f36483a = 0;
    public final br f36484b;

    public p10(br brVar) {
        this.f36484b = brVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36483a) {
            case 0:
                ((z10) this.f36484b.d).f40084l0.unlock();
                return;
            default:
                br brVar = this.f36484b;
                View view = brVar.f32560b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((z10) brVar.d).f40071b.removeView(view);
                return;
        }
    }

    public p10(br brVar, s4.o0 o0Var) {
        this.f36484b = brVar;
    }
}
