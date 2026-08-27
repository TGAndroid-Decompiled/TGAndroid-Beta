package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.n9;
import org.telegram.ui.ai0;
import org.telegram.ui.gi0;
import org.telegram.ui.ni0;

public final class f extends AnimatorListenerAdapter {

    public final int f22906a = 0;

    public final boolean f22907b;

    public final boolean f22908c;
    public final Object d;

    public final KeyEvent.Callback f22909e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f22909e = kVar;
        this.d = arrayList;
        this.f22907b = z10;
        this.f22908c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bf bfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        ai0 ai0Var;
        switch (this.f22906a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f22909e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f22907b;
                    if (i10 >= size) {
                        if (z10 && !this.f22908c) {
                            h5 h5Var = kVar.f23584n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f23584n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        n9 n9Var = kVar.f23569f;
                        if (n9Var != null && !z10) {
                            n9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i10);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                ni0 ni0Var = (ni0) this.f22909e;
                gi0 gi0Var = ni0Var.G;
                boolean z11 = this.f22907b;
                float f10 = z11 ? 1.0f : 0.0f;
                ni0Var.A = f10;
                ni0Var.f40870x = false;
                ni0Var.f40871y = false;
                ni0Var.D.setAlpha(f10);
                if (z11) {
                    ni0Var.f40869w = false;
                    ni0Var.v = false;
                }
                bf bfVar2 = ni0Var.O;
                if (bfVar2 != null) {
                    bfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ni0Var.f40858n0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                hg hgVar = ni0Var.S;
                if (hgVar != null && !ni0Var.f40864s) {
                    hgVar.setAlpha(1.0f);
                }
                if (!z11 && (ai0Var = ni0Var.T) != null) {
                    ai0Var.setAlpha(0.0f);
                }
                if (!this.f22908c && (viewGroup = ni0Var.V) != null) {
                    viewGroup.setAlpha(ni0Var.A);
                }
                gi0Var.invalidate();
                gi0Var.setAlpha(ni0Var.A);
                ni0Var.B.invalidate();
                ni0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = ni0Var.f40858n0) != null && s1Var.isAttachedToWindow()) {
                        ni0Var.f40858n0.post(runnable);
                    } else if (z11 || (bfVar = ni0Var.O) == null || !bfVar.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(runnable);
                    } else {
                        ni0Var.O.post(runnable);
                    }
                }
                break;
        }
    }

    public f(ni0 ni0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f22909e = ni0Var;
        this.f22907b = z10;
        this.f22908c = z11;
        this.d = runnable;
    }
}
