package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ag0;
import org.telegram.ui.eg0;
import org.telegram.ui.uf0;
public final class f extends AnimatorListenerAdapter {
    public final int f28940a = 0;
    public final boolean f28941b;
    public final boolean f28942c;
    public final Object d;
    public final KeyEvent.Callback f28943e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f28943e = kVar;
        this.d = arrayList;
        this.f28941b = z10;
        this.f28942c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        gf gfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        uf0 uf0Var;
        switch (this.f28940a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f28943e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f28941b;
                    if (i7 < size) {
                        View view = (View) arrayList.get(i7);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i7++;
                    } else {
                        if (z10 && !this.f28942c) {
                            m5 m5Var = kVar.f29148n[0];
                            if (m5Var != null) {
                                m5Var.setVisibility(8);
                            }
                            m5 m5Var2 = kVar.f29148n[1];
                            if (m5Var2 != null) {
                                m5Var2.setVisibility(8);
                            }
                        }
                        q9 q9Var = kVar.f29133f;
                        if (q9Var != null && !z10) {
                            q9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                eg0 eg0Var = (eg0) this.f28943e;
                ag0 ag0Var = eg0Var.K;
                boolean z11 = this.f28941b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                eg0Var.E = f10;
                eg0Var.f47294x = false;
                eg0Var.f47296y = false;
                eg0Var.H.setAlpha(f10);
                if (z11) {
                    eg0Var.f47292w = false;
                    eg0Var.f47287s = false;
                }
                gf gfVar2 = eg0Var.S;
                if (gfVar2 != null) {
                    gfVar2.setAlpha(1.0f);
                }
                ab.q qVar = eg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = eg0Var.f47291v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!eg0Var.f47285r) {
                    eg0Var.o(false, 1.0f);
                }
                if (!z11 && (uf0Var = eg0Var.X) != null) {
                    uf0Var.setAlpha(0.0f);
                }
                if (!this.f28942c && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                ag0Var.invalidate();
                ag0Var.setAlpha(eg0Var.E);
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = eg0Var.f47291v0) != null && r1Var.isAttachedToWindow()) {
                        eg0Var.f47291v0.post(runnable);
                        return;
                    } else if (!z11 && (gfVar = eg0Var.S) != null && gfVar.isAttachedToWindow()) {
                        eg0Var.S.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(eg0 eg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f28943e = eg0Var;
        this.f28941b = z10;
        this.f28942c = z11;
        this.d = runnable;
    }
}
