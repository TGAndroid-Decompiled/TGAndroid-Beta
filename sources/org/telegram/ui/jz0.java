package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class jz0 extends Fade {
    public final int f49146a;
    public final boolean f49147b;
    public final boolean f49148c;
    public final SecretMediaViewer d;

    public jz0(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i7) {
        super(1);
        this.f49146a = i7;
        switch (i7) {
            case 1:
                this.d = secretMediaViewer;
                this.f49147b = z10;
                this.f49148c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f49147b = z10;
                this.f49148c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f49146a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f49147b && !this.f49148c && view == this.d.Y) {
                    onAppear.addListener(new ay(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new iz0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f49146a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f49147b && this.f49148c && view == this.d.Y) {
                    onDisappear.addListener(new ay(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new iz0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
