package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.xe;
import org.telegram.ui.bg0;
import org.telegram.ui.rf0;
import org.telegram.ui.xf0;
public final class f extends AnimatorListenerAdapter {
    public final int f28519a = 0;
    public final boolean f28520b;
    public final boolean f28521c;
    public final Object d;
    public final KeyEvent.Callback f28522e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f28522e = kVar;
        this.d = arrayList;
        this.f28520b = z10;
        this.f28521c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        xe xeVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        rf0 rf0Var;
        switch (this.f28519a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f28522e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f28520b;
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
                        if (z10 && !this.f28521c) {
                            j5 j5Var = kVar.f29302n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f29302n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        i9 i9Var = kVar.f29287f;
                        if (i9Var != null && !z10) {
                            i9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                bg0 bg0Var = (bg0) this.f28522e;
                xf0 xf0Var = bg0Var.K;
                boolean z11 = this.f28520b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                bg0Var.E = f10;
                bg0Var.f45743x = false;
                bg0Var.f45745y = false;
                bg0Var.H.setAlpha(f10);
                if (z11) {
                    bg0Var.f45741w = false;
                    bg0Var.f45736s = false;
                }
                xe xeVar2 = bg0Var.S;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                ab.q qVar = bg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.f45740v0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                if (!bg0Var.f45734r) {
                    bg0Var.o(false, 1.0f);
                }
                if (!z11 && (rf0Var = bg0Var.X) != null) {
                    rf0Var.setAlpha(0.0f);
                }
                if (!this.f28521c && (viewGroup = bg0Var.Z) != null) {
                    viewGroup.setAlpha(bg0Var.E);
                }
                xf0Var.invalidate();
                xf0Var.setAlpha(bg0Var.E);
                bg0Var.F.invalidate();
                bg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = bg0Var.f45740v0) != null && q1Var.isAttachedToWindow()) {
                        bg0Var.f45740v0.post(runnable);
                        return;
                    } else if (!z11 && (xeVar = bg0Var.S) != null && xeVar.isAttachedToWindow()) {
                        bg0Var.S.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(bg0 bg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f28522e = bg0Var;
        this.f28520b = z10;
        this.f28521c = z11;
        this.d = runnable;
    }
}
