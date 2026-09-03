package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class s70 implements DialogInterface.OnCancelListener {
    public final int f30995a;
    public final AccountInstance f30996b;
    public final int f30997c;

    public s70(AccountInstance accountInstance, int i10, int i11) {
        this.f30995a = i11;
        this.f30996b = accountInstance;
        this.f30997c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30995a) {
            case 0:
                this.f30996b.getConnectionsManager().cancelRequest(this.f30997c, true);
                return;
            default:
                this.f30996b.getConnectionsManager().cancelRequest(this.f30997c, true);
                return;
        }
    }
}
