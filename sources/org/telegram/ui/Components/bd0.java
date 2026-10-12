package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class bd0 implements View.OnClickListener {
    public final int f24602a = 1;
    public final boolean f24603b;
    public final Object f24604c;
    public final Object d;

    public bd0(org.telegram.ui.qt qtVar, ArrayList arrayList, boolean z10) {
        this.f24604c = qtVar;
        this.d = arrayList;
        this.f24603b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f24602a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f24604c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f24603b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    e3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ut utVar = ((org.telegram.ui.qt) this.f24604c).f41433a;
                if (utVar.f42590w != null && utVar.f42580l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        utVar.f42580l.C(utVar.W);
                    } else if (intValue == 1) {
                        utVar.f42580l.v(utVar.W);
                    } else if (intValue == 2) {
                        utVar.f42580l.v(null);
                    } else if (intValue == 3) {
                        utVar.f42580l.H(utVar.W);
                    } else if (intValue == 4) {
                        utVar.f42580l.r(utVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(utVar.f42586r).addRecentSticker(2, utVar.f42569b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.f24603b);
                    }
                    utVar.p();
                    return;
                }
                return;
        }
    }

    public bd0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f24603b = z10;
        this.f24604c = e3Var;
        this.d = runnable;
    }
}
