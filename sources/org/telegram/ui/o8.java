package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f40423a;
    public final j9 f40424b;
    public final int f40425c;

    public o8(j9 j9Var, int i10, int i11) {
        this.f40423a = i11;
        this.f40424b = j9Var;
        this.f40425c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40423a) {
            case 0:
                this.f40424b.getConnectionsManager().cancelRequest(this.f40425c, true);
                return;
            default:
                this.f40424b.getConnectionsManager().cancelRequest(this.f40425c, true);
                return;
        }
    }
}
