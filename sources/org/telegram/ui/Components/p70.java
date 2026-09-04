package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f29311a;
    public final AccountInstance f29312b;
    public final int f29313c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f29311a = i11;
        this.f29312b = accountInstance;
        this.f29313c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29311a) {
            case 0:
                this.f29312b.getConnectionsManager().cancelRequest(this.f29313c, true);
                return;
            default:
                this.f29312b.getConnectionsManager().cancelRequest(this.f29313c, true);
                return;
        }
    }
}
