package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f50489a;
    public final i9 f50490b;
    public final int f50491c;

    public o8(i9 i9Var, int i7, int i10) {
        this.f50489a = i10;
        this.f50490b = i9Var;
        this.f50491c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50489a) {
            case 0:
                this.f50490b.getConnectionsManager().cancelRequest(this.f50491c, true);
                return;
            default:
                this.f50490b.getConnectionsManager().cancelRequest(this.f50491c, true);
                return;
        }
    }
}
