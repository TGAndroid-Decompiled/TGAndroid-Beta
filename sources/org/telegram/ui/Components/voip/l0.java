package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29368a;
    public final m0 f29369b;

    public l0(m0 m0Var, u uVar) {
        this.f29369b = m0Var;
        this.f29368a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29368a;
        if (uVar.getParent() != null) {
            this.f29369b.removeView(uVar);
            uVar.e();
        }
    }
}
