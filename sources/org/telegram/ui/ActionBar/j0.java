package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.r00;
public final class j0 implements Transition.TransitionListener {
    public final int f27603a;
    public final FrameLayout f27604b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f27603a = i7;
        this.f27604b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f27603a) {
            case 0:
                ((r0) this.f27604b).f28431i0.e();
                return;
            default:
                ((r00) this.f27604b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f27603a) {
            case 0:
                ((r0) this.f27604b).f28431i0.e();
                return;
            default:
                ((r00) this.f27604b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f27603a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f27603a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f27603a) {
            case 0:
                ((r0) this.f27604b).f28431i0.d();
                return;
            default:
                ((r00) this.f27604b).E.d();
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
