package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ua0 implements View.OnClickListener {
    public final int f40339a = 1;
    public final boolean f40340b;
    public final Object f40341c;
    public final Object d;

    public ua0(org.telegram.ui.Cells.aa aaVar, boolean z10, Runnable runnable) {
        this.d = aaVar;
        this.f40340b = z10;
        this.f40341c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f40339a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f40341c;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f40340b) {
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
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.d;
                Runnable runnable2 = (Runnable) this.f40341c;
                if (this.f40340b) {
                    ((it0) aaVar.f30491b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f40341c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f49201a;
                if (nsVar.f50424w != null && nsVar.f50414l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f50414l.A(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f50414l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f50414l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f50414l.G(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f50414l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ri.d0(nsVar.f50420r).d(2, nsVar.f50403b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f40340b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public ua0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f40341c = arrayList;
        this.f40340b = z10;
    }

    public ua0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f40340b = z10;
        this.d = p6Var;
        this.f40341c = runnable;
    }
}
