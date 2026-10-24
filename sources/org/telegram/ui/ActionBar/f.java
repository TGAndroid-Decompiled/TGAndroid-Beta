package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.u9;
import org.telegram.ui.ci0;
import org.telegram.ui.ii0;
import org.telegram.ui.pi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20877a = 0;
    public final boolean f20878b;
    public final boolean f20879c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f20878b = z10;
        this.f20879c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        nf nfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        ci0 ci0Var;
        switch (this.f20877a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20878b;
                    if (i10 < size) {
                        View view = (View) arrayList.get(i10);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    } else {
                        if (z10 && !this.f20879c) {
                            n5 n5Var = kVar.f21068n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.f21068n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        u9 u9Var = kVar.f21053f;
                        if (u9Var != null && !z10) {
                            u9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                pi0 pi0Var = (pi0) this.e;
                ii0 ii0Var = pi0Var.J;
                boolean z11 = this.f20878b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                pi0Var.f40581y = f7;
                pi0Var.f40577w = false;
                pi0Var.f40579x = false;
                pi0Var.G.setAlpha(f7);
                if (z11) {
                    pi0Var.v = false;
                    pi0Var.f40572s = false;
                }
                nf nfVar2 = pi0Var.R;
                if (nfVar2 != null) {
                    nfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = pi0Var.f40569q0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                tg tgVar = pi0Var.V;
                if (tgVar != null && !pi0Var.f40570r) {
                    tgVar.setAlpha(1.0f);
                }
                if (!z11 && (ci0Var = pi0Var.W) != null) {
                    ci0Var.setAlpha(0.0f);
                }
                if (!this.f20879c && (viewGroup = pi0Var.Y) != null) {
                    viewGroup.setAlpha(pi0Var.f40581y);
                }
                ii0Var.invalidate();
                ii0Var.setAlpha(pi0Var.f40581y);
                pi0Var.E.invalidate();
                pi0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = pi0Var.f40569q0) != null && t1Var.isAttachedToWindow()) {
                        pi0Var.f40569q0.post(runnable);
                        return;
                    } else if (!z11 && (nfVar = pi0Var.R) != null && nfVar.isAttachedToWindow()) {
                        pi0Var.R.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(pi0 pi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = pi0Var;
        this.f20878b = z10;
        this.f20879c = z11;
        this.d = runnable;
    }
}
