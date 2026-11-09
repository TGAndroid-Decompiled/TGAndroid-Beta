package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.s00;
public final class j0 implements Transition.TransitionListener {
    public final int f27594a;
    public final FrameLayout f27595b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f27594a = i7;
        this.f27595b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f27594a) {
            case 0:
                ((r0) this.f27595b).f28436i0.e();
                return;
            default:
                ((s00) this.f27595b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f27594a) {
            case 0:
                ((r0) this.f27595b).f28436i0.e();
                return;
            default:
                ((s00) this.f27595b).E.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f27594a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f27594a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f27594a) {
            case 0:
                ((r0) this.f27595b).f28436i0.d();
                return;
            default:
                ((s00) this.f27595b).E.d();
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
