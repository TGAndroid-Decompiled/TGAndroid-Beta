package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32359a;
    public final int f32360b;
    public final Object f32361c;

    public ba(Object obj, int i10, int i11) {
        this.f32359a = i11;
        this.f32361c = obj;
        this.f32360b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32359a) {
            case 0:
                qa.V((qa) this.f32361c, this.f32360b);
                return;
            case 1:
                ((in) this.f32361c).f34557a.getConnectionsManager().cancelRequest(this.f32360b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32361c;
                roVar.N0 = false;
                roVar.f37391b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32360b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32361c).P2.getConnectionsManager().cancelRequest(this.f32360b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.hy) this.f32361c).f24886c.f25198a.F.f26236c1).cancelRequest(this.f32360b, true);
                return;
            case 5:
                ((d60) this.f32361c).d.getConnectionsManager().cancelRequest(this.f32360b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32361c).currentAccount).cancelRequest(this.f32360b, true);
                return;
            case 7:
                ((cd0) this.f32361c).getConnectionsManager().cancelRequest(this.f32360b, true);
                return;
            case 8:
                td1.U((td1) this.f32361c, this.f32360b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32361c).f47784a).cancelRequest(this.f32360b, true);
                return;
        }
    }
}
