package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xc0 implements View.OnClickListener {
    public final int f31232a = 1;
    public final boolean f31233b;
    public final Object f31234c;
    public final Object d;

    public xc0(org.telegram.ui.tt ttVar, ArrayList arrayList, boolean z10) {
        this.f31234c = ttVar;
        this.d = arrayList;
        this.f31233b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f31232a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f31234c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f31233b) {
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
                org.telegram.ui.xt xtVar = ((org.telegram.ui.tt) this.f31234c).f40483a;
                if (xtVar.f41953w != null && xtVar.f41943l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        xtVar.f41943l.C(xtVar.W);
                    } else if (intValue == 1) {
                        xtVar.f41943l.v(xtVar.W);
                    } else if (intValue == 2) {
                        xtVar.f41943l.v(null);
                    } else if (intValue == 3) {
                        xtVar.f41943l.H(xtVar.W);
                    } else if (intValue == 4) {
                        xtVar.f41943l.q(xtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(xtVar.f41949r).addRecentSticker(2, xtVar.f41933b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), this.f31233b);
                    }
                    xtVar.p();
                    return;
                }
                return;
        }
    }

    public xc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f31233b = z10;
        this.f31234c = e3Var;
        this.d = runnable;
    }
}
