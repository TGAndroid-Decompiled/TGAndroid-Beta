package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class at0 implements View.OnClickListener {
    public final int f22479a;
    public final org.telegram.ui.ActionBar.f1 f22480b;
    public final org.telegram.ui.ActionBar.f1 f22481c;
    public final ct0 d;

    public at0(ct0 ct0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f22479a = i10;
        this.d = ct0Var;
        this.f22480b = f1Var;
        this.f22481c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22479a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f22480b;
                    boolean z10 = f1Var.getCheckView().f26546a.f21969q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f22481c;
                    if (!z10 && f1Var2.getCheckView().f26546a.f21969q) {
                        float f7 = -yu0Var.f30383s1;
                        yu0Var.f30383s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26546a.f21969q);
                    if (f1Var2.getCheckView().f26546a.f21969q && f1Var.getCheckView().f26546a.f21969q) {
                        yu0Var.f30385t1[0].f26588q = 0;
                    } else {
                        yu0Var.f30385t1[0].f26588q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f22480b;
                    boolean z11 = f1Var3.getCheckView().f26546a.f21969q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f22481c;
                    if (!z11 && f1Var4.getCheckView().f26546a.f21969q) {
                        float f10 = -yu0Var2.f30383s1;
                        yu0Var2.f30383s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26546a.f21969q);
                    if (f1Var3.getCheckView().f26546a.f21969q && f1Var4.getCheckView().f26546a.f21969q) {
                        yu0Var2.f30385t1[0].f26588q = 0;
                    } else {
                        yu0Var2.f30385t1[0].f26588q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
