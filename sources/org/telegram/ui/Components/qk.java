package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class qk extends AnimatorListenerAdapter {
    public final int f26431a = 0;
    public final org.telegram.ui.dr f26432b;

    public qk(org.telegram.ui.dr drVar) {
        this.f26432b = drVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26431a) {
            case 0:
                ((sk) this.f26432b.d).U.unlock();
                return;
            default:
                org.telegram.ui.dr drVar = this.f26432b;
                View view = drVar.f31961b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((sk) drVar.d).X.f27428r.removeView(view);
                return;
        }
    }

    public qk(org.telegram.ui.dr drVar, s4.o0 o0Var) {
        this.f26432b = drVar;
    }
}
