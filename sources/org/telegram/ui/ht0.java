package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class ht0 extends Fade {
    public final int f34949a;
    public final boolean f34950b;
    public final boolean f34951c;
    public final PhotoViewer d;

    public ht0(PhotoViewer photoViewer, boolean z4, boolean z10, int i10) {
        super(1);
        this.f34949a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f34950b = z4;
                this.f34951c = z10;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f34950b = z4;
                this.f34951c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f34949a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f34950b && !this.f34951c && view == this.d.N1) {
                    onAppear.addListener(new ls0(this, 4));
                    ((ObjectAnimator) onAppear).addUpdateListener(new e3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f34949a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f34950b && this.f34951c && view == this.d.N1) {
                    onDisappear.addListener(new ls0(this, 5));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new e3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
