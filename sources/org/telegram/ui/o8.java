package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f40469a;
    public final j9 f40470b;
    public final int f40471c;

    public o8(j9 j9Var, int i10, int i11) {
        this.f40469a = i11;
        this.f40470b = j9Var;
        this.f40471c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40469a) {
            case 0:
                this.f40470b.getConnectionsManager().cancelRequest(this.f40471c, true);
                return;
            default:
                this.f40470b.getConnectionsManager().cancelRequest(this.f40471c, true);
                return;
        }
    }
}
