package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zg;
import org.telegram.ui.ej0;
import org.telegram.ui.ri0;
import org.telegram.ui.xi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20372a = 0;
    public final boolean f20373b;
    public final boolean f20374c;
    public final Object d;
    public final KeyEvent.Callback f20375e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20375e = kVar;
        this.d = arrayList;
        this.f20373b = z10;
        this.f20374c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        uf ufVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ri0 ri0Var;
        switch (this.f20372a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f20375e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20373b;
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
                        if (z10 && !this.f20374c) {
                            h5 h5Var = kVar.f21059n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f21059n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        y9 y9Var = kVar.f21044f;
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
                ej0 ej0Var = (ej0) this.f20375e;
                xi0 xi0Var = ej0Var.K;
                boolean z11 = this.f20373b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ej0Var.E = f7;
                ej0Var.f37156x = false;
                ej0Var.f37158y = false;
                ej0Var.H.setAlpha(f7);
                if (z11) {
                    ej0Var.f37154w = false;
                    ej0Var.v = false;
                }
                uf ufVar2 = ej0Var.S;
                if (ufVar2 != null) {
                    ufVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = ej0Var.f37148r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                zg zgVar = ej0Var.W;
                if (zgVar != null && !ej0Var.f37149s) {
                    zgVar.setAlpha(1.0f);
                }
                if (!z11 && (ri0Var = ej0Var.X) != null) {
                    ri0Var.setAlpha(0.0f);
                }
                if (!this.f20374c && (viewGroup = ej0Var.Z) != null) {
                    viewGroup.setAlpha(ej0Var.E);
                }
                xi0Var.invalidate();
                xi0Var.setAlpha(ej0Var.E);
                ej0Var.F.invalidate();
                ej0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = ej0Var.f37148r0) != null && u1Var.isAttachedToWindow()) {
                        ej0Var.f37148r0.post(runnable);
                        return;
                    } else if (!z11 && (ufVar = ej0Var.S) != null && ufVar.isAttachedToWindow()) {
                        ej0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(ej0 ej0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f20375e = ej0Var;
        this.f20373b = z10;
        this.f20374c = z11;
        this.d = runnable;
    }
}
