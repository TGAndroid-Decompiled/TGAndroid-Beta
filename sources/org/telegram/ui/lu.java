package org.telegram.ui;

import android.content.DialogInterface;
public final class lu implements DialogInterface.OnDismissListener {
    public final int f47585a;
    public final ww f47586b;

    public lu(ww wwVar, int i7) {
        this.f47585a = i7;
        this.f47586b = wwVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47585a) {
            case 0:
                ww wwVar = this.f47586b;
                if (wwVar.R3 != null) {
                    wwVar.getMessagesController().k4(0L, wwVar.R3);
                    wwVar.R3 = null;
                    wwVar.X4();
                    return;
                }
                return;
            case 1:
                this.f47586b.n4(true);
                return;
            case 2:
                this.f47586b.n4(true);
                return;
            default:
                ww.l0(this.f47586b);
                return;
        }
    }
}
