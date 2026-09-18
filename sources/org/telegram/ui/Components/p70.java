package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f26955a;
    public final AccountInstance f26956b;
    public final int f26957c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f26955a = i11;
        this.f26956b = accountInstance;
        this.f26957c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26955a) {
            case 0:
                this.f26956b.getConnectionsManager().cancelRequest(this.f26957c, true);
                return;
            default:
                this.f26956b.getConnectionsManager().cancelRequest(this.f26957c, true);
                return;
        }
    }
}
