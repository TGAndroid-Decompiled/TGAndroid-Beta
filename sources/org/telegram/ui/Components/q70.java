package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class q70 implements DialogInterface.OnCancelListener {
    public final int f28077a;
    public final AccountInstance f28078b;
    public final int f28079c;

    public q70(AccountInstance accountInstance, int i10, int i11) {
        this.f28077a = i11;
        this.f28078b = accountInstance;
        this.f28079c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28077a) {
            case 0:
                this.f28078b.getConnectionsManager().cancelRequest(this.f28079c, true);
                return;
            default:
                this.f28078b.getConnectionsManager().cancelRequest(this.f28079c, true);
                return;
        }
    }
}
