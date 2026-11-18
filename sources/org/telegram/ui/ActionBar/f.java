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
    public final int f28917a = 0;
    public final boolean f28918b;
    public final boolean f28919c;
    public final Object d;
    public final KeyEvent.Callback f28920e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f28920e = kVar;
        this.d = arrayList;
        this.f28918b = z10;
        this.f28919c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        gf gfVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        uf0 uf0Var;
        switch (this.f28917a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f28920e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f28918b;
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
                        if (z10 && !this.f28919c) {
                            n5 n5Var = kVar.f29086n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.f29086n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        q9 q9Var = kVar.f29071f;
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
                eg0 eg0Var = (eg0) this.f28920e;
                ag0 ag0Var = eg0Var.K;
                boolean z11 = this.f28918b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                eg0Var.E = f10;
                eg0Var.f47254x = false;
                eg0Var.f47256y = false;
                eg0Var.H.setAlpha(f10);
                if (z11) {
                    eg0Var.f47252w = false;
                    eg0Var.f47247s = false;
                }
                gf gfVar2 = eg0Var.S;
                if (gfVar2 != null) {
                    gfVar2.setAlpha(1.0f);
                }
                ab.q qVar = eg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.q1 q1Var2 = eg0Var.f47251v0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                if (!eg0Var.f47245r) {
                    eg0Var.o(false, 1.0f);
                }
                if (!z11 && (uf0Var = eg0Var.X) != null) {
                    uf0Var.setAlpha(0.0f);
                }
                if (!this.f28919c && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                ag0Var.invalidate();
                ag0Var.setAlpha(eg0Var.E);
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = eg0Var.f47251v0) != null && q1Var.isAttachedToWindow()) {
                        eg0Var.f47251v0.post(runnable);
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
        this.f28920e = eg0Var;
        this.f28918b = z10;
        this.f28919c = z11;
        this.d = runnable;
    }
}
