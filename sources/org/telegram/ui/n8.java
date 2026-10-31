package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f39855a;
    public final j9 f39856b;
    public final int f39857c;

    public n8(j9 j9Var, int i10, int i11) {
        this.f39855a = i11;
        this.f39856b = j9Var;
        this.f39857c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39855a) {
            case 0:
                this.f39856b.getConnectionsManager().cancelRequest(this.f39857c, true);
                return;
            default:
                this.f39856b.getConnectionsManager().cancelRequest(this.f39857c, true);
                return;
        }
    }
}
