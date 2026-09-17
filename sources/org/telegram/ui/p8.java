package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f39423a;
    public final k9 f39424b;
    public final int f39425c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f39423a = i11;
        this.f39424b = k9Var;
        this.f39425c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39423a) {
            case 0:
                this.f39424b.getConnectionsManager().cancelRequest(this.f39425c, true);
                return;
            default:
                this.f39424b.getConnectionsManager().cancelRequest(this.f39425c, true);
                return;
        }
    }
}
