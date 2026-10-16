package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class de implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final qe f34966a;

    public de(qe qeVar) {
        this.f34966a = qeVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f34966a.f39138w0.presentFragment(new oh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f34966a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        qe qeVar = this.f34966a;
        ud udVar = qeVar.f39137v1;
        int i10 = qeVar.f39141y0;
        long j10 = qeVar.f39142z0;
        int i11 = ((org.telegram.ui.Components.m61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                qeVar.f39138w0.presentFragment(new fi.f4(j10));
            }
        } else if (qeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (qeVar.A0 == null) {
                return;
            }
            hb1 hb1Var = qeVar.f39138w0;
            sg.j0 j0Var = new sg.j0(30, qeVar.f39141y0, qeVar.getContext(), hb1Var, qeVar.f39140x0);
            j0Var.I1(j10);
            j0Var.G1(qeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, qeVar.A0, new uc(1, qeVar, j0Var));
        } else {
            qeVar.f39128m1 = !qeVar.f39128m1;
            AndroidUtilities.cancelRunOnUIThread(udVar);
            AndroidUtilities.runOnUIThread(udVar, 1000L);
            qeVar.f39117a1.W2.N(true);
        }
    }
}
