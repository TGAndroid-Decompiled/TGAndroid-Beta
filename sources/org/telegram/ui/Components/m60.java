package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class m60 implements DialogInterface.OnCancelListener {
    public final int f35923a;
    public final org.telegram.messenger.c f35924b;
    public final int f35925c;

    public m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f35923a = i10;
        this.f35924b = cVar;
        this.f35925c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35923a) {
            case 0:
                ConnectionsManager.getInstance(this.f35924b.f21765a).cancelRequest(this.f35925c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f35924b.f21765a).cancelRequest(this.f35925c, true);
                return;
        }
    }
}
