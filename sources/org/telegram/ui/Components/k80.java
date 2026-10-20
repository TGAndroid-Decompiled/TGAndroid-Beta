package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class k80 implements DialogInterface.OnCancelListener {
    public final int f27809a;
    public final AccountInstance f27810b;
    public final int f27811c;

    public k80(AccountInstance accountInstance, int i10, int i11) {
        this.f27809a = i11;
        this.f27810b = accountInstance;
        this.f27811c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27809a) {
            case 0:
                this.f27810b.getConnectionsManager().cancelRequest(this.f27811c, true);
                return;
            default:
                this.f27810b.getConnectionsManager().cancelRequest(this.f27811c, true);
                return;
        }
    }
}
