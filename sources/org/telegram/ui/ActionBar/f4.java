package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class f4 extends AnimatorListenerAdapter {
    public final int f27470a;
    public final i4 f27471b;

    public f4(i4 i4Var, int i7) {
        this.f27470a = i7;
        this.f27471b = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27470a) {
            case 0:
                qs.f(p10.f24470s0).d(new l2.w(this, 27));
                return;
            default:
                qs.f(p10.f24470s0).d(new l2.w(this, 28));
                return;
        }
    }
}
