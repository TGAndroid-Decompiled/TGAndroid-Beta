package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class fa0 implements View.OnClickListener {
    public final int f33769a = 1;
    public final boolean f33770b;
    public final Object f33771c;
    public final Object d;

    public fa0(i9 i9Var, boolean z10, Runnable runnable) {
        this.d = i9Var;
        this.f33770b = z10;
        this.f33771c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f33769a) {
            case 0:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) this.d;
                Runnable runnable = (Runnable) this.f33771c;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f33770b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    Q.presentFragment(new PremiumPreviewFragment(0, str));
                    q6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.d;
                Runnable runnable2 = (Runnable) this.f33771c;
                if (this.f33770b) {
                    ((ws0) i9Var.f34636b).J.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f33771c;
                org.telegram.ui.is isVar = ((org.telegram.ui.es) this.d).f45025a;
                if (isVar.f46406w != null && isVar.f46396l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        isVar.f46396l.B(isVar.W);
                    } else if (intValue == 1) {
                        isVar.f46396l.u(isVar.W);
                    } else if (intValue == 2) {
                        isVar.f46396l.u(null);
                    } else if (intValue == 3) {
                        isVar.f46396l.G(isVar.W);
                    } else if (intValue == 4) {
                        isVar.f46396l.q(isVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.li.b0(isVar.f46402r).d(2, isVar.f46385b0, isVar.W, (int) (System.currentTimeMillis() / 1000), this.f33770b);
                    }
                    isVar.o();
                    return;
                }
                return;
        }
    }

    public fa0(org.telegram.ui.es esVar, ArrayList arrayList, boolean z10) {
        this.d = esVar;
        this.f33771c = arrayList;
        this.f33770b = z10;
    }

    public fa0(boolean z10, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.f33770b = z10;
        this.d = q6Var;
        this.f33771c = runnable;
    }
}
