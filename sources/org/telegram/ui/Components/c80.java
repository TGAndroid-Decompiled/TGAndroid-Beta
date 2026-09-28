package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class c80 implements DialogInterface.OnCancelListener {
    public final int f23226a;
    public final AccountInstance f23227b;
    public final int f23228c;

    public c80(AccountInstance accountInstance, int i10, int i11) {
        this.f23226a = i11;
        this.f23227b = accountInstance;
        this.f23228c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23226a) {
            case 0:
                this.f23227b.getConnectionsManager().cancelRequest(this.f23228c, true);
                return;
            default:
                this.f23227b.getConnectionsManager().cancelRequest(this.f23228c, true);
                return;
        }
    }
}
