package org.telegram.ui;

import android.content.DialogInterface;
public final class q8 implements DialogInterface.OnCancelListener {
    public final int f36720a;
    public final l9 f36721b;
    public final int f36722c;

    public q8(l9 l9Var, int i10, int i11) {
        this.f36720a = i11;
        this.f36721b = l9Var;
        this.f36722c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36720a) {
            case 0:
                this.f36721b.getConnectionsManager().cancelRequest(this.f36722c, true);
                return;
            default:
                this.f36721b.getConnectionsManager().cancelRequest(this.f36722c, true);
                return;
        }
    }
}
