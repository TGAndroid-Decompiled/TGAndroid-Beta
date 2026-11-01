package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.h10;
public final class k0 implements Transition.TransitionListener {
    public final int f20449a;
    public final FrameLayout f20450b;

    public k0(int i10, FrameLayout frameLayout) {
        this.f20449a = i10;
        this.f20450b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f20449a) {
            case 0:
                ((t0) this.f20450b).f20837i0.e();
                return;
            default:
                ((h10) this.f20450b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f20449a) {
            case 0:
                ((t0) this.f20450b).f20837i0.e();
                return;
            default:
                ((h10) this.f20450b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i10 = this.f20449a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i10 = this.f20449a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f20449a) {
            case 0:
                ((t0) this.f20450b).f20837i0.d();
                return;
            default:
                ((h10) this.f20450b).E.d();
                return;
        }
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }
}
