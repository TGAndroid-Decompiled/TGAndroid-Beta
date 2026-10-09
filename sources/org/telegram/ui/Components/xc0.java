package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xc0 implements View.OnClickListener {
    public final int f32798a = 1;
    public final boolean f32799b;
    public final Object f32800c;
    public final Object d;

    public xc0(org.telegram.ui.nt ntVar, ArrayList arrayList, boolean z10) {
        this.f32800c = ntVar;
        this.d = arrayList;
        this.f32799b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32798a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f32800c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32799b) {
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
                org.telegram.ui.rt rtVar = ((org.telegram.ui.nt) this.f32800c).f40360a;
                if (rtVar.f41506w != null && rtVar.f41496l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rtVar.f41496l.C(rtVar.W);
                    } else if (intValue == 1) {
                        rtVar.f41496l.v(rtVar.W);
                    } else if (intValue == 2) {
                        rtVar.f41496l.v(null);
                    } else if (intValue == 3) {
                        rtVar.f41496l.H(rtVar.W);
                    } else if (intValue == 4) {
                        rtVar.f41496l.r(rtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(rtVar.f41502r).addRecentSticker(2, rtVar.f41485b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f32799b);
                    }
                    rtVar.p();
                    return;
                }
                return;
        }
    }

    public xc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f32799b = z10;
        this.f32800c = f3Var;
        this.d = runnable;
    }
}
