package org.telegram.ui;

import android.content.DialogInterface;
public final class hf implements DialogInterface.OnShowListener {
    public final int f37824a;
    public final sn f37825b;

    public hf(sn snVar, int i10) {
        this.f37824a = i10;
        this.f37825b = snVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37824a) {
            case 0:
                this.f37825b.Tb(false);
                return;
            default:
                this.f37825b.Tb(false);
                return;
        }
    }
}
