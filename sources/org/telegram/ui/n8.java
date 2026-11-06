package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f47988a;
    public final i9 f47989b;
    public final int f47990c;

    public n8(i9 i9Var, int i7, int i10) {
        this.f47988a = i10;
        this.f47989b = i9Var;
        this.f47990c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f47988a) {
            case 0:
                this.f47989b.getConnectionsManager().cancelRequest(this.f47990c, true);
                return;
            default:
                this.f47989b.getConnectionsManager().cancelRequest(this.f47990c, true);
                return;
        }
    }
}
