package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class b60 implements DialogInterface.OnCancelListener {
    public final int f43936a;
    public final int f43937b;

    public b60(int i3, int i10) {
        this.f43936a = i10;
        this.f43937b = i3;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f43936a) {
            case 0:
                org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
                int i3 = this.f43937b;
                if (i3 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.xc xcVar = (org.telegram.messenger.xc) ((Map.Entry) it.next()).getValue();
                        if (xcVar.f26363c == i3) {
                            ConnectionsManager.getInstance(xcVar.d).cancelRequest(i3, true);
                            it.remove();
                            xcVar.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).cancelRequest(this.f43937b, true);
                return;
        }
    }
}
