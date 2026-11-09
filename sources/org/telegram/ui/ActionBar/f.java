package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xe;
import org.telegram.ui.dg0;
import org.telegram.ui.tf0;
import org.telegram.ui.zf0;
public final class f extends AnimatorListenerAdapter {
    public final int f27460a = 0;
    public final boolean f27461b;
    public final boolean f27462c;
    public final Object d;
    public final KeyEvent.Callback f27463e;

    public f(k kVar, ArrayList arrayList, boolean z9, boolean z10) {
        this.f27463e = kVar;
        this.d = arrayList;
        this.f27461b = z9;
        this.f27462c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        xe xeVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        tf0 tf0Var;
        switch (this.f27460a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f27463e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z9 = this.f27461b;
                    if (i7 < size) {
                        View view = (View) arrayList.get(i7);
                        if (z9) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i7++;
                    } else {
                        if (z9 && !this.f27462c) {
                            l5 l5Var = kVar.f27663n[0];
                            if (l5Var != null) {
                                l5Var.setVisibility(8);
                            }
                            l5 l5Var2 = kVar.f27663n[1];
                            if (l5Var2 != null) {
                                l5Var2.setVisibility(8);
                            }
                        }
                        l9 l9Var = kVar.f27648f;
                        if (l9Var != null && !z9) {
                            l9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                dg0 dg0Var = (dg0) this.f27463e;
                zf0 zf0Var = dg0Var.J;
                boolean z10 = this.f27461b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                dg0Var.D = f10;
                dg0Var.f44978x = false;
                dg0Var.f44980y = false;
                dg0Var.G.setAlpha(f10);
                if (z10) {
                    dg0Var.f44976w = false;
                    dg0Var.f44971s = false;
                }
                xe xeVar2 = dg0Var.R;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = dg0Var.f44968q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                dg dgVar = dg0Var.V;
                if (dgVar != null && !dg0Var.f44969r) {
                    dgVar.setAlpha(1.0f);
                }
                if (!z10 && (tf0Var = dg0Var.W) != null) {
                    tf0Var.setAlpha(0.0f);
                }
                if (!this.f27462c && (viewGroup = dg0Var.Y) != null) {
                    viewGroup.setAlpha(dg0Var.D);
                }
                zf0Var.invalidate();
                zf0Var.setAlpha(dg0Var.D);
                dg0Var.E.invalidate();
                dg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = dg0Var.f44968q0) != null && q1Var.isAttachedToWindow()) {
                        dg0Var.f44968q0.post(runnable);
                        return;
                    } else if (!z10 && (xeVar = dg0Var.R) != null && xeVar.isAttachedToWindow()) {
                        dg0Var.R.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(dg0 dg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.f27463e = dg0Var;
        this.f27461b = z9;
        this.f27462c = z10;
        this.d = runnable;
    }
}
