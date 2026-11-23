package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e10;
public final class j0 implements Transition.TransitionListener {
    public final int f29009a;
    public final FrameLayout f29010b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f29009a = i7;
        this.f29010b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f29009a) {
            case 0:
                ((q0) this.f29010b).f29880j0.e();
                return;
            default:
                ((e10) this.f29010b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f29009a) {
            case 0:
                ((q0) this.f29010b).f29880j0.e();
                return;
            default:
                ((e10) this.f29010b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f29009a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f29009a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f29009a) {
            case 0:
                ((q0) this.f29010b).f29880j0.d();
                return;
            default:
                ((e10) this.f29010b).F.d();
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
