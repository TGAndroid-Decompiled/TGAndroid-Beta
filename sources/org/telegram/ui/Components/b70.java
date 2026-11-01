package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class b70 implements DialogInterface.OnCancelListener {
    public final int f24673a;
    public final org.telegram.messenger.c f24674b;
    public final int f24675c;

    public b70(org.telegram.messenger.c cVar, int i10, int i11) {
        this.f24673a = i11;
        this.f24674b = cVar;
        this.f24675c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f24673a) {
            case 0:
                ConnectionsManager.getInstance(this.f24674b.f15043a).cancelRequest(this.f24675c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f24674b.f15043a).cancelRequest(this.f24675c, true);
                return;
        }
    }
}
