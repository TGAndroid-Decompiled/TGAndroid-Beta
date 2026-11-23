package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.p9;
import org.telegram.ui.dg0;
import org.telegram.ui.tf0;
import org.telegram.ui.zf0;
public final class f extends AnimatorListenerAdapter {
    public final int f28998a = 0;
    public final boolean f28999b;
    public final boolean f29000c;
    public final Object d;
    public final KeyEvent.Callback f29001e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f29001e = kVar;
        this.d = arrayList;
        this.f28999b = z10;
        this.f29000c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        hf hfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        tf0 tf0Var;
        switch (this.f28998a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f29001e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f28999b;
                    if (i7 < size) {
                        View view = (View) arrayList.get(i7);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i7++;
                    } else {
                        if (z10 && !this.f29000c) {
                            n5 n5Var = kVar.f29164n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.f29164n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f29149f;
                        if (p9Var != null && !z10) {
                            p9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                dg0 dg0Var = (dg0) this.f29001e;
                zf0 zf0Var = dg0Var.K;
                boolean z11 = this.f28999b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                dg0Var.E = f10;
                dg0Var.f47122x = false;
                dg0Var.f47124y = false;
                dg0Var.H.setAlpha(f10);
                if (z11) {
                    dg0Var.f47120w = false;
                    dg0Var.f47115s = false;
                }
                hf hfVar2 = dg0Var.S;
                if (hfVar2 != null) {
                    hfVar2.setAlpha(1.0f);
                }
                ab.q qVar = dg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = dg0Var.f47119v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!dg0Var.f47113r) {
                    dg0Var.o(false, 1.0f);
                }
                if (!z11 && (tf0Var = dg0Var.X) != null) {
                    tf0Var.setAlpha(0.0f);
                }
                if (!this.f29000c && (viewGroup = dg0Var.Z) != null) {
                    viewGroup.setAlpha(dg0Var.E);
                }
                zf0Var.invalidate();
                zf0Var.setAlpha(dg0Var.E);
                dg0Var.F.invalidate();
                dg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = dg0Var.f47119v0) != null && r1Var.isAttachedToWindow()) {
                        dg0Var.f47119v0.post(runnable);
                        return;
                    } else if (!z11 && (hfVar = dg0Var.S) != null && hfVar.isAttachedToWindow()) {
                        dg0Var.S.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(dg0 dg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f29001e = dg0Var;
        this.f28999b = z10;
        this.f29000c = z11;
        this.d = runnable;
    }
}
