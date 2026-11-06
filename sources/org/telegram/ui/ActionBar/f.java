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
import org.telegram.ui.bg0;
import org.telegram.ui.rf0;
import org.telegram.ui.xf0;
public final class f extends AnimatorListenerAdapter {
    public final int f27457a = 0;
    public final boolean f27458b;
    public final boolean f27459c;
    public final Object d;
    public final KeyEvent.Callback f27460e;

    public f(k kVar, ArrayList arrayList, boolean z9, boolean z10) {
        this.f27460e = kVar;
        this.d = arrayList;
        this.f27458b = z9;
        this.f27459c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        xe xeVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        rf0 rf0Var;
        switch (this.f27457a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f27460e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z9 = this.f27458b;
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
                        if (z9 && !this.f27459c) {
                            k5 k5Var = kVar.f27675n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.f27675n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        l9 l9Var = kVar.f27660f;
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
                bg0 bg0Var = (bg0) this.f27460e;
                xf0 xf0Var = bg0Var.J;
                boolean z10 = this.f27458b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                bg0Var.D = f10;
                bg0Var.f44347x = false;
                bg0Var.f44349y = false;
                bg0Var.G.setAlpha(f10);
                if (z10) {
                    bg0Var.f44345w = false;
                    bg0Var.f44340s = false;
                }
                xe xeVar2 = bg0Var.R;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.f44337q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                dg dgVar = bg0Var.V;
                if (dgVar != null && !bg0Var.f44338r) {
                    dgVar.setAlpha(1.0f);
                }
                if (!z10 && (rf0Var = bg0Var.W) != null) {
                    rf0Var.setAlpha(0.0f);
                }
                if (!this.f27459c && (viewGroup = bg0Var.Y) != null) {
                    viewGroup.setAlpha(bg0Var.D);
                }
                xf0Var.invalidate();
                xf0Var.setAlpha(bg0Var.D);
                bg0Var.E.invalidate();
                bg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = bg0Var.f44337q0) != null && q1Var.isAttachedToWindow()) {
                        bg0Var.f44337q0.post(runnable);
                        return;
                    } else if (!z10 && (xeVar = bg0Var.R) != null && xeVar.isAttachedToWindow()) {
                        bg0Var.R.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(bg0 bg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.f27460e = bg0Var;
        this.f27458b = z9;
        this.f27459c = z10;
        this.d = runnable;
    }
}
