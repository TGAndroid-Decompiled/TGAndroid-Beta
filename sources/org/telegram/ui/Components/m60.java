package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class m60 implements DialogInterface.OnCancelListener {
    public final int f35895a;
    public final org.telegram.messenger.c f35896b;
    public final int f35897c;

    public m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f35895a = i10;
        this.f35896b = cVar;
        this.f35897c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35895a) {
            case 0:
                ConnectionsManager.getInstance(this.f35896b.f21729a).cancelRequest(this.f35897c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f35896b.f21729a).cancelRequest(this.f35897c, true);
                return;
        }
    }
}
