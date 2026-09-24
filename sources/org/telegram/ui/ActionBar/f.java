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
import org.telegram.ui.Components.w9;
import org.telegram.ui.ii0;
import org.telegram.ui.oi0;
import org.telegram.ui.vi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18847a = 0;
    public final boolean f18848b;
    public final boolean f18849c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18848b = z10;
        this.f18849c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        qf qfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ii0 ii0Var;
        switch (this.f18847a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18848b;
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
                        if (z10 && !this.f18849c) {
                            h5 h5Var = kVar.f19540n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f19540n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f19525f;
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
                vi0 vi0Var = (vi0) this.e;
                oi0 oi0Var = vi0Var.K;
                boolean z11 = this.f18848b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                vi0Var.E = f7;
                vi0Var.f38740x = false;
                vi0Var.f38742y = false;
                vi0Var.H.setAlpha(f7);
                if (z11) {
                    vi0Var.f38738w = false;
                    vi0Var.v = false;
                }
                qf qfVar2 = vi0Var.S;
                if (qfVar2 != null) {
                    qfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = vi0Var.f38732r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = vi0Var.W;
                if (vgVar != null && !vi0Var.f38733s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (ii0Var = vi0Var.X) != null) {
                    ii0Var.setAlpha(0.0f);
                }
                if (!this.f18849c && (viewGroup = vi0Var.Z) != null) {
                    viewGroup.setAlpha(vi0Var.E);
                }
                oi0Var.invalidate();
                oi0Var.setAlpha(vi0Var.E);
                vi0Var.F.invalidate();
                vi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = vi0Var.f38732r0) != null && u1Var.isAttachedToWindow()) {
                        vi0Var.f38732r0.post(runnable);
                        return;
                    } else if (!z11 && (qfVar = vi0Var.S) != null && qfVar.isAttachedToWindow()) {
                        vi0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(vi0 vi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = vi0Var;
        this.f18848b = z10;
        this.f18849c = z11;
        this.d = runnable;
    }
}
