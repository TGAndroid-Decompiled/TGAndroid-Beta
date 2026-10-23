package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ie0 extends TimerTask {
    public final je0 f38180a;

    public ie0(je0 je0Var) {
        this.f38180a = je0Var;
    }

    @Override
    public final void run() {
        if (this.f38180a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 24));
    }
}
