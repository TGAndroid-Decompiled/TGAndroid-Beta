package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;

public final class d70 implements DialogInterface.OnCancelListener {

    public final int f27664a;

    public final AccountInstance f27665b;

    public final int f27666c;

    public d70(AccountInstance accountInstance, int i10, int i11) {
        this.f27664a = i11;
        this.f27665b = accountInstance;
        this.f27666c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27664a) {
            case 0:
                this.f27665b.getConnectionsManager().cancelRequest(this.f27666c, true);
                break;
            default:
                this.f27665b.getConnectionsManager().cancelRequest(this.f27666c, true);
                break;
        }
    }
}
