package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ac0 implements View.OnClickListener {
    public final int f25212a = 1;
    public final boolean f25213b;
    public final Object f25214c;
    public final Object d;

    public ac0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z4) {
        this.f25214c = mtVar;
        this.d = arrayList;
        this.f25213b = z4;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25212a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f25214c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25213b) {
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
                org.telegram.ui.qt qtVar = ((org.telegram.ui.mt) this.f25214c).f39067a;
                if (qtVar.f40667w != null && qtVar.f40657l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.f40657l.B(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.f40657l.t(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.f40657l.t(null);
                    } else if (intValue == 3) {
                        qtVar.f40657l.G(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.f40657l.p(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.f40663r).addRecentSticker(2, qtVar.f40646b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f25213b);
                    }
                    qtVar.p();
                    return;
                }
                return;
        }
    }

    public ac0(boolean z4, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f25213b = z4;
        this.f25214c = h3Var;
        this.d = runnable;
    }
}
