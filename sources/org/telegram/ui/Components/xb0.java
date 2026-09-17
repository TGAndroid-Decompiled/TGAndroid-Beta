package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xb0 implements View.OnClickListener {
    public final int f29892a = 1;
    public final boolean f29893b;
    public final Object f29894c;
    public final Object d;

    public xb0(org.telegram.ui.qt qtVar, ArrayList arrayList, boolean z10) {
        this.f29894c = qtVar;
        this.d = arrayList;
        this.f29893b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29892a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f29894c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29893b) {
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
                org.telegram.ui.ut utVar = ((org.telegram.ui.qt) this.f29894c).f37017a;
                if (utVar.f38218w != null && utVar.f38208l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        utVar.f38208l.B(utVar.W);
                    } else if (intValue == 1) {
                        utVar.f38208l.u(utVar.W);
                    } else if (intValue == 2) {
                        utVar.f38208l.u(null);
                    } else if (intValue == 3) {
                        utVar.f38208l.H(utVar.W);
                    } else if (intValue == 4) {
                        utVar.f38208l.q(utVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(utVar.f38214r).addRecentSticker(2, utVar.f38198b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.f29893b);
                    }
                    utVar.p();
                    return;
                }
                return;
        }
    }

    public xb0(boolean z10, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f29893b = z10;
        this.f29894c = g3Var;
        this.d = runnable;
    }
}
