package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class fz0 extends Fade {
    public final int f47234a;
    public final boolean f47235b;
    public final boolean f47236c;
    public final SecretMediaViewer d;

    public fz0(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i7) {
        super(1);
        this.f47234a = i7;
        switch (i7) {
            case 1:
                this.d = secretMediaViewer;
                this.f47235b = z10;
                this.f47236c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f47235b = z10;
                this.f47236c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f47234a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f47235b && !this.f47236c && view == this.d.Y) {
                    onAppear.addListener(new xx(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new ez0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f47234a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f47235b && this.f47236c && view == this.d.Y) {
                    onDisappear.addListener(new xx(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new ez0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
