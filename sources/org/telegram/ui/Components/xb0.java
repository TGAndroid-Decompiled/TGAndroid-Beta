package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xb0 implements View.OnClickListener {
    public final int f29916a = 1;
    public final boolean f29917b;
    public final Object f29918c;
    public final Object d;

    public xb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f29918c = otVar;
        this.d = arrayList;
        this.f29917b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29916a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29918c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29917b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f29918c).f36336a;
                if (stVar.f37474w != null && stVar.f37464l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f37464l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f37464l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f37464l.u(null);
                    } else if (intValue == 3) {
                        stVar.f37464l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f37464l.q(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f37470r).addRecentSticker(2, stVar.f37454b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f29917b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public xb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29917b = z10;
        this.f29918c = f3Var;
        this.d = runnable;
    }
}
