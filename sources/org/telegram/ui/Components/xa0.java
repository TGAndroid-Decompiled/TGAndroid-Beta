package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xa0 implements View.OnClickListener {
    public final int f42035a = 1;
    public final boolean f42036b;
    public final Object f42037c;
    public final Object d;

    public xa0(qf qfVar, boolean z10, Runnable runnable) {
        this.d = qfVar;
        this.f42036b = z10;
        this.f42037c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f42035a) {
            case 0:
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.d;
                Runnable runnable = (Runnable) this.f42037c;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f42036b) {
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
                qf qfVar = (qf) this.d;
                Runnable runnable2 = (Runnable) this.f42037c;
                if (this.f42036b) {
                    ((jt0) qfVar.f38902b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f42037c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f49083a;
                if (nsVar.f50304w != null && nsVar.f50294l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f50294l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f50294l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f50294l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f50294l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f50294l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ri.d0(nsVar.f50300r).d(2, nsVar.f50283b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f42036b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public xa0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f42037c = arrayList;
        this.f42036b = z10;
    }

    public xa0(boolean z10, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f42036b = z10;
        this.d = o6Var;
        this.f42037c = runnable;
    }
}
