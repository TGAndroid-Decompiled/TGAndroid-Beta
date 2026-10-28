package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class qc0 implements View.OnClickListener {
    public final int f31874a = 1;
    public final boolean f31875b;
    public final Object f31876c;
    public final Object d;

    public qc0(jg.i iVar, boolean z10, Runnable runnable) {
        this.d = iVar;
        this.f31875b = z10;
        this.f31876c = runnable;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f31874a) {
            case 0:
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.d;
                Runnable runnable = (Runnable) this.f31876c;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    if (this.f31875b) {
                        str = "lastseen";
                    } else {
                        str = "readtime";
                    }
                    R.presentFragment(new PremiumPreviewFragment(0, str));
                    s6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jg.i iVar = (jg.i) this.d;
                Runnable runnable2 = (Runnable) this.f31876c;
                if (this.f31875b) {
                    ((bw0) iVar.f15725a).I.o();
                }
                runnable2.run();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f31876c;
                org.telegram.ui.ht htVar = ((org.telegram.ui.dt) this.d).f38675a;
                if (htVar.f39984w != null && htVar.f39974l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.f39974l.B(htVar.W);
                    } else if (intValue == 1) {
                        htVar.f39974l.u(htVar.W);
                    } else if (intValue == 2) {
                        htVar.f39974l.u(null);
                    } else if (intValue == 3) {
                        htVar.f39974l.G(htVar.W);
                    } else if (intValue == 4) {
                        htVar.f39974l.q(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.f39980r).addRecentSticker(2, htVar.f39964b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f31875b);
                    }
                    htVar.n();
                    return;
                }
                return;
        }
    }

    public qc0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.d = dtVar;
        this.f31876c = arrayList;
        this.f31875b = z10;
    }

    public qc0(boolean z10, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.f31875b = z10;
        this.d = s6Var;
        this.f31876c = runnable;
    }
}
