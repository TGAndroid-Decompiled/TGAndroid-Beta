package org.telegram.ui;

import android.content.Context;
public final class ow implements Runnable {
    public final int f48555a;
    public final pw f48556b;

    public ow(pw pwVar, int i7) {
        this.f48555a = i7;
        this.f48556b = pwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48555a) {
            case 0:
                pw pwVar = this.f48556b;
                ww wwVar = pwVar.f48964n0;
                Context context = pwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                wwVar.showDialog(new ug.i0(3, i7, context, wwVar, null));
                return;
            default:
                ww wwVar2 = this.f48556b.f48964n0;
                uv uvVar = wwVar2.M0;
                if (uvVar != null) {
                    uvVar.dismiss();
                    wwVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
