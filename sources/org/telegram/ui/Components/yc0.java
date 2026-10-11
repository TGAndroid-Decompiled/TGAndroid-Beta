package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yc0 implements View.OnClickListener {
    public final int f33169a = 1;
    public final boolean f33170b;
    public final Object f33171c;
    public final Object d;

    public yc0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z10) {
        this.f33171c = mtVar;
        this.d = arrayList;
        this.f33170b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f33169a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f33171c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f33170b) {
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
                org.telegram.ui.qt qtVar = ((org.telegram.ui.mt) this.f33171c).f40073a;
                if (qtVar.f41254w != null && qtVar.f41244l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.f41244l.C(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.f41244l.v(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.f41244l.v(null);
                    } else if (intValue == 3) {
                        qtVar.f41244l.H(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.f41244l.r(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.f41250r).addRecentSticker(2, qtVar.f41233b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f33170b);
                    }
                    qtVar.p();
                    return;
                }
                return;
        }
    }

    public yc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f33170b = z10;
        this.f33171c = e3Var;
        this.d = runnable;
    }
}
