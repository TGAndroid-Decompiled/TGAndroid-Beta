package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.lf0;
import org.telegram.ui.rf0;
import org.telegram.ui.vf0;
public final class f extends AnimatorListenerAdapter {
    public final int f27482a = 0;
    public final boolean f27483b;
    public final boolean f27484c;
    public final Object d;
    public final KeyEvent.Callback f27485e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f27485e = kVar;
        this.d = arrayList;
        this.f27483b = z10;
        this.f27484c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ve veVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        lf0 lf0Var;
        switch (this.f27482a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f27485e;
                int i3 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f27483b;
                    if (i3 < size) {
                        View view = (View) arrayList.get(i3);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i3++;
                    } else {
                        if (z10 && !this.f27484c) {
                            k5 k5Var = kVar.f27725n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.f27725n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        k9 k9Var = kVar.f27711f;
                        if (k9Var != null && !z10) {
                            k9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                vf0 vf0Var = (vf0) this.f27485e;
                rf0 rf0Var = vf0Var.K;
                boolean z11 = this.f27483b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                vf0Var.E = f10;
                vf0Var.f50503x = false;
                vf0Var.f50505y = false;
                vf0Var.H.setAlpha(f10);
                if (z11) {
                    vf0Var.f50501w = false;
                    vf0Var.f50496s = false;
                }
                ve veVar2 = vf0Var.S;
                if (veVar2 != null) {
                    veVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = vf0Var.f50495r0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                bg bgVar = vf0Var.W;
                if (bgVar != null && !vf0Var.f50494r) {
                    bgVar.setAlpha(1.0f);
                }
                if (!z11 && (lf0Var = vf0Var.X) != null) {
                    lf0Var.setAlpha(0.0f);
                }
                if (!this.f27484c && (viewGroup = vf0Var.Z) != null) {
                    viewGroup.setAlpha(vf0Var.E);
                }
                rf0Var.invalidate();
                rf0Var.setAlpha(vf0Var.E);
                vf0Var.F.invalidate();
                vf0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = vf0Var.f50495r0) != null && q1Var.isAttachedToWindow()) {
                        vf0Var.f50495r0.post(runnable);
                        return;
                    } else if (!z11 && (veVar = vf0Var.S) != null && veVar.isAttachedToWindow()) {
                        vf0Var.S.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(vf0 vf0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f27485e = vf0Var;
        this.f27483b = z10;
        this.f27484c = z11;
        this.d = runnable;
    }
}
