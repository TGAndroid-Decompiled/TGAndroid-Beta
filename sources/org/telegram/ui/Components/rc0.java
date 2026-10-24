package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class rc0 implements View.OnClickListener {
    public final int f30113a = 1;
    public final boolean f30114b;
    public final Object f30115c;
    public final Object d;

    public rc0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.f30115c = dtVar;
        this.d = arrayList;
        this.f30114b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f30113a) {
            case 0:
                org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.f30115c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f30114b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    r6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ht htVar = ((org.telegram.ui.dt) this.f30115c).f36721a;
                if (htVar.f38006w != null && htVar.f37996l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.f37996l.C(htVar.W);
                    } else if (intValue == 1) {
                        htVar.f37996l.v(htVar.W);
                    } else if (intValue == 2) {
                        htVar.f37996l.v(null);
                    } else if (intValue == 3) {
                        htVar.f37996l.H(htVar.W);
                    } else if (intValue == 4) {
                        htVar.f37996l.p(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.f38002r).addRecentSticker(2, htVar.f37986b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f30114b);
                    }
                    htVar.n();
                    return;
                }
                return;
        }
    }

    public rc0(boolean z10, org.telegram.ui.r6 r6Var, Runnable runnable) {
        this.f30114b = z10;
        this.f30115c = r6Var;
        this.d = runnable;
    }
}
