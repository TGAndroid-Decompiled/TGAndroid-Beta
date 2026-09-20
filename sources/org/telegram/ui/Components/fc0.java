package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class fc0 implements View.OnClickListener {
    public final int f24072a = 1;
    public final boolean f24073b;
    public final Object f24074c;
    public final Object d;

    public fc0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f24074c = otVar;
        this.d = arrayList;
        this.f24073b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f24072a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24074c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f24073b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f24074c).f36366a;
                if (stVar.f37547w != null && stVar.f37537l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f37537l.C(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f37537l.v(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f37537l.v(null);
                    } else if (intValue == 3) {
                        stVar.f37537l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f37537l.q(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f37543r).addRecentSticker(2, stVar.f37527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f24073b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public fc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f24073b = z10;
        this.f24074c = f3Var;
        this.d = runnable;
    }
}
