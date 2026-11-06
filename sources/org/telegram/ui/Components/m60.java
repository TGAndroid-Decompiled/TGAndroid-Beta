package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class m60 implements DialogInterface.OnCancelListener {
    public final int f35882a;
    public final org.telegram.messenger.c f35883b;
    public final int f35884c;

    public m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f35882a = i10;
        this.f35883b = cVar;
        this.f35884c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35882a) {
            case 0:
                ConnectionsManager.getInstance(this.f35883b.f21723a).cancelRequest(this.f35884c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f35883b.f21723a).cancelRequest(this.f35884c, true);
                return;
        }
    }
}
