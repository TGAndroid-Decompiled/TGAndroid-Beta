package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f36311a;
    public final int f36312b;
    public final Object f36313c;

    public ba(Object obj, int i10, int i11) {
        this.f36311a = i11;
        this.f36313c = obj;
        this.f36312b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36311a) {
            case 0:
                qa.V((qa) this.f36313c, this.f36312b);
                return;
            case 1:
                ((ln) this.f36313c).f39701a.getConnectionsManager().cancelRequest(this.f36312b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f36313c;
                uoVar.N0 = false;
                uoVar.f42656b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f36312b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36313c).P2.getConnectionsManager().cancelRequest(this.f36312b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.wy) this.f36313c).f32761c.f33043a.F.f24662c1).cancelRequest(this.f36312b, true);
                return;
            case 5:
                ((g60) this.f36313c).d.getConnectionsManager().cancelRequest(this.f36312b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36313c).currentAccount).cancelRequest(this.f36312b, true);
                return;
            case 7:
                ((gd0) this.f36313c).getConnectionsManager().cancelRequest(this.f36312b, true);
                return;
            case 8:
                be1.U((be1) this.f36313c, this.f36312b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f36313c).f53030a).cancelRequest(this.f36312b, true);
                return;
        }
    }
}
