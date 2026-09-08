package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class p70 implements DialogInterface.OnCancelListener {
    public final int f29338a;
    public final AccountInstance f29339b;
    public final int f29340c;

    public p70(AccountInstance accountInstance, int i10, int i11) {
        this.f29338a = i11;
        this.f29339b = accountInstance;
        this.f29340c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29338a) {
            case 0:
                this.f29339b.getConnectionsManager().cancelRequest(this.f29340c, true);
                return;
            default:
                this.f29339b.getConnectionsManager().cancelRequest(this.f29340c, true);
                return;
        }
    }
}
