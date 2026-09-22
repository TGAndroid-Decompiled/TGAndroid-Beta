package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32094a;
    public final int f32095b;
    public final Object f32096c;

    public ba(Object obj, int i10, int i11) {
        this.f32094a = i11;
        this.f32096c = obj;
        this.f32095b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32094a) {
            case 0:
                qa.V((qa) this.f32096c, this.f32095b);
                return;
            case 1:
                ((nn) this.f32096c).f36017a.getConnectionsManager().cancelRequest(this.f32095b, true);
                return;
            case 2:
                wo woVar = (wo) this.f32096c;
                woVar.N0 = false;
                woVar.f39267b = null;
                woVar.getConnectionsManager().cancelRequest(this.f32095b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32096c).O2.getConnectionsManager().cancelRequest(this.f32095b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.fy) this.f32096c).f24108c.f24469a.F.f25700c1).cancelRequest(this.f32095b, true);
                return;
            case 5:
                ((i60) this.f32096c).d.getConnectionsManager().cancelRequest(this.f32095b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32096c).currentAccount).cancelRequest(this.f32095b, true);
                return;
            case 7:
                ((id0) this.f32096c).getConnectionsManager().cancelRequest(this.f32095b, true);
                return;
            case 8:
                be1.U((be1) this.f32096c, this.f32095b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32096c).f47500a).cancelRequest(this.f32095b, true);
                return;
        }
    }
}
