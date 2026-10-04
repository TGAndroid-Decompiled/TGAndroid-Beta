package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class kc0 implements View.OnClickListener {
    public final int f28072a = 1;
    public final boolean f28073b;
    public final Object f28074c;
    public final Object d;

    public kc0(org.telegram.ui.nt ntVar, ArrayList arrayList, boolean z10) {
        this.f28074c = ntVar;
        this.d = arrayList;
        this.f28073b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f28072a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28074c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f28073b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    f3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.rt rtVar = ((org.telegram.ui.nt) this.f28074c).f39037a;
                if (rtVar.f40282w != null && rtVar.f40272l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rtVar.f40272l.C(rtVar.W);
                    } else if (intValue == 1) {
                        rtVar.f40272l.v(rtVar.W);
                    } else if (intValue == 2) {
                        rtVar.f40272l.v(null);
                    } else if (intValue == 3) {
                        rtVar.f40272l.H(rtVar.W);
                    } else if (intValue == 4) {
                        rtVar.f40272l.r(rtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(rtVar.f40278r).addRecentSticker(2, rtVar.f40261b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f28073b);
                    }
                    rtVar.p();
                    return;
                }
                return;
        }
    }

    public kc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f28073b = z10;
        this.f28074c = f3Var;
        this.d = runnable;
    }
}
