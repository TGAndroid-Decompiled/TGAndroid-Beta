package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class o80 implements DialogInterface.OnCancelListener {
    public final int f27905a;
    public final AccountInstance f27906b;
    public final int f27907c;

    public o80(AccountInstance accountInstance, int i10, int i11) {
        this.f27905a = i11;
        this.f27906b = accountInstance;
        this.f27907c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27905a) {
            case 0:
                this.f27906b.getConnectionsManager().cancelRequest(this.f27907c, true);
                return;
            default:
                this.f27906b.getConnectionsManager().cancelRequest(this.f27907c, true);
                return;
        }
    }
}
