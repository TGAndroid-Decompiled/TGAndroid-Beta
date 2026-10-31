package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f36143a;
    public final int f36144b;
    public final Object f36145c;

    public ba(Object obj, int i10, int i11) {
        this.f36143a = i11;
        this.f36145c = obj;
        this.f36144b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36143a) {
            case 0:
                ConnectionsManager.getInstance(((oa) this.f36145c).currentAccount).cancelRequest(this.f36144b, true);
                return;
            case 1:
                ((fn) this.f36145c).f37301a.getConnectionsManager().cancelRequest(this.f36144b, true);
                return;
            case 2:
                oo ooVar = (oo) this.f36145c;
                ooVar.N0 = false;
                ooVar.f40316b = null;
                ooVar.getConnectionsManager().cancelRequest(this.f36144b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36145c).P2.getConnectionsManager().cancelRequest(this.f36144b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ux) ((org.telegram.ui.Components.rx) this.f36145c).f30036c.f1886b).F.f31865c1).cancelRequest(this.f36144b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((b50) this.f36145c).f36036k1.f14863a).cancelRequest(this.f36144b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36145c).currentAccount).cancelRequest(this.f36144b, true);
                return;
            case 7:
                ((yb0) this.f36145c).getConnectionsManager().cancelRequest(this.f36144b, true);
                return;
            case 8:
                ConnectionsManager.getInstance(((p91) this.f36145c).currentAccount).cancelRequest(this.f36144b, true);
                return;
            default:
                ConnectionsManager.getInstance(((rh.r) this.f36145c).f47383a).cancelRequest(this.f36144b, true);
                return;
        }
    }
}
