package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class u80 implements DialogInterface.OnCancelListener {
    public final int f31103a;
    public final AccountInstance f31104b;
    public final int f31105c;

    public u80(AccountInstance accountInstance, int i10, int i11) {
        this.f31103a = i11;
        this.f31104b = accountInstance;
        this.f31105c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f31103a) {
            case 0:
                this.f31104b.getConnectionsManager().cancelRequest(this.f31105c, true);
                return;
            default:
                this.f31104b.getConnectionsManager().cancelRequest(this.f31105c, true);
                return;
        }
    }
}
