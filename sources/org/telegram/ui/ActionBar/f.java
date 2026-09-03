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
import org.telegram.ui.hi0;
import org.telegram.ui.ni0;
import org.telegram.ui.ui0;
public final class f extends AnimatorListenerAdapter {
    public final int f19646a = 0;
    public final boolean f19647b;
    public final boolean f19648c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z4, boolean z10) {
        this.e = kVar;
        this.d = arrayList;
        this.f19647b = z4;
        this.f19648c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ff ffVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        hi0 hi0Var;
        switch (this.f19646a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z4 = this.f19647b;
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
                        if (z4 && !this.f19648c) {
                            k5 k5Var = kVar.f20309n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.f20309n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f20294f;
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
                ui0 ui0Var = (ui0) this.e;
                ni0 ni0Var = ui0Var.H;
                boolean z10 = this.f19647b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ui0Var.B = f10;
                ui0Var.f38855x = false;
                ui0Var.f38856y = false;
                ui0Var.E.setAlpha(f10);
                if (z10) {
                    ui0Var.f38853w = false;
                    ui0Var.v = false;
                }
                ff ffVar2 = ui0Var.P;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ui0Var.f38843o0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                lg lgVar = ui0Var.T;
                if (lgVar != null && !ui0Var.f38848s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z10 && (hi0Var = ui0Var.U) != null) {
                    hi0Var.setAlpha(0.0f);
                }
                if (!this.f19648c && (viewGroup = ui0Var.W) != null) {
                    viewGroup.setAlpha(ui0Var.B);
                }
                ni0Var.invalidate();
                ni0Var.setAlpha(ui0Var.B);
                ui0Var.C.invalidate();
                ui0Var.D.invalidate();
                if (runnable != null) {
                    if (!z10 && (s1Var = ui0Var.f38843o0) != null && s1Var.isAttachedToWindow()) {
                        ui0Var.f38843o0.post(runnable);
                        return;
                    } else if (!z10 && (ffVar = ui0Var.P) != null && ffVar.isAttachedToWindow()) {
                        ui0Var.P.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(ui0 ui0Var, boolean z4, boolean z10, Runnable runnable) {
        this.e = ui0Var;
        this.f19647b = z4;
        this.f19648c = z10;
        this.d = runnable;
    }
}
