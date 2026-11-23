package org.telegram.ui;

import android.content.DialogInterface;
public final class o8 implements DialogInterface.OnCancelListener {
    public final int f50503a;
    public final i9 f50504b;
    public final int f50505c;

    public o8(i9 i9Var, int i7, int i10) {
        this.f50503a = i10;
        this.f50504b = i9Var;
        this.f50505c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50503a) {
            case 0:
                this.f50504b.getConnectionsManager().cancelRequest(this.f50505c, true);
                return;
            default:
                this.f50504b.getConnectionsManager().cancelRequest(this.f50505c, true);
                return;
        }
    }
}
