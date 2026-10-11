package org.telegram.ui;

import android.content.DialogInterface;
public final class n8 implements DialogInterface.OnCancelListener {
    public final int f40178a;
    public final i9 f40179b;
    public final int f40180c;

    public n8(i9 i9Var, int i10, int i11) {
        this.f40178a = i11;
        this.f40179b = i9Var;
        this.f40180c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40178a) {
            case 0:
                this.f40179b.getConnectionsManager().cancelRequest(this.f40180c, true);
                return;
            default:
                this.f40179b.getConnectionsManager().cancelRequest(this.f40180c, true);
                return;
        }
    }
}
