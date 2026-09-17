package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f29339a;
    public final AccountInstance f29340b;
    public final int f29341c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f29339a = i11;
        this.f29340b = accountInstance;
        this.f29341c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29339a) {
            case 0:
                this.f29340b.getConnectionsManager().cancelRequest(this.f29341c, true);
                return;
            default:
                this.f29340b.getConnectionsManager().cancelRequest(this.f29341c, true);
                return;
        }
    }
}
