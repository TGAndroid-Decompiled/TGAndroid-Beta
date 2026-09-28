package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36432a;
    public final k9 f36433b;
    public final int f36434c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36432a = i11;
        this.f36433b = k9Var;
        this.f36434c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36432a) {
            case 0:
                this.f36433b.getConnectionsManager().cancelRequest(this.f36434c, true);
                return;
            default:
                this.f36433b.getConnectionsManager().cancelRequest(this.f36434c, true);
                return;
        }
    }
}
