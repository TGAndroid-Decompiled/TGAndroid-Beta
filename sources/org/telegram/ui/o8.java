package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f50518a;
    public final j9 f50519b;
    public final int f50520c;

    public o8(j9 j9Var, int i7, int i10) {
        this.f50518a = i10;
        this.f50519b = j9Var;
        this.f50520c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50518a) {
            case 0:
                this.f50519b.getConnectionsManager().cancelRequest(this.f50520c, true);
                return;
            default:
                this.f50519b.getConnectionsManager().cancelRequest(this.f50520c, true);
                return;
        }
    }
}
