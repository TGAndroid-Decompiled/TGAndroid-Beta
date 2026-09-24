package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32346a;
    public final int f32347b;
    public final Object f32348c;

    public ba(Object obj, int i10, int i11) {
        this.f32346a = i11;
        this.f32348c = obj;
        this.f32347b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32346a) {
            case 0:
                qa.V((qa) this.f32348c, this.f32347b);
                return;
            case 1:
                ((in) this.f32348c).f34543a.getConnectionsManager().cancelRequest(this.f32347b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32348c;
                roVar.N0 = false;
                roVar.f37378b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32347b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32348c).P2.getConnectionsManager().cancelRequest(this.f32347b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.hy) this.f32348c).f24861c.f25173a.F.f26229c1).cancelRequest(this.f32347b, true);
                return;
            case 5:
                ((d60) this.f32348c).d.getConnectionsManager().cancelRequest(this.f32347b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32348c).currentAccount).cancelRequest(this.f32347b, true);
                return;
            case 7:
                ((cd0) this.f32348c).getConnectionsManager().cancelRequest(this.f32347b, true);
                return;
            case 8:
                td1.U((td1) this.f32348c, this.f32347b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32348c).f47773a).cancelRequest(this.f32347b, true);
                return;
        }
    }
}
