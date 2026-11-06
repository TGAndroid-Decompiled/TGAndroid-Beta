package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class m60 implements DialogInterface.OnCancelListener {
    public final int f35941a;
    public final org.telegram.messenger.c f35942b;
    public final int f35943c;

    public m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.f35941a = i10;
        this.f35942b = cVar;
        this.f35943c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35941a) {
            case 0:
                ConnectionsManager.getInstance(this.f35942b.f21723a).cancelRequest(this.f35943c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.f35942b.f21723a).cancelRequest(this.f35943c, true);
                return;
        }
    }
}
