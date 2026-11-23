package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c10;
public final class j0 implements Transition.TransitionListener {
    public final int f29096a;
    public final FrameLayout f29097b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f29096a = i7;
        this.f29097b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f29096a) {
            case 0:
                ((q0) this.f29097b).f29971j0.e();
                return;
            default:
                ((c10) this.f29097b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f29096a) {
            case 0:
                ((q0) this.f29097b).f29971j0.e();
                return;
            default:
                ((c10) this.f29097b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f29096a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f29096a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f29096a) {
            case 0:
                ((q0) this.f29097b).f29971j0.d();
                return;
            default:
                ((c10) this.f29097b).F.d();
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
