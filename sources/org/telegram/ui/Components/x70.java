package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class x70 implements DialogInterface.OnCancelListener {
    public final int f30183a;
    public final AccountInstance f30184b;
    public final int f30185c;

    public x70(AccountInstance accountInstance, int i10, int i11) {
        this.f30183a = i11;
        this.f30184b = accountInstance;
        this.f30185c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30183a) {
            case 0:
                this.f30184b.getConnectionsManager().cancelRequest(this.f30185c, true);
                return;
            default:
                this.f30184b.getConnectionsManager().cancelRequest(this.f30185c, true);
                return;
        }
    }
}
