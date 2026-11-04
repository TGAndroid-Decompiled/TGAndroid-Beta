package org.telegram.ui;

import android.content.Context;
public final class lw implements Runnable {
    public final int f47448a;
    public final mw f47449b;

    public lw(mw mwVar, int i3) {
        this.f47448a = i3;
        this.f47449b = mwVar;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f47448a) {
            case 0:
                mw mwVar = this.f47449b;
                uw uwVar = mwVar.f47801o0;
                Context context = mwVar.getContext();
                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                uwVar.showDialog(new vg.i0(3, i3, context, uwVar, null));
                return;
            default:
                uw uwVar2 = this.f47449b.f47801o0;
                rv rvVar = uwVar2.N0;
                if (rvVar != null) {
                    rvVar.dismiss();
                    uwVar2.N0 = null;
                    return;
                }
                return;
        }
    }
}
