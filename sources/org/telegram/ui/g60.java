package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class g60 implements DialogInterface.OnCancelListener {
    public final int f47343a;
    public final int f47344b;

    public g60(int i7, int i10) {
        this.f47343a = i10;
        this.f47344b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f47343a) {
            case 0:
                org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                int i7 = this.f47344b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) ((Map.Entry) it.next()).getValue();
                        if (cdVar.f22860c == i7) {
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
                ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).cancelRequest(this.f47344b, true);
                return;
        }
    }
}
