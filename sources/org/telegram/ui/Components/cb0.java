package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class cb0 implements View.OnClickListener {
    public final int f25038a = 1;
    public final boolean f25039b;
    public final Object f25040c;
    public final Object d;

    public cb0(n2.u uVar, boolean z10, Runnable runnable) {
        this.d = uVar;
        this.f25039b = z10;
        this.f25040c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25038a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.f25040c;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    if (this.f25039b) {
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
                Runnable runnable2 = (Runnable) this.f25040c;
                if (this.f25039b) {
                    ((zt0) uVar.f13480b).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f25040c;
                org.telegram.ui.lt ltVar = ((org.telegram.ui.gt) this.d).f37643a;
                if (ltVar.f39406w != null && ltVar.f39396l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ltVar.f39396l.A(ltVar.W);
                    } else if (intValue == 1) {
                        ltVar.f39396l.t(ltVar.W);
                    } else if (intValue == 2) {
                        ltVar.f39396l.t(null);
                    } else if (intValue == 3) {
                        ltVar.f39396l.G(ltVar.W);
                    } else if (intValue == 4) {
                        ltVar.f39396l.p(ltVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ltVar.f39402r).d(2, ltVar.f39386b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), this.f25039b);
                    }
                    ltVar.o();
                    return;
                }
                return;
        }
    }

    public cb0(org.telegram.ui.gt gtVar, ArrayList arrayList, boolean z10) {
        this.d = gtVar;
        this.f25040c = arrayList;
        this.f25039b = z10;
    }

    public cb0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f25039b = z10;
        this.d = p6Var;
        this.f25040c = runnable;
    }
}
