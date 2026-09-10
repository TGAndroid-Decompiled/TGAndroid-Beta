package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class bu0 extends Fade {
    public final int f31407a;
    public final boolean f31408b;
    public final boolean f31409c;
    public final PhotoViewer d;

    public bu0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f31407a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f31408b = z10;
                this.f31409c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f31408b = z10;
                this.f31409c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f31407a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f31408b && !this.f31409c && view == this.d.Q1) {
                    onAppear.addListener(new org.telegram.ui.Components.voip.v2(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new d3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f31407a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f31408b && this.f31409c && view == this.d.Q1) {
                    onDisappear.addListener(new org.telegram.ui.Components.voip.v2(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new d3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
