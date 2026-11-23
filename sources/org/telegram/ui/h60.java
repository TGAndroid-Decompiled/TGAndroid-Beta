package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f48209a;
    public final int f48210b;

    public h60(int i7, int i10) {
        this.f48209a = i10;
        this.f48210b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48209a) {
            case 0:
                org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                int i7 = this.f48210b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) ((Map.Entry) it.next()).getValue();
                        if (cdVar.f23261c == i7) {
                            ConnectionsManager.getInstance(cdVar.d).cancelRequest(i7, true);
                            it.remove();
                            cdVar.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.k10.f24932t0).cancelRequest(this.f48210b, true);
                return;
        }
    }
}
