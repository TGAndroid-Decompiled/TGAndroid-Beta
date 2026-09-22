package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class xb0 implements View.OnClickListener {
    public final int f29913a = 1;
    public final boolean f29914b;
    public final Object f29915c;
    public final Object d;

    public xb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f29915c = otVar;
        this.d = arrayList;
        this.f29914b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29913a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29915c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29914b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f29915c).f36339a;
                if (stVar.f37483w != null && stVar.f37473l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f37473l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f37473l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f37473l.u(null);
                    } else if (intValue == 3) {
                        stVar.f37473l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f37473l.q(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f37479r).addRecentSticker(2, stVar.f37463b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f29914b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public xb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29914b = z10;
        this.f29915c = f3Var;
        this.d = runnable;
    }
}
