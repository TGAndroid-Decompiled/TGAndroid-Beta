package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.zf;
import org.telegram.ui.ah0;
import org.telegram.ui.gh0;
import org.telegram.ui.kh0;
public final class f extends AnimatorListenerAdapter {
    public final int f20289a = 0;
    public final boolean f20290b;
    public final boolean f20291c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.f20290b = z10;
        this.f20291c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        se seVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        ah0 ah0Var;
        switch (this.f20289a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20290b;
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
                        if (z10 && !this.f20291c) {
                            u5 u5Var = lVar.f20496n[0];
                            if (u5Var != null) {
                                u5Var.setVisibility(8);
                            }
                            u5 u5Var2 = lVar.f20496n[1];
                            if (u5Var2 != null) {
                                u5Var2.setVisibility(8);
                            }
                        }
                        g9 g9Var = lVar.f20481f;
                        if (g9Var != null && !z10) {
                            g9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                kh0 kh0Var = (kh0) this.e;
                gh0 gh0Var = kh0Var.J;
                boolean z11 = this.f20290b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                kh0Var.D = f7;
                kh0Var.f38858x = false;
                kh0Var.f38860y = false;
                kh0Var.G.setAlpha(f7);
                if (z11) {
                    kh0Var.f38856w = false;
                    kh0Var.f38851s = false;
                }
                se seVar2 = kh0Var.R;
                if (seVar2 != null) {
                    seVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = kh0Var.f38848q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                zf zfVar = kh0Var.V;
                if (zfVar != null && !kh0Var.f38849r) {
                    zfVar.setAlpha(1.0f);
                }
                if (!z11 && (ah0Var = kh0Var.W) != null) {
                    ah0Var.setAlpha(0.0f);
                }
                if (!this.f20291c && (viewGroup = kh0Var.Y) != null) {
                    viewGroup.setAlpha(kh0Var.D);
                }
                gh0Var.invalidate();
                gh0Var.setAlpha(kh0Var.D);
                kh0Var.E.invalidate();
                kh0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = kh0Var.f38848q0) != null && q1Var.isAttachedToWindow()) {
                        kh0Var.f38848q0.post(runnable);
                        return;
                    } else if (!z11 && (seVar = kh0Var.R) != null && seVar.isAttachedToWindow()) {
                        kh0Var.R.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(kh0 kh0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = kh0Var;
        this.f20290b = z10;
        this.f20291c = z11;
        this.d = runnable;
    }
}
