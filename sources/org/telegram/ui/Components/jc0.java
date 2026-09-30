package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class jc0 implements View.OnClickListener {
    public final int f25417a = 1;
    public final boolean f25418b;
    public final Object f25419c;
    public final Object d;

    public jc0(org.telegram.ui.jt jtVar, ArrayList arrayList, boolean z10) {
        this.f25419c = jtVar;
        this.d = arrayList;
        this.f25418b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25417a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f25419c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25418b) {
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
                org.telegram.ui.nt ntVar = ((org.telegram.ui.jt) this.f25419c).f34870a;
                if (ntVar.f35989w != null && ntVar.f35979l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ntVar.f35979l.C(ntVar.W);
                    } else if (intValue == 1) {
                        ntVar.f35979l.v(ntVar.W);
                    } else if (intValue == 2) {
                        ntVar.f35979l.v(null);
                    } else if (intValue == 3) {
                        ntVar.f35979l.H(ntVar.W);
                    } else if (intValue == 4) {
                        ntVar.f35979l.r(ntVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ntVar.f35985r).addRecentSticker(2, ntVar.f35969b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.f25418b);
                    }
                    ntVar.p();
                    return;
                }
                return;
        }
    }

    public jc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f25418b = z10;
        this.f25419c = e3Var;
        this.d = runnable;
    }
}
