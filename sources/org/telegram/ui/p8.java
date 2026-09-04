package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f39422a;
    public final k9 f39423b;
    public final int f39424c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f39422a = i11;
        this.f39423b = k9Var;
        this.f39424c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39422a) {
            case 0:
                this.f39423b.getConnectionsManager().cancelRequest(this.f39424c, true);
                return;
            default:
                this.f39423b.getConnectionsManager().cancelRequest(this.f39424c, true);
                return;
        }
    }
}
