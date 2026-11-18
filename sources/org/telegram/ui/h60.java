package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f48166a;
    public final int f48167b;

    public h60(int i7, int i10) {
        this.f48166a = i10;
        this.f48167b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48166a) {
            case 0:
                org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
                int i7 = this.f48167b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.bd bdVar = (org.telegram.messenger.bd) ((Map.Entry) it.next()).getValue();
                        if (bdVar.f23056c == i7) {
                            ConnectionsManager.getInstance(bdVar.d).cancelRequest(i7, true);
                            it.remove();
                            bdVar.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).cancelRequest(this.f48167b, true);
                return;
        }
    }
}
