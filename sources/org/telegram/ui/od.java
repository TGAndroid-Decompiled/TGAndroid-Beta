package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class od implements org.telegram.ui.Components.hw0, org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f42150a;

    public od(ke keVar) {
        this.f42150a = keVar;
    }

    @Override
    public int c() {
        return this.f42150a.R0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f42150a.m0.presentFragment(new dg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f42150a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f42150a;
        pd pdVar = keVar.f40913s1;
        int i10 = keVar.f40904o0;
        long j10 = keVar.f40906p0;
        int i11 = ((org.telegram.ui.Components.t61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.m0.presentFragment(new hi.d4(j10));
            }
        } else if (keVar.f40910r0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.f40908q0 == null) {
                return;
            }
            w91 w91Var = keVar.m0;
            tg.j0 j0Var = new tg.j0(30, keVar.f40904o0, keVar.getContext(), w91Var, keVar.f40902n0);
            j0Var.L1(j10);
            j0Var.J1(keVar.f40908q0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.f40908q0, new li.s2(9, keVar, j0Var));
        } else {
            keVar.f40899j1 = !keVar.f40899j1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            keVar.X0.f32150g3.O(true);
        }
    }
}
