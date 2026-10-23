package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class tc0 implements View.OnClickListener {
    public final int f30681a = 1;
    public final boolean f30682b;
    public final Object f30683c;
    public final Object d;

    public tc0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.f30683c = dtVar;
        this.d = arrayList;
        this.f30682b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f30681a) {
            case 0:
                org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.f30683c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f30682b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    r6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ht htVar = ((org.telegram.ui.dt) this.f30683c).f36729a;
                if (htVar.f37955w != null && htVar.f37945l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.f37945l.C(htVar.W);
                    } else if (intValue == 1) {
                        htVar.f37945l.v(htVar.W);
                    } else if (intValue == 2) {
                        htVar.f37945l.v(null);
                    } else if (intValue == 3) {
                        htVar.f37945l.H(htVar.W);
                    } else if (intValue == 4) {
                        htVar.f37945l.p(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.f37951r).addRecentSticker(2, htVar.f37935b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f30682b);
                    }
                    htVar.n();
                    return;
                }
                return;
        }
    }

    public tc0(boolean z10, org.telegram.ui.r6 r6Var, Runnable runnable) {
        this.f30682b = z10;
        this.f30683c = r6Var;
        this.d = runnable;
    }
}
