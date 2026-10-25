package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class m80 implements DialogInterface.OnCancelListener {
    public final int f30454a;
    public final AccountInstance f30455b;
    public final int f30456c;

    public m80(AccountInstance accountInstance, int i10, int i11) {
        this.f30454a = i11;
        this.f30455b = accountInstance;
        this.f30456c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30454a) {
            case 0:
                this.f30455b.getConnectionsManager().cancelRequest(this.f30456c, true);
                return;
            default:
                this.f30455b.getConnectionsManager().cancelRequest(this.f30456c, true);
                return;
        }
    }
}
