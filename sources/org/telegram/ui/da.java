package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class da implements DialogInterface.OnCancelListener {
    public final int f33068a;
    public final int f33069b;
    public final Object f33070c;

    public da(Object obj, int i10, int i11) {
        this.f33068a = i11;
        this.f33070c = obj;
        this.f33069b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33068a) {
            case 0:
                sa.V((sa) this.f33070c, this.f33069b);
                return;
            case 1:
                ((nn) this.f33070c).f36134a.getConnectionsManager().cancelRequest(this.f33069b, true);
                return;
            case 2:
                wo woVar = (wo) this.f33070c;
                woVar.N0 = false;
                woVar.f39084b = null;
                woVar.getConnectionsManager().cancelRequest(this.f33069b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f33070c).O2.getConnectionsManager().cancelRequest(this.f33069b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.fy) this.f33070c).f24028c.f24414a.F.f25713c1).cancelRequest(this.f33069b, true);
                return;
            case 5:
                ((k60) this.f33070c).d.getConnectionsManager().cancelRequest(this.f33069b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f33070c).currentAccount).cancelRequest(this.f33069b, true);
                return;
            case 7:
                ((kd0) this.f33070c).getConnectionsManager().cancelRequest(this.f33069b, true);
                return;
            case 8:
                ce1.U((ce1) this.f33070c, this.f33069b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f33070c).f47564a).cancelRequest(this.f33069b, true);
                return;
        }
    }
}
