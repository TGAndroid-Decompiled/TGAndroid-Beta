package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y90;
import org.telegram.ui.fg0;
public final class h extends AnimatorListenerAdapter {
    public final int f23461a;
    public boolean f23462b;
    public final boolean f23463c;
    public final Object d;

    public h(Object obj, boolean z10, boolean z11, int i10) {
        this.f23461a = i10;
        this.d = obj;
        this.f23462b = z10;
        this.f23463c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23461a) {
            case 1:
                this.f23462b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.Z0 = false;
                actionBarLayout.f22691s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f22666d1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ni niVar = (ni) this.d;
                if (animator.equals(niVar.I0)) {
                    niVar.I0 = null;
                    return;
                }
                return;
            case 4:
                ((v90) this.d).f33503b2 = null;
                return;
            case 5:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.G;
                boolean z10 = this.f23462b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    fg0Var.G[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        fi fiVar;
        int i10;
        w0 w0Var;
        switch (this.f23461a) {
            case 0:
                l lVar = (l) this.d;
                h5 h5Var = lVar.f23618n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) lVar.f23618n[1].getParent()).removeView(lVar.f23618n[1]);
                }
                lVar.f23618n[1] = null;
                lVar.f23629t0 = false;
                if (this.f23462b && this.f23463c) {
                    lVar.f23625r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f23462b) {
                    actionBarLayout.Z0 = false;
                    actionBarLayout.f22691s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f23463c);
                    actionBarLayout.f22666d1 = null;
                    return;
                }
                return;
            case 2:
                b9 b9Var = (b9) this.d;
                b9Var.C = null;
                boolean z10 = this.f23462b;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                b9Var.i0(f9, false);
                if (this.f23463c) {
                    u8 u8Var = b9Var.f27003a;
                    u8Var.f26715w = -1.0f;
                    u8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f23462b;
                ni niVar = (ni) this.d;
                if (animator.equals(niVar.I0)) {
                    if (!z11) {
                        if (!niVar.J) {
                            niVar.f31069z0.setVisibility(4);
                        }
                        niVar.D0.setVisibility(4);
                    } else if (niVar.O0 && ((fiVar = niVar.f31051u0) == null || fiVar.I())) {
                        niVar.f31049t1.setVisibility(4);
                    }
                    if (this.f23463c) {
                        niVar.b2();
                        bg.d1 d1Var = niVar.K0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        d1Var.setVisibility(i10);
                    }
                    niVar.I0 = null;
                    return;
                }
                return;
            case 4:
                v90 v90Var = (v90) this.d;
                y90 y90Var = v90Var.f33506e2;
                if (v90Var.f33503b2 != null) {
                    v90Var.f33503b2 = null;
                    if (!this.f23462b) {
                        y90Var.B.setVisibility(4);
                        FrameLayout frameLayout = y90Var.O;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = y90Var.D;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f23463c && (w0Var = y90Var.C) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    y90Var.f35001s.setVisibility(4);
                    w0 w0Var3 = y90Var.C;
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
                boolean z12 = this.f23462b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f23463c && z12 && fg0Var.I.getAlpha() != 1.0f) {
                    fg0Var.I.setAlpha(1.0f);
                    fg0Var.I.setScaleX(1.0f);
                    fg0Var.I.setScaleY(1.0f);
                    fg0Var.I.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, boolean z10) {
        this.f23461a = 1;
        this.d = actionBarLayout;
        this.f23463c = z10;
    }
}
