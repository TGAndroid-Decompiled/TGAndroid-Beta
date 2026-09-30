package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36433a;
    public final k9 f36434b;
    public final int f36435c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36433a = i11;
        this.f36434b = k9Var;
        this.f36435c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36433a) {
            case 0:
                this.f36434b.getConnectionsManager().cancelRequest(this.f36435c, true);
                return;
            default:
                this.f36434b.getConnectionsManager().cancelRequest(this.f36435c, true);
                return;
        }
    }
}
