package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class a51 extends Fade {
    public final int f32013a;
    public final boolean f32014b;
    public final boolean f32015c;
    public final SecretMediaViewer d;

    public a51(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f32013a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f32014b = z10;
                this.f32015c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f32014b = z10;
                this.f32015c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f32013a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f32014b && !this.f32015c && view == this.d.Z) {
                    onAppear.addListener(new gp0(this, 18));
                    ((ObjectAnimator) onAppear).addUpdateListener(new i21(this, 3));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f32013a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f32014b && this.f32015c && view == this.d.Z) {
                    onDisappear.addListener(new gp0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new i21(this, 4));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
