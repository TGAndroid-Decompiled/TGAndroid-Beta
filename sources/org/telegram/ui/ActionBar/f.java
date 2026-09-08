package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cj0;
import org.telegram.ui.pi0;
import org.telegram.ui.vi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20423a = 0;
    public final boolean f20424b;
    public final boolean f20425c;
    public final Object d;
    public final KeyEvent.Callback f20426e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20426e = kVar;
        this.d = arrayList;
        this.f20424b = z10;
        this.f20425c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        qf qfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
        switch (this.f20423a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f20426e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20424b;
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
                        if (z10 && !this.f20425c) {
                            j5 j5Var = kVar.f21129n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f21129n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        x9 x9Var = kVar.f21114f;
                        if (x9Var != null && !z10) {
                            x9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                cj0 cj0Var = (cj0) this.f20426e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.f20424b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cj0Var.E = f7;
                cj0Var.f35185x = false;
                cj0Var.f35187y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.f35183w = false;
                    cj0Var.v = false;
                }
                qf qfVar2 = cj0Var.S;
                if (qfVar2 != null) {
                    qfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = cj0Var.f35177r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                vg vgVar = cj0Var.W;
                if (vgVar != null && !cj0Var.f35178s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.f20425c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = cj0Var.f35177r0) != null && t1Var.isAttachedToWindow()) {
                        cj0Var.f35177r0.post(runnable);
                        return;
                    } else if (!z11 && (qfVar = cj0Var.S) != null && qfVar.isAttachedToWindow()) {
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
        this.f20426e = cj0Var;
        this.f20424b = z10;
        this.f20425c = z11;
        this.d = runnable;
    }
}
