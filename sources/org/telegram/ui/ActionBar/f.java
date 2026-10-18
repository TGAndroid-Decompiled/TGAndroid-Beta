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
import org.telegram.ui.ai0;
import org.telegram.ui.gi0;
import org.telegram.ui.ni0;
public final class f extends AnimatorListenerAdapter {
    public final int f20786a = 0;
    public final boolean f20787b;
    public final boolean f20788c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f20787b = z10;
        this.f20788c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ai0 ai0Var;
        switch (this.f20786a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20787b;
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
                        if (z10 && !this.f20788c) {
                            j5 j5Var = kVar.f21492n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f21492n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f21477f;
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
                ni0 ni0Var = (ni0) this.e;
                gi0 gi0Var = ni0Var.K;
                boolean z11 = this.f20787b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ni0Var.E = f7;
                ni0Var.f39478x = false;
                ni0Var.f39480y = false;
                ni0Var.H.setAlpha(f7);
                if (z11) {
                    ni0Var.f39476w = false;
                    ni0Var.v = false;
                }
                pf pfVar2 = ni0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = ni0Var.f39470r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = ni0Var.W;
                if (vgVar != null && !ni0Var.f39471s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (ai0Var = ni0Var.X) != null) {
                    ai0Var.setAlpha(0.0f);
                }
                if (!this.f20788c && (viewGroup = ni0Var.Z) != null) {
                    viewGroup.setAlpha(ni0Var.E);
                }
                gi0Var.invalidate();
                gi0Var.setAlpha(ni0Var.E);
                ni0Var.F.invalidate();
                ni0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = ni0Var.f39470r0) != null && u1Var.isAttachedToWindow()) {
                        ni0Var.f39470r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = ni0Var.S) != null && pfVar.isAttachedToWindow()) {
                        ni0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(ni0 ni0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = ni0Var;
        this.f20787b = z10;
        this.f20788c = z11;
        this.d = runnable;
    }
}
