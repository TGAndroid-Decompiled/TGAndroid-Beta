package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class d80 implements DialogInterface.OnCancelListener {
    public final int f23575a;
    public final AccountInstance f23576b;
    public final int f23577c;

    public d80(AccountInstance accountInstance, int i10, int i11) {
        this.f23575a = i11;
        this.f23576b = accountInstance;
        this.f23577c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23575a) {
            case 0:
                this.f23576b.getConnectionsManager().cancelRequest(this.f23577c, true);
                return;
            default:
                this.f23576b.getConnectionsManager().cancelRequest(this.f23577c, true);
                return;
        }
    }
}
