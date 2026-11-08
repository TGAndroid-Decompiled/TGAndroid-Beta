package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ka0 implements View.OnClickListener {
    public final int f35265a = 1;
    public final boolean f35266b;
    public final Object f35267c;
    public final Object d;

    public ka0(rt rtVar, boolean z9, Runnable runnable) {
        this.d = rtVar;
        this.f35266b = z9;
        this.f35267c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f35265a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f35267c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f35266b) {
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
                rt rtVar = (rt) this.d;
                Runnable runnable2 = (Runnable) this.f35267c;
                if (this.f35266b) {
                    ((xs0) rtVar.f37758b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f35267c;
                org.telegram.ui.ks ksVar = ((org.telegram.ui.gs) this.d).f46089a;
                if (ksVar.f47296w != null && ksVar.f47286l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ksVar.f47286l.C(ksVar.W);
                    } else if (intValue == 1) {
                        ksVar.f47286l.v(ksVar.W);
                    } else if (intValue == 2) {
                        ksVar.f47286l.v(null);
                    } else if (intValue == 3) {
                        ksVar.f47286l.H(ksVar.W);
                    } else if (intValue == 4) {
                        ksVar.f47286l.q(ksVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ksVar.f47292r).d(2, ksVar.f47275b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f35266b);
                    }
                    ksVar.o();
                    return;
                }
                return;
        }
    }

    public ka0(org.telegram.ui.gs gsVar, ArrayList arrayList, boolean z9) {
        this.d = gsVar;
        this.f35267c = arrayList;
        this.f35266b = z9;
    }

    public ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f35266b = z9;
        this.d = p6Var;
        this.f35267c = runnable;
    }
}
