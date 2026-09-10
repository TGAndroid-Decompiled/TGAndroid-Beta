package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f35696a;
    public final k9 f35697b;
    public final int f35698c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f35696a = i11;
        this.f35697b = k9Var;
        this.f35698c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35696a) {
            case 0:
                this.f35697b.getConnectionsManager().cancelRequest(this.f35698c, true);
                return;
            default:
                this.f35697b.getConnectionsManager().cancelRequest(this.f35698c, true);
                return;
        }
    }
}
