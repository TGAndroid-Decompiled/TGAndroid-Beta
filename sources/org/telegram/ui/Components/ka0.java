package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ka0 implements View.OnClickListener {
    public final int f35248a = 1;
    public final boolean f35249b;
    public final Object f35250c;
    public final Object d;

    public ka0(qt qtVar, boolean z9, Runnable runnable) {
        this.d = qtVar;
        this.f35249b = z9;
        this.f35250c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f35248a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f35250c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f35249b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    Q.presentFragment(new PremiumPreviewFragment(0, str));
                    p6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qt qtVar = (qt) this.d;
                Runnable runnable2 = (Runnable) this.f35250c;
                if (this.f35249b) {
                    ((xs0) qtVar.f37394b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f35250c;
                org.telegram.ui.ks ksVar = ((org.telegram.ui.gs) this.d).f46088a;
                if (ksVar.f47292w != null && ksVar.f47282l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ksVar.f47282l.C(ksVar.W);
                    } else if (intValue == 1) {
                        ksVar.f47282l.v(ksVar.W);
                    } else if (intValue == 2) {
                        ksVar.f47282l.v(null);
                    } else if (intValue == 3) {
                        ksVar.f47282l.H(ksVar.W);
                    } else if (intValue == 4) {
                        ksVar.f47282l.q(ksVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ksVar.f47288r).d(2, ksVar.f47271b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f35249b);
                    }
                    ksVar.o();
                    return;
                }
                return;
        }
    }

    public ka0(org.telegram.ui.gs gsVar, ArrayList arrayList, boolean z9) {
        this.d = gsVar;
        this.f35250c = arrayList;
        this.f35249b = z9;
    }

    public ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f35249b = z9;
        this.d = p6Var;
        this.f35250c = runnable;
    }
}
