package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class wa0 implements View.OnClickListener {
    public final int f41650a = 1;
    public final boolean f41651b;
    public final Object f41652c;
    public final Object d;

    public wa0(of ofVar, boolean z10, Runnable runnable) {
        this.d = ofVar;
        this.f41651b = z10;
        this.f41652c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f41650a) {
            case 0:
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.d;
                Runnable runnable = (Runnable) this.f41652c;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f41651b) {
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
                of ofVar = (of) this.d;
                Runnable runnable2 = (Runnable) this.f41652c;
                if (this.f41651b) {
                    ((gt0) ofVar.f38076b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f41652c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f49050a;
                if (nsVar.f50297w != null && nsVar.f50287l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f50287l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f50287l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f50287l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f50287l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f50287l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ri.d0(nsVar.f50293r).d(2, nsVar.f50276b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f41651b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public wa0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f41652c = arrayList;
        this.f41651b = z10;
    }

    public wa0(boolean z10, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f41651b = z10;
        this.d = o6Var;
        this.f41652c = runnable;
    }
}
