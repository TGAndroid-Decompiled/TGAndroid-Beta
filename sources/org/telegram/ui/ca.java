package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f36638a;
    public final int f36639b;
    public final Object f36640c;

    public ca(Object obj, int i10, int i11) {
        this.f36638a = i11;
        this.f36640c = obj;
        this.f36639b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36638a) {
            case 0:
                ra.V((ra) this.f36640c, this.f36639b);
                return;
            case 1:
                ((ln) this.f36640c).f39680a.getConnectionsManager().cancelRequest(this.f36639b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f36640c;
                uoVar.N0 = false;
                uoVar.f42510b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f36639b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36640c).P2.getConnectionsManager().cancelRequest(this.f36639b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.wy) this.f36640c).f32780c.f33049a.F.f24689c1).cancelRequest(this.f36639b, true);
                return;
            case 5:
                ((g60) this.f36640c).d.getConnectionsManager().cancelRequest(this.f36639b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36640c).currentAccount).cancelRequest(this.f36639b, true);
                return;
            case 7:
                ((hd0) this.f36640c).getConnectionsManager().cancelRequest(this.f36639b, true);
                return;
            case 8:
                ce1.U((ce1) this.f36640c, this.f36639b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f36640c).f52989a).cancelRequest(this.f36639b, true);
                return;
        }
    }
}
