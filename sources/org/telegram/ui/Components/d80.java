package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class d80 implements DialogInterface.OnCancelListener {
    public final int f25709a;
    public final AccountInstance f25710b;
    public final int f25711c;

    public d80(AccountInstance accountInstance, int i10, int i11) {
        this.f25709a = i11;
        this.f25710b = accountInstance;
        this.f25711c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25709a) {
            case 0:
                this.f25710b.getConnectionsManager().cancelRequest(this.f25711c, true);
                return;
            default:
                this.f25710b.getConnectionsManager().cancelRequest(this.f25711c, true);
                return;
        }
    }
}
