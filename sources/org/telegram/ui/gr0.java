package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class gr0 extends Fade {
    public final int f37621a;
    public final boolean f37622b;
    public final boolean f37623c;
    public final PhotoViewer d;

    public gr0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f37621a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f37622b = z10;
                this.f37623c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f37622b = z10;
                this.f37623c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37621a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f37622b && !this.f37623c && view == this.d.Q1) {
                    onAppear.addListener(new org.telegram.ui.Components.voip.h2(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new a3(this, 18));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37621a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f37622b && this.f37623c && view == this.d.Q1) {
                    onDisappear.addListener(new org.telegram.ui.Components.voip.h2(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new a3(this, 19));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
