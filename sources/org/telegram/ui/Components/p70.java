package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f26963a;
    public final AccountInstance f26964b;
    public final int f26965c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f26963a = i11;
        this.f26964b = accountInstance;
        this.f26965c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26963a) {
            case 0:
                this.f26964b.getConnectionsManager().cancelRequest(this.f26965c, true);
                return;
            default:
                this.f26964b.getConnectionsManager().cancelRequest(this.f26965c, true);
                return;
        }
    }
}
