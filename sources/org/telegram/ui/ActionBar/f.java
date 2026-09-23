package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ji0;
import org.telegram.ui.pi0;
import org.telegram.ui.wi0;
public final class f extends AnimatorListenerAdapter {
    public final int f18606a = 0;
    public final boolean f18607b;
    public final boolean f18608c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.f18607b = z10;
        this.f18608c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pf pfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        ji0 ji0Var;
        switch (this.f18606a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f18607b;
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
                        if (z10 && !this.f18608c) {
                            i5 i5Var = kVar.f19295n[0];
                            if (i5Var != null) {
                                i5Var.setVisibility(8);
                            }
                            i5 i5Var2 = kVar.f19295n[1];
                            if (i5Var2 != null) {
                                i5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f19280f;
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
                wi0 wi0Var = (wi0) this.e;
                pi0 pi0Var = wi0Var.K;
                boolean z11 = this.f18607b;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wi0Var.E = f7;
                wi0Var.f39026x = false;
                wi0Var.f39028y = false;
                wi0Var.H.setAlpha(f7);
                if (z11) {
                    wi0Var.f39024w = false;
                    wi0Var.v = false;
                }
                pf pfVar2 = wi0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = wi0Var.f39018r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                ug ugVar = wi0Var.W;
                if (ugVar != null && !wi0Var.f39019s) {
                    ugVar.setAlpha(1.0f);
                }
                if (!z11 && (ji0Var = wi0Var.X) != null) {
                    ji0Var.setAlpha(0.0f);
                }
                if (!this.f18608c && (viewGroup = wi0Var.Z) != null) {
                    viewGroup.setAlpha(wi0Var.E);
                }
                pi0Var.invalidate();
                pi0Var.setAlpha(wi0Var.E);
                wi0Var.F.invalidate();
                wi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = wi0Var.f39018r0) != null && t1Var.isAttachedToWindow()) {
                        wi0Var.f39018r0.post(runnable);
                        return;
                    } else if (!z11 && (pfVar = wi0Var.S) != null && pfVar.isAttachedToWindow()) {
                        wi0Var.S.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(wi0 wi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = wi0Var;
        this.f18607b = z10;
        this.f18608c = z11;
        this.d = runnable;
    }
}
