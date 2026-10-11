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
    public final int f20579a = 0;
    public final boolean f20580b;
    public final boolean f20581c;
    public final Object d;
    public final KeyEvent.Callback f20582e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20582e = kVar;
        this.d = arrayList;
        this.f20580b = z10;
        this.f20581c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        sf sfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
        switch (this.f20579a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f20582e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20580b;
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
                        if (z10 && !this.f20581c) {
                            h5 h5Var = kVar.f21285n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f21285n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        y9 y9Var = kVar.f21270f;
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
                cj0 cj0Var = (cj0) this.f20582e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.f20580b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cj0Var.E = f7;
                cj0Var.f36754x = false;
                cj0Var.f36756y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.f36752w = false;
                    cj0Var.v = false;
                }
                sf sfVar2 = cj0Var.S;
                if (sfVar2 != null) {
                    sfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = cj0Var.f36746r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                xg xgVar = cj0Var.W;
                if (xgVar != null && !cj0Var.f36747s) {
                    xgVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.f20581c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = cj0Var.f36746r0) != null && u1Var.isAttachedToWindow()) {
                        cj0Var.f36746r0.post(runnable);
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
        this.f20582e = cj0Var;
        this.f20580b = z10;
        this.f20581c = z11;
        this.d = runnable;
    }
}
