package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class q70 implements DialogInterface.OnCancelListener {
    public final int f27248a;
    public final AccountInstance f27249b;
    public final int f27250c;

    public q70(AccountInstance accountInstance, int i10, int i11) {
        this.f27248a = i11;
        this.f27249b = accountInstance;
        this.f27250c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27248a) {
            case 0:
                this.f27249b.getConnectionsManager().cancelRequest(this.f27250c, true);
                return;
            default:
                this.f27249b.getConnectionsManager().cancelRequest(this.f27250c, true);
                return;
        }
    }
}
