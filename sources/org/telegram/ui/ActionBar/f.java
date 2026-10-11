package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.y9;
import org.telegram.ui.cj0;
import org.telegram.ui.pi0;
import org.telegram.ui.vi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20615a = 0;
    public final boolean f20616b;
    public final boolean f20617c;
    public final Object d;
    public final KeyEvent.Callback f20618e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20618e = kVar;
        this.d = arrayList;
        this.f20616b = z10;
        this.f20617c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        sf sfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
        switch (this.f20615a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f20618e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20616b;
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
                        if (z10 && !this.f20617c) {
                            h5 h5Var = kVar.f21321n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f21321n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        y9 y9Var = kVar.f21306f;
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
                cj0 cj0Var = (cj0) this.f20618e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.f20616b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cj0Var.E = f7;
                cj0Var.f36788x = false;
                cj0Var.f36790y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.f36786w = false;
                    cj0Var.v = false;
                }
                sf sfVar2 = cj0Var.S;
                if (sfVar2 != null) {
                    sfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = cj0Var.f36780r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                xg xgVar = cj0Var.W;
                if (xgVar != null && !cj0Var.f36781s) {
                    xgVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.f20617c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = cj0Var.f36780r0) != null && u1Var.isAttachedToWindow()) {
                        cj0Var.f36780r0.post(runnable);
                        return;
                    } else if (!z11 && (sfVar = cj0Var.S) != null && sfVar.isAttachedToWindow()) {
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
        this.f20618e = cj0Var;
        this.f20616b = z10;
        this.f20617c = z11;
        this.d = runnable;
    }
}
