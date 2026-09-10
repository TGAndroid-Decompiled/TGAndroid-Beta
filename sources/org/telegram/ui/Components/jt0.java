package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 implements View.OnClickListener {
    public final int f24497a;
    public final org.telegram.ui.ActionBar.g1 f24498b;
    public final org.telegram.ui.ActionBar.g1 f24499c;
    public final lt0 d;

    public jt0(lt0 lt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f24497a = i10;
        this.d = lt0Var;
        this.f24498b = g1Var;
        this.f24499c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24497a) {
            case 0:
                iv0 iv0Var = this.d.d;
                if (!iv0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f24498b;
                    boolean z10 = g1Var.getCheckView().f27462a.f21057q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f24499c;
                    if (!z10 && g1Var2.getCheckView().f27462a.f21057q) {
                        float f7 = -iv0Var.f24125s1;
                        iv0Var.f24125s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f27462a.f21057q);
                    if (g1Var2.getCheckView().f27462a.f21057q && g1Var.getCheckView().f27462a.f21057q) {
                        iv0Var.f24127t1[0].f29169q = 0;
                    } else {
                        iv0Var.f24127t1[0].f29169q = 2;
                    }
                    iv0.s(iv0Var);
                    return;
                }
                return;
            default:
                iv0 iv0Var2 = this.d.d;
                if (!iv0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f24498b;
                    boolean z11 = g1Var3.getCheckView().f27462a.f21057q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f24499c;
                    if (!z11 && g1Var4.getCheckView().f27462a.f21057q) {
                        float f10 = -iv0Var2.f24125s1;
                        iv0Var2.f24125s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f27462a.f21057q);
                    if (g1Var3.getCheckView().f27462a.f21057q && g1Var4.getCheckView().f27462a.f21057q) {
                        iv0Var2.f24127t1[0].f29169q = 0;
                    } else {
                        iv0Var2.f24127t1[0].f29169q = 1;
                    }
                    iv0.s(iv0Var2);
                    return;
                }
                return;
        }
    }
}
