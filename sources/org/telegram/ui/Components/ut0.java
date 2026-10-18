package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ut0 implements View.OnClickListener {
    public final int f31090a;
    public final org.telegram.ui.ActionBar.e1 f31091b;
    public final org.telegram.ui.ActionBar.e1 f31092c;
    public final wt0 d;

    public ut0(wt0 wt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f31090a = i10;
        this.d = wt0Var;
        this.f31091b = e1Var;
        this.f31092c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31090a) {
            case 0:
                sv0 sv0Var = this.d.d;
                if (!sv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f31091b;
                    boolean z10 = e1Var.getCheckView().f32435a.f24154q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f31092c;
                    if (!z10 && e1Var2.getCheckView().f32435a.f24154q) {
                        float f7 = -sv0Var.f30389s1;
                        sv0Var.f30389s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32435a.f24154q);
                    if (e1Var2.getCheckView().f32435a.f24154q && e1Var.getCheckView().f32435a.f24154q) {
                        sv0Var.f30391t1[0].f26962q = 0;
                    } else {
                        sv0Var.f30391t1[0].f26962q = 2;
                    }
                    sv0.t(sv0Var);
                    return;
                }
                return;
            default:
                sv0 sv0Var2 = this.d.d;
                if (!sv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f31091b;
                    boolean z11 = e1Var3.getCheckView().f32435a.f24154q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f31092c;
                    if (!z11 && e1Var4.getCheckView().f32435a.f24154q) {
                        float f10 = -sv0Var2.f30389s1;
                        sv0Var2.f30389s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32435a.f24154q);
                    if (e1Var3.getCheckView().f32435a.f24154q && e1Var4.getCheckView().f32435a.f24154q) {
                        sv0Var2.f30391t1[0].f26962q = 0;
                    } else {
                        sv0Var2.f30391t1[0].f26962q = 1;
                    }
                    sv0.t(sv0Var2);
                    return;
                }
                return;
        }
    }
}
