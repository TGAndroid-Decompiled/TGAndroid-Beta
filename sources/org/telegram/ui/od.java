package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class od implements org.telegram.ui.Components.wv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final me f39160a;

    public od(me meVar) {
        this.f39160a = meVar;
    }

    @Override
    public int b() {
        return this.f39160a.U1;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f39160a.f38558p1.presentFragment(new bh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.g61 g61Var = (org.telegram.ui.Components.g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f39160a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        me meVar = this.f39160a;
        pd pdVar = meVar.f38571v2;
        int i10 = meVar.f38562r1;
        long j3 = meVar.f38564s1;
        int i11 = ((org.telegram.ui.Components.g61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.f38558p1.presentFragment(new ei.f4(j3));
            }
        } else if (meVar.f38568u1 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (meVar.f38566t1 == null) {
                return;
            }
            va1 va1Var = meVar.f38558p1;
            rg.k0 k0Var = new rg.k0(30, meVar.f38562r1, meVar.getContext(), va1Var, meVar.f38560q1);
            k0Var.H1(j3);
            k0Var.F1(meVar.f38566t1, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, meVar.f38566t1, new qc(1, meVar, k0Var));
        } else {
            meVar.f38555m2 = !meVar.f38555m2;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            meVar.a2.f25245f3.N(true);
        }
    }
}
