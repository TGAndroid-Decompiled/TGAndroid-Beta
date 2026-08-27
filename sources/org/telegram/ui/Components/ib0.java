package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class ib0 implements View.OnClickListener {

    public final int f29326a = 1;

    public final boolean f29327b;

    public final Object f29328c;
    public final Object d;

    public ib0(org.telegram.ui.ft ftVar, ArrayList arrayList, boolean z10) {
        this.f29328c = ftVar;
        this.d = arrayList;
        this.f29327b = z10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29326a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f29328c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    n2VarR.presentFragment(new PremiumPreviewFragment(0, this.f29327b ? "lastseen" : "readtime"));
                    e3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            default:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.f29328c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.kt ktVar = ftVar.f38203a;
                if (ktVar.f39878w != null && ktVar.f39868l != null) {
                    int iIntValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (iIntValue == 0) {
                        ktVar.f39868l.A(ktVar.W);
                    } else if (iIntValue == 1) {
                        ktVar.f39868l.t(ktVar.W);
                    } else if (iIntValue == 2) {
                        ktVar.f39868l.t(null);
                    } else if (iIntValue == 3) {
                        ktVar.f39868l.G(ktVar.W);
                    } else if (iIntValue == 4) {
                        ktVar.f39868l.p(ktVar.W);
                    } else if (iIntValue == 5) {
                        MediaDataController.getInstance(ktVar.f39874r).addRecentSticker(2, ktVar.f39857b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.f29327b);
                    }
                    ktVar.p();
                    break;
                }
                break;
        }
    }

    public ib0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f29327b = z10;
        this.f29328c = e3Var;
        this.d = runnable;
    }
}
