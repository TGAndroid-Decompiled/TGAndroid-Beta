package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f26952a;
    public final AccountInstance f26953b;
    public final int f26954c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f26952a = i11;
        this.f26953b = accountInstance;
        this.f26954c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26952a) {
            case 0:
                this.f26953b.getConnectionsManager().cancelRequest(this.f26954c, true);
                return;
            default:
                this.f26953b.getConnectionsManager().cancelRequest(this.f26954c, true);
                return;
        }
    }
}
