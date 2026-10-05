package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f35725a;
    public final int f35726b;
    public final Object f35727c;

    public da(Object obj, int i10, int i11) {
        this.f35725a = i11;
        this.f35727c = obj;
        this.f35726b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35725a) {
            case 0:
                sa.T((sa) this.f35727c, this.f35726b);
                return;
            case 1:
                ((kn) this.f35727c).f38076a.getConnectionsManager().cancelRequest(this.f35726b, true);
                return;
            case 2:
                to toVar = (to) this.f35727c;
                toVar.N0 = false;
                toVar.f40946b = null;
                toVar.getConnectionsManager().cancelRequest(this.f35726b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f35727c).P2.getConnectionsManager().cancelRequest(this.f35726b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.jy) this.f35727c).f27991c.f28304a.F.f29194c1).cancelRequest(this.f35726b, true);
                return;
            case 5:
                ((h60) this.f35727c).d.getConnectionsManager().cancelRequest(this.f35726b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f35727c).currentAccount).cancelRequest(this.f35726b, true);
                return;
            case 7:
                ((gd0) this.f35727c).getConnectionsManager().cancelRequest(this.f35726b, true);
                return;
            case 8:
                ud1.S((ud1) this.f35727c, this.f35726b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.p) this.f35727c).f51768a).cancelRequest(this.f35726b, true);
                return;
        }
    }
}
