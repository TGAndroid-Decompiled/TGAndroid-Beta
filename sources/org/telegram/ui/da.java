package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f35716a;
    public final int f35717b;
    public final Object f35718c;

    public da(Object obj, int i10, int i11) {
        this.f35716a = i11;
        this.f35718c = obj;
        this.f35717b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35716a) {
            case 0:
                sa.T((sa) this.f35718c, this.f35717b);
                return;
            case 1:
                ((kn) this.f35718c).f38008a.getConnectionsManager().cancelRequest(this.f35717b, true);
                return;
            case 2:
                to toVar = (to) this.f35718c;
                toVar.N0 = false;
                toVar.f40890b = null;
                toVar.getConnectionsManager().cancelRequest(this.f35717b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f35718c).P2.getConnectionsManager().cancelRequest(this.f35717b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.jy) this.f35718c).f27918c.f28212a.F.f29097c1).cancelRequest(this.f35717b, true);
                return;
            case 5:
                ((h60) this.f35718c).d.getConnectionsManager().cancelRequest(this.f35717b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f35718c).currentAccount).cancelRequest(this.f35717b, true);
                return;
            case 7:
                ((gd0) this.f35718c).getConnectionsManager().cancelRequest(this.f35717b, true);
                return;
            case 8:
                wd1.S((wd1) this.f35718c, this.f35717b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f35718c).f51716a).cancelRequest(this.f35717b, true);
                return;
        }
    }
}
