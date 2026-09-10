package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xg;
import org.telegram.ui.cj0;
import org.telegram.ui.pi0;
import org.telegram.ui.vi0;
public final class f extends AnimatorListenerAdapter {
    public final int f17695a = 0;
    public final boolean f17696b;
    public final boolean f17697c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.f17696b = z10;
        this.f17697c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        rf rfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
        switch (this.f17695a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f17696b;
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
                        if (z10 && !this.f17697c) {
                            l5 l5Var = lVar.f18388n[0];
                            if (l5Var != null) {
                                l5Var.setVisibility(8);
                            }
                            l5 l5Var2 = lVar.f18388n[1];
                            if (l5Var2 != null) {
                                l5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = lVar.f18373f;
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
                cj0 cj0Var = (cj0) this.e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.f17696b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cj0Var.E = f7;
                cj0Var.f31712x = false;
                cj0Var.f31714y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.f31710w = false;
                    cj0Var.v = false;
                }
                rf rfVar2 = cj0Var.S;
                if (rfVar2 != null) {
                    rfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = cj0Var.f31704r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                xg xgVar = cj0Var.W;
                if (xgVar != null && !cj0Var.f31705s) {
                    xgVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.f17697c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = cj0Var.f31704r0) != null && t1Var.isAttachedToWindow()) {
                        cj0Var.f31704r0.post(runnable);
                        return;
                    } else if (!z11 && (rfVar = cj0Var.S) != null && rfVar.isAttachedToWindow()) {
                        cj0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(cj0 cj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = cj0Var;
        this.f17696b = z10;
        this.f17697c = z11;
        this.d = runnable;
    }
}
