package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.p9;
import org.telegram.ui.gi0;
import org.telegram.ui.mi0;
import org.telegram.ui.ti0;
public final class f extends AnimatorListenerAdapter {
    public final int f21336a = 0;
    public final boolean f21337b;
    public final boolean f21338c;
    public final Object d;
    public final KeyEvent.Callback f21339e;

    public f(k kVar, ArrayList arrayList, boolean z4, boolean z10) {
        this.f21339e = kVar;
        this.d = arrayList;
        this.f21337b = z4;
        this.f21338c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ff ffVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        gi0 gi0Var;
        switch (this.f21336a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f21339e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z4 = this.f21337b;
                    if (i10 < size) {
                        View view = (View) arrayList.get(i10);
                        if (z4) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    } else {
                        if (z4 && !this.f21338c) {
                            l5 l5Var = kVar.f21550n[0];
                            if (l5Var != null) {
                                l5Var.setVisibility(8);
                            }
                            l5 l5Var2 = kVar.f21550n[1];
                            if (l5Var2 != null) {
                                l5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f21535f;
                        if (p9Var != null && !z4) {
                            p9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                ti0 ti0Var = (ti0) this.f21339e;
                mi0 mi0Var = ti0Var.H;
                boolean z10 = this.f21337b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ti0Var.B = f10;
                ti0Var.f41655x = false;
                ti0Var.f41656y = false;
                ti0Var.E.setAlpha(f10);
                if (z10) {
                    ti0Var.f41653w = false;
                    ti0Var.v = false;
                }
                ff ffVar2 = ti0Var.P;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = ti0Var.f41643o0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                lg lgVar = ti0Var.T;
                if (lgVar != null && !ti0Var.f41648s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z10 && (gi0Var = ti0Var.U) != null) {
                    gi0Var.setAlpha(0.0f);
                }
                if (!this.f21338c && (viewGroup = ti0Var.W) != null) {
                    viewGroup.setAlpha(ti0Var.B);
                }
                mi0Var.invalidate();
                mi0Var.setAlpha(ti0Var.B);
                ti0Var.C.invalidate();
                ti0Var.D.invalidate();
                if (runnable != null) {
                    if (!z10 && (t1Var = ti0Var.f41643o0) != null && t1Var.isAttachedToWindow()) {
                        ti0Var.f41643o0.post(runnable);
                        return;
                    } else if (!z10 && (ffVar = ti0Var.P) != null && ffVar.isAttachedToWindow()) {
                        ti0Var.P.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(ti0 ti0Var, boolean z4, boolean z10, Runnable runnable) {
        this.f21339e = ti0Var;
        this.f21337b = z4;
        this.f21338c = z10;
        this.d = runnable;
    }
}
