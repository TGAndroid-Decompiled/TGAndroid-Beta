package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class yb0 implements View.OnClickListener {
    public final int f32906a = 1;
    public final boolean f32907b;
    public final Object f32908c;
    public final Object d;

    public yb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.f32908c = otVar;
        this.d = arrayList;
        this.f32907b = z10;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f32906a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f32908c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f32907b) {
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
                org.telegram.ui.st stVar = ((org.telegram.ui.ot) this.f32908c).f39337a;
                if (stVar.f40576w != null && stVar.f40566l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.f40566l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.f40566l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.f40566l.u(null);
                    } else if (intValue == 3) {
                        stVar.f40566l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.f40566l.p(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.f40572r).addRecentSticker(2, stVar.f40555b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f32907b);
                    }
                    stVar.p();
                    return;
                }
                return;
        }
    }

    public yb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f32907b = z10;
        this.f32908c = f3Var;
        this.d = runnable;
    }
}
