package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32360a;
    public final int f32361b;
    public final Object f32362c;

    public ba(Object obj, int i10, int i11) {
        this.f32360a = i11;
        this.f32362c = obj;
        this.f32361b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32360a) {
            case 0:
                qa.V((qa) this.f32362c, this.f32361b);
                return;
            case 1:
                ((in) this.f32362c).f34558a.getConnectionsManager().cancelRequest(this.f32361b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32362c;
                roVar.N0 = false;
                roVar.f37392b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32361b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32362c).P2.getConnectionsManager().cancelRequest(this.f32361b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.hy) this.f32362c).f24887c.f25199a.F.f26237c1).cancelRequest(this.f32361b, true);
                return;
            case 5:
                ((d60) this.f32362c).d.getConnectionsManager().cancelRequest(this.f32361b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32362c).currentAccount).cancelRequest(this.f32361b, true);
                return;
            case 7:
                ((cd0) this.f32362c).getConnectionsManager().cancelRequest(this.f32361b, true);
                return;
            case 8:
                td1.U((td1) this.f32362c, this.f32361b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32362c).f47785a).cancelRequest(this.f32361b, true);
                return;
        }
    }
}
