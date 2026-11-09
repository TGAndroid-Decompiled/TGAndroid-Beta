package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f48123a;
    public final i9 f48124b;
    public final int f48125c;

    public n8(i9 i9Var, int i7, int i10) {
        this.f48123a = i10;
        this.f48124b = i9Var;
        this.f48125c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48123a) {
            case 0:
                this.f48124b.getConnectionsManager().cancelRequest(this.f48125c, true);
                return;
            default:
                this.f48124b.getConnectionsManager().cancelRequest(this.f48125c, true);
                return;
        }
    }
}
