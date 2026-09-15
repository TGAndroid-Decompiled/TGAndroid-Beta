package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36463a;
    public final k9 f36464b;
    public final int f36465c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36463a = i11;
        this.f36464b = k9Var;
        this.f36465c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36463a) {
            case 0:
                this.f36464b.getConnectionsManager().cancelRequest(this.f36465c, true);
                return;
            default:
                this.f36464b.getConnectionsManager().cancelRequest(this.f36465c, true);
                return;
        }
    }
}
