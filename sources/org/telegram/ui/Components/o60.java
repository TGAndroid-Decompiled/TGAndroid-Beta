package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class o60 implements DialogInterface.OnCancelListener {
    public final int f37857a;
    public final org.telegram.messenger.c f37858b;
    public final int f37859c;

    public o60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f37857a = i10;
        this.f37858b = cVar;
        this.f37859c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37857a) {
            case 0:
                ConnectionsManager.getInstance(this.f37858b.f22778a).cancelRequest(this.f37859c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f37858b.f22778a).cancelRequest(this.f37859c, true);
                return;
        }
    }
}
