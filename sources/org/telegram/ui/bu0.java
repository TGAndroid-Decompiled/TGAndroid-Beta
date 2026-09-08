package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class bu0 extends Fade {
    public final int f34958a;
    public final boolean f34959b;
    public final boolean f34960c;
    public final PhotoViewer d;

    public bu0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f34958a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f34959b = z10;
                this.f34960c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f34959b = z10;
                this.f34960c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f34958a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f34959b && !this.f34960c && view == this.d.Q1) {
                    onAppear.addListener(new gk0(this, 8));
                    ((ObjectAnimator) onAppear).addUpdateListener(new c3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f34958a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f34959b && this.f34960c && view == this.d.Q1) {
                    onDisappear.addListener(new gk0(this, 9));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new c3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
