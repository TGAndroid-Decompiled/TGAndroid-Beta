package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ea implements DialogInterface.OnCancelListener {
    public final int f33181a;
    public final int f33182b;
    public final Object f33183c;

    public ea(Object obj, int i10, int i11) {
        this.f33181a = i11;
        this.f33183c = obj;
        this.f33182b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33181a) {
            case 0:
                ta.V((ta) this.f33183c, this.f33182b);
                return;
            case 1:
                ((jn) this.f33183c).f34766a.getConnectionsManager().cancelRequest(this.f33182b, true);
                return;
            case 2:
                so soVar = (so) this.f33183c;
                soVar.N0 = false;
                soVar.f37505b = null;
                soVar.getConnectionsManager().cancelRequest(this.f33182b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f33183c).P2.getConnectionsManager().cancelRequest(this.f33182b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.hy) this.f33183c).f24929c.f25264a.F.f26574c1).cancelRequest(this.f33182b, true);
                return;
            case 5:
                ((g60) this.f33183c).d.getConnectionsManager().cancelRequest(this.f33182b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f33183c).currentAccount).cancelRequest(this.f33182b, true);
                return;
            case 7:
                ((fd0) this.f33183c).getConnectionsManager().cancelRequest(this.f33182b, true);
                return;
            case 8:
                ud1.U((ud1) this.f33183c, this.f33182b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f33183c).f47847a).cancelRequest(this.f33182b, true);
                return;
        }
    }
}
