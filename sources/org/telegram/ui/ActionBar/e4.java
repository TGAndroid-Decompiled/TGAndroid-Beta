package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
public final class e4 extends AnimatorListenerAdapter {
    public final int f27475a;
    public final i4 f27476b;

    public e4(i4 i4Var, int i3) {
        this.f27475a = i3;
        this.f27476b = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27475a) {
            case 0:
                hs.f(h10.f22829t0).d(new d4(this, 0));
                return;
            default:
                hs.f(h10.f22829t0).d(new d4(this, 1));
                return;
        }
    }
}
