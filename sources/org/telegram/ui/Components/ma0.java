package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ma0 implements View.OnClickListener {
    public final int f37179a = 1;
    public final boolean f37180b;
    public final Object f37181c;
    public final Object d;

    public ma0(ff ffVar, boolean z10, Runnable runnable) {
        this.d = ffVar;
        this.f37180b = z10;
        this.f37181c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f37179a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f37181c;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f37180b) {
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
                Runnable runnable2 = (Runnable) this.f37181c;
                if (this.f37180b) {
                    ((ys0) ffVar.f34590b).J.p();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f37181c;
                org.telegram.ui.ns nsVar = ((org.telegram.ui.js) this.d).f48406a;
                if (nsVar.f49666w != null && nsVar.f49656l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.f49656l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.f49656l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.f49656l.t(null);
                    } else if (intValue == 3) {
                        nsVar.f49656l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.f49656l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.si.b0(nsVar.f49662r).d(2, nsVar.f49645b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f37180b);
                    }
                    nsVar.o();
                    return;
                }
                return;
        }
    }

    public ma0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.f37181c = arrayList;
        this.f37180b = z10;
    }

    public ma0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f37180b = z10;
        this.d = p6Var;
        this.f37181c = runnable;
    }
}
