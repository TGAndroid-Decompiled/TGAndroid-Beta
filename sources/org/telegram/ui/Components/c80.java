package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class c80 implements DialogInterface.OnCancelListener {
    public final int f23227a;
    public final AccountInstance f23228b;
    public final int f23229c;

    public c80(AccountInstance accountInstance, int i10, int i11) {
        this.f23227a = i11;
        this.f23228b = accountInstance;
        this.f23229c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23227a) {
            case 0:
                this.f23228b.getConnectionsManager().cancelRequest(this.f23229c, true);
                return;
            default:
                this.f23228b.getConnectionsManager().cancelRequest(this.f23229c, true);
                return;
        }
    }
}
