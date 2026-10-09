package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f36592a;
    public final int f36593b;
    public final Object f36594c;

    public ca(Object obj, int i10, int i11) {
        this.f36592a = i11;
        this.f36594c = obj;
        this.f36593b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36592a) {
            case 0:
                ra.V((ra) this.f36594c, this.f36593b);
                return;
            case 1:
                ((ln) this.f36594c).f39634a.getConnectionsManager().cancelRequest(this.f36593b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f36594c;
                uoVar.N0 = false;
                uoVar.f42464b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f36593b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f36594c).P2.getConnectionsManager().cancelRequest(this.f36593b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.vy) this.f36594c).f32476c.f32694a.F.f24401c1).cancelRequest(this.f36593b, true);
                return;
            case 5:
                ((g60) this.f36594c).d.getConnectionsManager().cancelRequest(this.f36593b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f36594c).currentAccount).cancelRequest(this.f36593b, true);
                return;
            case 7:
                ((hd0) this.f36594c).getConnectionsManager().cancelRequest(this.f36593b, true);
                return;
            case 8:
                ce1.U((ce1) this.f36594c, this.f36593b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f36594c).f52943a).cancelRequest(this.f36593b, true);
                return;
        }
    }
}
