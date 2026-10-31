package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class b70 implements DialogInterface.OnCancelListener {
    public final int f24560a;
    public final org.telegram.messenger.c f24561b;
    public final int f24562c;

    public b70(org.telegram.messenger.c cVar, int i10, int i11) {
        this.f24560a = i11;
        this.f24561b = cVar;
        this.f24562c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f24560a) {
            case 0:
                ConnectionsManager.getInstance(this.f24561b.f14863a).cancelRequest(this.f24562c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f24561b.f14863a).cancelRequest(this.f24562c, true);
                return;
        }
    }
}
