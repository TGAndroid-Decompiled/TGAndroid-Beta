package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xc0 implements View.OnClickListener {
    public final int f32933a = 1;
    public final boolean f32934b;
    public final Object f32935c;
    public final Object d;

    public xc0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z10) {
        this.f32935c = mtVar;
        this.d = arrayList;
        this.f32934b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32933a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f32935c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32934b) {
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
                org.telegram.ui.qt qtVar = ((org.telegram.ui.mt) this.f32935c).f40107a;
                if (qtVar.f41288w != null && qtVar.f41278l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.f41278l.C(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.f41278l.v(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.f41278l.v(null);
                    } else if (intValue == 3) {
                        qtVar.f41278l.H(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.f41278l.r(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.f41284r).addRecentSticker(2, qtVar.f41267b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f32934b);
                    }
                    qtVar.p();
                    return;
                }
                return;
        }
    }

    public xc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f32934b = z10;
        this.f32935c = e3Var;
        this.d = runnable;
    }
}
