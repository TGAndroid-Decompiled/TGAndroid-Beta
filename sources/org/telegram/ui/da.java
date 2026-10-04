package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f35710a;
    public final int f35711b;
    public final Object f35712c;

    public da(Object obj, int i10, int i11) {
        this.f35710a = i11;
        this.f35712c = obj;
        this.f35711b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35710a) {
            case 0:
                sa.T((sa) this.f35712c, this.f35711b);
                return;
            case 1:
                ((kn) this.f35712c).f38002a.getConnectionsManager().cancelRequest(this.f35711b, true);
                return;
            case 2:
                to toVar = (to) this.f35712c;
                toVar.N0 = false;
                toVar.f40883b = null;
                toVar.getConnectionsManager().cancelRequest(this.f35711b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f35712c).P2.getConnectionsManager().cancelRequest(this.f35711b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.jy) this.f35712c).f27912c.f28206a.F.f29091c1).cancelRequest(this.f35711b, true);
                return;
            case 5:
                ((h60) this.f35712c).d.getConnectionsManager().cancelRequest(this.f35711b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f35712c).currentAccount).cancelRequest(this.f35711b, true);
                return;
            case 7:
                ((gd0) this.f35712c).getConnectionsManager().cancelRequest(this.f35711b, true);
                return;
            case 8:
                wd1.S((wd1) this.f35712c, this.f35711b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f35712c).f51714a).cancelRequest(this.f35711b, true);
                return;
        }
    }
}
