package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class at0 extends Fade {
    public final int f36550a;
    public final boolean f36551b;
    public final boolean f36552c;
    public final PhotoViewer d;

    public at0(PhotoViewer photoViewer, boolean z10, boolean z11, int i9) {
        super(1);
        this.f36550a = i9;
        switch (i9) {
            case 1:
                this.d = photoViewer;
                this.f36551b = z10;
                this.f36552c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f36551b = z10;
                this.f36552c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36550a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36551b && !this.f36552c && view == this.d.M1) {
                    onAppear.addListener(new bc0(this, 11));
                    ((ObjectAnimator) onAppear).addUpdateListener(new f3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36550a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36551b && this.f36552c && view == this.d.M1) {
                    onDisappear.addListener(new bc0(this, 12));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new f3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
