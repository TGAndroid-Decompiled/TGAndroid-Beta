package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class od implements org.telegram.ui.Components.xv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final me f39175a;

    public od(me meVar) {
        this.f39175a = meVar;
    }

    @Override
    public int b() {
        return this.f39175a.R0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f39175a.m0.presentFragment(new zg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f39175a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        me meVar = this.f39175a;
        pd pdVar = meVar.f38603s1;
        int i10 = meVar.f38594o0;
        long j3 = meVar.f38596p0;
        int i11 = ((org.telegram.ui.Components.h61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.m0.presentFragment(new ei.f4(j3));
            }
        } else if (meVar.f38600r0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (meVar.f38598q0 == null) {
                return;
            }
            ta1 ta1Var = meVar.m0;
            rg.k0 k0Var = new rg.k0(30, meVar.f38594o0, meVar.getContext(), ta1Var, meVar.f38592n0);
            k0Var.H1(j3);
            k0Var.F1(meVar.f38598q0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, meVar.f38598q0, new qc(1, meVar, k0Var));
        } else {
            meVar.f38589j1 = !meVar.f38589j1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            meVar.X0.f26034f3.N(true);
        }
    }
}
