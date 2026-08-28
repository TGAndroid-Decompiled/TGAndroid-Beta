package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class z60 implements DialogInterface.OnCancelListener {
    public final int f35202a;
    public final AccountInstance f35203b;
    public final int f35204c;

    public z60(AccountInstance accountInstance, int i9, int i10) {
        this.f35202a = i10;
        this.f35203b = accountInstance;
        this.f35204c = i9;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35202a) {
            case 0:
                this.f35203b.getConnectionsManager().cancelRequest(this.f35204c, true);
                return;
            default:
                this.f35203b.getConnectionsManager().cancelRequest(this.f35204c, true);
                return;
        }
    }
}
