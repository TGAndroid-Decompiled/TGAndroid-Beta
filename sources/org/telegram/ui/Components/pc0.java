package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class pc0 implements View.OnClickListener {
    public final int f31544a = 1;
    public final boolean f31545b;
    public final Object f31546c;
    public final Object d;

    public pc0(jg.i iVar, boolean z10, Runnable runnable) {
        this.d = iVar;
        this.f31545b = z10;
        this.f31546c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f31544a) {
            case 0:
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.d;
                Runnable runnable = (Runnable) this.f31546c;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f31545b) {
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
                Runnable runnable2 = (Runnable) this.f31546c;
                if (this.f31545b) {
                    ((aw0) iVar.f15726a).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f31546c;
                org.telegram.ui.ft ftVar = ((org.telegram.ui.bt) this.d).f38155a;
                if (ftVar.f39466w != null && ftVar.f39456l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ftVar.f39456l.B(ftVar.W);
                    } else if (intValue == 1) {
                        ftVar.f39456l.u(ftVar.W);
                    } else if (intValue == 2) {
                        ftVar.f39456l.u(null);
                    } else if (intValue == 3) {
                        ftVar.f39456l.G(ftVar.W);
                    } else if (intValue == 4) {
                        ftVar.f39456l.q(ftVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ftVar.f39462r).addRecentSticker(2, ftVar.f39446b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.f31545b);
                    }
                    ftVar.n();
                    return;
                }
                return;
        }
    }

    public pc0(org.telegram.ui.bt btVar, ArrayList arrayList, boolean z10) {
        this.d = btVar;
        this.f31546c = arrayList;
        this.f31545b = z10;
    }

    public pc0(boolean z10, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.f31545b = z10;
        this.d = s6Var;
        this.f31546c = runnable;
    }
}
