package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f34696a;
    public final int f34697b;
    public final Object f34698c;

    public ba(Object obj, int i10, int i11) {
        this.f34696a = i11;
        this.f34698c = obj;
        this.f34697b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34696a) {
            case 0:
                qa.V((qa) this.f34698c, this.f34697b);
                return;
            case 1:
                ((on) this.f34698c).f39310a.getConnectionsManager().cancelRequest(this.f34697b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f34698c;
                xoVar.N0 = false;
                xoVar.f42796b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f34697b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f34698c).O2.getConnectionsManager().cancelRequest(this.f34697b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f34698c).f26550c.f26916a.F.f27959c1).cancelRequest(this.f34697b, true);
                return;
            case 5:
                ((j60) this.f34698c).d.getConnectionsManager().cancelRequest(this.f34697b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f34698c).currentAccount).cancelRequest(this.f34697b, true);
                return;
            case 7:
                ((id0) this.f34698c).getConnectionsManager().cancelRequest(this.f34697b, true);
                return;
            case 8:
                be1.U((be1) this.f34698c, this.f34697b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.o) this.f34698c).f52379a).cancelRequest(this.f34697b, true);
                return;
        }
    }
}
