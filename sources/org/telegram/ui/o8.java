package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f50514a;
    public final j9 f50515b;
    public final int f50516c;

    public o8(j9 j9Var, int i7, int i10) {
        this.f50514a = i10;
        this.f50515b = j9Var;
        this.f50516c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50514a) {
            case 0:
                this.f50515b.getConnectionsManager().cancelRequest(this.f50516c, true);
                return;
            default:
                this.f50515b.getConnectionsManager().cancelRequest(this.f50516c, true);
                return;
        }
    }
}
