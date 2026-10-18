package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class kt0 extends Fade {
    public final int f38672a;
    public final boolean f38673b;
    public final boolean f38674c;
    public final PhotoViewer d;

    public kt0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f38672a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f38673b = z10;
                this.f38674c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f38673b = z10;
                this.f38674c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f38672a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f38673b && !this.f38674c && view == this.d.Q1) {
                    onAppear.addListener(new bc0(this, 11));
                    ((ObjectAnimator) onAppear).addUpdateListener(new e3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f38672a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f38673b && this.f38674c && view == this.d.Q1) {
                    onDisappear.addListener(new bc0(this, 12));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new e3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
