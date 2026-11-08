package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.s00;
public final class j0 implements Transition.TransitionListener {
    public final int f27607a;
    public final FrameLayout f27608b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f27607a = i7;
        this.f27608b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f27607a) {
            case 0:
                ((r0) this.f27608b).f28435i0.e();
                return;
            default:
                ((s00) this.f27608b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f27607a) {
            case 0:
                ((r0) this.f27608b).f28435i0.e();
                return;
            default:
                ((s00) this.f27608b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f27607a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f27607a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f27607a) {
            case 0:
                ((r0) this.f27608b).f28435i0.d();
                return;
            default:
                ((s00) this.f27608b).E.d();
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
