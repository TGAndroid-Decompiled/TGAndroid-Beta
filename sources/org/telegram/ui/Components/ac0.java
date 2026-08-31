package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ac0 implements View.OnClickListener {
    public final int f25220a = 1;
    public final boolean f25221b;
    public final Object f25222c;
    public final Object d;

    public ac0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z4) {
        this.f25222c = mtVar;
        this.d = arrayList;
        this.f25221b = z4;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25220a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f25222c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25221b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    h3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.qt qtVar = ((org.telegram.ui.mt) this.f25222c).f39219a;
                if (qtVar.f40693w != null && qtVar.f40683l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.f40683l.B(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.f40683l.t(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.f40683l.t(null);
                    } else if (intValue == 3) {
                        qtVar.f40683l.G(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.f40683l.p(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.f40689r).addRecentSticker(2, qtVar.f40672b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f25221b);
                    }
                    qtVar.p();
                    return;
                }
                return;
        }
    }

    public ac0(boolean z4, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f25221b = z4;
        this.f25222c = h3Var;
        this.d = runnable;
    }
}
