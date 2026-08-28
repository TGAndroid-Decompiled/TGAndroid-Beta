package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.fg0;
public final class g extends AnimatorListenerAdapter {
    public final int f23397a;
    public boolean f23398b;
    public final boolean f23399c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i9) {
        this.f23397a = i9;
        this.d = obj;
        this.f23398b = z10;
        this.f23399c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23397a) {
            case 1:
                this.f23398b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.Z0 = false;
                actionBarLayout.f22679s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f22654d1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.I0)) {
                    kiVar.I0 = null;
                    return;
                }
                return;
            case 4:
                ((h90) this.d).f29000b2 = null;
                return;
            case 5:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.G;
                boolean z10 = this.f23398b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    fg0Var.G[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ci ciVar;
        int i9;
        w0 w0Var;
        switch (this.f23397a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f23583n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f23583n[1].getParent()).removeView(kVar.f23583n[1]);
                }
                kVar.f23583n[1] = null;
                kVar.f23594t0 = false;
                if (this.f23398b && this.f23399c) {
                    kVar.f23590r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f23398b) {
                    actionBarLayout.Z0 = false;
                    actionBarLayout.f22679s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f23399c);
                    actionBarLayout.f22654d1 = null;
                    return;
                }
                return;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.C = null;
                boolean z10 = this.f23398b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.h0(f10, false);
                if (this.f23399c) {
                    p8 p8Var = w8Var.f34138a;
                    p8Var.f33319w = -1.0f;
                    p8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f23398b;
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.I0)) {
                    if (!z11) {
                        if (!kiVar.J) {
                            kiVar.f30178z0.setVisibility(4);
                        }
                        kiVar.D0.setVisibility(4);
                    } else if (kiVar.O0 && ((ciVar = kiVar.f30160u0) == null || ciVar.I())) {
                        kiVar.f30158t1.setVisibility(4);
                    }
                    if (this.f23399c) {
                        kiVar.b2();
                        fh.v vVar = kiVar.K0;
                        if (z11) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        vVar.setVisibility(i9);
                    }
                    kiVar.I0 = null;
                    return;
                }
                return;
            case 4:
                h90 h90Var = (h90) this.d;
                k90 k90Var = h90Var.f29003e2;
                if (h90Var.f29000b2 != null) {
                    h90Var.f29000b2 = null;
                    if (!this.f23398b) {
                        k90Var.B.setVisibility(4);
                        FrameLayout frameLayout = k90Var.O;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = k90Var.D;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f23399c && (w0Var = k90Var.C) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    k90Var.f30039s.setVisibility(4);
                    w0 w0Var3 = k90Var.C;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.G;
                boolean z12 = this.f23398b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f23399c && z12 && fg0Var.I.getAlpha() != 1.0f) {
                    fg0Var.I.setAlpha(1.0f);
                    fg0Var.I.setScaleX(1.0f);
                    fg0Var.I.setScaleY(1.0f);
                    fg0Var.I.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f23397a = 1;
        this.d = actionBarLayout;
        this.f23399c = z10;
    }
}
