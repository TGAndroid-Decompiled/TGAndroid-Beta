package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

public final class ie0 extends TimerTask {

    public final je0 f39068a;

    public ie0(je0 je0Var) {
        this.f39068a = je0Var;
    }

    @Override
    public final void run() {
        if (this.f39068a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 22));
    }
}
