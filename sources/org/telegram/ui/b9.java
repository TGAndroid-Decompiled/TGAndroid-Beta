package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class b9 extends FragmentContextView {
    public final int K0;
    public final NotificationCenter.NotificationCenterDelegate L0;

    public b9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, p2Var, frameLayout, false, f6Var);
        this.K0 = i10;
        this.L0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.K0) {
            case 0:
                n9 n9Var = (n9) this.L0;
                org.telegram.ui.Components.is isVar = n9Var.J;
                FrameLayout frameLayout = n9Var.K;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                isVar.i(frameLayout, z4, true);
                return;
            case 1:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.L0;
                org.telegram.ui.Components.is isVar2 = wiVar.f30294x;
                FrameLayout frameLayout2 = wiVar.f30295y;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                isVar2.i(frameLayout2, z10, true);
                return;
            default:
                sf1 sf1Var = (sf1) this.L0;
                org.telegram.ui.Components.is isVar3 = sf1Var.R0;
                FrameLayout frameLayout3 = sf1Var.C0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                isVar3.i(frameLayout3, z11, true);
                return;
        }
    }

    public b9(sf1 sf1Var, Context context, sf1 sf1Var2) {
        super(context, sf1Var2, null, false, null);
        this.K0 = 2;
        this.L0 = sf1Var;
    }
}
