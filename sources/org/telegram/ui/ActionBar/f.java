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
import org.telegram.ui.bi0;
import org.telegram.ui.hi0;
import org.telegram.ui.oi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20793a = 0;
    public final boolean f20794b;
    public final boolean f20795c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f20794b = z10;
        this.f20795c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        bi0 bi0Var;
        switch (this.f20793a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20794b;
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
                        if (z10 && !this.f20795c) {
                            j5 j5Var = kVar.f21499n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f21499n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f21484f;
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
                oi0 oi0Var = (oi0) this.e;
                hi0 hi0Var = oi0Var.K;
                boolean z11 = this.f20794b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                oi0Var.E = f7;
                oi0Var.f39838x = false;
                oi0Var.f39840y = false;
                oi0Var.H.setAlpha(f7);
                if (z11) {
                    oi0Var.f39836w = false;
                    oi0Var.v = false;
                }
                pf pfVar2 = oi0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = oi0Var.f39830r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = oi0Var.W;
                if (vgVar != null && !oi0Var.f39831s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (bi0Var = oi0Var.X) != null) {
                    bi0Var.setAlpha(0.0f);
                }
                if (!this.f20795c && (viewGroup = oi0Var.Z) != null) {
                    viewGroup.setAlpha(oi0Var.E);
                }
                hi0Var.invalidate();
                hi0Var.setAlpha(oi0Var.E);
                oi0Var.F.invalidate();
                oi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = oi0Var.f39830r0) != null && u1Var.isAttachedToWindow()) {
                        oi0Var.f39830r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = oi0Var.S) != null && pfVar.isAttachedToWindow()) {
                        oi0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(oi0 oi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = oi0Var;
        this.f20794b = z10;
        this.f20795c = z11;
        this.d = runnable;
    }
}
