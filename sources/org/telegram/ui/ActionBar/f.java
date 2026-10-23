package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.w9;
import org.telegram.ui.di0;
import org.telegram.ui.ji0;
import org.telegram.ui.qi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20876a = 0;
    public final boolean f20877b;
    public final boolean f20878c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f20877b = z10;
        this.f20878c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        di0 di0Var;
        switch (this.f20876a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20877b;
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
                        if (z10 && !this.f20878c) {
                            n5 n5Var = kVar.f21067n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.f21067n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f21052f;
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
                qi0 qi0Var = (qi0) this.e;
                ji0 ji0Var = qi0Var.J;
                boolean z11 = this.f20877b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qi0Var.f40850y = f7;
                qi0Var.f40846w = false;
                qi0Var.f40848x = false;
                qi0Var.G.setAlpha(f7);
                if (z11) {
                    qi0Var.v = false;
                    qi0Var.f40841s = false;
                }
                pf pfVar2 = qi0Var.R;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = qi0Var.f40838q0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                vg vgVar = qi0Var.V;
                if (vgVar != null && !qi0Var.f40839r) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (di0Var = qi0Var.W) != null) {
                    di0Var.setAlpha(0.0f);
                }
                if (!this.f20878c && (viewGroup = qi0Var.Y) != null) {
                    viewGroup.setAlpha(qi0Var.f40850y);
                }
                ji0Var.invalidate();
                ji0Var.setAlpha(qi0Var.f40850y);
                qi0Var.E.invalidate();
                qi0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = qi0Var.f40838q0) != null && t1Var.isAttachedToWindow()) {
                        qi0Var.f40838q0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = qi0Var.R) != null && pfVar.isAttachedToWindow()) {
                        qi0Var.R.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(qi0 qi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = qi0Var;
        this.f20877b = z10;
        this.f20878c = z11;
        this.d = runnable;
    }
}
