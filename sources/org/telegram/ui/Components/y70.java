package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class y70 implements DialogInterface.OnCancelListener {
    public final int f29262a;
    public final AccountInstance f29263b;
    public final int f29264c;

    public y70(AccountInstance accountInstance, int i10, int i11) {
        this.f29262a = i11;
        this.f29263b = accountInstance;
        this.f29264c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29262a) {
            case 0:
                this.f29263b.getConnectionsManager().cancelRequest(this.f29264c, true);
                return;
            default:
                this.f29263b.getConnectionsManager().cancelRequest(this.f29264c, true);
                return;
        }
    }
}
