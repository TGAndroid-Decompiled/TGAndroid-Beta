package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f39449a;
    public final k9 f39450b;
    public final int f39451c;

    public p8(k9 k9Var, int i10, int i11) {
        this.f39449a = i11;
        this.f39450b = k9Var;
        this.f39451c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39449a) {
            case 0:
                this.f39450b.getConnectionsManager().cancelRequest(this.f39451c, true);
                return;
            default:
                this.f39450b.getConnectionsManager().cancelRequest(this.f39451c, true);
                return;
        }
    }
}
