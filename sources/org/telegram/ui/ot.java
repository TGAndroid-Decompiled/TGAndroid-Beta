package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ot extends TimerTask {
    public final int f41217a;
    public final String f41218b;
    public final org.telegram.ui.Components.il0 f41219c;

    public ot(org.telegram.ui.Components.il0 il0Var, String str, int i10) {
        this.f41217a = i10;
        this.f41219c = il0Var;
        this.f41218b = str;
    }

    @Override
    public final void run() {
        switch (this.f41217a) {
            case 0:
                try {
                    ((pt) this.f41219c).d.cancel();
                    ((pt) this.f41219c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.voip.o(3, (pt) this.f41219c, this.f41218b));
                return;
            default:
                rf.d1 d1Var = (rf.d1) this.f41219c;
                try {
                    d1Var.f47196n.cancel();
                    d1Var.f47196n = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                String str = this.f41218b;
                d1Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(24, d1Var, str));
                return;
        }
    }
}
