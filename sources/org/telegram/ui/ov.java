package org.telegram.ui;

import android.content.DialogInterface;
public final class ov implements DialogInterface.OnDismissListener {
    public final int f39846a;
    public final py f39847b;

    public ov(py pyVar, int i10) {
        this.f39846a = i10;
        this.f39847b = pyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39846a) {
            case 0:
                py.i0(this.f39847b);
                return;
            case 1:
                py pyVar = this.f39847b;
                if (pyVar.P3 != null) {
                    pyVar.getMessagesController().removeSuggestion(0L, pyVar.P3);
                    pyVar.P3 = null;
                    pyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f39847b.b4(true);
                return;
            default:
                this.f39847b.b4(true);
                return;
        }
    }
}
