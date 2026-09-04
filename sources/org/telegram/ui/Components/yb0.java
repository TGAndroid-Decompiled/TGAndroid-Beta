package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yb0 implements View.OnClickListener {
    public final int f32878a = 1;
    public final boolean f32879b;
    public final Object f32880c;
    public final Object d;

    public yb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f32880c = otVar;
        this.d = arrayList;
        this.f32879b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32878a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f32880c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32879b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f32880c).f39309a;
                if (stVar.f40548w != null && stVar.f40538l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f40538l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f40538l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f40538l.u(null);
                    } else if (intValue == 3) {
                        stVar.f40538l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f40538l.p(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f40544r).addRecentSticker(2, stVar.f40527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f32879b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public yb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f32879b = z10;
        this.f32880c = f3Var;
        this.d = runnable;
    }
}
