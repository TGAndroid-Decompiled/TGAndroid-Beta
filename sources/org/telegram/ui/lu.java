package org.telegram.ui;

import android.content.DialogInterface;
public final class lu implements DialogInterface.OnDismissListener {
    public final int f47588a;
    public final ww f47589b;

    public lu(ww wwVar, int i7) {
        this.f47588a = i7;
        this.f47589b = wwVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47588a) {
            case 0:
                ww wwVar = this.f47589b;
                if (wwVar.R3 != null) {
                    wwVar.getMessagesController().k4(0L, wwVar.R3);
                    wwVar.R3 = null;
                    wwVar.X4();
                    return;
                }
                return;
            case 1:
                this.f47589b.n4(true);
                return;
            case 2:
                this.f47589b.n4(true);
                return;
            default:
                ww.l0(this.f47589b);
                return;
        }
    }
}
