package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class p41 extends Fade {
    public final int f36022a;
    public final boolean f36023b;
    public final boolean f36024c;
    public final SecretMediaViewer d;

    public p41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f36022a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f36023b = z10;
                this.f36024c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f36023b = z10;
                this.f36024c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36022a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36023b && !this.f36024c && view == this.d.Z) {
                    onAppear.addListener(new wq0(this, 17));
                    ((ObjectAnimator) onAppear).addUpdateListener(new s11(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36022a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36023b && this.f36024c && view == this.d.Z) {
                    onDisappear.addListener(new wq0(this, 18));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new s11(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
