package org.telegram.ui;

import android.content.DialogInterface;
public final class kg implements DialogInterface.OnCancelListener {
    public final int f38792a;
    public final Object f38793b;

    public kg(Object obj, int i10) {
        this.f38792a = i10;
        this.f38793b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38792a) {
            case 0:
                un unVar = (un) this.f38793b;
                unVar.p9 = true;
                unVar.f42350n9 = 0;
                unVar.Lb = 0;
                unVar.Z4 = 0;
                unVar.C9();
                unVar.gc(false);
                return;
            case 1:
                oo ooVar = (oo) this.f38793b;
                ooVar.M0 = false;
                ooVar.f40316b = null;
                ooVar.N0 = false;
                return;
            case 2:
                ((qp) this.f38793b).f41024n = null;
                return;
            default:
                ((ua0) this.f38793b).b();
                return;
        }
    }
}
