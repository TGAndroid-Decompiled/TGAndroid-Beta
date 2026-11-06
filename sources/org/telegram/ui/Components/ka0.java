package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ka0 implements View.OnClickListener {
    public final int f35245a = 1;
    public final boolean f35246b;
    public final Object f35247c;
    public final Object d;

    public ka0(qt qtVar, boolean z9, Runnable runnable) {
        this.d = qtVar;
        this.f35246b = z9;
        this.f35247c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f35245a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f35247c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f35246b) {
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
                Runnable runnable2 = (Runnable) this.f35247c;
                if (this.f35246b) {
                    ((xs0) qtVar.f37504b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f35247c;
                org.telegram.ui.ks ksVar = ((org.telegram.ui.gs) this.d).f46062a;
                if (ksVar.f47267w != null && ksVar.f47257l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ksVar.f47257l.C(ksVar.W);
                    } else if (intValue == 1) {
                        ksVar.f47257l.v(ksVar.W);
                    } else if (intValue == 2) {
                        ksVar.f47257l.v(null);
                    } else if (intValue == 3) {
                        ksVar.f47257l.H(ksVar.W);
                    } else if (intValue == 4) {
                        ksVar.f47257l.q(ksVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ksVar.f47263r).d(2, ksVar.f47246b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f35246b);
                    }
                    ksVar.o();
                    return;
                }
                return;
        }
    }

    public ka0(org.telegram.ui.gs gsVar, ArrayList arrayList, boolean z9) {
        this.d = gsVar;
        this.f35247c = arrayList;
        this.f35246b = z9;
    }

    public ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f35246b = z9;
        this.d = p6Var;
        this.f35247c = runnable;
    }
}
