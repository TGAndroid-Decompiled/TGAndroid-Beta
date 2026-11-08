package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class hz0 extends Fade {
    public final int f46530a;
    public final boolean f46531b;
    public final boolean f46532c;
    public final SecretMediaViewer d;

    public hz0(SecretMediaViewer secretMediaViewer, boolean z9, boolean z10, int i7) {
        super(1);
        this.f46530a = i7;
        switch (i7) {
            case 1:
                this.d = secretMediaViewer;
                this.f46531b = z9;
                this.f46532c = z10;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f46531b = z9;
                this.f46532c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f46530a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f46531b && !this.f46532c && view == this.d.X) {
                    onAppear.addListener(new d30(this, 24));
                    ((ObjectAnimator) onAppear).addUpdateListener(new gz0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f46530a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f46531b && this.f46532c && view == this.d.X) {
                    onDisappear.addListener(new d30(this, 25));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new gz0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
