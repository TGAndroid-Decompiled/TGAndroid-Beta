package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36430a;
    public final k9 f36431b;
    public final int f36432c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36430a = i11;
        this.f36431b = k9Var;
        this.f36432c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36430a) {
            case 0:
                this.f36431b.getConnectionsManager().cancelRequest(this.f36432c, true);
                return;
            default:
                this.f36431b.getConnectionsManager().cancelRequest(this.f36432c, true);
                return;
        }
    }
}
