package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fa implements DialogInterface.OnCancelListener {
    public final int f37688a;
    public final int f37689b;
    public final Object f37690c;

    public fa(Object obj, int i10, int i11) {
        this.f37688a = i11;
        this.f37690c = obj;
        this.f37689b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37688a) {
            case 0:
                ua.V((ua) this.f37690c, this.f37689b);
                return;
            case 1:
                ((pn) this.f37690c).f40998a.getConnectionsManager().cancelRequest(this.f37689b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f37690c;
                xoVar.N0 = false;
                xoVar.f44049b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f37689b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f37690c).P2.getConnectionsManager().cancelRequest(this.f37689b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.yy) this.f37690c).f33221c.f33519a.F.f25080c1).cancelRequest(this.f37689b, true);
                return;
            case 5:
                ((i60) this.f37690c).d.getConnectionsManager().cancelRequest(this.f37689b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f37690c).currentAccount).cancelRequest(this.f37689b, true);
                return;
            case 7:
                ((id0) this.f37690c).getConnectionsManager().cancelRequest(this.f37689b, true);
                return;
            case 8:
                ConnectionsManager.getInstance(((ee1) this.f37690c).currentAccount).cancelRequest(this.f37689b, true);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f37690c).f53167a).cancelRequest(this.f37689b, true);
                return;
        }
    }
}
