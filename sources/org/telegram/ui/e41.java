package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class e41 extends Fade {
    public final int f33885a;
    public final boolean f33886b;
    public final boolean f33887c;
    public final SecretMediaViewer d;

    public e41(SecretMediaViewer secretMediaViewer, boolean z4, boolean z10, int i10) {
        super(1);
        this.f33885a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f33886b = z4;
                this.f33887c = z10;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f33886b = z4;
                this.f33887c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f33885a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f33886b && !this.f33887c && view == this.d.W) {
                    onAppear.addListener(new ls0(this, 16));
                    ((ObjectAnimator) onAppear).addUpdateListener(new h11(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f33885a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f33886b && this.f33887c && view == this.d.W) {
                    onDisappear.addListener(new ls0(this, 17));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new h11(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
