package org.telegram.ui;

import android.content.Context;
public final class ky implements Runnable {
    public final int f39478a;
    public final ly f39479b;

    public ky(ly lyVar, int i10) {
        this.f39478a = i10;
        this.f39479b = lyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39478a) {
            case 0:
                ly lyVar = this.f39479b;
                sy syVar = lyVar.E0;
                Context context = lyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                syVar.showDialog(new rg.j0(3, i10, context, syVar, null));
                return;
            default:
                sy syVar2 = this.f39479b.E0;
                ox oxVar = syVar2.M0;
                if (oxVar != null) {
                    oxVar.dismiss();
                    syVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
