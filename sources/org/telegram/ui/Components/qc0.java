package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class qc0 implements View.OnClickListener {
    public final int f29651a = 1;
    public final boolean f29652b;
    public final Object f29653c;
    public final Object d;

    public qc0(org.telegram.ui.ct ctVar, ArrayList arrayList, boolean z10) {
        this.f29653c = ctVar;
        this.d = arrayList;
        this.f29652b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29651a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29653c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29652b) {
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
                org.telegram.ui.gt gtVar = ((org.telegram.ui.ct) this.f29653c).f35984a;
                if (gtVar.f37332w != null && gtVar.f37322l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        gtVar.f37322l.C(gtVar.W);
                    } else if (intValue == 1) {
                        gtVar.f37322l.v(gtVar.W);
                    } else if (intValue == 2) {
                        gtVar.f37322l.v(null);
                    } else if (intValue == 3) {
                        gtVar.f37322l.H(gtVar.W);
                    } else if (intValue == 4) {
                        gtVar.f37322l.p(gtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(gtVar.f37328r).addRecentSticker(2, gtVar.f37312b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.f29652b);
                    }
                    gtVar.p();
                    return;
                }
                return;
        }
    }

    public qc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29652b = z10;
        this.f29653c = f3Var;
        this.d = runnable;
    }
}
