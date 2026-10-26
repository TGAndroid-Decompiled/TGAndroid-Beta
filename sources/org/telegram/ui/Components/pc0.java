package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class pc0 implements View.OnClickListener {
    public final int f31546a = 1;
    public final boolean f31547b;
    public final Object f31548c;
    public final Object d;

    public pc0(jg.i iVar, boolean z10, Runnable runnable) {
        this.d = iVar;
        this.f31547b = z10;
        this.f31548c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f31546a) {
            case 0:
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.d;
                Runnable runnable = (Runnable) this.f31548c;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f31547b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    s6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jg.i iVar = (jg.i) this.d;
                Runnable runnable2 = (Runnable) this.f31548c;
                if (this.f31547b) {
                    ((aw0) iVar.f15726a).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f31548c;
                org.telegram.ui.ft ftVar = ((org.telegram.ui.bt) this.d).f38158a;
                if (ftVar.f39469w != null && ftVar.f39459l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ftVar.f39459l.B(ftVar.W);
                    } else if (intValue == 1) {
                        ftVar.f39459l.u(ftVar.W);
                    } else if (intValue == 2) {
                        ftVar.f39459l.u(null);
                    } else if (intValue == 3) {
                        ftVar.f39459l.G(ftVar.W);
                    } else if (intValue == 4) {
                        ftVar.f39459l.q(ftVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ftVar.f39465r).addRecentSticker(2, ftVar.f39449b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.f31547b);
                    }
                    ftVar.n();
                    return;
                }
                return;
        }
    }

    public pc0(org.telegram.ui.bt btVar, ArrayList arrayList, boolean z10) {
        this.d = btVar;
        this.f31548c = arrayList;
        this.f31547b = z10;
    }

    public pc0(boolean z10, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.f31547b = z10;
        this.d = s6Var;
        this.f31548c = runnable;
    }
}
