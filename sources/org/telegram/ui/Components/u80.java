package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class u80 implements DialogInterface.OnCancelListener {
    public final int f31098a;
    public final AccountInstance f31099b;
    public final int f31100c;

    public u80(AccountInstance accountInstance, int i10, int i11) {
        this.f31098a = i11;
        this.f31099b = accountInstance;
        this.f31100c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f31098a) {
            case 0:
                this.f31099b.getConnectionsManager().cancelRequest(this.f31100c, true);
                return;
            default:
                this.f31099b.getConnectionsManager().cancelRequest(this.f31100c, true);
                return;
        }
    }
}
