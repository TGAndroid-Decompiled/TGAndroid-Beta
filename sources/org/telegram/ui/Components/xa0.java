package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xa0 implements View.OnClickListener {
    public final int f41984a = 1;
    public final boolean f41985b;
    public final Object f41986c;
    public final Object d;

    public xa0(pf pfVar, boolean z10, Runnable runnable) {
        this.d = pfVar;
        this.f41985b = z10;
        this.f41986c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f41984a) {
            case 0:
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.d;
                Runnable runnable = (Runnable) this.f41986c;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f41985b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    Q.presentFragment(new PremiumPreviewFragment(0, str));
                    o6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pf pfVar = (pf) this.d;
                Runnable runnable2 = (Runnable) this.f41986c;
                if (this.f41985b) {
                    ((jt0) pfVar.f38544b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f41986c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f49052a;
                if (nsVar.f50312w != null && nsVar.f50302l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f50302l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f50302l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f50302l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f50302l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f50302l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.si.d0(nsVar.f50308r).d(2, nsVar.f50291b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f41985b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public xa0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f41986c = arrayList;
        this.f41985b = z10;
    }

    public xa0(boolean z10, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f41985b = z10;
        this.d = o6Var;
        this.f41986c = runnable;
    }
}
