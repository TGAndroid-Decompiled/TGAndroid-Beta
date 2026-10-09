package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f40425a;
    public final j9 f40426b;
    public final int f40427c;

    public o8(j9 j9Var, int i10, int i11) {
        this.f40425a = i11;
        this.f40426b = j9Var;
        this.f40427c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40425a) {
            case 0:
                this.f40426b.getConnectionsManager().cancelRequest(this.f40427c, true);
                return;
            default:
                this.f40426b.getConnectionsManager().cancelRequest(this.f40427c, true);
                return;
        }
    }
}
