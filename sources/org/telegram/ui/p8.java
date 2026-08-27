package org.telegram.ui;

import android.content.DialogInterface;

public final class p8 implements DialogInterface.OnCancelListener {

    public final int f41293a;

    public final j9 f41294b;

    public final int f41295c;

    public p8(j9 j9Var, int i10, int i11) {
        this.f41293a = i11;
        this.f41294b = j9Var;
        this.f41295c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41293a) {
            case 0:
                this.f41294b.getConnectionsManager().cancelRequest(this.f41295c, true);
                break;
            default:
                this.f41294b.getConnectionsManager().cancelRequest(this.f41295c, true);
                break;
        }
    }
}
