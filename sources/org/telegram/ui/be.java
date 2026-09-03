package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class be implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final me f32853a;

    public be(me meVar) {
        this.f32853a = meVar;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f32853a.f36055t0.presentFragment(new wg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f32853a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        me meVar = this.f32853a;
        rd rdVar = meVar.f36054s1;
        int i10 = meVar.f36058v0;
        long j10 = meVar.f36059w0;
        int i11 = ((org.telegram.ui.Components.i51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.f36055t0.presentFragment(new rh.d3(j10));
            }
        } else if (meVar.f36061y0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (meVar.f36060x0 == null) {
                return;
            }
            oa1 oa1Var = meVar.f36055t0;
            eg.v0 v0Var = new eg.v0(30, meVar.f36058v0, meVar.getContext(), oa1Var, meVar.f36057u0);
            v0Var.H1(j10);
            v0Var.F1(meVar.f36060x0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, meVar.f36060x0, new nh.z1(3, meVar, v0Var));
        } else {
            meVar.f36046j1 = !meVar.f36046j1;
            AndroidUtilities.cancelRunOnUIThread(rdVar);
            AndroidUtilities.runOnUIThread(rdVar, 1000L);
            meVar.X0.V2.N(true);
        }
    }
}
