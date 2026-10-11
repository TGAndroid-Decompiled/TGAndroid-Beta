package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class s80 implements DialogInterface.OnCancelListener {
    public final int f30666a;
    public final AccountInstance f30667b;
    public final int f30668c;

    public s80(AccountInstance accountInstance, int i10, int i11) {
        this.f30666a = i11;
        this.f30667b = accountInstance;
        this.f30668c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f30666a) {
            case 0:
                this.f30667b.getConnectionsManager().cancelRequest(this.f30668c, true);
                return;
            default:
                this.f30667b.getConnectionsManager().cancelRequest(this.f30668c, true);
                return;
        }
    }
}
