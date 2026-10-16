package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xc0 implements View.OnClickListener {
    public final int f30916a = 1;
    public final boolean f30917b;
    public final Object f30918c;
    public final Object d;

    public xc0(org.telegram.ui.tt ttVar, ArrayList arrayList, boolean z10) {
        this.f30918c = ttVar;
        this.d = arrayList;
        this.f30917b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f30916a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f30918c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f30917b) {
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
                org.telegram.ui.xt xtVar = ((org.telegram.ui.tt) this.f30918c).f40207a;
                if (xtVar.f41657w != null && xtVar.f41647l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        xtVar.f41647l.C(xtVar.W);
                    } else if (intValue == 1) {
                        xtVar.f41647l.v(xtVar.W);
                    } else if (intValue == 2) {
                        xtVar.f41647l.v(null);
                    } else if (intValue == 3) {
                        xtVar.f41647l.H(xtVar.W);
                    } else if (intValue == 4) {
                        xtVar.f41647l.q(xtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(xtVar.f41653r).addRecentSticker(2, xtVar.f41637b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), this.f30917b);
                    }
                    xtVar.p();
                    return;
                }
                return;
        }
    }

    public xc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f30917b = z10;
        this.f30918c = e3Var;
        this.d = runnable;
    }
}
