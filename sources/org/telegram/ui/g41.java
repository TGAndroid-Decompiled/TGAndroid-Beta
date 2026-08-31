package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class g41 extends Fade {
    public final int f37083a;
    public final boolean f37084b;
    public final boolean f37085c;
    public final SecretMediaViewer d;

    public g41(SecretMediaViewer secretMediaViewer, boolean z4, boolean z10, int i10) {
        super(1);
        this.f37083a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f37084b = z4;
                this.f37085c = z10;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f37084b = z4;
                this.f37085c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37083a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f37084b && !this.f37085c && view == this.d.W) {
                    onAppear.addListener(new ns0(this, 16));
                    ((ObjectAnimator) onAppear).addUpdateListener(new j11(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37083a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f37084b && this.f37085c && view == this.d.W) {
                    onDisappear.addListener(new ns0(this, 17));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new j11(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
