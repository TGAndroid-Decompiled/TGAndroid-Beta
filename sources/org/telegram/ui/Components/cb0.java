package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class cb0 implements View.OnClickListener {
    public final int f25073a = 1;
    public final boolean f25074b;
    public final Object f25075c;
    public final Object d;

    public cb0(n2.u uVar, boolean z10, Runnable runnable) {
        this.d = uVar;
        this.f25074b = z10;
        this.f25075c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25073a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f25075c;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f25074b) {
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
                n2.u uVar = (n2.u) this.d;
                Runnable runnable2 = (Runnable) this.f25075c;
                if (this.f25074b) {
                    ((au0) uVar.f13481b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f25075c;
                org.telegram.ui.kt ktVar = ((org.telegram.ui.ft) this.d).f37231a;
                if (ktVar.f38996w != null && ktVar.f38986l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ktVar.f38986l.A(ktVar.W);
                    } else if (intValue == 1) {
                        ktVar.f38986l.t(ktVar.W);
                    } else if (intValue == 2) {
                        ktVar.f38986l.t(null);
                    } else if (intValue == 3) {
                        ktVar.f38986l.G(ktVar.W);
                    } else if (intValue == 4) {
                        ktVar.f38986l.p(ktVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.vi.b0(ktVar.f38992r).d(2, ktVar.f38976b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.f25074b);
                    }
                    ktVar.o();
                    return;
                }
                return;
        }
    }

    public cb0(org.telegram.ui.ft ftVar, ArrayList arrayList, boolean z10) {
        this.d = ftVar;
        this.f25075c = arrayList;
        this.f25074b = z10;
    }

    public cb0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f25074b = z10;
        this.d = p6Var;
        this.f25075c = runnable;
    }
}
