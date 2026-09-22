package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36460a;
    public final k9 f36461b;
    public final int f36462c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36460a = i11;
        this.f36461b = k9Var;
        this.f36462c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36460a) {
            case 0:
                this.f36461b.getConnectionsManager().cancelRequest(this.f36462c, true);
                return;
            default:
                this.f36461b.getConnectionsManager().cancelRequest(this.f36462c, true);
                return;
        }
    }
}
