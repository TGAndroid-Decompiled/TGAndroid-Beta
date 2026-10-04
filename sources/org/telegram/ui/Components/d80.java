package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class d80 implements DialogInterface.OnCancelListener {
    public final int f25632a;
    public final AccountInstance f25633b;
    public final int f25634c;

    public d80(AccountInstance accountInstance, int i10, int i11) {
        this.f25632a = i11;
        this.f25633b = accountInstance;
        this.f25634c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25632a) {
            case 0:
                this.f25633b.getConnectionsManager().cancelRequest(this.f25634c, true);
                return;
            default:
                this.f25633b.getConnectionsManager().cancelRequest(this.f25634c, true);
                return;
        }
    }
}
