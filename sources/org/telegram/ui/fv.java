package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f38237a;
    public final fy f38238b;

    public fv(fy fyVar, int i10) {
        this.f38237a = i10;
        this.f38238b = fyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38237a) {
            case 0:
                fy.i0(this.f38238b);
                return;
            case 1:
                fy fyVar = this.f38238b;
                if (fyVar.O3 != null) {
                    fyVar.getMessagesController().removeSuggestion(0L, fyVar.O3);
                    fyVar.O3 = null;
                    fyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f38238b.b4(true);
                return;
            default:
                this.f38238b.b4(true);
                return;
        }
    }
}
