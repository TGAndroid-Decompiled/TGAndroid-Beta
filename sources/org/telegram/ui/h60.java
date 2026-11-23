package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class h60 implements DialogInterface.OnCancelListener {
    public final int f48436a;
    public final int f48437b;

    public h60(int i7, int i10) {
        this.f48436a = i10;
        this.f48437b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f48436a) {
            case 0:
                org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
                int i7 = this.f48437b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.bd bdVar = (org.telegram.messenger.bd) ((Map.Entry) it.next()).getValue();
                        if (bdVar.f23181c == i7) {
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
                ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).cancelRequest(this.f48437b, true);
                return;
        }
    }
}
