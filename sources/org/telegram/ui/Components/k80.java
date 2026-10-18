package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27798a;
    public final AccountInstance f27799b;
    public final int f27800c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27798a = i11;
        this.f27799b = accountInstance;
        this.f27800c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27798a) {
            case 0:
                this.f27799b.getConnectionsManager().cancelRequest(this.f27800c, true);
                return;
            default:
                this.f27799b.getConnectionsManager().cancelRequest(this.f27800c, true);
                return;
        }
    }
}
