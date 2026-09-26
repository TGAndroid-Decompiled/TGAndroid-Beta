package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class b80 implements DialogInterface.OnCancelListener {
    public final int f22909a;
    public final AccountInstance f22910b;
    public final int f22911c;

    public b80(AccountInstance accountInstance, int i10, int i11) {
        this.f22909a = i11;
        this.f22910b = accountInstance;
        this.f22911c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22909a) {
            case 0:
                this.f22910b.getConnectionsManager().cancelRequest(this.f22911c, true);
                return;
            default:
                this.f22910b.getConnectionsManager().cancelRequest(this.f22911c, true);
                return;
        }
    }
}
