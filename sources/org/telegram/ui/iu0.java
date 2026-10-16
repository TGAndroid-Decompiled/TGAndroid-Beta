package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class iu0 extends Fade {
    public final int f36868a;
    public final boolean f36869b;
    public final boolean f36870c;
    public final PhotoViewer d;

    public iu0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f36868a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f36869b = z10;
                this.f36870c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f36869b = z10;
                this.f36870c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36868a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36869b && !this.f36870c && view == this.d.Q1) {
                    onAppear.addListener(new kj0(this, 9));
                    ((ObjectAnimator) onAppear).addUpdateListener(new e3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36868a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36869b && this.f36870c && view == this.d.Q1) {
                    onDisappear.addListener(new kj0(this, 10));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new e3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
