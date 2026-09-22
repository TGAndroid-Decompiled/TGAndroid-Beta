package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f32704a;
    public final int f32705b;
    public final Object f32706c;

    public ca(Object obj, int i10, int i11) {
        this.f32704a = i11;
        this.f32706c = obj;
        this.f32705b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32704a) {
            case 0:
                ra.V((ra) this.f32706c, this.f32705b);
                return;
            case 1:
                ((ln) this.f32706c).f35505a.getConnectionsManager().cancelRequest(this.f32705b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f32706c;
                uoVar.N0 = false;
                uoVar.f38166b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f32705b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32706c).P2.getConnectionsManager().cancelRequest(this.f32705b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f32706c).f24645c.f24901a.F.f25858c1).cancelRequest(this.f32705b, true);
                return;
            case 5:
                ((i60) this.f32706c).d.getConnectionsManager().cancelRequest(this.f32705b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32706c).currentAccount).cancelRequest(this.f32705b, true);
                return;
            case 7:
                ((kd0) this.f32706c).getConnectionsManager().cancelRequest(this.f32705b, true);
                return;
            case 8:
                ce1.U((ce1) this.f32706c, this.f32705b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32706c).f47848a).cancelRequest(this.f32705b, true);
                return;
        }
    }
}
