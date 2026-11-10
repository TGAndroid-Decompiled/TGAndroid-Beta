package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class lz0 extends Fade {
    public final int f47758a;
    public final boolean f47759b;
    public final boolean f47760c;
    public final SecretMediaViewer d;

    public lz0(SecretMediaViewer secretMediaViewer, boolean z9, boolean z10, int i7) {
        super(1);
        this.f47758a = i7;
        switch (i7) {
            case 1:
                this.d = secretMediaViewer;
                this.f47759b = z9;
                this.f47760c = z10;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f47759b = z9;
                this.f47760c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f47758a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f47759b && !this.f47760c && view == this.d.X) {
                    onAppear.addListener(new g30(this, 24));
                    ((ObjectAnimator) onAppear).addUpdateListener(new kz0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f47758a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f47759b && this.f47760c && view == this.d.X) {
                    onDisappear.addListener(new g30(this, 25));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new kz0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
