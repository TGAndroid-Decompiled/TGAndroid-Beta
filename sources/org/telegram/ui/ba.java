package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f34697a;
    public final int f34698b;
    public final Object f34699c;

    public ba(Object obj, int i10, int i11) {
        this.f34697a = i11;
        this.f34699c = obj;
        this.f34698b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34697a) {
            case 0:
                qa.V((qa) this.f34699c, this.f34698b);
                return;
            case 1:
                ((on) this.f34699c).f39311a.getConnectionsManager().cancelRequest(this.f34698b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f34699c;
                xoVar.N0 = false;
                xoVar.f42797b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f34698b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f34699c).O2.getConnectionsManager().cancelRequest(this.f34698b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f34699c).f26551c.f26917a.F.f27960c1).cancelRequest(this.f34698b, true);
                return;
            case 5:
                ((j60) this.f34699c).d.getConnectionsManager().cancelRequest(this.f34698b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f34699c).currentAccount).cancelRequest(this.f34698b, true);
                return;
            case 7:
                ((id0) this.f34699c).getConnectionsManager().cancelRequest(this.f34698b, true);
                return;
            case 8:
                be1.U((be1) this.f34699c, this.f34698b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.o) this.f34699c).f52380a).cancelRequest(this.f34698b, true);
                return;
        }
    }
}
