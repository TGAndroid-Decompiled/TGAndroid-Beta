package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yb0 implements View.OnClickListener {
    public final int f30960a = 1;
    public final boolean f30961b;
    public final Object f30962c;
    public final Object d;

    public yb0(org.telegram.ui.lt ltVar, ArrayList arrayList, boolean z4) {
        this.f30962c = ltVar;
        this.d = arrayList;
        this.f30961b = z4;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f30960a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f30962c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f30961b) {
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
                org.telegram.ui.pt ptVar = ((org.telegram.ui.lt) this.f30962c).f36133a;
                if (ptVar.f37534w != null && ptVar.f37524l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ptVar.f37524l.C(ptVar.W);
                    } else if (intValue == 1) {
                        ptVar.f37524l.u(ptVar.W);
                    } else if (intValue == 2) {
                        ptVar.f37524l.u(null);
                    } else if (intValue == 3) {
                        ptVar.f37524l.H(ptVar.W);
                    } else if (intValue == 4) {
                        ptVar.f37524l.q(ptVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ptVar.f37530r).addRecentSticker(2, ptVar.f37514b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.f30961b);
                    }
                    ptVar.p();
                    return;
                }
                return;
        }
    }

    public yb0(boolean z4, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f30961b = z4;
        this.f30962c = g3Var;
        this.d = runnable;
    }
}
