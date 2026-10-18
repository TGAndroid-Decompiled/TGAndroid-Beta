package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class o31 extends Fade {
    public final int f39656a;
    public final boolean f39657b;
    public final boolean f39658c;
    public final SecretMediaViewer d;

    public o31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f39656a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f39657b = z10;
                this.f39658c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f39657b = z10;
                this.f39658c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f39656a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f39657b && !this.f39658c && view == this.d.Z) {
                    onAppear.addListener(new bc0(this, 22));
                    ((ObjectAnimator) onAppear).addUpdateListener(new e11(this, 2));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f39656a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f39657b && this.f39658c && view == this.d.Z) {
                    onDisappear.addListener(new bc0(this, 23));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new e11(this, 3));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
