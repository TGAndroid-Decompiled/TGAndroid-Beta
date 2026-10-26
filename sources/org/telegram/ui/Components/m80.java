package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class m80 implements DialogInterface.OnCancelListener {
    public final int f30456a;
    public final AccountInstance f30457b;
    public final int f30458c;

    public m80(AccountInstance accountInstance, int i10, int i11) {
        this.f30456a = i11;
        this.f30457b = accountInstance;
        this.f30458c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30456a) {
            case 0:
                this.f30457b.getConnectionsManager().cancelRequest(this.f30458c, true);
                return;
            default:
                this.f30457b.getConnectionsManager().cancelRequest(this.f30458c, true);
                return;
        }
    }
}
