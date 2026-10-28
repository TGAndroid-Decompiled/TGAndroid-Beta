package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ci0;
import org.telegram.ui.ii0;
import org.telegram.ui.pi0;
public final class f extends AnimatorListenerAdapter {
    public final int f22614a = 0;
    public final boolean f22615b;
    public final boolean f22616c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f22615b = z10;
        this.f22616c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        ci0 ci0Var;
        switch (this.f22614a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f22615b;
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
                        if (z10 && !this.f22616c) {
                            b6 b6Var = kVar.f22774n[0];
                            if (b6Var != null) {
                                b6Var.setVisibility(8);
                            }
                            b6 b6Var2 = kVar.f22774n[1];
                            if (b6Var2 != null) {
                                b6Var2.setVisibility(8);
                            }
                        }
                        y9 y9Var = kVar.f22759f;
                        if (y9Var != null && !z10) {
                            y9Var.setVisibility(8);
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
                boolean z11 = this.f22615b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                pi0Var.f42439y = f7;
                pi0Var.f42435w = false;
                pi0Var.f42437x = false;
                pi0Var.G.setAlpha(f7);
                if (z11) {
                    pi0Var.v = false;
                    pi0Var.f42430s = false;
                }
                pf pfVar2 = pi0Var.R;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = pi0Var.f42427q0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                vg vgVar = pi0Var.V;
                if (vgVar != null && !pi0Var.f42428r) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (ci0Var = pi0Var.W) != null) {
                    ci0Var.setAlpha(0.0f);
                }
                if (!this.f22616c && (viewGroup = pi0Var.Y) != null) {
                    viewGroup.setAlpha(pi0Var.f42439y);
                }
                ii0Var.invalidate();
                ii0Var.setAlpha(pi0Var.f42439y);
                pi0Var.E.invalidate();
                pi0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = pi0Var.f42427q0) != null && s1Var.isAttachedToWindow()) {
                        pi0Var.f42427q0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = pi0Var.R) != null && pfVar.isAttachedToWindow()) {
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
        this.f22615b = z10;
        this.f22616c = z11;
        this.d = runnable;
    }
}
