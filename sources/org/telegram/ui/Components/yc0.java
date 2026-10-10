package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yc0 implements View.OnClickListener {
    public final int f33168a = 1;
    public final boolean f33169b;
    public final Object f33170c;
    public final Object d;

    public yc0(org.telegram.ui.nt ntVar, ArrayList arrayList, boolean z10) {
        this.f33170c = ntVar;
        this.d = arrayList;
        this.f33169b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f33168a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f33170c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f33169b) {
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
                org.telegram.ui.rt rtVar = ((org.telegram.ui.nt) this.f33170c).f40406a;
                if (rtVar.f41552w != null && rtVar.f41542l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rtVar.f41542l.C(rtVar.W);
                    } else if (intValue == 1) {
                        rtVar.f41542l.v(rtVar.W);
                    } else if (intValue == 2) {
                        rtVar.f41542l.v(null);
                    } else if (intValue == 3) {
                        rtVar.f41542l.H(rtVar.W);
                    } else if (intValue == 4) {
                        rtVar.f41542l.r(rtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(rtVar.f41548r).addRecentSticker(2, rtVar.f41531b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f33169b);
                    }
                    rtVar.p();
                    return;
                }
                return;
        }
    }

    public yc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f33169b = z10;
        this.f33170c = f3Var;
        this.d = runnable;
    }
}
