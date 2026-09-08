package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yb0 implements View.OnClickListener {
    public final int f32905a = 1;
    public final boolean f32906b;
    public final Object f32907c;
    public final Object d;

    public yb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f32907c = otVar;
        this.d = arrayList;
        this.f32906b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32905a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f32907c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32906b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f32907c).f39336a;
                if (stVar.f40575w != null && stVar.f40565l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f40565l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f40565l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f40565l.u(null);
                    } else if (intValue == 3) {
                        stVar.f40565l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f40565l.p(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f40571r).addRecentSticker(2, stVar.f40554b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f32906b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public yb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f32906b = z10;
        this.f32907c = f3Var;
        this.d = runnable;
    }
}
