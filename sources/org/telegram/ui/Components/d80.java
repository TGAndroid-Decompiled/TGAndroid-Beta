package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class d80 implements DialogInterface.OnCancelListener {
    public final int f25626a;
    public final AccountInstance f25627b;
    public final int f25628c;

    public d80(AccountInstance accountInstance, int i10, int i11) {
        this.f25626a = i11;
        this.f25627b = accountInstance;
        this.f25628c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25626a) {
            case 0:
                this.f25627b.getConnectionsManager().cancelRequest(this.f25628c, true);
                return;
            default:
                this.f25627b.getConnectionsManager().cancelRequest(this.f25628c, true);
                return;
        }
    }
}
