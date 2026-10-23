package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27813a;
    public final AccountInstance f27814b;
    public final int f27815c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27813a = i11;
        this.f27814b = accountInstance;
        this.f27815c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27813a) {
            case 0:
                this.f27814b.getConnectionsManager().cancelRequest(this.f27815c, true);
                return;
            default:
                this.f27814b.getConnectionsManager().cancelRequest(this.f27815c, true);
                return;
        }
    }
}
