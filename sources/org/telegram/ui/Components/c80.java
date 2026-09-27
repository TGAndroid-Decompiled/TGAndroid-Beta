package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class c80 implements DialogInterface.OnCancelListener {
    public final int f23247a;
    public final AccountInstance f23248b;
    public final int f23249c;

    public c80(AccountInstance accountInstance, int i10, int i11) {
        this.f23247a = i11;
        this.f23248b = accountInstance;
        this.f23249c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23247a) {
            case 0:
                this.f23248b.getConnectionsManager().cancelRequest(this.f23249c, true);
                return;
            default:
                this.f23248b.getConnectionsManager().cancelRequest(this.f23249c, true);
                return;
        }
    }
}
