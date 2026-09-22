package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.v9;
import org.telegram.ui.dj0;
import org.telegram.ui.qi0;
import org.telegram.ui.wi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18854a = 0;
    public final boolean f18855b;
    public final boolean f18856c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18855b = z10;
        this.f18856c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        qi0 qi0Var;
        switch (this.f18854a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18855b;
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
                        if (z10 && !this.f18856c) {
                            j5 j5Var = kVar.f19551n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f19551n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        v9 v9Var = kVar.f19536f;
                        if (v9Var != null && !z10) {
                            v9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                dj0 dj0Var = (dj0) this.e;
                wi0 wi0Var = dj0Var.K;
                boolean z11 = this.f18855b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                dj0Var.E = f7;
                dj0Var.f33108x = false;
                dj0Var.f33110y = false;
                dj0Var.H.setAlpha(f7);
                if (z11) {
                    dj0Var.f33106w = false;
                    dj0Var.v = false;
                }
                pf pfVar2 = dj0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = dj0Var.f33100r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                ug ugVar = dj0Var.W;
                if (ugVar != null && !dj0Var.f33101s) {
                    ugVar.setAlpha(1.0f);
                }
                if (!z11 && (qi0Var = dj0Var.X) != null) {
                    qi0Var.setAlpha(0.0f);
                }
                if (!this.f18856c && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                wi0Var.invalidate();
                wi0Var.setAlpha(dj0Var.E);
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = dj0Var.f33100r0) != null && u1Var.isAttachedToWindow()) {
                        dj0Var.f33100r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = dj0Var.S) != null && pfVar.isAttachedToWindow()) {
                        dj0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(dj0 dj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = dj0Var;
        this.f18855b = z10;
        this.f18856c = z11;
        this.d = runnable;
    }
}
