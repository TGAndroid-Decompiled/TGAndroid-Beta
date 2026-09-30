package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36536a;
    public final k9 f36537b;
    public final int f36538c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36536a = i11;
        this.f36537b = k9Var;
        this.f36538c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36536a) {
            case 0:
                this.f36537b.getConnectionsManager().cancelRequest(this.f36538c, true);
                return;
            default:
                this.f36537b.getConnectionsManager().cancelRequest(this.f36538c, true);
                return;
        }
    }
}
