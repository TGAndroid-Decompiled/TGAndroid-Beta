package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class q41 extends Fade {
    public final int f36785a;
    public final boolean f36786b;
    public final boolean f36787c;
    public final SecretMediaViewer d;

    public q41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f36785a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f36786b = z10;
                this.f36787c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f36786b = z10;
                this.f36787c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36785a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36786b && !this.f36787c && view == this.d.Z) {
                    onAppear.addListener(new xo0(this, 18));
                    ((ObjectAnimator) onAppear).addUpdateListener(new q11(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36785a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36786b && this.f36787c && view == this.d.Z) {
                    onDisappear.addListener(new xo0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new q11(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
