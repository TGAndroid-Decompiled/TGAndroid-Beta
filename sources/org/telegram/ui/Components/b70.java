package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class b70 implements DialogInterface.OnCancelListener {
    public final int f33782a;
    public final org.telegram.messenger.c f33783b;
    public final int f33784c;

    public b70(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f33782a = i10;
        this.f33783b = cVar;
        this.f33784c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33782a) {
            case 0:
                ConnectionsManager.getInstance(this.f33783b.f23202a).cancelRequest(this.f33784c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f33783b.f23202a).cancelRequest(this.f33784c, true);
                return;
        }
    }
}
