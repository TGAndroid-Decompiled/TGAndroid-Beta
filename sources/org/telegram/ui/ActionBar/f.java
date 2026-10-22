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
import org.telegram.ui.fi0;
import org.telegram.ui.mi0;
import org.telegram.ui.zh0;
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
        zh0 zh0Var;
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
                mi0 mi0Var = (mi0) this.e;
                fi0 fi0Var = mi0Var.J;
                boolean z11 = this.f20794b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                mi0Var.f39290y = f7;
                mi0Var.f39286w = false;
                mi0Var.f39288x = false;
                mi0Var.G.setAlpha(f7);
                if (z11) {
                    mi0Var.v = false;
                    mi0Var.f39281s = false;
                }
                pf pfVar2 = mi0Var.R;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = mi0Var.f39278q0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = mi0Var.V;
                if (vgVar != null && !mi0Var.f39279r) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (zh0Var = mi0Var.W) != null) {
                    zh0Var.setAlpha(0.0f);
                }
                if (!this.f20795c && (viewGroup = mi0Var.Y) != null) {
                    viewGroup.setAlpha(mi0Var.f39290y);
                }
                fi0Var.invalidate();
                fi0Var.setAlpha(mi0Var.f39290y);
                mi0Var.E.invalidate();
                mi0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = mi0Var.f39278q0) != null && u1Var.isAttachedToWindow()) {
                        mi0Var.f39278q0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = mi0Var.R) != null && pfVar.isAttachedToWindow()) {
                        mi0Var.R.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(mi0 mi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = mi0Var;
        this.f20794b = z10;
        this.f20795c = z11;
        this.d = runnable;
    }
}
