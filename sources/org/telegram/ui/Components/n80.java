package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class n80 implements DialogInterface.OnCancelListener {
    public final int f30782a;
    public final AccountInstance f30783b;
    public final int f30784c;

    public n80(AccountInstance accountInstance, int i10, int i11) {
        this.f30782a = i11;
        this.f30783b = accountInstance;
        this.f30784c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30782a) {
            case 0:
                this.f30783b.getConnectionsManager().cancelRequest(this.f30784c, true);
                return;
            default:
                this.f30783b.getConnectionsManager().cancelRequest(this.f30784c, true);
                return;
        }
    }
}
