package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f26960a;
    public final AccountInstance f26961b;
    public final int f26962c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f26960a = i11;
        this.f26961b = accountInstance;
        this.f26962c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26960a) {
            case 0:
                this.f26961b.getConnectionsManager().cancelRequest(this.f26962c, true);
                return;
            default:
                this.f26961b.getConnectionsManager().cancelRequest(this.f26962c, true);
                return;
        }
    }
}
