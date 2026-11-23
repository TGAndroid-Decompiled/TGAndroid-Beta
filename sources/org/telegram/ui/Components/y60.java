package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class y60 implements DialogInterface.OnCancelListener {
    public final int f42369a;
    public final org.telegram.messenger.c f42370b;
    public final int f42371c;

    public y60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f42369a = i10;
        this.f42370b = cVar;
        this.f42371c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42369a) {
            case 0:
                ConnectionsManager.getInstance(this.f42370b.f23343a).cancelRequest(this.f42371c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f42370b.f23343a).cancelRequest(this.f42371c, true);
                return;
        }
    }
}
