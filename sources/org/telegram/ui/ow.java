package org.telegram.ui;

import android.content.Context;
public final class ow implements Runnable {
    public final int f48560a;
    public final pw f48561b;

    public ow(pw pwVar, int i7) {
        this.f48560a = i7;
        this.f48561b = pwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48560a) {
            case 0:
                pw pwVar = this.f48561b;
                ww wwVar = pwVar.f48937n0;
                Context context = pwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                wwVar.showDialog(new ug.i0(3, i7, context, wwVar, null));
                return;
            default:
                ww wwVar2 = this.f48561b.f48937n0;
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
