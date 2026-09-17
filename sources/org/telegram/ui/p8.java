package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f39450a;
    public final k9 f39451b;
    public final int f39452c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f39450a = i11;
        this.f39451b = k9Var;
        this.f39452c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39450a) {
            case 0:
                this.f39451b.getConnectionsManager().cancelRequest(this.f39452c, true);
                return;
            default:
                this.f39451b.getConnectionsManager().cancelRequest(this.f39452c, true);
                return;
        }
    }
}
