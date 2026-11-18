package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.q9;
import org.telegram.ui.bg0;
import org.telegram.ui.fg0;
import org.telegram.ui.vf0;
public final class f extends AnimatorListenerAdapter {
    public final int f28915a = 0;
    public final boolean f28916b;
    public final boolean f28917c;
    public final Object d;
    public final KeyEvent.Callback f28918e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f28918e = kVar;
        this.d = arrayList;
        this.f28916b = z10;
        this.f28917c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        gf gfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        vf0 vf0Var;
        switch (this.f28915a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f28918e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f28916b;
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
                        if (z10 && !this.f28917c) {
                            n5 n5Var = kVar.f29084n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.f29084n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        q9 q9Var = kVar.f29069f;
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
                fg0 fg0Var = (fg0) this.f28918e;
                bg0 bg0Var = fg0Var.K;
                boolean z11 = this.f28916b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fg0Var.E = f10;
                fg0Var.f47649x = false;
                fg0Var.f47651y = false;
                fg0Var.H.setAlpha(f10);
                if (z11) {
                    fg0Var.f47647w = false;
                    fg0Var.f47642s = false;
                }
                gf gfVar2 = fg0Var.S;
                if (gfVar2 != null) {
                    gfVar2.setAlpha(1.0f);
                }
                ab.q qVar = fg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = fg0Var.f47646v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!fg0Var.f47640r) {
                    fg0Var.o(false, 1.0f);
                }
                if (!z11 && (vf0Var = fg0Var.X) != null) {
                    vf0Var.setAlpha(0.0f);
                }
                if (!this.f28917c && (viewGroup = fg0Var.Z) != null) {
                    viewGroup.setAlpha(fg0Var.E);
                }
                bg0Var.invalidate();
                bg0Var.setAlpha(fg0Var.E);
                fg0Var.F.invalidate();
                fg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = fg0Var.f47646v0) != null && r1Var.isAttachedToWindow()) {
                        fg0Var.f47646v0.post(runnable);
                        return;
                    } else if (!z11 && (gfVar = fg0Var.S) != null && gfVar.isAttachedToWindow()) {
                        fg0Var.S.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(fg0 fg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f28918e = fg0Var;
        this.f28916b = z10;
        this.f28917c = z11;
        this.d = runnable;
    }
}
