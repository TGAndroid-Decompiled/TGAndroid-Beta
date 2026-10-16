package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class g51 extends Fade {
    public final int f36073a;
    public final boolean f36074b;
    public final boolean f36075c;
    public final SecretMediaViewer d;

    public g51(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f36073a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f36074b = z10;
                this.f36075c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f36074b = z10;
                this.f36075c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36073a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36074b && !this.f36075c && view == this.d.Z) {
                    onAppear.addListener(new kj0(this, 21));
                    ((ObjectAnimator) onAppear).addUpdateListener(new f21(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36073a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36074b && this.f36075c && view == this.d.Z) {
                    onDisappear.addListener(new kj0(this, 22));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new f21(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
