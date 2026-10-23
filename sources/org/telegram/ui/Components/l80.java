package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;
public final class l80 implements DialogInterface.OnCancelListener {
    public final int f28275a;
    public final AccountInstance f28276b;
    public final int f28277c;

    public l80(AccountInstance accountInstance, int i10, int i11) {
        this.f28275a = i11;
        this.f28276b = accountInstance;
        this.f28277c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28275a) {
            case 0:
                this.f28276b.getConnectionsManager().cancelRequest(this.f28277c, true);
                return;
            default:
                this.f28276b.getConnectionsManager().cancelRequest(this.f28277c, true);
                return;
        }
    }
}
