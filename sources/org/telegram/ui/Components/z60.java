package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class z60 implements DialogInterface.OnCancelListener {
    public final int f42818a;
    public final org.telegram.messenger.c f42819b;
    public final int f42820c;

    public z60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f42818a = i10;
        this.f42819b = cVar;
        this.f42820c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42818a) {
            case 0:
                ConnectionsManager.getInstance(this.f42819b.f23221a).cancelRequest(this.f42820c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f42819b.f23221a).cancelRequest(this.f42820c, true);
                return;
        }
    }
}
