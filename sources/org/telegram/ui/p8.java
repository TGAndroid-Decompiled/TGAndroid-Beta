package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36421a;
    public final k9 f36422b;
    public final int f36423c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36421a = i11;
        this.f36422b = k9Var;
        this.f36423c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36421a) {
            case 0:
                this.f36422b.getConnectionsManager().cancelRequest(this.f36423c, true);
                return;
            default:
                this.f36422b.getConnectionsManager().cancelRequest(this.f36423c, true);
                return;
        }
    }
}
