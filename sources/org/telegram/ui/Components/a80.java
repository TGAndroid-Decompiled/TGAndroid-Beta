package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class a80 implements DialogInterface.OnCancelListener {
    public final int f22611a;
    public final AccountInstance f22612b;
    public final int f22613c;

    public a80(AccountInstance accountInstance, int i10, int i11) {
        this.f22611a = i11;
        this.f22612b = accountInstance;
        this.f22613c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22611a) {
            case 0:
                this.f22612b.getConnectionsManager().cancelRequest(this.f22613c, true);
                return;
            default:
                this.f22612b.getConnectionsManager().cancelRequest(this.f22613c, true);
                return;
        }
    }
}
