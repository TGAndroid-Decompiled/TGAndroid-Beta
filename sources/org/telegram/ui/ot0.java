package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class ot0 extends Fade {
    public final int f36880a;
    public final boolean f36881b;
    public final boolean f36882c;
    public final PhotoViewer d;

    public ot0(PhotoViewer photoViewer, boolean z4, boolean z10, int i10) {
        super(1);
        this.f36880a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f36881b = z4;
                this.f36882c = z10;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f36881b = z4;
                this.f36882c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36880a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36881b && !this.f36882c && view == this.d.N1) {
                    onAppear.addListener(new ss0(this, 4));
                    ((ObjectAnimator) onAppear).addUpdateListener(new g3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36880a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36881b && this.f36882c && view == this.d.N1) {
                    onDisappear.addListener(new ss0(this, 5));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new g3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
