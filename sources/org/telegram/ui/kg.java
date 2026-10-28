package org.telegram.ui;

import android.content.DialogInterface;
public final class kg implements DialogInterface.OnCancelListener {
    public final int f40794a;
    public final Object f40795b;

    public kg(Object obj, int i10) {
        this.f40794a = i10;
        this.f40795b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40794a) {
            case 0:
                wn wnVar = (wn) this.f40795b;
                wnVar.f45268r9 = true;
                wnVar.f45246p9 = 0;
                wnVar.Qb = 0;
                wnVar.Z4 = 0;
                wnVar.C9();
                wnVar.dc(false);
                return;
            case 1:
                oo ooVar = (oo) this.f40795b;
                ooVar.L0 = false;
                ooVar.f42131b = null;
                ooVar.M0 = false;
                return;
            case 2:
                ((pp) this.f40795b).f42468n = null;
                return;
            default:
                ((ob0) this.f40795b).b();
                return;
        }
    }
}
