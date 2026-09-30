package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class c80 implements DialogInterface.OnCancelListener {
    public final int f23206a;
    public final AccountInstance f23207b;
    public final int f23208c;

    public c80(AccountInstance accountInstance, int i10, int i11) {
        this.f23206a = i11;
        this.f23207b = accountInstance;
        this.f23208c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23206a) {
            case 0:
                this.f23207b.getConnectionsManager().cancelRequest(this.f23208c, true);
                return;
            default:
                this.f23207b.getConnectionsManager().cancelRequest(this.f23208c, true);
                return;
        }
    }
}
