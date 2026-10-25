package org.telegram.ui;

import android.content.DialogInterface;
public final class fg implements DialogInterface.OnCancelListener {
    public final int f39356a;
    public final Object f39357b;

    public fg(Object obj, int i10) {
        this.f39356a = i10;
        this.f39357b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39356a) {
            case 0:
                un unVar = (un) this.f39357b;
                unVar.f44349n9 = true;
                unVar.f44323l9 = 0;
                unVar.Mb = 0;
                unVar.Z4 = 0;
                unVar.z9();
                unVar.Zb(false);
                return;
            case 1:
                mo moVar = (mo) this.f39357b;
                moVar.L0 = false;
                moVar.f41596b = null;
                moVar.M0 = false;
                return;
            case 2:
                ((np) this.f39357b).f41962n = null;
                return;
            default:
                ((lb0) this.f39357b).b();
                return;
        }
    }
}
