package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class iz0 extends Fade {
    public final int f48951a;
    public final boolean f48952b;
    public final boolean f48953c;
    public final SecretMediaViewer d;

    public iz0(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i7) {
        super(1);
        this.f48951a = i7;
        switch (i7) {
            case 1:
                this.d = secretMediaViewer;
                this.f48952b = z10;
                this.f48953c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f48952b = z10;
                this.f48953c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f48951a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f48952b && !this.f48953c && view == this.d.Y) {
                    onAppear.addListener(new zx(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new hz0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f48951a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f48952b && this.f48953c && view == this.d.Y) {
                    onDisappear.addListener(new zx(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new hz0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
