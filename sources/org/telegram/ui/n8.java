package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f40144a;
    public final i9 f40145b;
    public final int f40146c;

    public n8(i9 i9Var, int i10, int i11) {
        this.f40144a = i11;
        this.f40145b = i9Var;
        this.f40146c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40144a) {
            case 0:
                this.f40145b.getConnectionsManager().cancelRequest(this.f40146c, true);
                return;
            default:
                this.f40145b.getConnectionsManager().cancelRequest(this.f40146c, true);
                return;
        }
    }
}
