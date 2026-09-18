package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class gc0 implements View.OnClickListener {
    public final int f24360a = 1;
    public final boolean f24361b;
    public final Object f24362c;
    public final Object d;

    public gc0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f24362c = otVar;
        this.d = arrayList;
        this.f24361b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f24360a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24362c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f24361b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f24362c).f36238a;
                if (stVar.f37492w != null && stVar.f37482l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f37482l.C(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f37482l.v(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f37482l.v(null);
                    } else if (intValue == 3) {
                        stVar.f37482l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f37482l.q(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f37488r).addRecentSticker(2, stVar.f37472b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f24361b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public gc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f24361b = z10;
        this.f24362c = f3Var;
        this.d = runnable;
    }
}
