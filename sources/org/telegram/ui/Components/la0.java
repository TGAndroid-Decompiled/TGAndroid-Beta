package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class la0 implements View.OnClickListener {
    public final int f35662a = 1;
    public final boolean f35663b;
    public final Object f35664c;
    public final Object d;

    public la0(rt rtVar, boolean z9, Runnable runnable) {
        this.d = rtVar;
        this.f35663b = z9;
        this.f35664c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f35662a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f35664c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f35663b) {
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
                Runnable runnable2 = (Runnable) this.f35664c;
                if (this.f35663b) {
                    ((zs0) rtVar.f37805b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f35664c;
                org.telegram.ui.ms msVar = ((org.telegram.ui.is) this.d).f46750a;
                if (msVar.f47980w != null && msVar.f47970l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        msVar.f47970l.C(msVar.W);
                    } else if (intValue == 1) {
                        msVar.f47970l.v(msVar.W);
                    } else if (intValue == 2) {
                        msVar.f47970l.v(null);
                    } else if (intValue == 3) {
                        msVar.f47970l.H(msVar.W);
                    } else if (intValue == 4) {
                        msVar.f47970l.q(msVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(msVar.f47976r).d(2, msVar.f47959b0, msVar.W, (int) (System.currentTimeMillis() / 1000), this.f35663b);
                    }
                    msVar.o();
                    return;
                }
                return;
        }
    }

    public la0(org.telegram.ui.is isVar, ArrayList arrayList, boolean z9) {
        this.d = isVar;
        this.f35664c = arrayList;
        this.f35663b = z9;
    }

    public la0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f35663b = z9;
        this.d = p6Var;
        this.f35664c = runnable;
    }
}
