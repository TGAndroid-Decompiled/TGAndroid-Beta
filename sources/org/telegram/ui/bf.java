package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class bf implements Runnable {
    public final int f36059a;
    public final sn f36060b;
    public final int f36061c;

    public bf(sn snVar, int i10, int i11) {
        this.f36059a = i11;
        this.f36060b = snVar;
        this.f36061c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f36059a) {
            case 0:
                this.f36060b.getConnectionsManager().cancelRequest(this.f36061c, true);
                return;
            case 1:
                this.f36060b.j(this.f36061c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36060b.getConnectionsManager().cancelRequest(this.f36061c, true);
                return;
            case 3:
                sn snVar = this.f36060b;
                nj njVar = snVar.f41734x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = snVar.f41734x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(snVar.S3)) {
                            t1Var.f4(this.f36061c, true, true);
                        }
                    }
                }
                snVar.S3 = null;
                return;
            case 4:
                this.f36060b.getConnectionsManager().cancelRequest(this.f36061c, true);
                return;
            case 5:
                sn.a0(this.f36060b, this.f36061c);
                return;
            case 6:
                this.f36060b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36061c, new Object[0]));
                return;
            case 7:
                this.f36060b.getConnectionsManager().cancelRequest(this.f36061c, true);
                return;
            case 8:
                sn.m1(this.f36060b, this.f36061c);
                return;
            default:
                sn.i1(this.f36060b, this.f36061c);
                return;
        }
    }
}
