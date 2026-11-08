package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f46226a;
    public final int f46227b;

    public h60(int i7, int i10) {
        this.f46226a = i10;
        this.f46227b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f46226a) {
            case 0:
                org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
                int i7 = this.f46227b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) ((Map.Entry) it.next()).getValue();
                        if (edVar.f22207c == i7) {
                            ConnectionsManager.getInstance(edVar.d).cancelRequest(i7, true);
                            it.remove();
                            edVar.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).cancelRequest(this.f46227b, true);
                return;
        }
    }
}
