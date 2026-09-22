package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ic0 implements View.OnClickListener {
    public final int f25085a = 1;
    public final boolean f25086b;
    public final Object f25087c;
    public final Object d;

    public ic0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f25087c = otVar;
        this.d = arrayList;
        this.f25086b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f25085a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f25087c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f25086b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f25087c).f36393a;
                if (stVar.f37571w != null && stVar.f37561l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f37561l.C(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f37561l.v(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f37561l.v(null);
                    } else if (intValue == 3) {
                        stVar.f37561l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f37561l.q(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f37567r).addRecentSticker(2, stVar.f37551b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f25086b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public ic0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f25086b = z10;
        this.f25087c = f3Var;
        this.d = runnable;
    }
}
