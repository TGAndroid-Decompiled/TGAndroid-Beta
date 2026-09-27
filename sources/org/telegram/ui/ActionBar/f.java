package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.w9;
import org.telegram.ui.li0;
import org.telegram.ui.ri0;
import org.telegram.ui.yi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18840a = 0;
    public final boolean f18841b;
    public final boolean f18842c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.f18841b = z10;
        this.f18842c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        qf qfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        li0 li0Var;
        switch (this.f18840a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18841b;
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
                        if (z10 && !this.f18842c) {
                            j5 j5Var = lVar.f19569n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = lVar.f19569n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = lVar.f19554f;
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
                yi0 yi0Var = (yi0) this.e;
                ri0 ri0Var = yi0Var.K;
                boolean z11 = this.f18841b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                yi0Var.E = f7;
                yi0Var.f40251x = false;
                yi0Var.f40253y = false;
                yi0Var.H.setAlpha(f7);
                if (z11) {
                    yi0Var.f40249w = false;
                    yi0Var.v = false;
                }
                qf qfVar2 = yi0Var.S;
                if (qfVar2 != null) {
                    qfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = yi0Var.f40243r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = yi0Var.W;
                if (vgVar != null && !yi0Var.f40244s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (li0Var = yi0Var.X) != null) {
                    li0Var.setAlpha(0.0f);
                }
                if (!this.f18842c && (viewGroup = yi0Var.Z) != null) {
                    viewGroup.setAlpha(yi0Var.E);
                }
                ri0Var.invalidate();
                ri0Var.setAlpha(yi0Var.E);
                yi0Var.F.invalidate();
                yi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = yi0Var.f40243r0) != null && u1Var.isAttachedToWindow()) {
                        yi0Var.f40243r0.post(runnable);
                        return;
                    } else if (!z11 && (qfVar = yi0Var.S) != null && qfVar.isAttachedToWindow()) {
                        yi0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(yi0 yi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = yi0Var;
        this.f18841b = z10;
        this.f18842c = z11;
        this.d = runnable;
    }
}
