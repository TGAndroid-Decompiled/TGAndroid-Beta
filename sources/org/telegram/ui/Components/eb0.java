package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class eb0 implements View.OnClickListener {
    public final int f27996a = 1;
    public final boolean f27997b;
    public final Object f27998c;
    public final Object d;

    public eb0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.f27998c = dtVar;
        this.d = arrayList;
        this.f27997b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f27996a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f27998c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f27997b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    f3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ht htVar = ((org.telegram.ui.dt) this.f27998c).f37593a;
                if (htVar.f38933w != null && htVar.f38923l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.f38923l.B(htVar.W);
                    } else if (intValue == 1) {
                        htVar.f38923l.u(htVar.W);
                    } else if (intValue == 2) {
                        htVar.f38923l.u(null);
                    } else if (intValue == 3) {
                        htVar.f38923l.H(htVar.W);
                    } else if (intValue == 4) {
                        htVar.f38923l.p(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.f38929r).addRecentSticker(2, htVar.f38912b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f27997b);
                    }
                    htVar.p();
                    return;
                }
                return;
        }
    }

    public eb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f27997b = z10;
        this.f27998c = f3Var;
        this.d = runnable;
    }
}
