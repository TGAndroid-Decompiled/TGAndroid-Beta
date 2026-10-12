package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.z9;
import org.telegram.ui.aj0;
import org.telegram.ui.hj0;
import org.telegram.ui.ui0;
public final class f extends AnimatorListenerAdapter {
    public final int f19767a = 0;
    public final boolean f19768b;
    public final boolean f19769c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f19768b = z10;
        this.f19769c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        rf rfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ui0 ui0Var;
        switch (this.f19767a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f19768b;
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
                        if (z10 && !this.f19769c) {
                            h5 h5Var = kVar.f20441n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f20441n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        z9 z9Var = kVar.f20426f;
                        if (z9Var != null && !z10) {
                            z9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                hj0 hj0Var = (hj0) this.e;
                aj0 aj0Var = hj0Var.K;
                boolean z11 = this.f19768b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                hj0Var.E = f7;
                hj0Var.f36864x = false;
                hj0Var.f36866y = false;
                hj0Var.H.setAlpha(f7);
                if (z11) {
                    hj0Var.f36862w = false;
                    hj0Var.v = false;
                }
                rf rfVar2 = hj0Var.S;
                if (rfVar2 != null) {
                    rfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = hj0Var.f36856r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                wg wgVar = hj0Var.W;
                if (wgVar != null && !hj0Var.f36857s) {
                    wgVar.setAlpha(1.0f);
                }
                if (!z11 && (ui0Var = hj0Var.X) != null) {
                    ui0Var.setAlpha(0.0f);
                }
                if (!this.f19769c && (viewGroup = hj0Var.Z) != null) {
                    viewGroup.setAlpha(hj0Var.E);
                }
                aj0Var.invalidate();
                aj0Var.setAlpha(hj0Var.E);
                hj0Var.F.invalidate();
                hj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = hj0Var.f36856r0) != null && u1Var.isAttachedToWindow()) {
                        hj0Var.f36856r0.post(runnable);
                        return;
                    } else if (!z11 && (rfVar = hj0Var.S) != null && rfVar.isAttachedToWindow()) {
                        hj0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(hj0 hj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = hj0Var;
        this.f19768b = z10;
        this.f19769c = z11;
        this.d = runnable;
    }
}
