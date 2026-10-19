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
import org.telegram.ui.ei0;
import org.telegram.ui.li0;
import org.telegram.ui.yh0;
public final class f extends AnimatorListenerAdapter {
    public final int f20789a = 0;
    public final boolean f20790b;
    public final boolean f20791c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f20790b = z10;
        this.f20791c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        yh0 yh0Var;
        switch (this.f20789a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20790b;
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
                        if (z10 && !this.f20791c) {
                            j5 j5Var = kVar.f21495n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.f21495n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f21480f;
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
                li0 li0Var = (li0) this.e;
                ei0 ei0Var = li0Var.K;
                boolean z11 = this.f20790b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                li0Var.E = f7;
                li0Var.f38960x = false;
                li0Var.f38962y = false;
                li0Var.H.setAlpha(f7);
                if (z11) {
                    li0Var.f38958w = false;
                    li0Var.v = false;
                }
                pf pfVar2 = li0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = li0Var.f38952r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = li0Var.W;
                if (vgVar != null && !li0Var.f38953s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (yh0Var = li0Var.X) != null) {
                    yh0Var.setAlpha(0.0f);
                }
                if (!this.f20791c && (viewGroup = li0Var.Z) != null) {
                    viewGroup.setAlpha(li0Var.E);
                }
                ei0Var.invalidate();
                ei0Var.setAlpha(li0Var.E);
                li0Var.F.invalidate();
                li0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = li0Var.f38952r0) != null && u1Var.isAttachedToWindow()) {
                        li0Var.f38952r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = li0Var.S) != null && pfVar.isAttachedToWindow()) {
                        li0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(li0 li0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = li0Var;
        this.f20790b = z10;
        this.f20791c = z11;
        this.d = runnable;
    }
}
