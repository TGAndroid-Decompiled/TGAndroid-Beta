package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f47989a;
    public final i9 f47990b;
    public final int f47991c;

    public n8(i9 i9Var, int i7, int i10) {
        this.f47989a = i10;
        this.f47990b = i9Var;
        this.f47991c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f47989a) {
            case 0:
                this.f47990b.getConnectionsManager().cancelRequest(this.f47991c, true);
                return;
            default:
                this.f47990b.getConnectionsManager().cancelRequest(this.f47991c, true);
                return;
        }
    }
}
