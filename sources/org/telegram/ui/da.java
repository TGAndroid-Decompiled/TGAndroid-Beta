package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f35711a;
    public final int f35712b;
    public final Object f35713c;

    public da(Object obj, int i10, int i11) {
        this.f35711a = i11;
        this.f35713c = obj;
        this.f35712b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35711a) {
            case 0:
                sa.T((sa) this.f35713c, this.f35712b);
                return;
            case 1:
                ((kn) this.f35713c).f38003a.getConnectionsManager().cancelRequest(this.f35712b, true);
                return;
            case 2:
                to toVar = (to) this.f35713c;
                toVar.N0 = false;
                toVar.f40884b = null;
                toVar.getConnectionsManager().cancelRequest(this.f35712b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f35713c).P2.getConnectionsManager().cancelRequest(this.f35712b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.jy) this.f35713c).f27913c.f28207a.F.f29092c1).cancelRequest(this.f35712b, true);
                return;
            case 5:
                ((h60) this.f35713c).d.getConnectionsManager().cancelRequest(this.f35712b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f35713c).currentAccount).cancelRequest(this.f35712b, true);
                return;
            case 7:
                ((gd0) this.f35713c).getConnectionsManager().cancelRequest(this.f35712b, true);
                return;
            case 8:
                wd1.S((wd1) this.f35713c, this.f35712b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f35713c).f51715a).cancelRequest(this.f35712b, true);
                return;
        }
    }
}
