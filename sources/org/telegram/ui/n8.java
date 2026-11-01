package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f39740a;
    public final j9 f39741b;
    public final int f39742c;

    public n8(j9 j9Var, int i10, int i11) {
        this.f39740a = i11;
        this.f39741b = j9Var;
        this.f39742c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39740a) {
            case 0:
                this.f39741b.getConnectionsManager().cancelRequest(this.f39742c, true);
                return;
            default:
                this.f39741b.getConnectionsManager().cancelRequest(this.f39742c, true);
                return;
        }
    }
}
