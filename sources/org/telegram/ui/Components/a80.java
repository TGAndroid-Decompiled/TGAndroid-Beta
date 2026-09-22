package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class a80 implements DialogInterface.OnCancelListener {
    public final int f22560a;
    public final AccountInstance f22561b;
    public final int f22562c;

    public a80(AccountInstance accountInstance, int i10, int i11) {
        this.f22560a = i11;
        this.f22561b = accountInstance;
        this.f22562c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22560a) {
            case 0:
                this.f22561b.getConnectionsManager().cancelRequest(this.f22562c, true);
                return;
            default:
                this.f22561b.getConnectionsManager().cancelRequest(this.f22562c, true);
                return;
        }
    }
}
