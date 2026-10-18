package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27805a;
    public final AccountInstance f27806b;
    public final int f27807c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27805a = i11;
        this.f27806b = accountInstance;
        this.f27807c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27805a) {
            case 0:
                this.f27806b.getConnectionsManager().cancelRequest(this.f27807c, true);
                return;
            default:
                this.f27806b.getConnectionsManager().cancelRequest(this.f27807c, true);
                return;
        }
    }
}
