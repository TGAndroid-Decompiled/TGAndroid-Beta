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
import org.telegram.ui.dj0;
import org.telegram.ui.qi0;
import org.telegram.ui.wi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18626a = 0;
    public final boolean f18627b;
    public final boolean f18628c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18627b = z10;
        this.f18628c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        of ofVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        qi0 qi0Var;
        switch (this.f18626a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18627b;
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
                        if (z10 && !this.f18628c) {
                            k5 k5Var = kVar.f19304n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.f19304n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        u9 u9Var = kVar.f19289f;
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
                dj0 dj0Var = (dj0) this.e;
                wi0 wi0Var = dj0Var.K;
                boolean z11 = this.f18627b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                dj0Var.E = f7;
                dj0Var.f33169x = false;
                dj0Var.f33171y = false;
                dj0Var.H.setAlpha(f7);
                if (z11) {
                    dj0Var.f33167w = false;
                    dj0Var.v = false;
                }
                of ofVar2 = dj0Var.S;
                if (ofVar2 != null) {
                    ofVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = dj0Var.f33161r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                tg tgVar = dj0Var.W;
                if (tgVar != null && !dj0Var.f33162s) {
                    tgVar.setAlpha(1.0f);
                }
                if (!z11 && (qi0Var = dj0Var.X) != null) {
                    qi0Var.setAlpha(0.0f);
                }
                if (!this.f18628c && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                wi0Var.invalidate();
                wi0Var.setAlpha(dj0Var.E);
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = dj0Var.f33161r0) != null && t1Var.isAttachedToWindow()) {
                        dj0Var.f33161r0.post(runnable);
                        return;
                    } else if (!z11 && (ofVar = dj0Var.S) != null && ofVar.isAttachedToWindow()) {
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
        this.f18627b = z10;
        this.f18628c = z11;
        this.d = runnable;
    }
}
