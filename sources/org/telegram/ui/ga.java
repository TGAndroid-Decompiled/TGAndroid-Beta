package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ga implements DialogInterface.OnCancelListener {
    public final int f36112a;
    public final int f36113b;
    public final Object f36114c;

    public ga(Object obj, int i10, int i11) {
        this.f36112a = i11;
        this.f36114c = obj;
        this.f36113b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36112a) {
            case 0:
                va.V((va) this.f36114c, this.f36113b);
                return;
            case 1:
                ((qn) this.f36114c).f39190a.getConnectionsManager().cancelRequest(this.f36113b, true);
                return;
            case 2:
                zo zoVar = (zo) this.f36114c;
                zoVar.N0 = false;
                zoVar.f42365b = null;
                zoVar.getConnectionsManager().cancelRequest(this.f36113b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36114c).P2.getConnectionsManager().cancelRequest(this.f36113b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ry) this.f36114c).f28663c.f28929a.F.f30707c1).cancelRequest(this.f36113b, true);
                return;
            case 5:
                ((n60) this.f36114c).d.getConnectionsManager().cancelRequest(this.f36113b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36114c).currentAccount).cancelRequest(this.f36113b, true);
                return;
            case 7:
                ((ld0) this.f36114c).getConnectionsManager().cancelRequest(this.f36113b, true);
                return;
            case 8:
                he1.U((he1) this.f36114c, this.f36113b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.p) this.f36114c).f50959a).cancelRequest(this.f36113b, true);
                return;
        }
    }
}
