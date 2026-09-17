package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f34670a;
    public final int f34671b;
    public final Object f34672c;

    public ba(Object obj, int i10, int i11) {
        this.f34670a = i11;
        this.f34672c = obj;
        this.f34671b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34670a) {
            case 0:
                qa.V((qa) this.f34672c, this.f34671b);
                return;
            case 1:
                ((on) this.f34672c).f39284a.getConnectionsManager().cancelRequest(this.f34671b, true);
                return;
            case 2:
                xo xoVar = (xo) this.f34672c;
                xoVar.N0 = false;
                xoVar.f42770b = null;
                xoVar.getConnectionsManager().cancelRequest(this.f34671b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f34672c).O2.getConnectionsManager().cancelRequest(this.f34671b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f34672c).f26524c.f26890a.F.f27933c1).cancelRequest(this.f34671b, true);
                return;
            case 5:
                ((j60) this.f34672c).d.getConnectionsManager().cancelRequest(this.f34671b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f34672c).currentAccount).cancelRequest(this.f34671b, true);
                return;
            case 7:
                ((id0) this.f34672c).getConnectionsManager().cancelRequest(this.f34671b, true);
                return;
            case 8:
                be1.U((be1) this.f34672c, this.f34671b);
                return;
            default:
                ConnectionsManager.getInstance(((zh.o) this.f34672c).f52349a).cancelRequest(this.f34671b, true);
                return;
        }
    }
}
