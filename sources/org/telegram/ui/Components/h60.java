package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f34312a;
    public final org.telegram.messenger.c f34313b;
    public final int f34314c;

    public h60(org.telegram.messenger.c cVar, int i3, int i10) {
        this.f34312a = i10;
        this.f34313b = cVar;
        this.f34314c = i3;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34312a) {
            case 0:
                ConnectionsManager.getInstance(this.f34313b.f21919a).cancelRequest(this.f34314c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f34313b.f21919a).cancelRequest(this.f34314c, true);
                return;
        }
    }
}
