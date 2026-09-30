package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class kc0 implements View.OnClickListener {
    public final int f25745a = 1;
    public final boolean f25746b;
    public final Object f25747c;
    public final Object d;

    public kc0(org.telegram.ui.jt jtVar, ArrayList arrayList, boolean z10) {
        this.f25747c = jtVar;
        this.d = arrayList;
        this.f25746b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25745a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f25747c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25746b) {
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
                org.telegram.ui.nt ntVar = ((org.telegram.ui.jt) this.f25747c).f34957a;
                if (ntVar.f36133w != null && ntVar.f36123l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ntVar.f36123l.C(ntVar.W);
                    } else if (intValue == 1) {
                        ntVar.f36123l.v(ntVar.W);
                    } else if (intValue == 2) {
                        ntVar.f36123l.v(null);
                    } else if (intValue == 3) {
                        ntVar.f36123l.H(ntVar.W);
                    } else if (intValue == 4) {
                        ntVar.f36123l.r(ntVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ntVar.f36129r).addRecentSticker(2, ntVar.f36113b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.f25746b);
                    }
                    ntVar.p();
                    return;
                }
                return;
        }
    }

    public kc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f25746b = z10;
        this.f25747c = e3Var;
        this.d = runnable;
    }
}
