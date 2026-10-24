package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class j80 implements DialogInterface.OnCancelListener {
    public final int f27619a;
    public final AccountInstance f27620b;
    public final int f27621c;

    public j80(AccountInstance accountInstance, int i10, int i11) {
        this.f27619a = i11;
        this.f27620b = accountInstance;
        this.f27621c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27619a) {
            case 0:
                this.f27620b.getConnectionsManager().cancelRequest(this.f27621c, true);
                return;
            default:
                this.f27620b.getConnectionsManager().cancelRequest(this.f27621c, true);
                return;
        }
    }
}
