package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.yh;
import org.telegram.ui.ig0;

public final class g extends AnimatorListenerAdapter {

    public final int f22958a;

    public boolean f22959b;

    public final boolean f22960c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f22958a = i10;
        this.d = obj;
        this.f22959b = z10;
        this.f22960c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22958a) {
            case 1:
                this.f22959b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.Z0 = false;
                actionBarLayout.f22679s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f22654d1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                gi giVar = (gi) this.d;
                if (animator.equals(giVar.I0)) {
                    giVar.I0 = null;
                }
                break;
            case 4:
                ((l90) this.d).f30325b2 = null;
                break;
            case 5:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.G;
                boolean z10 = this.f22959b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ig0Var.G[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yh yhVar;
        v0 v0Var;
        switch (this.f22958a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f23584n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f23584n[1].getParent()).removeView(kVar.f23584n[1]);
                }
                kVar.f23584n[1] = null;
                kVar.f23595t0 = false;
                if (this.f22959b && this.f22960c) {
                    kVar.f23591r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f22959b) {
                    actionBarLayout.Z0 = false;
                    actionBarLayout.f22679s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f22960c);
                    actionBarLayout.f22654d1 = null;
                    break;
                }
                break;
            case 2:
                v8 v8Var = (v8) this.d;
                v8Var.C = null;
                boolean z10 = this.f22959b;
                v8Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.f22960c) {
                    o8 o8Var = v8Var.f33295a;
                    o8Var.f33010w = -1.0f;
                    o8Var.setExpanded(z10);
                }
                break;
            case 3:
                boolean z11 = this.f22959b;
                gi giVar = (gi) this.d;
                if (animator.equals(giVar.I0)) {
                    if (!z11) {
                        if (!giVar.J) {
                            giVar.f28714z0.setVisibility(4);
                        }
                        giVar.D0.setVisibility(4);
                    } else if (giVar.O0 && ((yhVar = giVar.f28696u0) == null || yhVar.J())) {
                        giVar.f28694t1.setVisibility(4);
                    }
                    if (this.f22960c) {
                        giVar.b2();
                        giVar.K0.setVisibility(z11 ? 0 : 8);
                    }
                    giVar.I0 = null;
                }
                break;
            case 4:
                l90 l90Var = (l90) this.d;
                o90 o90Var = l90Var.f30328e2;
                if (l90Var.f30325b2 != null) {
                    l90Var.f30325b2 = null;
                    if (this.f22959b) {
                        o90Var.f31243s.setVisibility(4);
                        v0 v0Var2 = o90Var.C;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        break;
                    } else {
                        o90Var.B.setVisibility(4);
                        FrameLayout frameLayout = o90Var.O;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var3 = o90Var.D;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        if (this.f22960c && (v0Var = o90Var.C) != null) {
                            v0Var.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.G;
                boolean z12 = this.f22959b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f22960c && z12 && ig0Var.I.getAlpha() != 1.0f) {
                    ig0Var.I.setAlpha(1.0f);
                    ig0Var.I.setScaleX(1.0f);
                    ig0Var.I.setScaleY(1.0f);
                    ig0Var.I.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f22958a = 1;
        this.d = actionBarLayout;
        this.f22960c = z10;
    }
}
