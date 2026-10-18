package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class qc0 implements View.OnClickListener {
    public final int f29650a = 1;
    public final boolean f29651b;
    public final Object f29652c;
    public final Object d;

    public qc0(org.telegram.ui.ct ctVar, ArrayList arrayList, boolean z10) {
        this.f29652c = ctVar;
        this.d = arrayList;
        this.f29651b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29650a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29652c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29651b) {
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
                org.telegram.ui.gt gtVar = ((org.telegram.ui.ct) this.f29652c).f35970a;
                if (gtVar.f37313w != null && gtVar.f37303l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        gtVar.f37303l.C(gtVar.W);
                    } else if (intValue == 1) {
                        gtVar.f37303l.v(gtVar.W);
                    } else if (intValue == 2) {
                        gtVar.f37303l.v(null);
                    } else if (intValue == 3) {
                        gtVar.f37303l.H(gtVar.W);
                    } else if (intValue == 4) {
                        gtVar.f37303l.p(gtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(gtVar.f37309r).addRecentSticker(2, gtVar.f37293b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.f29651b);
                    }
                    gtVar.p();
                    return;
                }
                return;
        }
    }

    public qc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29651b = z10;
        this.f29652c = f3Var;
        this.d = runnable;
    }
}
