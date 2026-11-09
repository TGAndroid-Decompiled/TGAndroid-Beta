package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class n60 implements DialogInterface.OnCancelListener {
    public final int f36273a;
    public final org.telegram.messenger.c f36274b;
    public final int f36275c;

    public n60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f36273a = i10;
        this.f36274b = cVar;
        this.f36275c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36273a) {
            case 0:
                ConnectionsManager.getInstance(this.f36274b.f21765a).cancelRequest(this.f36275c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f36274b.f21765a).cancelRequest(this.f36275c, true);
                return;
        }
    }
}
