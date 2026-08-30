package org.telegram.ui;

import android.content.DialogInterface;
public final class nv implements DialogInterface.OnDismissListener {
    public final int f36729a;
    public final oy f36730b;

    public nv(oy oyVar, int i10) {
        this.f36729a = i10;
        this.f36730b = oyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36729a) {
            case 0:
                oy.i0(this.f36730b);
                return;
            case 1:
                oy oyVar = this.f36730b;
                if (oyVar.P3 != null) {
                    oyVar.getMessagesController().removeSuggestion(0L, oyVar.P3);
                    oyVar.P3 = null;
                    oyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f36730b.b4(true);
                return;
            default:
                this.f36730b.b4(true);
                return;
        }
    }
}
