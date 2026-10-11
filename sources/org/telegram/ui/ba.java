package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f36345a;
    public final int f36346b;
    public final Object f36347c;

    public ba(Object obj, int i10, int i11) {
        this.f36345a = i11;
        this.f36347c = obj;
        this.f36346b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36345a) {
            case 0:
                qa.V((qa) this.f36347c, this.f36346b);
                return;
            case 1:
                ((ln) this.f36347c).f39735a.getConnectionsManager().cancelRequest(this.f36346b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f36347c;
                uoVar.N0 = false;
                uoVar.f42690b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f36346b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36347c).P2.getConnectionsManager().cancelRequest(this.f36346b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.wy) this.f36347c).f32810c.f33087a.F.f24731c1).cancelRequest(this.f36346b, true);
                return;
            case 5:
                ((g60) this.f36347c).d.getConnectionsManager().cancelRequest(this.f36346b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36347c).currentAccount).cancelRequest(this.f36346b, true);
                return;
            case 7:
                ((gd0) this.f36347c).getConnectionsManager().cancelRequest(this.f36346b, true);
                return;
            case 8:
                be1.U((be1) this.f36347c, this.f36346b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f36347c).f53064a).cancelRequest(this.f36346b, true);
                return;
        }
    }
}
