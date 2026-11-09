package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class j60 implements DialogInterface.OnCancelListener {
    public final int f46844a;
    public final int f46845b;

    public j60(int i7, int i10) {
        this.f46844a = i10;
        this.f46845b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f46844a) {
            case 0:
                org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
                int i7 = this.f46845b;
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
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).cancelRequest(this.f46845b, true);
                return;
        }
    }
}
