package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class jc0 implements View.OnClickListener {
    public final int f25438a = 1;
    public final boolean f25439b;
    public final Object f25440c;
    public final Object d;

    public jc0(org.telegram.ui.jt jtVar, ArrayList arrayList, boolean z10) {
        this.f25440c = jtVar;
        this.d = arrayList;
        this.f25439b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25438a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f25440c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25439b) {
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
                org.telegram.ui.nt ntVar = ((org.telegram.ui.jt) this.f25440c).f34868a;
                if (ntVar.f35996w != null && ntVar.f35986l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ntVar.f35986l.C(ntVar.W);
                    } else if (intValue == 1) {
                        ntVar.f35986l.v(ntVar.W);
                    } else if (intValue == 2) {
                        ntVar.f35986l.v(null);
                    } else if (intValue == 3) {
                        ntVar.f35986l.H(ntVar.W);
                    } else if (intValue == 4) {
                        ntVar.f35986l.r(ntVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ntVar.f35992r).addRecentSticker(2, ntVar.f35976b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.f25439b);
                    }
                    ntVar.p();
                    return;
                }
                return;
        }
    }

    public jc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f25439b = z10;
        this.f25440c = e3Var;
        this.d = runnable;
    }
}
