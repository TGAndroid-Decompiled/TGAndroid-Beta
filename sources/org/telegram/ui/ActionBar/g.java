package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.pg0;
public final class g extends AnimatorListenerAdapter {
    public final int f19671a;
    public boolean f19672b;
    public final boolean f19673c;
    public final Object d;

    public g(Object obj, boolean z4, boolean z10, int i10) {
        this.f19671a = i10;
        this.d = obj;
        this.f19672b = z4;
        this.f19673c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19671a) {
            case 1:
                this.f19672b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f19424a1 = false;
                actionBarLayout.f19456s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f19434e1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                li liVar = (li) this.d;
                if (animator.equals(liVar.J0)) {
                    liVar.J0 = null;
                    return;
                }
                return;
            case 4:
                ((ba0) this.d).f23606c2 = null;
                return;
            case 5:
                pg0 pg0Var = (pg0) this.d;
                AnimatorSet[] animatorSetArr = pg0Var.H;
                boolean z4 = this.f19672b;
                if (animatorSetArr[!z4 ? 1 : 0] != null && animatorSetArr[!z4 ? 1 : 0].equals(animator)) {
                    pg0Var.H[!z4 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        di diVar;
        int i10;
        w0 w0Var;
        switch (this.f19671a) {
            case 0:
                k kVar = (k) this.d;
                k5 k5Var = kVar.f20309n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar.f20309n[1].getParent()).removeView(kVar.f20309n[1]);
                }
                kVar.f20309n[1] = null;
                kVar.f20322u0 = false;
                if (this.f19672b && this.f19673c) {
                    kVar.f20317r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f19672b) {
                    actionBarLayout.f19424a1 = false;
                    actionBarLayout.f19456s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f19673c);
                    actionBarLayout.f19434e1 = null;
                    return;
                }
                return;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.D = null;
                boolean z4 = this.f19672b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.i0(f10, false);
                if (this.f19673c) {
                    p8 p8Var = w8Var.f30173a;
                    p8Var.f29405w = -1.0f;
                    p8Var.setExpanded(z4);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f19672b;
                li liVar = (li) this.d;
                if (animator.equals(liVar.J0)) {
                    if (!z10) {
                        if (!liVar.K) {
                            liVar.A0.setVisibility(4);
                        }
                        liVar.E0.setVisibility(4);
                    } else if (liVar.P0 && ((diVar = liVar.f26744v0) == null || diVar.I())) {
                        liVar.f26742u1.setVisibility(4);
                    }
                    if (this.f19673c) {
                        liVar.b2();
                        ah.e eVar = liVar.L0;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        eVar.setVisibility(i10);
                    }
                    liVar.J0 = null;
                    return;
                }
                return;
            case 4:
                ba0 ba0Var = (ba0) this.d;
                ea0 ea0Var = ba0Var.f23609f2;
                if (ba0Var.f23606c2 != null) {
                    ba0Var.f23606c2 = null;
                    if (!this.f19672b) {
                        ea0Var.C.setVisibility(4);
                        FrameLayout frameLayout = ea0Var.P;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = ea0Var.E;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f19673c && (w0Var = ea0Var.D) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ea0Var.f24560s.setVisibility(4);
                    w0 w0Var3 = ea0Var.D;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                pg0 pg0Var = (pg0) this.d;
                AnimatorSet[] animatorSetArr = pg0Var.H;
                boolean z11 = this.f19672b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f19673c && z11 && pg0Var.J.getAlpha() != 1.0f) {
                    pg0Var.J.setAlpha(1.0f);
                    pg0Var.J.setScaleX(1.0f);
                    pg0Var.J.setScaleY(1.0f);
                    pg0Var.J.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z4) {
        this.f19671a = 1;
        this.d = actionBarLayout;
        this.f19673c = z4;
    }
}
