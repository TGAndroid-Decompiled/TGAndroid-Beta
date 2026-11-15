package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f49869a;
    public final i9 f49870b;
    public final int f49871c;

    public o8(i9 i9Var, int i7, int i10) {
        this.f49869a = i10;
        this.f49870b = i9Var;
        this.f49871c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f49869a) {
            case 0:
                this.f49870b.getConnectionsManager().cancelRequest(this.f49871c, true);
                return;
            default:
                this.f49870b.getConnectionsManager().cancelRequest(this.f49871c, true);
                return;
        }
    }
}
