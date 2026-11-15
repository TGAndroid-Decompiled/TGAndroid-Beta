package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.v00;
public final class j0 implements Transition.TransitionListener {
    public final int f28720a;
    public final FrameLayout f28721b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f28720a = i7;
        this.f28721b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f28720a) {
            case 0:
                ((q0) this.f28721b).f29509j0.e();
                return;
            default:
                ((v00) this.f28721b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f28720a) {
            case 0:
                ((q0) this.f28721b).f29509j0.e();
                return;
            default:
                ((v00) this.f28721b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f28720a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f28720a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f28720a) {
            case 0:
                ((q0) this.f28721b).f29509j0.d();
                return;
            default:
                ((v00) this.f28721b).F.d();
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
