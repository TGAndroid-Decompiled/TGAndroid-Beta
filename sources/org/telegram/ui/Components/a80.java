package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class a80 implements DialogInterface.OnCancelListener {
    public final int f22597a;
    public final AccountInstance f22598b;
    public final int f22599c;

    public a80(AccountInstance accountInstance, int i10, int i11) {
        this.f22597a = i11;
        this.f22598b = accountInstance;
        this.f22599c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22597a) {
            case 0:
                this.f22598b.getConnectionsManager().cancelRequest(this.f22599c, true);
                return;
            default:
                this.f22598b.getConnectionsManager().cancelRequest(this.f22599c, true);
                return;
        }
    }
}
