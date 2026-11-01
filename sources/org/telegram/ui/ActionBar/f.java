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
import org.telegram.ui.eh0;
import org.telegram.ui.ih0;
import org.telegram.ui.yg0;
public final class f extends AnimatorListenerAdapter {
    public final int f20290a = 0;
    public final boolean f20291b;
    public final boolean f20292c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.f20291b = z10;
        this.f20292c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        se seVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        yg0 yg0Var;
        switch (this.f20290a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20291b;
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
                        if (z10 && !this.f20292c) {
                            u5 u5Var = lVar.f20497n[0];
                            if (u5Var != null) {
                                u5Var.setVisibility(8);
                            }
                            u5 u5Var2 = lVar.f20497n[1];
                            if (u5Var2 != null) {
                                u5Var2.setVisibility(8);
                            }
                        }
                        g9 g9Var = lVar.f20482f;
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
                ih0 ih0Var = (ih0) this.e;
                eh0 eh0Var = ih0Var.J;
                boolean z11 = this.f20291b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ih0Var.D = f7;
                ih0Var.f38088x = false;
                ih0Var.f38090y = false;
                ih0Var.G.setAlpha(f7);
                if (z11) {
                    ih0Var.f38086w = false;
                    ih0Var.f38081s = false;
                }
                se seVar2 = ih0Var.R;
                if (seVar2 != null) {
                    seVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = ih0Var.f38078q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                zf zfVar = ih0Var.V;
                if (zfVar != null && !ih0Var.f38079r) {
                    zfVar.setAlpha(1.0f);
                }
                if (!z11 && (yg0Var = ih0Var.W) != null) {
                    yg0Var.setAlpha(0.0f);
                }
                if (!this.f20292c && (viewGroup = ih0Var.Y) != null) {
                    viewGroup.setAlpha(ih0Var.D);
                }
                eh0Var.invalidate();
                eh0Var.setAlpha(ih0Var.D);
                ih0Var.E.invalidate();
                ih0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = ih0Var.f38078q0) != null && q1Var.isAttachedToWindow()) {
                        ih0Var.f38078q0.post(runnable);
                        return;
                    } else if (!z11 && (seVar = ih0Var.R) != null && seVar.isAttachedToWindow()) {
                        ih0Var.R.post(runnable);
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(ih0 ih0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = ih0Var;
        this.f20291b = z10;
        this.f20292c = z11;
        this.d = runnable;
    }
}
