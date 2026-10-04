package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class d80 implements DialogInterface.OnCancelListener {
    public final int f25627a;
    public final AccountInstance f25628b;
    public final int f25629c;

    public d80(AccountInstance accountInstance, int i10, int i11) {
        this.f25627a = i11;
        this.f25628b = accountInstance;
        this.f25629c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25627a) {
            case 0:
                this.f25628b.getConnectionsManager().cancelRequest(this.f25629c, true);
                return;
            default:
                this.f25628b.getConnectionsManager().cancelRequest(this.f25629c, true);
                return;
        }
    }
}
