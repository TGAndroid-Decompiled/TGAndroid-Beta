package org.telegram.ui;

import android.content.DialogInterface;
public final class q8 implements DialogInterface.OnCancelListener {
    public final int f36812a;
    public final l9 f36813b;
    public final int f36814c;

    public q8(l9 l9Var, int i10, int i11) {
        this.f36812a = i11;
        this.f36813b = l9Var;
        this.f36814c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36812a) {
            case 0:
                this.f36813b.getConnectionsManager().cancelRequest(this.f36814c, true);
                return;
            default:
                this.f36813b.getConnectionsManager().cancelRequest(this.f36814c, true);
                return;
        }
    }
}
