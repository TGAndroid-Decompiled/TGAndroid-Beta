package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ga implements DialogInterface.OnCancelListener {
    public final int f36355a;
    public final int f36356b;
    public final Object f36357c;

    public ga(Object obj, int i10, int i11) {
        this.f36355a = i11;
        this.f36357c = obj;
        this.f36356b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36355a) {
            case 0:
                va.V((va) this.f36357c, this.f36356b);
                return;
            case 1:
                ((qn) this.f36357c).f39497a.getConnectionsManager().cancelRequest(this.f36356b, true);
                return;
            case 2:
                zo zoVar = (zo) this.f36357c;
                zoVar.N0 = false;
                zoVar.f42656b = null;
                zoVar.getConnectionsManager().cancelRequest(this.f36356b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36357c).P2.getConnectionsManager().cancelRequest(this.f36356b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ry) this.f36357c).f28963c.f29229a.F.f31014c1).cancelRequest(this.f36356b, true);
                return;
            case 5:
                ((n60) this.f36357c).d.getConnectionsManager().cancelRequest(this.f36356b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36357c).currentAccount).cancelRequest(this.f36356b, true);
                return;
            case 7:
                ((nd0) this.f36357c).getConnectionsManager().cancelRequest(this.f36356b, true);
                return;
            case 8:
                he1.U((he1) this.f36357c, this.f36356b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.p) this.f36357c).f50958a).cancelRequest(this.f36356b, true);
                return;
        }
    }
}
