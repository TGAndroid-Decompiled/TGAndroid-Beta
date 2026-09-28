package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36431a;
    public final k9 f36432b;
    public final int f36433c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36431a = i11;
        this.f36432b = k9Var;
        this.f36433c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36431a) {
            case 0:
                this.f36432b.getConnectionsManager().cancelRequest(this.f36433c, true);
                return;
            default:
                this.f36432b.getConnectionsManager().cancelRequest(this.f36433c, true);
                return;
        }
    }
}
