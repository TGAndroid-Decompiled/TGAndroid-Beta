package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.u9;
import org.telegram.ui.bj0;
import org.telegram.ui.oi0;
import org.telegram.ui.ui0;
public final class f extends AnimatorListenerAdapter {
    public final int f18619a = 0;
    public final boolean f18620b;
    public final boolean f18621c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18620b = z10;
        this.f18621c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        of ofVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        oi0 oi0Var;
        switch (this.f18619a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18620b;
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
                        if (z10 && !this.f18621c) {
                            j5 j5Var = kVar.f19315n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f19315n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        u9 u9Var = kVar.f19300f;
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
                bj0 bj0Var = (bj0) this.e;
                ui0 ui0Var = bj0Var.K;
                boolean z11 = this.f18620b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                bj0Var.E = f7;
                bj0Var.f32205x = false;
                bj0Var.f32207y = false;
                bj0Var.H.setAlpha(f7);
                if (z11) {
                    bj0Var.f32203w = false;
                    bj0Var.v = false;
                }
                of ofVar2 = bj0Var.S;
                if (ofVar2 != null) {
                    ofVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = bj0Var.f32197r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                tg tgVar = bj0Var.W;
                if (tgVar != null && !bj0Var.f32198s) {
                    tgVar.setAlpha(1.0f);
                }
                if (!z11 && (oi0Var = bj0Var.X) != null) {
                    oi0Var.setAlpha(0.0f);
                }
                if (!this.f18621c && (viewGroup = bj0Var.Z) != null) {
                    viewGroup.setAlpha(bj0Var.E);
                }
                ui0Var.invalidate();
                ui0Var.setAlpha(bj0Var.E);
                bj0Var.F.invalidate();
                bj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = bj0Var.f32197r0) != null && t1Var.isAttachedToWindow()) {
                        bj0Var.f32197r0.post(runnable);
                        return;
                    } else if (!z11 && (ofVar = bj0Var.S) != null && ofVar.isAttachedToWindow()) {
                        bj0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(bj0 bj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = bj0Var;
        this.f18620b = z10;
        this.f18621c = z11;
        this.d = runnable;
    }
}
