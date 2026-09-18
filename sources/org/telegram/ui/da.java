package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f33072a;
    public final int f33073b;
    public final Object f33074c;

    public da(Object obj, int i10, int i11) {
        this.f33072a = i11;
        this.f33074c = obj;
        this.f33073b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33072a) {
            case 0:
                sa.V((sa) this.f33074c, this.f33073b);
                return;
            case 1:
                ((nn) this.f33074c).f36139a.getConnectionsManager().cancelRequest(this.f33073b, true);
                return;
            case 2:
                wo woVar = (wo) this.f33074c;
                woVar.N0 = false;
                woVar.f39089b = null;
                woVar.getConnectionsManager().cancelRequest(this.f33073b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f33074c).O2.getConnectionsManager().cancelRequest(this.f33073b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.fy) this.f33074c).f24031c.f24417a.F.f25716c1).cancelRequest(this.f33073b, true);
                return;
            case 5:
                ((k60) this.f33074c).d.getConnectionsManager().cancelRequest(this.f33073b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f33074c).currentAccount).cancelRequest(this.f33073b, true);
                return;
            case 7:
                ((kd0) this.f33074c).getConnectionsManager().cancelRequest(this.f33073b, true);
                return;
            case 8:
                ce1.U((ce1) this.f33074c, this.f33073b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f33074c).f47569a).cancelRequest(this.f33073b, true);
                return;
        }
    }
}
