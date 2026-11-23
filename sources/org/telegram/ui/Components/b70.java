package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class b70 implements DialogInterface.OnCancelListener {
    public final int f33759a;
    public final org.telegram.messenger.c f33760b;
    public final int f33761c;

    public b70(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f33759a = i10;
        this.f33760b = cVar;
        this.f33761c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33759a) {
            case 0:
                ConnectionsManager.getInstance(this.f33760b.f23166a).cancelRequest(this.f33761c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f33760b.f23166a).cancelRequest(this.f33761c, true);
                return;
        }
    }
}
