package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f48155a;
    public final i9 f48156b;
    public final int f48157c;

    public n8(i9 i9Var, int i7, int i10) {
        this.f48155a = i10;
        this.f48156b = i9Var;
        this.f48157c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48155a) {
            case 0:
                this.f48156b.getConnectionsManager().cancelRequest(this.f48157c, true);
                return;
            default:
                this.f48156b.getConnectionsManager().cancelRequest(this.f48157c, true);
                return;
        }
    }
}
