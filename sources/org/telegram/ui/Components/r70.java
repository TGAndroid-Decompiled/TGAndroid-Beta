package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class r70 implements DialogInterface.OnCancelListener {
    public final int f28416a;
    public final AccountInstance f28417b;
    public final int f28418c;

    public r70(AccountInstance accountInstance, int i10, int i11) {
        this.f28416a = i11;
        this.f28417b = accountInstance;
        this.f28418c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28416a) {
            case 0:
                this.f28417b.getConnectionsManager().cancelRequest(this.f28418c, true);
                return;
            default:
                this.f28417b.getConnectionsManager().cancelRequest(this.f28418c, true);
                return;
        }
    }
}
