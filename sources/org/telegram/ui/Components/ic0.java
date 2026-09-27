package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ic0 implements View.OnClickListener {
    public final int f25085a = 1;
    public final boolean f25086b;
    public final Object f25087c;
    public final Object d;

    public ic0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z10) {
        this.f25087c = mtVar;
        this.d = arrayList;
        this.f25086b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25085a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f25087c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25086b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    g3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.qt qtVar = ((org.telegram.ui.mt) this.f25087c).f35750a;
                if (qtVar.f36906w != null && qtVar.f36896l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.f36896l.C(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.f36896l.v(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.f36896l.v(null);
                    } else if (intValue == 3) {
                        qtVar.f36896l.H(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.f36896l.r(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.f36902r).addRecentSticker(2, qtVar.f36886b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f25086b);
                    }
                    qtVar.p();
                    return;
                }
                return;
        }
    }

    public ic0(boolean z10, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f25086b = z10;
        this.f25087c = g3Var;
        this.d = runnable;
    }
}
