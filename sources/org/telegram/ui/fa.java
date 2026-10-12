package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fa implements DialogInterface.OnCancelListener {
    public final int f37692a;
    public final int f37693b;
    public final Object f37694c;

    public fa(Object obj, int i10, int i11) {
        this.f37692a = i11;
        this.f37694c = obj;
        this.f37693b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37692a) {
            case 0:
                ua.V((ua) this.f37694c, this.f37693b);
                return;
            case 1:
                ((pn) this.f37694c).f41000a.getConnectionsManager().cancelRequest(this.f37693b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f37694c;
                xoVar.N0 = false;
                xoVar.f44054b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f37693b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f37694c).P2.getConnectionsManager().cancelRequest(this.f37693b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.yy) this.f37694c).f33227c.f33521a.F.f25072c1).cancelRequest(this.f37693b, true);
                return;
            case 5:
                ((i60) this.f37694c).d.getConnectionsManager().cancelRequest(this.f37693b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f37694c).currentAccount).cancelRequest(this.f37693b, true);
                return;
            case 7:
                ((id0) this.f37694c).getConnectionsManager().cancelRequest(this.f37693b, true);
                return;
            case 8:
                ConnectionsManager.getInstance(((ee1) this.f37694c).currentAccount).cancelRequest(this.f37693b, true);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f37694c).f53179a).cancelRequest(this.f37693b, true);
                return;
        }
    }
}
