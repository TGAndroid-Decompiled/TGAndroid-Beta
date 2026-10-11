package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class r80 implements DialogInterface.OnCancelListener {
    public final int f30451a;
    public final AccountInstance f30452b;
    public final int f30453c;

    public r80(AccountInstance accountInstance, int i10, int i11) {
        this.f30451a = i11;
        this.f30452b = accountInstance;
        this.f30453c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30451a) {
            case 0:
                this.f30452b.getConnectionsManager().cancelRequest(this.f30453c, true);
                return;
            default:
                this.f30452b.getConnectionsManager().cancelRequest(this.f30453c, true);
                return;
        }
    }
}
