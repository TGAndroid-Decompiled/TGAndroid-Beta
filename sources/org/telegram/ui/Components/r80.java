package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class r80 implements DialogInterface.OnCancelListener {
    public final int f30384a;
    public final AccountInstance f30385b;
    public final int f30386c;

    public r80(AccountInstance accountInstance, int i10, int i11) {
        this.f30384a = i11;
        this.f30385b = accountInstance;
        this.f30386c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30384a) {
            case 0:
                this.f30385b.getConnectionsManager().cancelRequest(this.f30386c, true);
                return;
            default:
                this.f30385b.getConnectionsManager().cancelRequest(this.f30386c, true);
                return;
        }
    }
}
