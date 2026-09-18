package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f32608a;
    public final int f32609b;
    public final Object f32610c;

    public ca(Object obj, int i10, int i11) {
        this.f32608a = i11;
        this.f32610c = obj;
        this.f32609b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32608a) {
            case 0:
                ra.V((ra) this.f32610c, this.f32609b);
                return;
            case 1:
                ((ln) this.f32610c).f35408a.getConnectionsManager().cancelRequest(this.f32609b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f32610c;
                uoVar.N0 = false;
                uoVar.f38036b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f32609b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32610c).O2.getConnectionsManager().cancelRequest(this.f32609b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f32610c).f24505c.f24750a.F.f25892c1).cancelRequest(this.f32609b, true);
                return;
            case 5:
                ((i60) this.f32610c).d.getConnectionsManager().cancelRequest(this.f32609b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32610c).currentAccount).cancelRequest(this.f32609b, true);
                return;
            case 7:
                ((jd0) this.f32610c).getConnectionsManager().cancelRequest(this.f32609b, true);
                return;
            case 8:
                ae1.U((ae1) this.f32610c, this.f32609b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32610c).f47788a).cancelRequest(this.f32609b, true);
                return;
        }
    }
}
