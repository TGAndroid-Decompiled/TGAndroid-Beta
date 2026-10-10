package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class s80 implements DialogInterface.OnCancelListener {
    public final int f30706a;
    public final AccountInstance f30707b;
    public final int f30708c;

    public s80(AccountInstance accountInstance, int i10, int i11) {
        this.f30706a = i11;
        this.f30707b = accountInstance;
        this.f30708c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30706a) {
            case 0:
                this.f30707b.getConnectionsManager().cancelRequest(this.f30708c, true);
                return;
            default:
                this.f30707b.getConnectionsManager().cancelRequest(this.f30708c, true);
                return;
        }
    }
}
