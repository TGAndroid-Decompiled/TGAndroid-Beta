package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class o60 implements DialogInterface.OnCancelListener {
    public final int f37846a;
    public final org.telegram.messenger.c f37847b;
    public final int f37848c;

    public o60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f37846a = i10;
        this.f37847b = cVar;
        this.f37848c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37846a) {
            case 0:
                ConnectionsManager.getInstance(this.f37847b.f22782a).cancelRequest(this.f37848c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f37847b.f22782a).cancelRequest(this.f37848c, true);
                return;
        }
    }
}
