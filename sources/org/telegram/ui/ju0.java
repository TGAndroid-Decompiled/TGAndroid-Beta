package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class ju0 extends Fade {
    public final int f37437a;
    public final boolean f37438b;
    public final boolean f37439c;
    public final PhotoViewer d;

    public ju0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f37437a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f37438b = z10;
                this.f37439c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f37438b = z10;
                this.f37439c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37437a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f37438b && !this.f37439c && view == this.d.Q1) {
                    onAppear.addListener(new lj0(this, 9));
                    ((ObjectAnimator) onAppear).addUpdateListener(new e3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37437a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f37438b && this.f37439c && view == this.d.Q1) {
                    onDisappear.addListener(new lj0(this, 10));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new e3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
