package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c10;
public final class k0 implements Transition.TransitionListener {
    public final int f29115a;
    public final FrameLayout f29116b;

    public k0(int i7, FrameLayout frameLayout) {
        this.f29115a = i7;
        this.f29116b = frameLayout;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        switch (this.f29115a) {
            case 0:
                ((r0) this.f29116b).f29928j0.e();
                return;
            default:
                ((c10) this.f29116b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        switch (this.f29115a) {
            case 0:
                ((r0) this.f29116b).f29928j0.e();
                return;
            default:
                ((c10) this.f29116b).F.e();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        int i7 = this.f29115a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        int i7 = this.f29115a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        switch (this.f29115a) {
            case 0:
                ((r0) this.f29116b).f29928j0.d();
                return;
            default:
                ((c10) this.f29116b).F.d();
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
