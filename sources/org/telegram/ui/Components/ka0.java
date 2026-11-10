package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ka0 implements View.OnClickListener {
    public final int f35264a = 1;
    public final boolean f35265b;
    public final Object f35266c;
    public final Object d;

    public ka0(qt qtVar, boolean z9, Runnable runnable) {
        this.d = qtVar;
        this.f35265b = z9;
        this.f35266c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f35264a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f35266c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f35265b) {
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
                Runnable runnable2 = (Runnable) this.f35266c;
                if (this.f35265b) {
                    ((ys0) qtVar.f37395b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f35266c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f47066a;
                if (nsVar.f48277w != null && nsVar.f48267l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f48267l.C(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f48267l.v(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f48267l.v(null);
                    } else if (intValue == 3) {
                        nsVar.f48267l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f48267l.q(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(nsVar.f48273r).d(2, nsVar.f48256b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f35265b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public ka0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z9) {
        this.d = jsVar;
        this.f35266c = arrayList;
        this.f35265b = z9;
    }

    public ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f35265b = z9;
        this.d = p6Var;
        this.f35266c = runnable;
    }
}
