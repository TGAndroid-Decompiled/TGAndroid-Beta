package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f46224a;
    public final int f46225b;

    public h60(int i7, int i10) {
        this.f46224a = i10;
        this.f46225b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f46224a) {
            case 0:
                org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                int i7 = this.f46225b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) ((Map.Entry) it.next()).getValue();
                        if (ddVar.f21991c == i7) {
                            ConnectionsManager.getInstance(ddVar.d).cancelRequest(i7, true);
                            it.remove();
                            ddVar.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24467s0).cancelRequest(this.f46225b, true);
                return;
        }
    }
}
