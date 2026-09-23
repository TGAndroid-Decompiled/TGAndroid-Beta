package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class wb0 implements View.OnClickListener {
    public final int f29595a = 1;
    public final boolean f29596b;
    public final Object f29597c;
    public final Object d;

    public wb0(org.telegram.ui.lt ltVar, ArrayList arrayList, boolean z10) {
        this.f29597c = ltVar;
        this.d = arrayList;
        this.f29596b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29595a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29597c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29596b) {
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
                org.telegram.ui.pt ptVar = ((org.telegram.ui.lt) this.f29597c).f35086a;
                if (ptVar.f36203w != null && ptVar.f36193l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ptVar.f36193l.C(ptVar.W);
                    } else if (intValue == 1) {
                        ptVar.f36193l.v(ptVar.W);
                    } else if (intValue == 2) {
                        ptVar.f36193l.v(null);
                    } else if (intValue == 3) {
                        ptVar.f36193l.H(ptVar.W);
                    } else if (intValue == 4) {
                        ptVar.f36193l.r(ptVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ptVar.f36199r).addRecentSticker(2, ptVar.f36183b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.f29596b);
                    }
                    ptVar.p();
                    return;
                }
                return;
        }
    }

    public wb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29596b = z10;
        this.f29597c = f3Var;
        this.d = runnable;
    }
}
