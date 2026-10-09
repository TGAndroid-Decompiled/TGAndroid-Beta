package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f36594a;
    public final int f36595b;
    public final Object f36596c;

    public ca(Object obj, int i10, int i11) {
        this.f36594a = i11;
        this.f36596c = obj;
        this.f36595b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36594a) {
            case 0:
                ra.V((ra) this.f36596c, this.f36595b);
                return;
            case 1:
                ((ln) this.f36596c).f39636a.getConnectionsManager().cancelRequest(this.f36595b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f36596c;
                uoVar.N0 = false;
                uoVar.f42466b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f36595b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36596c).P2.getConnectionsManager().cancelRequest(this.f36595b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.vy) this.f36596c).f32476c.f32694a.F.f24401c1).cancelRequest(this.f36595b, true);
                return;
            case 5:
                ((g60) this.f36596c).d.getConnectionsManager().cancelRequest(this.f36595b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36596c).currentAccount).cancelRequest(this.f36595b, true);
                return;
            case 7:
                ((hd0) this.f36596c).getConnectionsManager().cancelRequest(this.f36595b, true);
                return;
            case 8:
                ce1.U((ce1) this.f36596c, this.f36595b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f36596c).f52945a).cancelRequest(this.f36595b, true);
                return;
        }
    }
}
