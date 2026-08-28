package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f41003a;
    public final i9 f41004b;
    public final int f41005c;

    public o8(i9 i9Var, int i9, int i10) {
        this.f41003a = i10;
        this.f41004b = i9Var;
        this.f41005c = i9;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41003a) {
            case 0:
                this.f41004b.getConnectionsManager().cancelRequest(this.f41005c, true);
                return;
            default:
                this.f41004b.getConnectionsManager().cancelRequest(this.f41005c, true);
                return;
        }
    }
}
