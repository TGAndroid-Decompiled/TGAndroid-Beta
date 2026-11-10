package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.we;
import org.telegram.ui.ag0;
import org.telegram.ui.eg0;
import org.telegram.ui.uf0;
public final class g extends AnimatorListenerAdapter {
    public final int f27480a = 0;
    public final boolean f27481b;
    public final boolean f27482c;
    public final Object d;
    public final KeyEvent.Callback f27483e;

    public g(l lVar, ArrayList arrayList, boolean z9, boolean z10) {
        this.f27483e = lVar;
        this.d = arrayList;
        this.f27481b = z9;
        this.f27482c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        we weVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        uf0 uf0Var;
        switch (this.f27480a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.f27483e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z9 = this.f27481b;
                    if (i7 < size) {
                        View view = (View) arrayList.get(i7);
                        if (z9) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i7++;
                    } else {
                        if (z9 && !this.f27482c) {
                            m5 m5Var = lVar.f27690n[0];
                            if (m5Var != null) {
                                m5Var.setVisibility(8);
                            }
                            m5 m5Var2 = lVar.f27690n[1];
                            if (m5Var2 != null) {
                                m5Var2.setVisibility(8);
                            }
                        }
                        k9 k9Var = lVar.f27675f;
                        if (k9Var != null && !z9) {
                            k9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                eg0 eg0Var = (eg0) this.f27483e;
                ag0 ag0Var = eg0Var.J;
                boolean z10 = this.f27481b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                eg0Var.D = f10;
                eg0Var.f45299x = false;
                eg0Var.f45301y = false;
                eg0Var.G.setAlpha(f10);
                if (z10) {
                    eg0Var.f45297w = false;
                    eg0Var.f45292s = false;
                }
                we weVar2 = eg0Var.R;
                if (weVar2 != null) {
                    weVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = eg0Var.f45289q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                cg cgVar = eg0Var.V;
                if (cgVar != null && !eg0Var.f45290r) {
                    cgVar.setAlpha(1.0f);
                }
                if (!z10 && (uf0Var = eg0Var.W) != null) {
                    uf0Var.setAlpha(0.0f);
                }
                if (!this.f27482c && (viewGroup = eg0Var.Y) != null) {
                    viewGroup.setAlpha(eg0Var.D);
                }
                ag0Var.invalidate();
                ag0Var.setAlpha(eg0Var.D);
                eg0Var.E.invalidate();
                eg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = eg0Var.f45289q0) != null && q1Var.isAttachedToWindow()) {
                        eg0Var.f45289q0.post(runnable);
                        return;
                    } else if (!z10 && (weVar = eg0Var.R) != null && weVar.isAttachedToWindow()) {
                        eg0Var.R.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public g(eg0 eg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.f27483e = eg0Var;
        this.f27481b = z9;
        this.f27482c = z10;
        this.d = runnable;
    }
}
