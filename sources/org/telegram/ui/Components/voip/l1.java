package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oj0;
public final class l1 implements Runnable {
    public final int f29367a;
    public final p1 f29368b;
    public final oj0 f29369c;

    public l1(p1 p1Var, oj0 oj0Var, int i10) {
        this.f29367a = i10;
        this.f29368b = p1Var;
        this.f29369c = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29367a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29368b, this.f29369c, 1));
                return;
            default:
                this.f29368b.removeView(this.f29369c);
                return;
        }
    }
}
