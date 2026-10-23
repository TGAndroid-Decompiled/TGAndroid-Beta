package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class q31 extends Fade {
    public final int f40616a;
    public final boolean f40617b;
    public final boolean f40618c;
    public final SecretMediaViewer d;

    public q31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f40616a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f40617b = z10;
                this.f40618c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f40617b = z10;
                this.f40618c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f40616a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f40617b && !this.f40618c && view == this.d.Z) {
                    onAppear.addListener(new v70(this, 23));
                    ((ObjectAnimator) onAppear).addUpdateListener(new g11(this, 2));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f40616a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f40617b && this.f40618c && view == this.d.Z) {
                    onDisappear.addListener(new v70(this, 24));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new g11(this, 3));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
