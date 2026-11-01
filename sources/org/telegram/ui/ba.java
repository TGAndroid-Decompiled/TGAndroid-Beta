package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f36012a;
    public final int f36013b;
    public final Object f36014c;

    public ba(Object obj, int i10, int i11) {
        this.f36012a = i11;
        this.f36014c = obj;
        this.f36013b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36012a) {
            case 0:
                ConnectionsManager.getInstance(((oa) this.f36014c).currentAccount).cancelRequest(this.f36013b, true);
                return;
            case 1:
                ((fn) this.f36014c).f37191a.getConnectionsManager().cancelRequest(this.f36013b, true);
                return;
            case 2:
                oo ooVar = (oo) this.f36014c;
                ooVar.N0 = false;
                ooVar.f40205b = null;
                ooVar.getConnectionsManager().cancelRequest(this.f36013b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36014c).P2.getConnectionsManager().cancelRequest(this.f36013b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ux) ((org.telegram.ui.Components.rx) this.f36014c).f30097c.f1886b).F.f31943c1).cancelRequest(this.f36013b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((a50) this.f36014c).f35620k1.f15043a).cancelRequest(this.f36013b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36014c).currentAccount).cancelRequest(this.f36013b, true);
                return;
            case 7:
                ((xb0) this.f36014c).getConnectionsManager().cancelRequest(this.f36013b, true);
                return;
            case 8:
                ConnectionsManager.getInstance(((n91) this.f36014c).currentAccount).cancelRequest(this.f36013b, true);
                return;
            default:
                ConnectionsManager.getInstance(((rh.r) this.f36014c).f47396a).cancelRequest(this.f36013b, true);
                return;
        }
    }
}
