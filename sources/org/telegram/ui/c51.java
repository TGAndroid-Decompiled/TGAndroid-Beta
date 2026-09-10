package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class c51 extends Fade {
    public final int f31542a;
    public final boolean f31543b;
    public final boolean f31544c;
    public final SecretMediaViewer d;

    public c51(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f31542a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f31543b = z10;
                this.f31544c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f31543b = z10;
                this.f31544c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f31542a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f31543b && !this.f31544c && view == this.d.Z) {
                    onAppear.addListener(new mv0(this, 7));
                    ((ObjectAnimator) onAppear).addUpdateListener(new f21(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f31542a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f31543b && this.f31544c && view == this.d.Z) {
                    onDisappear.addListener(new mv0(this, 8));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new f21(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
