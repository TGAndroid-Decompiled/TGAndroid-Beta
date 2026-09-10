package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class gc0 implements View.OnClickListener {
    public final int f23324a = 1;
    public final boolean f23325b;
    public final Object f23326c;
    public final Object d;

    public gc0(org.telegram.ui.pt ptVar, ArrayList arrayList, boolean z10) {
        this.f23326c = ptVar;
        this.d = arrayList;
        this.f23325b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f23324a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f23326c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f23325b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    h3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.tt ttVar = ((org.telegram.ui.pt) this.f23326c).f35899a;
                if (ttVar.f37036w != null && ttVar.f37026l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ttVar.f37026l.A(ttVar.W);
                    } else if (intValue == 1) {
                        ttVar.f37026l.t(ttVar.W);
                    } else if (intValue == 2) {
                        ttVar.f37026l.t(null);
                    } else if (intValue == 3) {
                        ttVar.f37026l.G(ttVar.W);
                    } else if (intValue == 4) {
                        ttVar.f37026l.p(ttVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ttVar.f37032r).addRecentSticker(2, ttVar.f37016b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), this.f23325b);
                    }
                    ttVar.p();
                    return;
                }
                return;
        }
    }

    public gc0(boolean z10, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f23325b = z10;
        this.f23326c = h3Var;
        this.d = runnable;
    }
}
