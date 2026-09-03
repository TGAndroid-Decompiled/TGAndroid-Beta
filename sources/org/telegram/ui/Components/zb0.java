package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class zb0 implements View.OnClickListener {
    public final int f31327a = 1;
    public final boolean f31328b;
    public final Object f31329c;
    public final Object d;

    public zb0(org.telegram.ui.nt ntVar, ArrayList arrayList, boolean z4) {
        this.f31329c = ntVar;
        this.d = arrayList;
        this.f31328b = z4;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f31327a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f31329c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f31328b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    g3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.rt rtVar = ((org.telegram.ui.nt) this.f31329c).f36580a;
                if (rtVar.f38050w != null && rtVar.f38040l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rtVar.f38040l.C(rtVar.W);
                    } else if (intValue == 1) {
                        rtVar.f38040l.u(rtVar.W);
                    } else if (intValue == 2) {
                        rtVar.f38040l.u(null);
                    } else if (intValue == 3) {
                        rtVar.f38040l.H(rtVar.W);
                    } else if (intValue == 4) {
                        rtVar.f38040l.q(rtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(rtVar.f38046r).addRecentSticker(2, rtVar.f38030b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f31328b);
                    }
                    rtVar.p();
                    return;
                }
                return;
        }
    }

    public zb0(boolean z4, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f31328b = z4;
        this.f31329c = g3Var;
        this.d = runnable;
    }
}
