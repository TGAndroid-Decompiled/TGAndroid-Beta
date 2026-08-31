package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class s70 implements DialogInterface.OnCancelListener {
    public final int f30998a;
    public final AccountInstance f30999b;
    public final int f31000c;

    public s70(AccountInstance accountInstance, int i10, int i11) {
        this.f30998a = i11;
        this.f30999b = accountInstance;
        this.f31000c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30998a) {
            case 0:
                this.f30999b.getConnectionsManager().cancelRequest(this.f31000c, true);
                return;
            default:
                this.f30999b.getConnectionsManager().cancelRequest(this.f31000c, true);
                return;
        }
    }
}
