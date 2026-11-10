package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class m60 implements DialogInterface.OnCancelListener {
    public final int f35873a;
    public final org.telegram.messenger.c f35874b;
    public final int f35875c;

    public m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f35873a = i10;
        this.f35874b = cVar;
        this.f35875c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35873a) {
            case 0:
                ConnectionsManager.getInstance(this.f35874b.f21770a).cancelRequest(this.f35875c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f35874b.f21770a).cancelRequest(this.f35875c, true);
                return;
        }
    }
}
