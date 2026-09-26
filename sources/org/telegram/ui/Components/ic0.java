package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ic0 implements View.OnClickListener {
    public final int f25048a = 1;
    public final boolean f25049b;
    public final Object f25050c;
    public final Object d;

    public ic0(org.telegram.ui.jt jtVar, ArrayList arrayList, boolean z10) {
        this.f25050c = jtVar;
        this.d = arrayList;
        this.f25049b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25048a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f25050c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25049b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    e3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.nt ntVar = ((org.telegram.ui.jt) this.f25050c).f34866a;
                if (ntVar.f35994w != null && ntVar.f35984l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ntVar.f35984l.C(ntVar.W);
                    } else if (intValue == 1) {
                        ntVar.f35984l.v(ntVar.W);
                    } else if (intValue == 2) {
                        ntVar.f35984l.v(null);
                    } else if (intValue == 3) {
                        ntVar.f35984l.H(ntVar.W);
                    } else if (intValue == 4) {
                        ntVar.f35984l.r(ntVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ntVar.f35990r).addRecentSticker(2, ntVar.f35974b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.f25049b);
                    }
                    ntVar.p();
                    return;
                }
                return;
        }
    }

    public ic0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f25049b = z10;
        this.f25050c = e3Var;
        this.d = runnable;
    }
}
