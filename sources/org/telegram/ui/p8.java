package org.telegram.ui;

import android.content.DialogInterface;
public final class p8 implements DialogInterface.OnCancelListener {
    public final int f50902a;
    public final j9 f50903b;
    public final int f50904c;

    public p8(j9 j9Var, int i7, int i10) {
        this.f50902a = i10;
        this.f50903b = j9Var;
        this.f50904c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50902a) {
            case 0:
                this.f50903b.getConnectionsManager().cancelRequest(this.f50904c, true);
                return;
            default:
                this.f50903b.getConnectionsManager().cancelRequest(this.f50904c, true);
                return;
        }
    }
}
