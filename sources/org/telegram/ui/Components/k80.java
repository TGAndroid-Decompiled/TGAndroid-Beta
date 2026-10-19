package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27777a;
    public final AccountInstance f27778b;
    public final int f27779c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27777a = i11;
        this.f27778b = accountInstance;
        this.f27779c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27777a) {
            case 0:
                this.f27778b.getConnectionsManager().cancelRequest(this.f27779c, true);
                return;
            default:
                this.f27778b.getConnectionsManager().cancelRequest(this.f27779c, true);
                return;
        }
    }
}
