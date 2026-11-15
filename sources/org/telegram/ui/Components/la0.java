package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class la0 implements View.OnClickListener {
    public final int f36746a = 1;
    public final boolean f36747b;
    public final Object f36748c;
    public final Object d;

    public la0(ff ffVar, boolean z10, Runnable runnable) {
        this.d = ffVar;
        this.f36747b = z10;
        this.f36748c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f36746a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f36748c;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f36747b) {
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
                ff ffVar = (ff) this.d;
                Runnable runnable2 = (Runnable) this.f36748c;
                if (this.f36747b) {
                    ((ys0) ffVar.f34586b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f36748c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f48452a;
                if (nsVar.f49676w != null && nsVar.f49666l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f49666l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f49666l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f49666l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f49666l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f49666l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.si.b0(nsVar.f49672r).d(2, nsVar.f49655b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f36747b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public la0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f36748c = arrayList;
        this.f36747b = z10;
    }

    public la0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f36747b = z10;
        this.d = p6Var;
        this.f36748c = runnable;
    }
}
