package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f34669a;
    public final int f34670b;
    public final Object f34671c;

    public ba(Object obj, int i10, int i11) {
        this.f34669a = i11;
        this.f34671c = obj;
        this.f34670b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34669a) {
            case 0:
                qa.V((qa) this.f34671c, this.f34670b);
                return;
            case 1:
                ((on) this.f34671c).f39283a.getConnectionsManager().cancelRequest(this.f34670b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f34671c;
                xoVar.N0 = false;
                xoVar.f42769b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f34670b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f34671c).O2.getConnectionsManager().cancelRequest(this.f34670b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f34671c).f26523c.f26889a.F.f27932c1).cancelRequest(this.f34670b, true);
                return;
            case 5:
                ((j60) this.f34671c).d.getConnectionsManager().cancelRequest(this.f34670b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f34671c).currentAccount).cancelRequest(this.f34670b, true);
                return;
            case 7:
                ((id0) this.f34671c).getConnectionsManager().cancelRequest(this.f34670b, true);
                return;
            case 8:
                be1.U((be1) this.f34671c, this.f34670b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.o) this.f34671c).f52348a).cancelRequest(this.f34670b, true);
                return;
        }
    }
}
