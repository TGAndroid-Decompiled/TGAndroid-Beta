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
import org.telegram.ui.Components.y9;
import org.telegram.ui.ai0;
import org.telegram.ui.gi0;
import org.telegram.ui.ni0;
public final class f extends AnimatorListenerAdapter {
    public final int f22611a = 0;
    public final boolean f22612b;
    public final boolean f22613c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f22612b = z10;
        this.f22613c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        ai0 ai0Var;
        switch (this.f22611a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f22612b;
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
                        if (z10 && !this.f22613c) {
                            b6 b6Var = kVar.f22771n[0];
                            if (b6Var != null) {
                                b6Var.setVisibility(8);
                            }
                            b6 b6Var2 = kVar.f22771n[1];
                            if (b6Var2 != null) {
                                b6Var2.setVisibility(8);
                            }
                        }
                        y9 y9Var = kVar.f22756f;
                        if (y9Var != null && !z10) {
                            y9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                ni0 ni0Var = (ni0) this.e;
                gi0 gi0Var = ni0Var.J;
                boolean z11 = this.f22612b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ni0Var.f41933y = f7;
                ni0Var.f41929w = false;
                ni0Var.f41931x = false;
                ni0Var.G.setAlpha(f7);
                if (z11) {
                    ni0Var.v = false;
                    ni0Var.f41924s = false;
                }
                pf pfVar2 = ni0Var.R;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ni0Var.f41921q0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                vg vgVar = ni0Var.V;
                if (vgVar != null && !ni0Var.f41922r) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (ai0Var = ni0Var.W) != null) {
                    ai0Var.setAlpha(0.0f);
                }
                if (!this.f22613c && (viewGroup = ni0Var.Y) != null) {
                    viewGroup.setAlpha(ni0Var.f41933y);
                }
                gi0Var.invalidate();
                gi0Var.setAlpha(ni0Var.f41933y);
                ni0Var.E.invalidate();
                ni0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = ni0Var.f41921q0) != null && s1Var.isAttachedToWindow()) {
                        ni0Var.f41921q0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = ni0Var.R) != null && pfVar.isAttachedToWindow()) {
                        ni0Var.R.post(runnable);
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
        this.f22612b = z10;
        this.f22613c = z11;
        this.d = runnable;
    }
}
