package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class be implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final oe f36140a;

    public be(oe oeVar) {
        this.f36140a = oeVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f36140a.f40676w0.presentFragment(new kh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f36140a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        oe oeVar = this.f36140a;
        sd sdVar = oeVar.f40675v1;
        int i10 = oeVar.f40679y0;
        long j3 = oeVar.f40680z0;
        int i11 = ((org.telegram.ui.Components.u61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                oeVar.f40676w0.presentFragment(new ei.e4(j3));
            }
        } else if (oeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (oeVar.A0 == null) {
                return;
            }
            db1 db1Var = oeVar.f40676w0;
            rg.j0 j0Var = new rg.j0(30, oeVar.f40679y0, oeVar.getContext(), db1Var, oeVar.f40678x0);
            j0Var.I1(j3);
            j0Var.G1(oeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, oeVar.A0, new tc(1, oeVar, j0Var));
        } else {
            oeVar.f40666m1 = !oeVar.f40666m1;
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            AndroidUtilities.runOnUIThread(sdVar, 1000L);
            oeVar.f40655a1.W2.N(true);
        }
    }
}
