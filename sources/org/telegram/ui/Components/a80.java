package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class a80 implements DialogInterface.OnCancelListener {
    public final int f22612a;
    public final AccountInstance f22613b;
    public final int f22614c;

    public a80(AccountInstance accountInstance, int i10, int i11) {
        this.f22612a = i11;
        this.f22613b = accountInstance;
        this.f22614c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22612a) {
            case 0:
                this.f22613b.getConnectionsManager().cancelRequest(this.f22614c, true);
                return;
            default:
                this.f22613b.getConnectionsManager().cancelRequest(this.f22614c, true);
                return;
        }
    }
}
