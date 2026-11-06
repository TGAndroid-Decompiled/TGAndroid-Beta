package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f47963a;
    public final i9 f47964b;
    public final int f47965c;

    public n8(i9 i9Var, int i7, int i10) {
        this.f47963a = i10;
        this.f47964b = i9Var;
        this.f47965c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f47963a) {
            case 0:
                this.f47964b.getConnectionsManager().cancelRequest(this.f47965c, true);
                return;
            default:
                this.f47964b.getConnectionsManager().cancelRequest(this.f47965c, true);
                return;
        }
    }
}
