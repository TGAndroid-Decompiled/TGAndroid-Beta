package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class k60 implements DialogInterface.OnCancelListener {
    public final int f47178a;
    public final int f47179b;

    public k60(int i7, int i10) {
        this.f47178a = i10;
        this.f47179b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f47178a) {
            case 0:
                org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
                int i7 = this.f47179b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) ((Map.Entry) it.next()).getValue();
                        if (edVar.f22211c == i7) {
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
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0).cancelRequest(this.f47179b, true);
                return;
        }
    }
}
