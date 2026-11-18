package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f50526a;
    public final i9 f50527b;
    public final int f50528c;

    public o8(i9 i9Var, int i7, int i10) {
        this.f50526a = i10;
        this.f50527b = i9Var;
        this.f50528c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50526a) {
            case 0:
                this.f50527b.getConnectionsManager().cancelRequest(this.f50528c, true);
                return;
            default:
                this.f50527b.getConnectionsManager().cancelRequest(this.f50528c, true);
                return;
        }
    }
}
