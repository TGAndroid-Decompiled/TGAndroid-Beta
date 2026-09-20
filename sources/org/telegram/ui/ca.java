package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ca implements DialogInterface.OnCancelListener {
    public final int f32684a;
    public final int f32685b;
    public final Object f32686c;

    public ca(Object obj, int i10, int i11) {
        this.f32684a = i11;
        this.f32686c = obj;
        this.f32685b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32684a) {
            case 0:
                ra.V((ra) this.f32686c, this.f32685b);
                return;
            case 1:
                ((ln) this.f32686c).f35482a.getConnectionsManager().cancelRequest(this.f32685b, true);
                return;
            case 2:
                uo uoVar = (uo) this.f32686c;
                uoVar.N0 = false;
                uoVar.f38145b = null;
                uoVar.getConnectionsManager().cancelRequest(this.f32685b, true);
                return;
            case 3:
                ((ChatActivityEnterView) this.f32686c).O2.getConnectionsManager().cancelRequest(this.f32685b, true);
                return;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.f32686c).f24474c.f24794a.F.f25898c1).cancelRequest(this.f32685b, true);
                return;
            case 5:
                ((i60) this.f32686c).d.getConnectionsManager().cancelRequest(this.f32685b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f32686c).currentAccount).cancelRequest(this.f32685b, true);
                return;
            case 7:
                ((kd0) this.f32686c).getConnectionsManager().cancelRequest(this.f32685b, true);
                return;
            case 8:
                ce1.U((ce1) this.f32686c, this.f32685b);
                return;
            default:
                ConnectionsManager.getInstance(((yh.o) this.f32686c).f47827a).cancelRequest(this.f32685b, true);
                return;
        }
    }
}
