package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class y70 implements DialogInterface.OnCancelListener {
    public final int f30491a;
    public final AccountInstance f30492b;
    public final int f30493c;

    public y70(AccountInstance accountInstance, int i10, int i11) {
        this.f30491a = i11;
        this.f30492b = accountInstance;
        this.f30493c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30491a) {
            case 0:
                this.f30492b.getConnectionsManager().cancelRequest(this.f30493c, true);
                return;
            default:
                this.f30492b.getConnectionsManager().cancelRequest(this.f30493c, true);
                return;
        }
    }
}
