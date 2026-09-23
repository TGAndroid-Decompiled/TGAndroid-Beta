package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32029a;
    public final int f32030b;
    public final Object f32031c;

    public ba(Object obj, int i10, int i11) {
        this.f32029a = i11;
        this.f32031c = obj;
        this.f32030b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32029a) {
            case 0:
                qa.V((qa) this.f32031c, this.f32030b);
                return;
            case 1:
                ((jn) this.f32031c).f34487a.getConnectionsManager().cancelRequest(this.f32030b, true);
                return;
            case 2:
                so soVar = (so) this.f32031c;
                soVar.N0 = false;
                soVar.f37345b = null;
                soVar.getConnectionsManager().cancelRequest(this.f32030b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32031c).O2.getConnectionsManager().cancelRequest(this.f32030b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f32031c).f24441c.f24829a.F.f25968c1).cancelRequest(this.f32030b, true);
                return;
            case 5:
                ((f60) this.f32031c).d.getConnectionsManager().cancelRequest(this.f32030b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32031c).currentAccount).cancelRequest(this.f32030b, true);
                return;
            case 7:
                ((dd0) this.f32031c).getConnectionsManager().cancelRequest(this.f32030b, true);
                return;
            case 8:
                td1.U((td1) this.f32031c, this.f32030b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32031c).f47474a).cancelRequest(this.f32030b, true);
                return;
        }
    }
}
