package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32362a;
    public final int f32363b;
    public final Object f32364c;

    public ba(Object obj, int i10, int i11) {
        this.f32362a = i11;
        this.f32364c = obj;
        this.f32363b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32362a) {
            case 0:
                qa.V((qa) this.f32364c, this.f32363b);
                return;
            case 1:
                ((in) this.f32364c).f34559a.getConnectionsManager().cancelRequest(this.f32363b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32364c;
                roVar.N0 = false;
                roVar.f37391b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32363b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32364c).P2.getConnectionsManager().cancelRequest(this.f32363b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.iy) this.f32364c).f25229c.f25530a.F.f26531c1).cancelRequest(this.f32363b, true);
                return;
            case 5:
                ((d60) this.f32364c).d.getConnectionsManager().cancelRequest(this.f32363b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32364c).currentAccount).cancelRequest(this.f32363b, true);
                return;
            case 7:
                ((cd0) this.f32364c).getConnectionsManager().cancelRequest(this.f32363b, true);
                return;
            case 8:
                td1.U((td1) this.f32364c, this.f32363b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32364c).f47786a).cancelRequest(this.f32363b, true);
                return;
        }
    }
}
