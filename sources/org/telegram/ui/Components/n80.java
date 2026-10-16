package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class n80 implements DialogInterface.OnCancelListener {
    public final int f27314a;
    public final AccountInstance f27315b;
    public final int f27316c;

    public n80(AccountInstance accountInstance, int i10, int i11) {
        this.f27314a = i11;
        this.f27315b = accountInstance;
        this.f27316c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27314a) {
            case 0:
                this.f27315b.getConnectionsManager().cancelRequest(this.f27316c, true);
                return;
            default:
                this.f27315b.getConnectionsManager().cancelRequest(this.f27316c, true);
                return;
        }
    }
}
