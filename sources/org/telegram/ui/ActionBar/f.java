package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wg;
import org.telegram.ui.mi0;
import org.telegram.ui.si0;
import org.telegram.ui.zi0;
public final class f extends AnimatorListenerAdapter {
    public final int f20587a = 0;
    public final boolean f20588b;
    public final boolean f20589c;
    public final Object d;
    public final KeyEvent.Callback f20590e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20590e = kVar;
        this.d = arrayList;
        this.f20588b = z10;
        this.f20589c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        rf rfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        mi0 mi0Var;
        switch (this.f20587a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f20590e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f20588b;
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
                        if (z10 && !this.f20589c) {
                            i5 i5Var = kVar.f21285n[0];
                            if (i5Var != null) {
                                i5Var.setVisibility(8);
                            }
                            i5 i5Var2 = kVar.f21285n[1];
                            if (i5Var2 != null) {
                                i5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f21270f;
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
                zi0 zi0Var = (zi0) this.f20590e;
                si0 si0Var = zi0Var.K;
                boolean z11 = this.f20588b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zi0Var.E = f7;
                zi0Var.f43833x = false;
                zi0Var.f43835y = false;
                zi0Var.H.setAlpha(f7);
                if (z11) {
                    zi0Var.f43831w = false;
                    zi0Var.v = false;
                }
                rf rfVar2 = zi0Var.S;
                if (rfVar2 != null) {
                    rfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = zi0Var.f43825r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                wg wgVar = zi0Var.W;
                if (wgVar != null && !zi0Var.f43826s) {
                    wgVar.setAlpha(1.0f);
                }
                if (!z11 && (mi0Var = zi0Var.X) != null) {
                    mi0Var.setAlpha(0.0f);
                }
                if (!this.f20589c && (viewGroup = zi0Var.Z) != null) {
                    viewGroup.setAlpha(zi0Var.E);
                }
                si0Var.invalidate();
                si0Var.setAlpha(zi0Var.E);
                zi0Var.F.invalidate();
                zi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = zi0Var.f43825r0) != null && u1Var.isAttachedToWindow()) {
                        zi0Var.f43825r0.post(runnable);
                        return;
                    } else if (!z11 && (rfVar = zi0Var.S) != null && rfVar.isAttachedToWindow()) {
                        zi0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(zi0 zi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f20590e = zi0Var;
        this.f20588b = z10;
        this.f20589c = z11;
        this.d = runnable;
    }
}
