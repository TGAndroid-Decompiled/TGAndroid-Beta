package org.telegram.ui;

import android.content.DialogInterface;
public final class q8 implements DialogInterface.OnCancelListener {
    public final int f36789a;
    public final l9 f36790b;
    public final int f36791c;

    public q8(l9 l9Var, int i10, int i11) {
        this.f36789a = i11;
        this.f36790b = l9Var;
        this.f36791c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36789a) {
            case 0:
                this.f36790b.getConnectionsManager().cancelRequest(this.f36791c, true);
                return;
            default:
                this.f36790b.getConnectionsManager().cancelRequest(this.f36791c, true);
                return;
        }
    }
}
