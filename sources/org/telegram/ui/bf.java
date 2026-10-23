package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class bf implements Runnable {
    public final int f36069a;
    public final sn f36070b;
    public final int f36071c;

    public bf(sn snVar, int i10, int i11) {
        this.f36069a = i11;
        this.f36070b = snVar;
        this.f36071c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f36069a) {
            case 0:
                this.f36070b.getConnectionsManager().cancelRequest(this.f36071c, true);
                return;
            case 1:
                this.f36070b.j(this.f36071c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36070b.getConnectionsManager().cancelRequest(this.f36071c, true);
                return;
            case 3:
                sn snVar = this.f36070b;
                nj njVar = snVar.f41737x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = snVar.f41737x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(snVar.S3)) {
                            t1Var.f4(this.f36071c, true, true);
                        }
                    }
                }
                snVar.S3 = null;
                return;
            case 4:
                this.f36070b.getConnectionsManager().cancelRequest(this.f36071c, true);
                return;
            case 5:
                sn.a0(this.f36070b, this.f36071c);
                return;
            case 6:
                this.f36070b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36071c, new Object[0]));
                return;
            case 7:
                this.f36070b.getConnectionsManager().cancelRequest(this.f36071c, true);
                return;
            case 8:
                sn.m1(this.f36070b, this.f36071c);
                return;
            default:
                sn.i1(this.f36070b, this.f36071c);
                return;
        }
    }
}
