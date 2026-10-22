package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class qc0 implements View.OnClickListener {
    public final int f29546a = 1;
    public final boolean f29547b;
    public final Object f29548c;
    public final Object d;

    public qc0(org.telegram.ui.at atVar, ArrayList arrayList, boolean z10) {
        this.f29548c = atVar;
        this.d = arrayList;
        this.f29547b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f29546a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f29548c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f29547b) {
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
                org.telegram.ui.et etVar = ((org.telegram.ui.at) this.f29548c).f35419a;
                if (etVar.f36800w != null && etVar.f36790l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        etVar.f36790l.C(etVar.W);
                    } else if (intValue == 1) {
                        etVar.f36790l.v(etVar.W);
                    } else if (intValue == 2) {
                        etVar.f36790l.v(null);
                    } else if (intValue == 3) {
                        etVar.f36790l.H(etVar.W);
                    } else if (intValue == 4) {
                        etVar.f36790l.p(etVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(etVar.f36796r).addRecentSticker(2, etVar.f36780b0, etVar.W, (int) (System.currentTimeMillis() / 1000), this.f29547b);
                    }
                    etVar.p();
                    return;
                }
                return;
        }
    }

    public qc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f29547b = z10;
        this.f29548c = f3Var;
        this.d = runnable;
    }
}
