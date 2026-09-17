package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f29312a;
    public final AccountInstance f29313b;
    public final int f29314c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f29312a = i11;
        this.f29313b = accountInstance;
        this.f29314c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29312a) {
            case 0:
                this.f29313b.getConnectionsManager().cancelRequest(this.f29314c, true);
                return;
            default:
                this.f29313b.getConnectionsManager().cancelRequest(this.f29314c, true);
                return;
        }
    }
}
