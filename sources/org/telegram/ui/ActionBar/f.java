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
import org.telegram.ui.Components.w9;
import org.telegram.ui.cj0;
import org.telegram.ui.pi0;
import org.telegram.ui.vi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18804a = 0;
    public final boolean f18805b;
    public final boolean f18806c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18805b = z10;
        this.f18806c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
        switch (this.f18804a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18805b;
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
                        if (z10 && !this.f18806c) {
                            j5 j5Var = kVar.f19504n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f19504n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f19489f;
                        if (w9Var != null && !z10) {
                            w9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                cj0 cj0Var = (cj0) this.e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.f18805b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cj0Var.E = f7;
                cj0Var.f32701x = false;
                cj0Var.f32703y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.f32699w = false;
                    cj0Var.v = false;
                }
                pf pfVar2 = cj0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = cj0Var.f32693r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                ug ugVar = cj0Var.W;
                if (ugVar != null && !cj0Var.f32694s) {
                    ugVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.f18806c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = cj0Var.f32693r0) != null && u1Var.isAttachedToWindow()) {
                        cj0Var.f32693r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = cj0Var.S) != null && pfVar.isAttachedToWindow()) {
                        cj0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(cj0 cj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = cj0Var;
        this.f18805b = z10;
        this.f18806c = z11;
        this.d = runnable;
    }
}
