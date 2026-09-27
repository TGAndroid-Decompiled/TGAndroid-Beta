package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class od implements Utilities.Callback5Return, org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final me f36186a;

    public od(me meVar) {
        this.f36186a = meVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f36186a.f35662w0.presentFragment(new zg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f36186a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        me meVar = this.f36186a;
        pd pdVar = meVar.f35661v1;
        int i10 = meVar.f35665y0;
        long j3 = meVar.f35666z0;
        int i11 = ((org.telegram.ui.Components.x51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.f35662w0.presentFragment(new ei.e4(j3));
            }
        } else if (meVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (meVar.A0 == null) {
                return;
            }
            ra1 ra1Var = meVar.f35662w0;
            rg.j0 j0Var = new rg.j0(30, meVar.f35665y0, meVar.getContext(), ra1Var, meVar.f35664x0);
            j0Var.H1(j3);
            j0Var.F1(meVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, meVar.A0, new qc(1, meVar, j0Var));
        } else {
            meVar.f35652m1 = !meVar.f35652m1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            meVar.f35641a1.Y2.N(true);
        }
    }
}
