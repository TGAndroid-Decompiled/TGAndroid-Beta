package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class od implements org.telegram.ui.Components.iw0, org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f42063a;

    public od(ke keVar) {
        this.f42063a = keVar;
    }

    @Override
    public int c() {
        return this.f42063a.R0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f42063a.m0.presentFragment(new fg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f42063a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f42063a;
        pd pdVar = keVar.f40778s1;
        int i10 = keVar.f40769o0;
        long j10 = keVar.f40771p0;
        int i11 = ((org.telegram.ui.Components.u61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.m0.presentFragment(new hi.d4(j10));
            }
        } else if (keVar.f40775r0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.f40773q0 == null) {
                return;
            }
            y91 y91Var = keVar.m0;
            tg.j0 j0Var = new tg.j0(30, keVar.f40769o0, keVar.getContext(), y91Var, keVar.f40767n0);
            j0Var.L1(j10);
            j0Var.J1(keVar.f40773q0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.f40773q0, new li.s2(9, keVar, j0Var));
        } else {
            keVar.f40764j1 = !keVar.f40764j1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            keVar.X0.f32504g3.O(true);
        }
    }
}
