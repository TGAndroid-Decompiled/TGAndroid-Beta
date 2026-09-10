package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f31199a;
    public final int f31200b;
    public final Object f31201c;

    public ba(Object obj, int i10, int i11) {
        this.f31199a = i11;
        this.f31201c = obj;
        this.f31200b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f31199a) {
            case 0:
                ra.V((ra) this.f31201c, this.f31200b);
                return;
            case 1:
                ((pn) this.f31201c).f35881a.getConnectionsManager().cancelRequest(this.f31200b, true);
                return;
            case 2:
                yo yoVar = (yo) this.f31201c;
                yoVar.N0 = false;
                yoVar.f39041b = null;
                yoVar.getConnectionsManager().cancelRequest(this.f31200b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f31201c).O2.getConnectionsManager().cancelRequest(this.f31200b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ny) this.f31201c).f25618c.f25939a.F.f26805c1).cancelRequest(this.f31200b, true);
                return;
            case 5:
                ((j60) this.f31201c).d.getConnectionsManager().cancelRequest(this.f31200b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f31201c).currentAccount).cancelRequest(this.f31200b, true);
                return;
            case 7:
                ((id0) this.f31201c).getConnectionsManager().cancelRequest(this.f31200b, true);
                return;
            case 8:
                fe1.U((fe1) this.f31201c, this.f31200b);
                return;
            default:
                ConnectionsManager.getInstance(((xh.p) this.f31201c).f45843a).cancelRequest(this.f31200b, true);
                return;
        }
    }
}
