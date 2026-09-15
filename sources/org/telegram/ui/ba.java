package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32109a;
    public final int f32110b;
    public final Object f32111c;

    public ba(Object obj, int i10, int i11) {
        this.f32109a = i11;
        this.f32111c = obj;
        this.f32110b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32109a) {
            case 0:
                qa.V((qa) this.f32111c, this.f32110b);
                return;
            case 1:
                ((nn) this.f32111c).f36012a.getConnectionsManager().cancelRequest(this.f32110b, true);
                return;
            case 2:
                wo woVar = (wo) this.f32111c;
                woVar.N0 = false;
                woVar.f39271b = null;
                woVar.getConnectionsManager().cancelRequest(this.f32110b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32111c).O2.getConnectionsManager().cancelRequest(this.f32110b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.fy) this.f32111c).f24111c.f24466a.F.f25703c1).cancelRequest(this.f32110b, true);
                return;
            case 5:
                ((i60) this.f32111c).d.getConnectionsManager().cancelRequest(this.f32110b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32111c).currentAccount).cancelRequest(this.f32110b, true);
                return;
            case 7:
                ((id0) this.f32111c).getConnectionsManager().cancelRequest(this.f32110b, true);
                return;
            case 8:
                ae1.U((ae1) this.f32111c, this.f32110b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32111c).f47541a).cancelRequest(this.f32110b, true);
                return;
        }
    }
}
