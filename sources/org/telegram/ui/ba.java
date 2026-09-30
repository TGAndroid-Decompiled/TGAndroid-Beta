package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ba implements DialogInterface.OnCancelListener {
    public final int f32434a;
    public final int f32435b;
    public final Object f32436c;

    public ba(Object obj, int i10, int i11) {
        this.f32434a = i11;
        this.f32436c = obj;
        this.f32435b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32434a) {
            case 0:
                qa.V((qa) this.f32436c, this.f32435b);
                return;
            case 1:
                ((in) this.f32436c).f34642a.getConnectionsManager().cancelRequest(this.f32435b, true);
                return;
            case 2:
                ro roVar = (ro) this.f32436c;
                roVar.N0 = false;
                roVar.f37484b = null;
                roVar.getConnectionsManager().cancelRequest(this.f32435b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32436c).P2.getConnectionsManager().cancelRequest(this.f32435b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.jy) this.f32436c).f25586c.f25838a.F.f26818c1).cancelRequest(this.f32435b, true);
                return;
            case 5:
                ((d60) this.f32436c).d.getConnectionsManager().cancelRequest(this.f32435b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32436c).currentAccount).cancelRequest(this.f32435b, true);
                return;
            case 7:
                ((cd0) this.f32436c).getConnectionsManager().cancelRequest(this.f32435b, true);
                return;
            case 8:
                td1.U((td1) this.f32436c, this.f32435b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32436c).f47892a).cancelRequest(this.f32435b, true);
                return;
        }
    }
}
