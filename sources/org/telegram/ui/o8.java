package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f49859a;
    public final i9 f49860b;
    public final int f49861c;

    public o8(i9 i9Var, int i7, int i10) {
        this.f49859a = i10;
        this.f49860b = i9Var;
        this.f49861c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f49859a) {
            case 0:
                this.f49860b.getConnectionsManager().cancelRequest(this.f49861c, true);
                return;
            default:
                this.f49860b.getConnectionsManager().cancelRequest(this.f49861c, true);
                return;
        }
    }
}
