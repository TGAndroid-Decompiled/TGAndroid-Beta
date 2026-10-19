package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27775a;
    public final AccountInstance f27776b;
    public final int f27777c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27775a = i11;
        this.f27776b = accountInstance;
        this.f27777c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27775a) {
            case 0:
                this.f27776b.getConnectionsManager().cancelRequest(this.f27777c, true);
                return;
            default:
                this.f27776b.getConnectionsManager().cancelRequest(this.f27777c, true);
                return;
        }
    }
}
