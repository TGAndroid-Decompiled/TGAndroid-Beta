package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f48230a;
    public final h9 f48231b;
    public final int f48232c;

    public o8(h9 h9Var, int i3, int i10) {
        this.f48230a = i10;
        this.f48231b = h9Var;
        this.f48232c = i3;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48230a) {
            case 0:
                this.f48231b.getConnectionsManager().cancelRequest(this.f48232c, true);
                return;
            default:
                this.f48231b.getConnectionsManager().cancelRequest(this.f48232c, true);
                return;
        }
    }
}
