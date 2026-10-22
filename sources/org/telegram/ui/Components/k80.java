package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27812a;
    public final AccountInstance f27813b;
    public final int f27814c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27812a = i11;
        this.f27813b = accountInstance;
        this.f27814c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27812a) {
            case 0:
                this.f27813b.getConnectionsManager().cancelRequest(this.f27814c, true);
                return;
            default:
                this.f27813b.getConnectionsManager().cancelRequest(this.f27814c, true);
                return;
        }
    }
}
