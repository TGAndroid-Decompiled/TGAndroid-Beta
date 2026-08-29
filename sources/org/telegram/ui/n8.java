package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f40737a;
    public final h9 f40738b;
    public final int f40739c;

    public n8(h9 h9Var, int i10, int i11) {
        this.f40737a = i11;
        this.f40738b = h9Var;
        this.f40739c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40737a) {
            case 0:
                this.f40738b.getConnectionsManager().cancelRequest(this.f40739c, true);
                return;
            default:
                this.f40738b.getConnectionsManager().cancelRequest(this.f40739c, true);
                return;
        }
    }
}
