package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class tb0 implements View.OnClickListener {
    public final int f32919a = 1;
    public final boolean f32920b;
    public final Object f32921c;
    public final Object d;

    public tb0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.f32921c = dtVar;
        this.d = arrayList;
        this.f32920b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32919a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f32921c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32920b) {
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
                org.telegram.ui.ht htVar = ((org.telegram.ui.dt) this.f32921c).f37629a;
                if (htVar.f39042w != null && htVar.f39032l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.f39032l.A(htVar.W);
                    } else if (intValue == 1) {
                        htVar.f39032l.t(htVar.W);
                    } else if (intValue == 2) {
                        htVar.f39032l.t(null);
                    } else if (intValue == 3) {
                        htVar.f39032l.H(htVar.W);
                    } else if (intValue == 4) {
                        htVar.f39032l.p(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.f39038r).addRecentSticker(2, htVar.f39021b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f32920b);
                    }
                    htVar.p();
                    return;
                }
                return;
        }
    }

    public tb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f32920b = z10;
        this.f32921c = f3Var;
        this.d = runnable;
    }
}
