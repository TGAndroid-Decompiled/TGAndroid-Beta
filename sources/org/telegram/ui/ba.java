package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32358a;
    public final int f32359b;
    public final Object f32360c;

    public ba(Object obj, int i10, int i11) {
        this.f32358a = i11;
        this.f32360c = obj;
        this.f32359b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32358a) {
            case 0:
                qa.V((qa) this.f32360c, this.f32359b);
                return;
            case 1:
                ((in) this.f32360c).f34556a.getConnectionsManager().cancelRequest(this.f32359b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32360c;
                roVar.N0 = false;
                roVar.f37390b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32359b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32360c).P2.getConnectionsManager().cancelRequest(this.f32359b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.iy) this.f32360c).f25207c.f25554a.F.f26548c1).cancelRequest(this.f32359b, true);
                return;
            case 5:
                ((d60) this.f32360c).d.getConnectionsManager().cancelRequest(this.f32359b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32360c).currentAccount).cancelRequest(this.f32359b, true);
                return;
            case 7:
                ((cd0) this.f32360c).getConnectionsManager().cancelRequest(this.f32359b, true);
                return;
            case 8:
                td1.U((td1) this.f32360c, this.f32359b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32360c).f47783a).cancelRequest(this.f32359b, true);
                return;
        }
    }
}
