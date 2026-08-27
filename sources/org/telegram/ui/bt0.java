package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class bt0 extends Fade {

    public final int f36881a;

    public final boolean f36882b;

    public final boolean f36883c;
    public final PhotoViewer d;

    public bt0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f36881a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f36882b = z10;
                this.f36883c = z11;
                super(2);
                break;
            default:
                this.d = photoViewer;
                this.f36882b = z10;
                this.f36883c = z11;
                break;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36881a) {
            case 0:
                Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f36882b && !this.f36883c && view == this.d.M1) {
                    animatorOnAppear.addListener(new f50(this, 13));
                    ((ObjectAnimator) animatorOnAppear).addUpdateListener(new g3(this, 20));
                }
                return animatorOnAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f36881a) {
            case 1:
                Animator animatorOnDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f36882b && this.f36883c && view == this.d.M1) {
                    animatorOnDisappear.addListener(new f50(this, 14));
                    ((ObjectAnimator) animatorOnDisappear).addUpdateListener(new g3(this, 21));
                }
                return animatorOnDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
