package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class l70 implements DialogInterface.OnCancelListener {
    public final int f30245a;
    public final AccountInstance f30246b;
    public final int f30247c;

    public l70(AccountInstance accountInstance, int i10, int i11) {
        this.f30245a = i11;
        this.f30246b = accountInstance;
        this.f30247c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30245a) {
            case 0:
                this.f30246b.getConnectionsManager().cancelRequest(this.f30247c, true);
                return;
            default:
                this.f30246b.getConnectionsManager().cancelRequest(this.f30247c, true);
                return;
        }
    }
}
