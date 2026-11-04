package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.n00;
public final class i0 implements Transition.TransitionListener {
    public final int f27587a;
    public final FrameLayout f27588b;

    public i0(int i3, FrameLayout frameLayout) {
        this.f27587a = i3;
        this.f27588b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f27587a) {
            case 0:
                ((q0) this.f27588b).f28452j0.e();
                return;
            default:
                ((n00) this.f27588b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f27587a) {
            case 0:
                ((q0) this.f27588b).f28452j0.e();
                return;
            default:
                ((n00) this.f27588b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i3 = this.f27587a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i3 = this.f27587a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f27587a) {
            case 0:
                ((q0) this.f27588b).f28452j0.d();
                return;
            default:
                ((n00) this.f27588b).F.d();
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
