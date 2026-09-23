package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f36040a;
    public final k9 f36041b;
    public final int f36042c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f36040a = i11;
        this.f36041b = k9Var;
        this.f36042c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36040a) {
            case 0:
                this.f36041b.getConnectionsManager().cancelRequest(this.f36042c, true);
                return;
            default:
                this.f36041b.getConnectionsManager().cancelRequest(this.f36042c, true);
                return;
        }
    }
}
