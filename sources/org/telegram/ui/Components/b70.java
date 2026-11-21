package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class b70 implements DialogInterface.OnCancelListener {
    public final int f33789a;
    public final org.telegram.messenger.c f33790b;
    public final int f33791c;

    public b70(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f33789a = i10;
        this.f33790b = cVar;
        this.f33791c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33789a) {
            case 0:
                ConnectionsManager.getInstance(this.f33790b.f23246a).cancelRequest(this.f33791c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f33790b.f23246a).cancelRequest(this.f33791c, true);
                return;
        }
    }
}
